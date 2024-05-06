<?php
// Function to read and update the visitor count
function updateVisitorCount() {
    $countFile = 'visitor_count.txt';

    if (file_exists($countFile)) {
        // Read the current count from the file
        $count = (int) file_get_contents($countFile);

        // Increment the count
        $count++;

        // Write the updated count back to the file
        file_put_contents($countFile, $count);
    } else {
        // If the file doesn't exist, create it with count 1
        file_put_contents($countFile, 1);
        $count = 1;
    }

    return $count;
}

// Get the updated visitor count
$visitorCount = updateVisitorCount();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Visitor Count</title>
</head>
<body>

    <h2>Welcome to Our Website</h2>

    <p>This page has been visited <?php echo $visitorCount; ?> times.</p>

</body>
</html>
