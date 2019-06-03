<%@ page import="java.util.Arrays" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>出错了</title>
    <style>
        {
            margin-bottom: 10%
        ;
            margin-top: 5%
        ;
        }
        .alert-warning {
            color: #8a6d3b;
            background-color: #fcf8e3;
            border-color: #faebcc;
        }

        .alert {
            padding: 15px;
            margin-bottom: 20px;
            border: 1px solid transparent;
            border-radius: 4px;
        }

        main.search {
            width: 1190px;
        }

        main.search {
            width: 990px;
            margin: 0 auto;
        }
    </style>
</head>
<body>
<main class="search" style="margin-bottom: 10%;margin-top: 5%;">
    <div class="alert alert-warning" role="alert">
        <%=exception.toString()%>
    </div>
</main>
</body>
</html>
