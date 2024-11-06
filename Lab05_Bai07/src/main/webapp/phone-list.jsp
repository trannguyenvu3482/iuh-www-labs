<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách sản phẩm</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
	<div style="flex-direction: column;" class="container d-flex justify-between">
		<header class="text-center border border-2">
			<a href="phone-list" class="btn btn-link">Danh sách sản phẩm</a>
			| <a href="add-phone.jsp" class="btn btn-link">Thêm mới sản
				phẩm</a> | <a href="manage-phone" class="btn btn-link">Chức năng
				quản lý</a>
		</header>
		<main class="flex-1">
			<h2>Danh sách sản phẩm</h2>
			
			<form action="phone-list" method="post">
				<input type="text" name="search"></input>
				<button type="submit" class="btn btn-primary">Tìm kiếm</button>
			</form>
			
			<table class="table table-bordered table-striped table-hover">
				<thead>
					<tr>
						<th>Mã điện thoại</th>
						<th>Tên sản phẩm</th>
						<th>Năm sản xuất</th>
						<th>Cấu hình</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listDienThoai}" var="item">
						<tr>
							<td>${item.maDienThoai}</td>
							<td>${item.tenDienThoai}</td>
							<td>${item.namSanXuat}</td>
							<td>${item.cauHinh}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</main>
		<footer>
			<p>Trần Nguyên Vũ - 21088201</p>
		</footer>
	</div>
</body>
</html>