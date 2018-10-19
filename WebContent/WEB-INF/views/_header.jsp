<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<html>
<head>
 <link href="Bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet" type="text/css">
<link href="css/font-awesome.css" rel="stylesheet" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Poppins:300,500,600,700' rel='stylesheet' type='text/css'>
<link href="css/owl.carousel.css" rel="stylesheet" type="text/css">
<script src="js/jQuery.js"></script> 
 
<script src="Bootstrap/js/bootstrap.js"></script> 
<script src="js/owl.carousel.min.js"></script> 
<script src="js/globle.js"></script>
</head>
<body>
<div class="header">
        <div class="header-top">
            <div class="container">
                <div class="call pull-left">
                    <p>Call us toll free : <span>+1324 353 4689</span></p>
                </div>
                <div class="user-info pull-right">
                    <div class="user">
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/login">Login:<b>${loginedUser.userName}</b></a> 
                                <!-- Modal -->
                                
                            </li>
                            <li><a href="#" data-toggle="modal" data-target="#register">Register</a>
                                <div class="modal fade" id="register" role="dialog">
                                    <div class="modal-dialog"> 
                                        <!-- Modal content-->
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <div class="panel-heading">
                                                    <div class="panel-title pull-left">Register</div>
                                                    <div class="pull-right">
                                                        <button aria-hidden="true" data-dismiss="modal" class="close" type="button"><i class="fa fa-times"></i> </button>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="modal-body">
                                                <div class="control-group"> 
                                                    <!-- Username -->
                                                    <label class="control-label"  for="username">Username</label>
                                                    <div class="controls">
                                                        <input type="text" id="username" name="username" placeholder="" class="input-xlarge">
                                                        <p class="help-block">Username can contain any letters or numbers, without spaces</p>
                                                    </div>
                                                </div>
                                                <div class="control-group"> 
                                                    <!-- E-mail -->
                                                    <label class="control-label" for="email">E-mail</label>
                                                    <div class="controls">
                                                        <input type="text" id="email" name="email" placeholder="" class="input-xlarge">
                                                        <p class="help-block">Please provide your E-mail</p>
                                                    </div>
                                                </div>
                                                <div class="control-group"> 
                                                    <!-- Password-->
                                                    <label class="control-label" for="password">Password</label>
                                                    <div class="controls">
                                                        <input type="password" id="password" name="password" placeholder="" class="input-xlarge">
                                                        <p class="help-block">Password should be at least 4 characters</p>
                                                    </div>
                                                </div>
                                                <div class="control-group"> 
                                                    <!-- Password -->
                                                    <label class="control-label"  for="password_confirm">Password (Confirm)</label>
                                                    <div class="controls">
                                                        <input type="password" id="password_confirm" name="password_confirm" placeholder="" class="input-xlarge">
                                                        <p class="help-block">Please confirm password</p>
                                                    </div>
                                                </div>
                                                <div class="control-group"> 
                                                    <!-- Button -->
                                                    <div class="controls">
                                                        <button class="btn btn-success">Register</button>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="header-mid">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 header-left">
                        <div class="logo"> <a href="index.html"><img src="images/logo.png" alt="#"></a> </div>
                    </div>
                    <div class="col-md-6 search_block">
                        <div class="search">
                            <form action="grid-view.html">
                                <div class="search_cat">
                                    <select class="search-category" name="search-category">
                                        <option class="computer" selected>All Categories</option>
                                        <option class="computer">Men</option>
                                        <option class="computer">Women</option>
                                        <option class="computer">Kids</option>
                                        <option class="computer">Computer</option>
                                        <option class="computer">Electronics</option>
                                    </select>
                                    <span class="fa fa-angle-down"></span> </div>
                                <input type="text" placeholder="Search...">
                                <button type="submit" class="btn submit"> <span class="fa fa-search"></span></button>
                            </form>
                        </div>
                    </div>
                    <div class="col-md-3 header-right">
                        <div class="cart">
                            <div class="cart-icon dropdown"></div>
                            <a aria-expanded="false" aria-haspopup="true" role="button" data-toggle="dropdown" class="dropdown-toggle" href="cart.html">My Cart( 2 )<span> $261.20</span></a>
                            <ul class="dropdown-menu pull-right cart-dropdown-menu">
                                <li>
                                    <table class="table table-striped">
                                        <tbody>
                                            <tr>
                                                <td class="text-center"><a href="product.html"><img class="img-thumbnail" src="images/product/car3-70x92.jpg" alt="img"></a></td>
                                                <td class="text-left"><a href="#">Black African Print Pencil Skirt</a></td>
                                                <td class="text-right quality">X1</td>
                                                <td class="text-right price-new">$254.00</td>
                                                <td class="text-center"><button type="button" title="Remove" class="btn btn-xs remove"><i class="fa fa-times"></i></button></td>
                                            </tr>
                                            <tr>
                                                <td class="text-center"><a href="product.html"><img class="img-thumbnail" src="images/product/car3-70x92.jpg" alt="img"></a></td>
                                                <td class="text-left"><a href="#">Black African Print Pencil Skirt</a></td>
                                                <td class="text-right quality">X1</td>
                                                <td class="text-right price-new">$254.00</td>
                                                <td class="text-center"><button type="button" title="Remove" class="btn btn-xs remove"><i class="fa fa-times"></i></button></td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </li>
                                <li>
                                    <div class="minitotal">
                                        <table class="table pricetotal">
                                            <tbody>
                                                <tr>
                                                    <td class="text-right"><strong>Sub-Total</strong></td>
                                                    <td class="text-right price-new">$210.00</td>
                                                </tr>
                                                <tr>
                                                    <td class="text-right"><strong>Eco Tax (-2.00)</strong></td>
                                                    <td class="text-right price-new">$2.00</td>
                                                </tr>
                                                <tr>
                                                    <td class="text-right"><strong>VAT (20%)</strong></td>
                                                    <td class="text-right price-new">$42.00</td>
                                                </tr>
                                                <tr>
                                                    <td class="text-right"><strong>Total</strong></td>
                                                    <td class="text-right price-new">$254.00</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                        <div class="controls"> <a class="btn btn-primary pull-left" href="cart.html" id="view-cart"><i class="fa fa-shopping-cart"></i> View Cart </a> <a class="btn btn-primary pull-right" href="checkout.html" id="checkout"><i class="fa fa-share"></i> Checkout</a> </div>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
    </div>
</body>
</html>