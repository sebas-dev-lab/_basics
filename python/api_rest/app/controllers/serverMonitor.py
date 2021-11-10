import requests
from flask import jsonify


class ServerMonitorController:
    
    @staticmethod
    def health(url, basePath, sm):
        try:
            res = requests.get(
                f"{url}/{basePath}/{sm.getPathRoute('status')}")
            return jsonify({
                "status": 200,
                "statusRequest": res.status_code,
                "data": res.json()

            })
        except Exception:
            return jsonify({
                "status": 500,
                "statusRequest": res.status_code,
                "server": "Down",
                "message": "Test local api"
            })
        