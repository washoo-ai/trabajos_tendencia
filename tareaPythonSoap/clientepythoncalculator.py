from zeep import Client


client = Client('http://www.dneonline.com/calculator.asmx?WSDL')

# Metodo para sumar
result = client.service.Add(4, 6)
print('La suma es: ' + str(result))

# Metodo para restar
result = client.service.Subtract(4, 6)
print('La resta es: ' + str(result))


# Metodo para dividir
result = client.service.Divide(6, 3)
print('La division es: ' + str(result))


# Metodo para multiplicar
result = client.service.Multiply(2, 6)
print('La multiplicacion es: ' + str(result))

