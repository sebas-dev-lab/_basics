
/*
    - Variables y constantes
        *>Variables
            >> Especificar el tipo de dato que se designa a una variable.
            >> Se almacenan en la memoria RAM y el espacio ocupado se mide en bytes
        *>Constantes
            >>No puede ser modificado durante la ejecucion del programa

        *>Revisar int, float y char
            - int ocupa 16 bits (2bytes -> 8 bits=1 bytes)
            - float ocupa 32 bits (4bytes)
            - char ocupa 8 bits(1bytes) -> Almacenar caracteres

        *>Ambito de una variable -  scope
            - Definirla fuera del void setup o loop el ambito es global, si se declara dentro de la funcion el scope es local
             
        *> #define
            - No puede ser definido dentro de funciones.
    
    - Operaciones aritmeticas

    - Condicionales if/else

    - Monitor Serial
        *>Nos permite desde nuestra PC enviar y recibir  datos textuales de la placa de arduino desde el IDE. Es importante que la velocidad de
        transmision sea la misma que la especificada en el sketch o no se establecera comunicacion. 
        *>La definimos en el void setup=> Serial.being(9600) - 9600 es el baud rate (numero de simbolos por segundo en medio de transmision)


*/

// #Define
#define LED_1 11

// Variable
int var = 1;

// Constante
const float pi = 3.14;

void setup()
{
    Serial.begin(9600);
}

void loop()
{
    Serial.println(var);
    delay(1000);
    var = var + 1
}