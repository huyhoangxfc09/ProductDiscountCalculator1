
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<br/>
<form method="post" action="/display-discount">
  <input type="text" name="Product Description" placeholder="Product Description" value="a"><br>
  <input type="number" name="List Price" placeholder="List Price" value="1"><br>
  <input type="number" name="Discount Percent" placeholder="Discount Percent" value="1"><br>
  <input type="submit" id="submit" value="Calculate Discount">
</form>
</body>
</html>
