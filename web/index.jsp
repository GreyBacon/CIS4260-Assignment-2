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
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <title>Order Form</title>
    </head>
    <body>
    <div id="mainFormDiv" >
        <h2>Order Form</h2>
        
        <? if(${error_message}!=null{?>
        <h2 id="errorMessage">${error_message}</h2>
        <?}?>
        
            <form action="OrderServlet" method="post" id="mainForm">
                <label>Product: </label> 
                <input type="text" name="product_name" value="${product_name}" required>
                </br>
                <label>Quantity: </label>
                <select name="product_quantity" id="selectQuantity"> </select> <!--Populated via script -->
                </br>
                <label>Unit Price: </label>
                <input type="text" name="product_price" value="${product_price}" required>
                </br>
                <label>Name: </label>
                <input type="text" name="user_name" value="${user_name}" required>
                </br>
                <label>Shipping Address: </label>
                <textarea name="user_addr" rows="4"></textarea>
                </br>
                <label>Credit Card: </label>
                <div> 
                    <input type="radio" name="credit_card" value ="Visa" checked>Visa<br>
                    <input type="radio" name="credit_card" value ="Master Card">Master Card<br>
                    <input type="radio" name="credit_card" value ="American Express">American Express<br>
                    <input type="radio" name="credit_card" value ="Discover">Discover<br>
                </div>
                <label>Credit Card Number: </label>
                <input type="password" name="cc_no" required>
                </br>
                <label>Repeat Credit Card Number: </label>
                <input type="password" name="cc_no_repeat" required >
                </br>
                
                <hr>
                <input type="submit" value="Submit Order" id="btnSubmit" >

            </form>
    </div>
    </body>
    
    <script>
        var maxQuantity = 9; //Max value for the amount of products in the dropdown
        
        $(document).ready(function() {
            for(i=1; i<maxQuantity+1; i++){
            $("#selectQuantity").append($('<option></option>').val(i).html(i));     //Fills out the product quantity dropdown
            }

        })
    </script>
</html>
