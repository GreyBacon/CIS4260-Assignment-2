/*
 * 
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Ken Wood
 */
public class OrderServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       //input: product_name, product_quantity, product_price, user_name, user_addr, creditCard, ccNo
       response.setContentType("text/html;charset=UTF-8");
       String productName = request.getParameter("product_name");
       String productQuantity = request.getParameter("product_quantity");
       Integer productQuantityNum = Integer.valueOf(productQuantity);   //Convert quantity to int, only save this value into object
       String productPrice = request.getParameter("product_price");
       Double productPriceNum = Double.valueOf(productPrice);   //Convert unit price to double, only save this value into object
       String userName = request.getParameter("user_name");
       String userAddr = request.getParameter("user_addr");
       String creditCard = request.getParameter("credit_card");
       String ccNo = request.getParameter("cc_no");
       
       Order newOrder = new Order(productName,productQuantityNum, productPriceNum, userName, userAddr, creditCard, ccNo);//Create order object with information from form
       
       //Figure out details on how this work better *********************************************
       request.setAttribute("Order", newOrder);
       RequestDispatcher dispatcher = request.getRequestDispatcher("display.jsp");
       dispatcher.forward(request, response);
       
       //response.sendRedirect("display.jsp");
       
       /* just for testing inputs 
        try (PrintWriter out = response.getWriter()) {
            out.println("productName: " + productName);
            out.println("productQuantityNum: " + productQuantityNum +", test valid int " + ++productQuantityNum);
            out.println("userName: " + userName);
            out.println("userAddr: " + userAddr);
            out.println("creditCard: " + creditCard);
            out.println("ccNo: " + ccNo);
            out.println("javabean access: " + newOrder.getCcNo());
        }*/
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
