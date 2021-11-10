from utils.environ import getEnviron

class SecurityEnvs:
    def __init__(self):
        self.__basicAuth = {
            "username": getEnviron("USERNAME"),
            "password": getEnviron("PASSWORD")
        }
        self.__baseUrl = getEnviron("BASEURL")
        self.__basePath = getEnviron("BASEPATH")

    def getBauth(self):
        return self.__basicAuth

    def getUrl(self):
        return self.__baseUrl

    def getBasePath(self):
        return self.__basePath
