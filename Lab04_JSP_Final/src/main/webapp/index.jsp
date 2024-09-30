<%@page import="com.fit.se.beans.Product"%>
<%@ page contentType="text/html" language="java"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<jsp:useBean id="products" scope="request"
	type="java.util.List<Product>" />

<!DOCTYPE html>
<html>
<head>
<title>Title</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<a href="${pageContext.request.contextPath}/cart.jsp"
			class="btn btn-link">View cart</a>

		<div
			style="display: inline-grid; grid-template-columns: repeat(3, 1fr); gap: 20px;">
			<c:forEach items="${products}" var="product">
				<form name="modelDetail" method="post"
					action="/demo/CartController">
					<div class="card text-center" style="width: 18rem;">
						<h5 style="margin-top: 8px;">${product.model}</h5>
						<img alt="Card image cap" class="card-img-top"
							src="https://picsum.photos/200">
						<div class="card-body">
							<h5>Price: ${product.price}</h5>
							<input max={product.quantity} maxlength="2" min="1" type="number" name="quantity"
								value="1">
							<input type="hidden" name="id" value="${product.id}">	
							<input type="hidden" name="model" value="${product.model}">
							<input type="hidden" name="price" value="${product.price}">
<%-- 							<input type="hidden" name="image" value="${product.image}"> --%>
		                    <input type="hidden" name="action" value="add">								
								 <br>
							<button type="submit" class="btn btn-primary">Add to
								cart</button>
						</div>
					</div>
				</form>
			</c:forEach>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>
