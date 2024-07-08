<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculadora</title>
    <link rel="stylesheet" href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css">
</head>
<body>
<main>
    <h1>Calculadora</h1>
    <div class="grid">
        <form name="formulario" action="Servlet" method="post">
            <div class="field">
                <label for="numero1">Número 1</label>
                <input type="text" name="numero1" id="numero1" value="">
            </div>
            <div class="field">
                <label for="numero2">Número 2</label>
                <input type="text" name="numero2" id="numero2" value="">
            </div>
            <div class="field">
                <label for="operacion">Operación</label>
                <select name="operacion" id="operacion">
                    <option value="suma">Suma</option>
                    <option value="resta">Resta</option>
                    <option value="multiplicacion">Multiplicación</option>
                    <option value="division">División</option>
                    <option value="ordenar">Ordenar el número</option>
                    <option value="par_impar">Cuál es par e impar</option>
                </select>
            </div>
            <div class="actions">
                <input type="submit" value="Calcular">
            </div>
        </form>
    </div>
</main>
</body>
</html>
