<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Digital Clock</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 100px;
        }

        #clock {
            font-size: 36px;
            color: #333;
        }
    </style>
</head>
<body>

    <h1>Digital Clock</h1>

    <div id="clock">
        <?php
        // Get the current time from the server
        date_default_timezone_set('UTC'); // Set the timezone to your preference
        echo date("H:i:s");
        ?>
    </div>

    <script>
        // Update the clock every second
        setInterval(function () {
            var clockElement = document.getElementById('clock');
            var now = new Date();
            var hours = now.getHours().toString().padStart(2, '0');
            var minutes = now.getMinutes().toString().padStart(2, '0');
            var seconds = now.getSeconds().toString().padStart(2, '0');
            clockElement.textContent = hours + ':' + minutes + ':' + seconds;
        }, 1000);
    </script>

</body>
</html>
