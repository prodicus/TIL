<?php

$con=mysqli_connect('localhost', 'root', 'root');
$db=mysqli_select_db('CSV_DB');



<select name=equipment>

$sql = "SELECT equipment FROM TBL_NAME";
$result = mysqli_query($con,$sql);


while ($row = mysqli_fetch_array($result)) {
    <option value= echo $row['Equipment']

    </option>
}
</select>

?>