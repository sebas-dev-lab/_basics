from app import app
from routes.serverMonitor.ServerStatusMonitor import ServerMonitor
from config.security import SecurityEnvs
from controllers.serverMonitor import ServerMonitorController


sm = ServerMonitor()
sec = SecurityEnvs()

url = sec.getUrl()
basePath = sec.getBasePath()

# /api/health
@app.route(sm.getMonitorRoutes("status"), methods=["GET"])
def health():
    # /api/v1/health
    return ServerMonitorController().health(url, basePath, sm)


@app.route("/test")
def test():
    return "up"
