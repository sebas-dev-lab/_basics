
def extractNumbers(str):
    '''
        Extrae segmento de numeros ganadores y la separa de la fecha
    '''
    setNums = {}
    nums = str.split(",")
    date = nums.pop(0)
    k = 1
    for n in nums:
        setNums[k] = int(n)
        k += 1
    return {
        "date": date,
        "nums": setNums
    }



import os
THIS_FOLDER = os.path.dirname(os.path.abspath(__file__))
my_file = os.path.join(THIS_FOLDER, 'info.txt')


def extractInfoAndReformat():
    '''
        Leo el archivo info.txt
        extraigo la informacion
        Se reesctructura

        Determino el sorteo.
            si es el primero armo el objet
            si no comparo el date de referencia con el del objeto entrante
                si es igual al de referencia entonces se agrega como nuevo
                sorteo.
                de lo contrario se inicia un nuevo objeto y se pushea el anterior

        obj={
            date:fecha,
            1:{...} sorteo 1
            2:{...} sorteo 2
            3:{...} sorteo 3
            4:{...} sorteo 4
        }
    '''
    formatList = []
    newObj = {}
    reference = {
        "n": 1,
        "ref": ""
    }
    # Read file, reformat,
    with open(my_file, "r") as f:
        for linea in f:
            obj = extractNumbers(linea)
            if reference['ref'] != obj['date']:
                newObj={}
                formatList.append(newObj)
                reference = {
                    "n": 1,
                    "ref": ""
                }
                reference["ref"] = obj['date']
                newObj['date'] = obj['date']
                newObj[reference["n"]] = obj['nums']
                reference["n"] += 1
            else:
                newObj[reference["n"]] = obj['nums']
                reference["n"] += 1

    return formatList
