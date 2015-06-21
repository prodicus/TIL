<html>
<body>
<?php
$servername = "localhost";
$username = "root";
$password = "root";
$dbname = "CSV_DB";

// Create connection
$conn = mysqli_connect($servername, $username, $password, $dbname);

if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}

$sql = "SELECT * FROM TBL_NAME";
$result = mysqli_query($conn, $sql);
$rowcount=mysqli_num_rows($result);


if ($rowcount > 0) {
    // output data of each row
    echo "<table border=1>";
    while($row = mysqli_fetch_assoc($result)) {
        echo "<tr><td>" . $row["sr_no"]. "</td><td>"  . $row["status"]. "</td><td>" . $row["equipment"].
        "</td><td>" . $row["asset"]. "</td><td>"  . $row["complex"]. "</td><td>" . $row["platform"].
        "</td><td>" . $row["equipment_name"]. "</td><td>" . $row["quantity"]. "</td><td>" . $row["make"].
        "</td><td>" . $row["model"]. "</td><td>" . $row["erp_mac"].  "</td><td>" . $row["status_mac"].
        "</td><td>" . $row["remarks"]."</td><td>" . $row["by_gajam"]. "</td><td>" . $row["by_tony"].
        "</td><td>" . $row["COL_16"]."</td><td>" . $row["COL_17"]."</td></tr>";
    }echo "</table>";
} else {
    echo "0 results";
}

mysqli_close($conn);
?> </body>
</html>