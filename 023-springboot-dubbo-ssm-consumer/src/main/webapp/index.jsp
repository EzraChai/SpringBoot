<%--
  Created by IntelliJ IDEA.
  User: juanz
  Date: 12/23/2020
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script>
        $(function(){
            $("#search").click(function (){
                $studentId = $(":text").val()
                $(location).attr('href', "student/detail/" + $studentId)
            })
            $("#check").click(function (){
                $.ajax({
                    url:"student/all/count",
                    method:"get",
                    type:"json"})
                    .done(function (data){
                        alert(data)
                    })
            })
        })
    </script>
</head>
<body align="center" >
    <input type="text" name="id" placeholder="Student ID"><br>
    <input type="button" value="Submit" id="search">
    <br>
    <br>
    <input type="button" value="Check Total numbers of student" id="check">
</body>
</html>
