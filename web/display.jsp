<%-- 
    Document   : display
    Author     : Ken Wood
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Order</title>
    </head>
    <body>
        <table>
            <tr>
                <th>Product</th>
                <th>${Order.productName}</th>
            </tr>
            <tr>
                <th>Quantity</th>
                <th>${Order.productQuantityNum}</th>
            </tr>
            <tr>
                <th>Order Total</th>
                <th>${Order.productName}</th>
            </tr>
            <tr>
                <th>Shipping Address</th>
                <th>${Order.userAddr}</th>
            </tr>
            <tr>
                <th>Credit Card</th>
                <th>${Order.userAddr}</th>
            </tr>
        </table>
    </body>
</html>
