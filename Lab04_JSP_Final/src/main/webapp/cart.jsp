<%--
  Created by IntelliJ IDEA.
  User: trannguyenvu3482
  Date: 19/09/2024
  Time: 09:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<jsp:useBean id="cart" scope="session" class="com.fit.se.beans.CartBean" />

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
		<a href="${pageContext.request.contextPath}/ProductController"
			class="btn btn-link">List Products</a>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th scope="col">Model Description</th>
					<th scope="col">Quantity</th>
					<th scope="col">Unit Price</th>
					<th scope="col">Total</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${cart.getLineItemCount()==0}">
					<tr>
						<td colspan="4">No items in cart</td>
					</tr>
				</c:if>
				<c:forEach items="${cart.cartItems}" var="cartItem">
					<tr>
						<td>
							<h4>${cartItem.modelDescription}</h4>
						</td>
						<td>
							<form name="updateCart" method="post"
								action="${pageContext.request.contextPath}/CartController">
								<input type="hidden" name="index" value="${cartItem.modelID}">
								<input type="hidden" name="action" value="update"> <input
									type="number" name="quantity" value="${cartItem.quantity}"
									min="1">
								<button type="submit" class="btn btn-primary">Update</button>
							</form>
							<form name="removeFromCart" method="post"
								action="${pageContext.request.contextPath}/CartController">
								<input type="hidden" name="index" value="${cartItem.modelID}">
								<input type="hidden" name="action" value="remove">
								<button type="submit" class="btn btn-danger">Remove</button>
							</form>
						</td>
						<td>${cartItem.modelPrice}</td>
						<td>${cartItem.total}</td>
					</tr>
				</c:forEach>

				<tr>
					<td colspan="2"></td>
					<td></td>
					<td>Subtotal: ${cart.orderTotal}</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>
</html>
