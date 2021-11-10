
class Routes:
    def __init__(self):
        self.serverMonitorRoutes={
                "status":"health"
                }
    
    def getServerMonitor(self):
        return self.serverMonitorRoutes