<?php
// Database connection parameters
$servername = "localhost";
$username = "your_username";
$password = "your_password";
$dbname = "university";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Selection sort function
function selectionSort(&$arr, $column) {
    $n = count($arr);

    for ($i = 0; $i < $n - 1; $i++) {
        $minIndex = $i;
        for ($j = $i + 1; $j < $n; $j++) {
            if ($arr[$j][$column] < $arr[$minIndex][$column]) {
                $minIndex = $j;
            }
        }

        // Swap the found minimum element with the first element
        $temp = $arr[$minIndex];
        $arr[$minIndex] = $arr[$i];
        $arr[$i] = $temp;
    }
}

// Fetch student records from the database
$sql = "SELECT * FROM students";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // Fetch the result into an associative array
    while ($row = $result->fetch_assoc()) {
        $students[] = $row;
    }

    // Close the database connection
    $conn->close();

    // Sort student records based on student ID using selection sort
    selectionSort($students, 'student_id');

    // Display the sorted student records
    echo "<h2>Sorted Student Records:</h2>";
    echo "<table border='1'>";
    echo "<tr><th>Student ID</th><th>Name</th><th>Age</th></tr>";
    foreach ($students as $student) {
        echo "<tr><td>{$student['student_id']}</td><td>{$student['name']}</td><td>{$student['age']}</td></tr>";
    }
    echo "</table>";
} else {
    echo "No records found in the database.";
}

?>
