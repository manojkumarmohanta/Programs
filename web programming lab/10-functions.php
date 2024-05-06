<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Calculator</title>
</head>
<body>

    <h2>Simple Calculator</h2>

    <form method="post">
        <label for="num1">Number 1:</label>
        <input type="text" name="num1" required>

        <label for="num2">Number 2:</label>
        <input type="text" name="num2" required>

        <label for="operation">Operation:</label>
        <select name="operation" required>
            <option value="add">Addition (+)</option>
            <option value="subtract">Subtraction (-)</option>
            <option value="multiply">Multiplication (*)</option>
            <option value="divide">Division (/)</option>
        </select>

        <button type="submit">Calculate</button>
    </form>

    <?php
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $num1 = $_POST['num1'];
        $num2 = $_POST['num2'];
        $operation = $_POST['operation'];

        switch ($operation) {
            case 'add':
                $result = $num1 + $num2;
                break;
            case 'subtract':
                $result = $num1 - $num2;
                break;
            case 'multiply':
                $result = $num1 * $num2;
                break;
            case 'divide':
                $result = ($num2 != 0) ? ($num1 / $num2) : 'Undefined (division by zero)';
                break;
            default:
                $result = 'Invalid operation';
        }

        echo '<p>Result: ' . $result . '</p>';
    }
    ?>

</body>
</html>


<?php
// Function to find the transpose of a matrix
function transposeMatrix($matrix) {
    $rows = count($matrix);
    $cols = count($matrix[0]);

    $transposedMatrix = [];
    for ($i = 0; $i < $cols; $i++) {
        for ($j = 0; $j < $rows; $j++) {
            $transposedMatrix[$i][$j] = $matrix[$j][$i];
        }
    }

    return $transposedMatrix;
}

// Example matrix
$matrix = [
    [1, 2, 3],
    [4, 5, 6],
];

// Find the transpose of the matrix
$transposedMatrix = transposeMatrix($matrix);

// Display the original and transposed matrices
echo '<p>Original Matrix:</p>';
displayMatrix2($matrix);

echo '<p>Transposed Matrix:</p>';
displayMatrix2($transposedMatrix);

// Function to display a matrix
function displayMatrix2($matrix) {
    echo '<table border="1">';
    foreach ($matrix as $row) {
        echo '<tr>';
        foreach ($row as $element) {
            echo '<td>' . $element . '</td>';
        }
        echo '</tr>';
    }
    echo '</table>';
}
?>


<?php
// Function to multiply two matrices
function multiplyMatrices($matrix1, $matrix2) {
    $rows1 = count($matrix1);
    $cols1 = count($matrix1[0]);
    $rows2 = count($matrix2);
    $cols2 = count($matrix2[0]);

    // Check if matrices can be multiplied
    if ($cols1 != $rows2) {
        return 'Matrices cannot be multiplied';
    }

    // Initialize the result matrix
    $resultMatrix = array_fill(0, $rows1, array_fill(0, $cols2, 0));

    // Perform matrix multiplication
    for ($i = 0; $i < $rows1; $i++) {
        for ($j = 0; $j < $cols2; $j++) {
            for ($k = 0; $k < $cols1; $k++) {
                $resultMatrix[$i][$j] += $matrix1[$i][$k] * $matrix2[$k][$j];
            }
        }
    }

    return $resultMatrix;
}

// Example matrices
$matrix1 = [
    [1, 2],
    [3, 4],
];

$matrix2 = [
    [5, 6],
    [7, 8],
];

// Multiply the matrices
$resultMatrix = multiplyMatrices($matrix1, $matrix2);

// Display the original matrices and the result matrix
echo '<p>Matrix 1:</p>';
displayMatrix1($matrix1);

echo '<p>Matrix 2:</p>';
displayMatrix1($matrix2);

echo '<p>Result Matrix:</p>';
displayMatrix1($resultMatrix);

// Function to display a matrix
function displayMatrix1($matrix) {
    echo '<table border="1">';
    foreach ($matrix as $row) {
        echo '<tr>';
        foreach ($row as $element) {
            echo '<td>' . $element . '</td>';
        }
        echo '</tr>';
    }
    echo '</table>';
}
?>
<?php


// Function to add two matrices
function addMatrices($matrix1, $matrix2) {
    $rows1 = count($matrix1);
    $cols1 = count($matrix1[0]);
    $rows2 = count($matrix2);
    $cols2 = count($matrix2[0]);

    // Check if matrices have the same dimensions
    if ($rows1 != $rows2 || $cols1 != $cols2) {
        return 'Matrices must have the same dimensions for addition';
    }

    // Initialize the result matrix
    $resultMatrix = array_fill(0, $rows1, array_fill(0, $cols1, 0));

    // Perform matrix addition
    for ($i = 0; $i < $rows1; $i++) {
        for ($j = 0; $j < $cols1; $j++) {
            $resultMatrix[$i][$j] = $matrix1[$i][$j] + $matrix2[$i][$j];
        }
    }

    return $resultMatrix;
}

// Example matrices
$matrix1 = [
    [1, 2],
    [3, 4],
];

$matrix2 = [
    [5, 6],
    [7, 8],
];

// Add the matrices
$resultMatrix = addMatrices($matrix1, $matrix2);

// Display the original matrices and the result matrix
echo '<p>Matrix 1:</p>';
displayMatrix($matrix1);

echo '<p>Matrix 2:</p>';
displayMatrix($matrix2);

echo '<p>Result Matrix:</p>';
displayMatrix($resultMatrix);

// Function to display a matrix
function displayMatrix($matrix) {
    echo '<table border="1">';
    foreach ($matrix as $row) {
        echo '<tr>';
        foreach ($row as $element) {
            echo '<td>' . $element . '</td>';
        }
        echo '</tr>';
    }
    echo '</table>';
}
?>
