<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<HTML>
<HEAD>
    <META http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <TITLE>teacher</TITLE>
    <STYLE>
        TABLE {
            border-collapse: collapse;
        }

        TH, TD {
            border: 1px solid black;
            padding: 5px 30px 5px 10px;
        }
    </STYLE>
</HEAD>
<BODY>

<c:choose>
    <c:when test="${not empty user}">
        ${user.login}&nbsp;&mdash; <A href="logout.html">выйти</A>
    </c:when>
    <c:otherwise>
        <A href="login-form.jsp">войти</A>
    </c:otherwise>
</c:choose>

<FORM action="delete.html" method="post">


    <TABLE>
        <TR>
            <TH>&nbsp;</TH>
            <TH>фамилия</TH>
            <TH>имя</TH>
            <TH>отчество</TH>
            <TH>степень</TH>
            <TH>звание</TH>
            <TH>должность</TH>
            <TH>пол</TH>
            <TH>дата рождения</TH>
            <TH>количество курсов</TH>

        </TR>

        <c:forEach var="teacher" items="${teachers}">

            <TR>

                <TD>
                    <c:if test="${not empty user}">
                        <INPUT type="checkbox" name="id"value="${teacher.id}">
                    </c:if>

                </TD>
                <TD>
                    <c:if test="${not empty user}">
                        <A href="edit.html?id=${teacher.id}"/>
                     </c:if>
                            ${teacher.secondName}
                    </A>


                </TD>
                <TD>${teacher.name}</TD>
                <TD>${teacher.lastName}</TD>
                <TD>${teacher.degree}</TD>
                <TD>${teacher.rank}</TD>
                <TD>${teacher.position}</TD>
                <TD>${teacher.sex}</TD>
                <TD>${teacher.date}</TD>
                <TD>
                    <c:if test="${not empty user}">
                        <A href="editCourse.html?id=${teacher.id}"/>
                    </c:if>
                        ${teacher.countCourse}
                    </A>
                        </TD>

            </TR>

        </c:forEach>

    </TABLE>

    <c:if test="${not empty user}">
        <P>
            <A href="edit.html">Добавить</A>
            <BUTTON type="submit">Удалить</BUTTON>
        </P>
    </c:if>
</FORM>
</BODY>
</HTML>