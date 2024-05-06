<?php

// Database connection
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "test";

$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Function to perform selection sort on an array of students based on marks
function selectionSort(&$students) {
    $n = count($students);

    for ($i = 0; $i < $n - 1; $i++) {
        $minIndex = $i;
        
        for ($j = $i + 1; $j < $n; $j++) {
            if ($students[$j]['marks'] < $students[$minIndex]['marks']) {
                $minIndex = $j;
            }
        }

        // Swap the found minimum element with the first element
        $temp = $students[$minIndex];
        $students[$minIndex] = $students[$i];
        $students[$i] = $temp;
    }
}

// Fetch student records from the database
$sql = "SELECT * FROM students";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // Store records in an array
    $students = [];
    while ($row = $result->fetch_assoc()) {
        $students[] = $row;
    }

    // Perform selection sort based on marks
    selectionSort($students);

    // Display sorted student records
    echo "<h2>Sorted Student Records:</h2>";
    echo "<table border='1'>";
    echo "<tr><th>Student ID</th><th>Name</th><th>Marks</th></tr>";

    foreach ($students as $student) {
        echo "<tr>";
        echo "<td>" . $student['student_id'] . "</td>";
        echo "<td>" . $student['name'] . "</td>";
        echo "<td>" . $student['marks'] . "</td>";
        echo "</tr>";
    }

    echo "</table>";
} else {
    echo "No records found";
}

$conn->close();
?>
