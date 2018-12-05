<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp"%>
<c:url var="formUrl" value="/login.html" />
<html>
<head>
    <title><dec:title default="Login Page" /></title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--===============================================================================================-->
    <link rel="icon" type="image/png" href="<c:url value='/template/login/images/icons/favicon.ico' /> "/>
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/template/login/vendor/bootstrap/css/bootstrap.min.css' /> ">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/template/login/fonts/font-awesome-4.7.0/css/font-awesome.min.css' />">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/template/login/fonts/iconic/css/material-design-iconic-font.min.css' />">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/template/login/vendor/animate/animate.css' />">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/template/login/vendor/css-hamburgers/hamburgers.min.css' />">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/template/login/vendor/animsition/css/animsition.min.css' />">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/template/login/vendor/select2/select2.min.css' />">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/template/login/vendor/daterangepicker/daterangepicker.css' />">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/template/login/css/util.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/template/login/css/main.css' />">
    <!--===============================================================================================-->
    <dec:head></dec:head>
</head>
<body>
    <div class="limiter">
        <div class="container-login100">
            <div class="wrap-login100">
                <form class="login100-form validate-form" action="${formUrl}" method="post">
                    <%@ include file="/common/login/header.jsp" %>

                    <c:if test="${not empty messageResponse}">
                        <div class="alert alert-block alert-${alert}">
                            <button type="button" class="close" data-dismiss="alert">
                                <i class = "ace-icon fa fa-times"></i>
                            </button>
                                ${messageResponse}
                        </div>
                    </c:if>

                    <dec:body />
                </form>
            </div>
        </div>
    </div>
    <!--===============================================================================================-->
    <script src="<c:url value='/template/login/vendor/jquery/jquery-3.2.1.min.js' />"></script>
    <!--===============================================================================================-->
    <script src="<c:url value='/template/login/vendor/animsition/js/animsition.min.js' />"></script>
    <!--===============================================================================================-->
    <script src="<c:url value='/template/login/vendor/bootstrap/js/popper.js' />"></script>
    <script src="<c:url value='/template/login/vendor/bootstrap/js/bootstrap.min.js' />"></script>
    <!--===============================================================================================-->
    <script src="<c:url value='/template/login/vendor/select2/select2.min.js' />"></script>
    <!--===============================================================================================-->
    <script src="<c:url value='/template/login/vendor/daterangepicker/moment.min.js' />"></script>
    <script src="<c:url value='/template/login/vendor/daterangepicker/daterangepicker.js' />"></script>
    <!--===============================================================================================-->
    <script src="<c:url value='/template/login/vendor/countdowntime/countdowntime.js' />"></script>
    <!--===============================================================================================-->
    <script src="<c:url value='/template/login/js/main.js' />"></script>
</body>
</html>
