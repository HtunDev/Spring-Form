<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Form</title>
<style type="text/css">

	.radio-box > span {
		margin-right: 16px;
	}
	
	.radio-box input {
		margin-right: 6px;
	}

</style>

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
		
		<c:if test="${hasErrors}">Errors
			<div class="alert alert-warning">
				<sf:errors path="*"></sf:errors>
			</div>
		</c:if>
		
		<sf:hidden path="id"/>

			<div class="row">
				<div class="col">
					<sf:label path="name">Student Name</sf:label>
					<sf:input path="name" type="text" cssClass="form-control" placeholder="Enter Student Name"/>
					<sf:errors path="name" cssClass="text-danger"></sf:errors>
				</div>
				
				<div class="col">
					<sf:label path="phone">Student Phone Number</sf:label>
					<sf:input path="phone" type="tel" cssClass="form-control" placeholder="Enter Student Phone Number"/>
					<sf:errors path="phone" cssClass="text-danger"></sf:errors>
				</div>
				
				<div class="col">
					<sf:label path="email">Student Email</sf:label>
					<sf:input path="email" type="email" cssClass="form-control" placeholder="Enter Student Email"/>
					<sf:errors path="email" cssClass="text-danger"></sf:errors>
				</div>
			</div>
			
			<div class="row mt-4">
				<div class="col">
					<sf:label path="password">Password</sf:label>
					<sf:password path="password" cssClass="form-control" placeholder="Enter Password"/>
				</div>
				
				<div class="col">
					<sf:label path="course">Select Course</sf:label>
					<sf:select path="course" cssClass="form-select">
						<sf:option value="">Select Course</sf:option>
						<sf:options items="${courses}" itemValue="id" itemLabel="name"></sf:options>
					</sf:select>
					<sf:errors path="course" cssClass="text-danger"></sf:errors>
				</div>
				
				<div class="col">
					<sf:label path="registrationDate">Registration Date</sf:label>
					<sf:input path="registrationDate" cssClass="form-control" placeholder="Enter Registration Date" type="date"/>
				</div>
			</div>
			
			<div class="row mt-4">
				<div class="col">
					<sf:label path="gender">Gender</sf:label>
					<div class="radio-box">
					<sf:radiobuttons path="gender" items="${genders}"/>
					</div>
				</div>
				
				<div class="col">
					<sf:label path="foundation">Knowledges</sf:label>
					<div class="radio-box">
						<sf:checkboxes items="${knowledges}" path="foundation"/>
					</div>
				</div>
				
				<div class="col">
					<sf:label path="agree">Agree the Conditions</sf:label>
					<div class="radio-box">
						<sf:checkbox path="agree" label="I'm agree the rules"/>
					</div>
				</div>
			</div>
			
			<div class="mt-4">
				<sf:label path="remark">Remark</sf:label>
				<sf:textarea path="remark" cssClass="form-control" />
			</div>
			
			<div class="mt-4">
				<button type="submit" class="btn btn-primary">Send Data</button>
			</div>

		</sf:form>
		
		<h3 class="mt-4 ">Data Lists</h3>
		
		<table class="table">
		
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Phone Number</th>
					<th>Email</th>
					<th>Registration Date</th>
					<th>Gender</th>
					<th>Remark</th>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach var="d" items="${lists}">
					<tr>
						<td>${d.id}</td>
						<td>${d.name}</td>
						<td>${d.phone}</td>
						<td>${d.email}</td>
						<td>${d.registrationDate}</td>
						<td>${d.gender}</td>
						<td>${d.remark}</td>
					</tr>
				</c:forEach>
			</tbody>
			
		</table>

	</div>

</body>
</html>