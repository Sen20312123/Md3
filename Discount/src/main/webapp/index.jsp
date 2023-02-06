<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<h1> Discount Calculator</h1>
<br/>
    <form action="/display-discount" method="post">
        <label>Product Description:</label>
        <input type="text" name="description"/><br/>
        <label>List Price:</label>
        <input type="text" name="price"/><br/>
        <label>Discount Percent:</label>
        <input type="text" name="percent"/>
        <input type="submit" id="submit" value="Calculate Discount"/>
    </form>
</body>
</html>