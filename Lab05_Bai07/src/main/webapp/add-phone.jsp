<%@page import="java.io.IOException"%>
<%@page import="com.fit.se.entity.DienThoai"%>
<%@page import="jakarta.validation.ConstraintViolation"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

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
	<div style="flex-direction: column;"
		class="container d-flex justify-between">
		<header style="width: 100%;" class="text-center border border-2">
			<a href="phone-list" class="btn btn-link">Danh sách sản phẩm</a> | <a
				href="add-phone.jsp" class="btn btn-link">Thêm mới sản phẩm</a> | <a href="manage-phone"
				class="btn btn-link">Chức năng quản lý</a>
		</header>
		<main style="margin-top: 10px;">
			<h2>Thêm mới sản phẩm</h2>

			<c:if test="${not empty errors}">
				<c:forEach items="${errors}" var="error">
					<div class="alert alert-danger" role="alert">${error.getMessage()}</div>
				</c:forEach>
			</c:if>

			<form style="width: 400px;" action="add-phone-servlet" method="POST">
				<div class="mb-3">
					<label for="tenDienThoai" class="form-label">Tên điện thoại</label>
					<input type="text" class="form-control" id="tenDienThoai"
						name="tenDienThoai">
				</div>
				<div class="mb-3">
					<label for="namSanXuat" class="form-label">Năm sản xuất</label> <input
						type="number" class="form-control" id="namSanXuat" placeholder="2024"
						name="namSanXuat">
				</div>
				<div class="mb-3">
					<label for="cauHinh" class="form-label">Cấu hình</label> <input
						type="text" class="form-control" id="cauHinh" name="cauHinh">
				</div>
				<div class="mb-3">
					<label for="cauHinh" class="form-label">Nhà cung cấp</label> <select
						class="form-select" name="maNCC">
						<option value="1">Apple</option>
						<option value="2">Samsung</option>
						<option value="3">Xiaomi</option>
						<option value="4">Oppo</option>
						<option value="5">Vivo</option>
					</select>
				</div>

				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</main>
		<footer style="margin-top: 30px;">
			<p class="container">Trần Nguyên Vũ - 21088201</p>
		</footer>
	</div>
</body>
</html>