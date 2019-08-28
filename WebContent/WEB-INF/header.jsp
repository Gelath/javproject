<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		
		<!-- Bootstrap -->
		<link rel="stylesheet"
		 href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
		 integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
		 crossorigin="anonymous">
		 
		<title>Mon shop</title>
	</head>
	
	<body>
	
	<header>
		<nav class="nav nav-tabs justify-content-center">
			<c:if test="${ sessionScope.user  == null}">
				<a class="nav-item" href="Login">Connexion</a>
			</c:if>
			
			<c:if test="${ sessionScope.user  != null}">
				<a href="Logout">Déconnexion</a>
			</c:if>
			
		</nav>
	</header>
	
	<div class="container">
