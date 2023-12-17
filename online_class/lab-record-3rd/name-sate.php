<?php
// Declare the variable $states
$states = "Mississippi Alabama Texas Massachusetts Kansas";

// Initialize an empty array to store the search results
$statesList = array();

// Task a: Search for a word in $states that ends in "xas"
$pattern1 = '/\bxas\b/i'; // \b is a word boundary, and /i makes the search case-insensitive
preg_match($pattern1, $states, $matches1);
$statesList[0] = isset($matches1[0]) ? $matches1[0] : "Not found";

// Task b: Search for a word in $states that begins with "k" and ends in "s"
$pattern2 = '/\bks\b/i';
preg_match($pattern2, $states, $matches2);
$statesList[1] = isset($matches2[0]) ? $matches2[0] : "Not found";

// Task c: Search for a word in $states that begins with "M" and ends in "s"
$pattern3 = '/\bM.*s\b/';
preg_match($pattern3, $states, $matches3);
$statesList[2] = isset($matches3[0]) ? $matches3[0] : "Not found";

// Task d: Search for a word in $states that ends in "a"
$pattern4 = '/a\b/i';
preg_match($pattern4, $states, $matches4);
$statesList[3] = isset($matches4[0]) ? $matches4[0] : "Not found";

// Display the results
echo "<h2>Search Results:</h2>";
echo "<ul>";
foreach ($statesList as $index => $result) {
    echo "<li>Element $index: $result</li>";
}
echo "</ul>";
?>
