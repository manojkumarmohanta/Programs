<?php
// File to store the visitor count
$counterFile = "visitor_count.txt";

// Function to read and increment the visitor count
function incrementVisitorCount($counterFile) {
    $count = 1; // Default count

    // Check if the counter file exists
    if (file_exists($counterFile)) {
        // Read the current count from the file
        $count = (int) file_get_contents($counterFile);

        // Increment the count
        $count++;

        // Write the updated count back to the file
        file_put_contents($counterFile, $count);
    } else {
        // Create the counter file if it doesn't exist
        file_put_contents($counterFile, $count);
    }

    return $count;
}

// Get and increment the visitor count
$visitorCount = incrementVisitorCount($counterFile);
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Visitor Count</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 50px;
        }

        h1 {
            color: #333;
        }

        p {
            font-size: 18px;
            color: #555;
        }
    </style>
</head>
<body>

    <h1>Welcome to Our Website</h1>

    <p>This page has been visited by <?php echo $visitorCount; ?> <?php echo ($visitorCount === 1) ? 'person' : 'people'; ?>.</p>

</body>
</html>
