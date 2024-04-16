<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>
</head>
<body>

	<div class="container pt-4">

		<h3>Spring Form</h3>

		<sf:form modelAttribute="userInput">
		
		<sf:hidden path="id"/>

			<div class="row">
				<div class="col">
					<sf:label path="name">Student Name</sf:label>
					<sf:input path="name" type="text" cssClass="form-control" placeholder="Enter Student Name"/>
				</div>
				
				<div class="col">
					<sf:label path="phone">Student Phone Number</sf:label>
					<sf:input path="phone" type="tel" cssClass="form-control" placeholder="Enter Student Phone Number"/>
				</div>
				
				<div class="col">
					<sf:label path="email">Student Email</sf:label>
					<sf:input path="email" type="email" cssClass="form-control" placeholder="Enter Student Email"/>
				</div>
			</div>
			
			<div class="row mt-4">
				<div class="col">
					<sf:label path="password">Password</sf:label>
					<sf:password path="password" cssClass="form-control" placeholder="Enter Password"/>
				</div>
				
				<div class="col">
					<sf:label path="course">Select Course</sf:label>
				</div>
				
				<div class="col">
					<sf:label path="email">Student Email</sf:label>
				</div>
			</div>


		</sf:form>

	</div>

</body>
</html>