<?php
  $con = mysqli_connect("localhost", "givetest", "gbgb18gb!!", "givetest");

  $userID = $_POST["userID"];
  $userPassword = $_POST["userPassword"];

  $statement = mysqli_prepare($con, "SELECT * FROM USER WHERE userID = ? AND userPassword = ?");
  mysqli_stmt_bind_param($statement, "ss", $userID, $userPassword);
  mysqli_stmt_execute($statement);

  mysqli_stmt_store_result($statement);
  mysqli_stmt_bind_result($statement, $userID);

  $response = array();
  $response["success"] = false;

  while (mysql_stmt_fetch($statement)){
    $response["success"] = true;
    $response["userID"] = $userID;
  }

  echo json_encode($response);
?>
