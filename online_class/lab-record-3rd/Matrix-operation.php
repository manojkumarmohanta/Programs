<?php
// Function to find the transpose of a matrix
function transposeMatrix($matrix) {
    $rows = count($matrix);
    $cols = count($matrix[0]);

    $result = [];
    for ($i = 0; $i < $cols; $i++) {
        $result[$i] = [];
        for ($j = 0; $j < $rows; $j++) {
            $result[$i][$j] = $matrix[$j][$i];
        }
    }

    return $result;
}

// Example matrix
$originalMatrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

// Display original matrix
echo "<h2>Original Matrix</h2>";
echo "<pre>";
print_r($originalMatrix);
echo "</pre>";

// Find and display the transpose of the matrix
$transposedMatrix = transposeMatrix($originalMatrix);
echo "<h2>Transpose of the Matrix</h2>";
echo "<pre>";
print_r($transposedMatrix);
echo "</pre>";
?>
<?php
// Function to multiply two matrices
function multiplyMatrices($matrix1, $matrix2) {
    $result = [];

    $rows1 = count($matrix1);
    $cols1 = count($matrix1[0]);
    $rows2 = count($matrix2);
    $cols2 = count($matrix2[0]);

    if ($cols1 != $rows2) {
        return "Error: Number of columns in the first matrix must be equal to the number of rows in the second matrix.";
    }

    for ($i = 0; $i < $rows1; $i++) {
        for ($j = 0; $j < $cols2; $j++) {
            $result[$i][$j] = 0;
            for ($k = 0; $k < $cols1; $k++) {
                $result[$i][$j] += $matrix1[$i][$k] * $matrix2[$k][$j];
            }
        }
    }

    return $result;
}

// Example matrices
$matrix1 = [
    [1, 2, 3],
    [4, 5, 6]
];

$matrix2 = [
    [7, 8],
    [9, 10],
    [11, 12]
];

// Display matrices
echo "<h2>Matrix 1</h2>";
echo "<pre>";
print_r($matrix1);
echo "</pre>";

echo "<h2>Matrix 2</h2>";
echo "<pre>";
print_r($matrix2);
echo "</pre>";

// Multiply matrices and display the result
$resultMatrix = multiplyMatrices($matrix1, $matrix2);
echo "<h2>Result of Matrix Multiplication</h2>";
echo "<pre>";
print_r($resultMatrix);
echo "</pre>";
?>
<?php
// Function to add two matrices
function addMatrices($matrix1, $matrix2) {
    $rows = count($matrix1);
    $cols = count($matrix1[0]);

    $result = [];

    for ($i = 0; $i < $rows; $i++) {
        for ($j = 0; $j < $cols; $j++) {
            $result[$i][$j] = $matrix1[$i][$j] + $matrix2[$i][$j];
        }
    }

    return $result;
}

// Example matrices
$matrix1 = [
    [1, 2],
    [3, 4]
];

$matrix2 = [
    [5, 6],
    [7, 8]
];

// Display matrices
echo "<h2>Matrix 1</h2>";
echo "<pre>";
print_r($matrix1);
echo "</pre>";

echo "<h2>Matrix 2</h2>";
echo "<pre>";
print_r($matrix2);
echo "</pre>";

// Add matrices and display the result
$resultMatrix = addMatrices($matrix1, $matrix2);
echo "<h2>Result of Matrix Addition</h2>";
echo "<pre>";
print_r($resultMatrix);
echo "</pre>";
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Calculator</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 50px;
        }

        input, button {
            margin: 5px;
        }
    </style>
</head>
<body>

    <h2>Simple Calculator</h2>

    <form method="post">
        <label for="num1">Enter first number:</label>
        <input type="text" name="num1" required>

        <label for="num2">Enter second number:</label>
        <input type="text" name="num2" required>

        <br>

        <button type="submit" name="add">Add</button>
        <button type="submit" name="subtract">Subtract</button>
        <button type="submit" name="multiply">Multiply</button>
        <button type="submit" name="divide">Divide</button>
    </form>

    <?php
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $num1 = $_POST['num1'];
        $num2 = $_POST['num2'];

        if (is_numeric($num1) && is_numeric($num2)) {
            if (isset($_POST['add'])) {
                $result = $num1 + $num2;
                echo "<p>Result: $num1 + $num2 = $result</p>";
            } elseif (isset($_POST['subtract'])) {
                $result = $num1 - $num2;
                echo "<p>Result: $num1 - $num2 = $result</p>";
            } elseif (isset($_POST['multiply'])) {
                $result = $num1 * $num2;
                echo "<p>Result: $num1 * $num2 = $result</p>";
            } elseif (isset($_POST['divide']) && $num2 != 0) {
                $result = $num1 / $num2;
                echo "<p>Result: $num1 / $num2 = $result</p>";
            } else {
                echo "<p>Error: Division by zero is not allowed.</p>";
            }
        } else {
            echo "<p>Please enter valid numeric values.</p>";
        }
    }
    ?>

</body>
</html>
