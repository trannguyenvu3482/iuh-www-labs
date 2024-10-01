<%@page import="com.fit.se.beans.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<jsp:useBean id="book" scope="request" type="com.fit.se.beans.Book" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

</head>
<body>
	<header
		class="container d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
		<a href="${pageContext.request.contextPath}/book-controller"
			class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
			<span class="fs-4">IUH Bookstore</span>
		</a>

		<ul class="nav nav-pills">
			<li class="nav-item"><a href="#" class="nav-link active"
				aria-current="page">Home</a></li>
			<li class="nav-item"><a href="#" class="nav-link">Examples</a></li>
			<li class="nav-item"><a href="#" class="nav-link">Services</a></li>
			<li class="nav-item"><a href="#" class="nav-link">Products</a></li>
			<li class="nav-item"><a href="#" class="nav-link">Contact</a></li>
		</ul>
	</header>
	<div class="container">
		<div class="row gx-5">
			<div class="col-4">
				<div class="card">
					<div class="card-header">About us</div>
					<div class="card-body">
						<h5 class="card-title">IUH Bookstore</h5>
						<p class="card-text">
							IUH Bookstore is a website that provides books for students at
							IUH. We have a lot of books for you to choose from <a href="#"
								class="btn-link">Read more</a>
						</p>
					</div>
				</div>
				<div class="card mt-4">
					<div class="card-header">Search site</div>
					<div class="card-body">
						<h5 class="card-title">Search for your favorite book</h5>
						<div class="input-group mb-3">
							<input type="text" class="form-control">
						</div>
					</div>
				</div>
			</div>
			<div class="col-8">
				<div class="card" style="width: 18rem;">
					<img
						src="${pageContext.request.contextPath}/resources/images/${book.imgURL}"
						class="card-img-top" alt="...">
					<div style="display: flex;flex-direction:row;align-items: center;">
						<div class="card-body">
							<h5 class="card-title">${book.title}</h5>
							<p class="card-text">Giá: ${book.price}đ</p>
							<p class="card-text">Số lượng: ${book.quantity}</p>
						</div>
						<div
							style="margin-right: 8px;">
							<a href="book-controller" class="btn btn-primary">Trở về</a>
						</div>
					</div>
				</div>

				<%-- 				<% --%>
				<!-- 					Book book2 = (Book) request.getAttribute("book"); -->

				<%-- 				%> --%>
				<!-- 				<div class="card" style="width: 18rem;"> -->
				<!-- 					<img -->
				<%-- 						src="${pageContext.request.contextPath}/resources/images/<%=book2.getImgURL()%>" --%>
				<!-- 						class="card-img-top" alt="..." > -->
				<!-- 					<div class="card-body"> -->
				<%-- 						<h5 class="card-title"><%=book2.getTitle() %></h5> --%>
				<%-- 						<p class="card-text"><%=book2.getPrice() %>đ</p> --%>
				<%-- 						<p class="card-text">Số lượng: <%=book2.getQuantity() %></p> --%>
				<!-- 					</div> -->
				<!-- 				</div> -->
			</div>
		</div>
	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
	integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
	crossorigin="anonymous"></script>
</html>