<%@page import="com.fit.se.entity.DeTai"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Danh sách đề tài</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.table th, .table td {
	vertical-align: middle;
}

.research-area {
	font-weight: bold;
}

.project-list {
	font-style: italic;
	font-size: 0.9em;
}
</style>
</head>
<body>
	<c:if test="${empty listDeTai}">
		<p>Không có dữ liệu</p>
	</c:if>

	<div class="container mt-5">
		<a href="index.jsp" class="btn btn-primary mb-2">Trở về trang chủ</a>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th scope="col">Faculty ID</th>
					<th scope="col">Full Name</th>
					<th scope="col">Research Area</th>
					<th scope="col">Telephone Number</th>
					<th scope="col">ActionsActions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listDeTai}" var="deTai">
					<tr>
						<td>${deTai.getGiangVien().getMaGV()}</td>
						<td>${deTai.getGiangVien().getTenGV()}
							<div class="project-list">
								Danh sách đề tài:
								<ul>
									<li>${deTai.getTenDeTai()}</li>
								</ul>
							</div>
						</td>
						<td class="research-area">${deTai.getGiangVien().getLinhVuc()}</td>
						<td>${deTai.getGiangVien().getSoDienThoai()}</td>
						<td><a href="home-controller?action=add"
							class="btn btn-primary">Thêm đề tài</a> <a
							href="home-controller?action=delete&id=${deTai.getMaDeTai()}"
							class="btn btn-danger">Xóa</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="home-controller?action=add-teacher" class="btn btn-secondary mb-2">+ Thêm mới
			giảng viên</a>

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>