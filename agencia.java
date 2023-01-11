<!DOCTYPE html>
<html>
<head>
    <title>Calculadora</title>
    <style>
        /* Adicione o seu CSS aqui */
        /* Aqui esta um exemplo */
        #calculator {
            width: 300px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid black;
        }
        #display {
            width: 100%;
            height: 50px;
            border: 1px solid black;
            font-size: 2em;
            text-align: right;
            padding: 10px;
            box-sizing: border-box;
        }
        .button {
            width: 25%;
            height: 50px;
            border: 1px solid black;
            float: left;
            font-size: 2em;
            text-align: center;
            line-height: 50px;
            box-sizing: border-box;
        }
        .clear {
            background-color: gray;
            color: white;
        }
    </style>
</head>
<body>
    <div id="calculator">
        <div id="display"></div>
        <div class="button" onclick="display.innerHTML += '1'">1</div>
        <div class="button" onclick="display.innerHTML += '2'">2</div>
        <div class="button" onclick="display.innerHTML += '3'">3</div>
        <div class="button" onclick="display.innerHTML += '+'">+</div>
        <div class="button" onclick="display.innerHTML += '4'">4</div>
        <div class="button" onclick="display.innerHTML += '5'">5</div>
        <div class="button" onclick="display.innerHTML += '6'">6</div>
        <div class="button" onclick="display.innerHTML += '-'">-</div>
        <div class="button" onclick="display.innerHTML += '7'">7</div>
        <div class="button" onclick="display.innerHTML += '8'">8</div>
        <div class="button" onclick="display.innerHTML += '9'">9</div>
        <div class="button" onclick="display.innerHTML += '*'">*</div>
        <div class="button clear" onclick="display.innerHTML = ''">C</div>
        <div class="button" onclick="display.innerHTML += '0'">0</div>
        <div class="button" onclick="display.innerHTML += '.'">.</div>
        <div class="button" onclick="display.innerHTML = eval(display.innerHTML)">=</div>
        <div class="button" onclick="display.innerHTML += '/'">/</div>
    </div>
    <script>
        // Adicione seu JavaScript aqui
    </script>
</body>
</
