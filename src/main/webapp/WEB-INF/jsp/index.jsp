<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<HTML>
<HEAD>
    <META http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <TITLE>Тест JSP</TITLE>
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
<FORM action="delete.html" method="post">
    <TABLE>
        <TR>
            <TH>&nbsp;</TH>
            <TH>номер зачетки</TH>
            <TH>группа</TH>
            <TH>фамилия</TH>
            <TH>имя</TH>
            <TH>отчество</TH>
            <TH>1 сем</TH>
            <TH>2 сем</TH>
            <TH>3 сем</TH>
            <TH>4 сем</TH>
            <TH>средняя</TH>

        </TR>

        <c:forEach var="object" items="${objects}">

            <TR>
                <TD>
                    <INPUT type="checkbox" name="id"

                           value="${object.id}">

                </TD>
                <TD>

                    <A href="edit.html?id=${object.id}">
                            ${object.tickedNum}

                    </A>
                </TD>
                <TD>${object.group}</TD>
                <TD>${object.secondName}</TD>
                <TD>${object.name}</TD>
                <TD>${object.lastName}</TD>
                <TD>${object.mark1}</TD>
                <TD>${object.mark2}</TD>
                <TD>${object.mark3}</TD>
                <TD>${object.mark4}</TD>
                <TD>${object.avarageMark}</TD>

            </TR>

        </c:forEach>

    </TABLE>
    <P> группы лучших:${bests}</P>

    <P>
        <A href="edit.html">Добавить</A>
        <BUTTON type="submit">Удалить</BUTTON>
    </P>
</FORM>
</BODY>
</HTML>