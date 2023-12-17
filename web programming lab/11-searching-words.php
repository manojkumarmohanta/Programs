<?php

// Declare the variable 'states'
$states = "Mississippi Alabama Texas Massachusetts Kansas";

// Initialize an empty array 'statesList'
$statesList = [];

// a. Search for a word in 'states' that ends in 'xas'
preg_match('/\bxas\b/i', $states, $matches);
$statesList[0] = isset($matches[0]) ? $matches[0] : 'Not found';

// b. Search for a word in 'states' that begins with 'k' and ends in 's' (case-insensitive)
preg_match('/\bks\b/i', $states, $matches);
$statesList[1] = isset($matches[0]) ? $matches[0] : 'Not found';

// c. Search for a word in 'states' that begins with 'M' and ends in 's'
preg_match('/\bM.*?s\b/', $states, $matches);
$statesList[2] = isset($matches[0]) ? $matches[0] : 'Not found';

// d. Search for a word in 'states' that ends in 'a'
preg_match('/\ba\b/i', $states, $matches);
$statesList[3] = isset($matches[0]) ? $matches[0] : 'Not found';

// Display the result
echo "<h2>Results:</h2>";
echo "<ul>";
foreach ($statesList as $index => $word) {
    echo "<li>Element $index: $word</li>";
}
echo "</ul>";
?>
