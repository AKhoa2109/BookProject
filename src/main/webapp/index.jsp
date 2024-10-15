<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="beans.BookBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book</title>
</head>
<body>
	<h1>Cửa hàng bán sách online</h1>
    <table>
   		
      <thead>
        <tr>
          <th>Mô tả</th>
          <th>Giá</th>
          <th>&nbsp;</th>
        </tr>
      </thead>
      <tbody>
			<c:forEach items="${productList}" var="product">
            <tr>
                <td>${product.description}</td>
                <td class="right">${product.price}đ</td>
                <td>
                    <form action="BookServlet?id=${product.code}" method="post" name="button-add">
                    	<input type="hidden" name="productID" value="${product.code }"/>
                    	<input type="hidden" name="productDescription" value="${product.description}"/>
                    	<input type="hidden" name="productPrice" value="${product.price}"/>
                        <input type="submit" value="Add To Cart" />
                    </form>
                </td>
            </tr>
    	</c:forEach>
      </tbody>
      <tfoot></tfoot>
    </table>
    <style>
      tr > td:first-child {
        padding-right: 0 auto;
      }
      .right {
        padding-right: 10px;
      }
    </style>
</body>
</html>