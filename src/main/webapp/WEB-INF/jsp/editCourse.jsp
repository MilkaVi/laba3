<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<HTML>
<HEAD>
    <META http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <TITLE>edit course</TITLE>
</HEAD>
<BODY>
<FORM action="saveCourse.html" method="post">

    <c:if test="${not empty course}">
        <INPUT type="hidden" name="id" value="${course.id}">
    </c:if>


    <P>преподаватель:</P>

    <INPUT type="text" name="teacher" value="${course.teacher}">

    <P>имя:</P>

    <INPUT type="text" name="name" value="${course.name}">

    <P>специальность:</P>

    <INPUT type="text" name="specialty" value="${course.specialty}">

    <P>номер курса:</P>

    <INPUT type="text" name="coursNumber" value="${course.coursNumber}">

    <P>номер сема:</P>

    <INPUT type="text" name="semesterNumber" value="${course.semesterNumber}">

    <P>кол-во студентов:</P>

    <INPUT type="text" name="countStudents" value="${course.countStudents}">

    <P>кол-во лекций:</P>

    <INPUT type="text" name="lectures" value="${course.lectures}">

    <P>кол-во практик:</P>

    <INPUT type="text" name="practick" value="${course.practick}">

    <P>кол-во лаб:</P>

    <INPUT type="text" name="lab" value="${course.lab}">


    <P>экз\зачет:</P>

    <INPUT type="text" name="formControl" value="${course.formControl}">

    <P>кол-во контрольных:</P>

    <INPUT type="text" name="controlWork" value="${course.controlWork}">


    <BUTTON type="submit">Сохранить</BUTTON>
    <A href="index.html">Назад</A>
</FORM>
</BODY>
</HTML>