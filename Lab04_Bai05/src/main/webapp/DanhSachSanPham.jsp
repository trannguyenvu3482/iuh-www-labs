<%@page import="com.fit.se.beans.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<jsp:useBean id="books" scope="request"
	type="java.util.List<com.fit.se.beans.Book>" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

<title>Document</title>
</head>
<body>
	<div class="container container-fluid">
		<header
			class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
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
				<c:if test="${not empty sessionScope.cart}">
					<li class="nav-item"><a href="cart.jsp" class="btn btn-primary">Giỏ
							hàng</a></li>
				</c:if>
			</ul>
		</header>
		<main>
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
					<div
						style="display: grid; grid-template-columns: repeat(3, 1fr); gap: 20px;">
						<c:forEach items="${books}" var="book">
							<div class="card" style="width: 18rem;">
								<img
									src="${pageContext.request.contextPath}/resources/images/${book.imgURL}"
									class="card-img-top" alt="..." width="120">
								<div class="card-body">
									<h5 class="card-title">${book.title}</h5>
									<p class="card-text">Giá: ${book.price}đ</p>
									<p class="card-text">Số lượng: ${book.quantity}</p>
									<div style="display: flex; justify-content: space-between;">
										<a href="book-detail?id=${book.id}" class="btn btn-primary">Chi
											tiết sản phẩm</a> <a href="cart?action=add&id=${book.id}"
											class="btn btn-danger">Thêm</a>
									</div>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>
			</div>
		</main>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
		integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
		crossorigin="anonymous"></script>
</body>
</html>