<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
    </head>
    <body>
        <form:form action="calc" method="post" modelAttribute="operation">
            <input type="number" id="operator1" name="operator1" placeholder="Introducer data 1"/>
            <select name="operator" id="operator">
              <option value="+">+</option>
              <option value="-">-</option>
              <option value="*">*</option>
              <option value="/">/</option>
            </select>
            <input type="number" id="operator2" name="operator2"placeholder="Introducer data 2"/>

            <input type="submit" value="Calculate"/>
        </form:form>
        <div>${operation.getOperator1()} ${operation.getOperator()} ${operation.getOperator2()} =  ${result}</div>
    </body>
</html>