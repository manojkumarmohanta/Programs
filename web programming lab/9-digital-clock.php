<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Digital Clock</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            text-align: center;
            margin-top: 100px;
            font-size: 3em;
        }
    </style>
</head>
<body>

    <h2>Digital Clock</h2>

    <div id="digital-clock"><?php echo date('H:i:s'); ?></div>

    <script>
        // Update the clock every second
        setInterval(function() {
            var currentTime = new Date();
            var hours = currentTime.getHours();
            var minutes = currentTime.getMinutes();
            var seconds = currentTime.getSeconds();

            // Add leading zero if the number is less than 10
            hours = (hours < 10) ? '0' + hours : hours;
            minutes = (minutes < 10) ? '0' + minutes : minutes;
            seconds = (seconds < 10) ? '0' + seconds : seconds;

            // Display the updated time
            document.getElementById('digital-clock').innerHTML = hours + ':' + minutes + ':' + seconds;
        }, 1000); // Update every 1000 milliseconds (1 second)
    </script>

</body>
</html>
