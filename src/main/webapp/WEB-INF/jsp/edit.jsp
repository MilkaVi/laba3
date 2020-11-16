<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<HTML>
<HEAD>
    <META http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <TITLE>Тест JSP</TITLE>
</HEAD>
<BODY>
<FORM action="save.html" method="post">

    <c:if test="${not empty object}">
        <INPUT type="hidden" name="id" value="${object.id}">
    </c:if>

    <P>номер зачетки:</P>

    <INPUT type="text" name="tickedNum" value="${tickedNum}">

    <P>группа:</P>

    <INPUT type="text" name="group" value="${group}">


    <P>фамилия:</P>

    <INPUT type="text" name="secondName" value="${secondName}">

    <P>имя:</P>

    <INPUT type="text" name="name" value="${name}">


    <P>отчество:</P>

    <INPUT type="text" name="lastName" value="${lastName}">

    <P>1 сем:</P>

    <INPUT type="text" name="mark1" value="${mark1}">

    <P>2 сем:</P>

    <INPUT type="text" name="mark2" value="${mark2}">
    <P>3 сем:</P>

    <INPUT type="text" name="mark3" value="${mark3}">
    <P>4 сем:</P>

    <INPUT type="text" name="mark4" value="${mark4}">





    <BUTTON type="submit">Сохранить</BUTTON>
    <A href="index.html">Назад</A>
</FORM>
</BODY>
</HTML>