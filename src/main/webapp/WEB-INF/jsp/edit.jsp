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

    <c:if test="${not empty teacher}">
        <INPUT type="hidden" name="id" value="${teacher.id}">
    </c:if>

    <P>фамилия:</P>

    <INPUT type="text" name="secondName" value="${teacher.secondName}">

    <P>имя:</P>

    <INPUT type="text" name="name" value="${teacher.name}">


    <P>отчество:</P>

    <INPUT type="text" name="lastName" value="${teacher.lastName}">

    <P>степень:</P>

    <INPUT type="text" name="degree" value="${teacher.degree}">


    <P>звание:</P>

    <INPUT type="text" name="rank" value="${teacher.rank}">

    <P>должность:</P>

    <INPUT type="text" name="position" value="${teacher.position}">

    <P>пол:</P>

    <INPUT type="text" name="sex" value="${teacher.sex}">

    <P>дата рождения:</P>

    <INPUT type="text" name="date" value="${teacher.date}">

    <P>кол-во курсов:</P>

    <INPUT type="text" name="countCourse" value="${teacher.countCourse}">




    <BUTTON type="submit">Сохранить</BUTTON>
    <A href="index.html">Назад</A>
</FORM>
</BODY>
</HTML>