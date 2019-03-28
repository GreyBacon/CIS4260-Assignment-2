<%-- 
    Document   : display
    Author     : Ken Wood
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="main.css">
        <title>Display Order</title>
    </head>
    <body>
        <div id="displayForm">
            <h1>Order Details</h1>
            <p>${Order.userName}, thank you for your order.</p>
            <table>
                <tr>
                    <th class="tLabel">Product</th>
                    <th class="tVal">${Order.productName}</th>
                </tr>
                <tr>
                    <th class="tLabel">Quantity</th>
                    <th class="tVal">${Order.productQuantityNum}</th>
                </tr>
                <tr>
                    <th class="tLabel">Order Total</th>
                    <th class="tVal">${Order.totalPrice}</th>
                </tr>
                <tr>
                    <th class="tLabel">Shipping Address</th>
                    <th class="tVal">${Order.userAddr}</th>
                </tr>
                <tr>
                    <th class="tLabel">Credit Card</th>
                    <th class="tVal">${Order.creditCard}</th>
                </tr>
            </table>
        </div>
    </body>
</html>
