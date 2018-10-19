<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<section id="main-menu">
        <div class="container">
            <nav class="navbar navbar-default">
                <div class="navbar-header">
                    <button aria-controls= "navbar" data-target="#navbar" data-toggle="collapse" class="navbar-toggle collapsed" type="button"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
                    <a href="#" class="navbar-brand">menu</a> </div>
                <div class="navbar-collapse collapse" id="navbar">
                    <ul class="nav navbar-nav">
                        <li><a href="index.html">HOME</a></li>
                        <li><a href="grid-view.html">WOMEN</a></li>
                        <li><a href="grid-view.html">MEN</a><span class="new">new</span></li>
                        <li class="dropdown"> <a aria-expanded="false" aria-haspopup="true" role="button" data-toggle="dropdown" class="dropdown-toggle" href="#"> PAGES<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="checkout.html">Checkout</a></li>
                                <li><a href="cart.html">Shoping Cart</a></li>
                                <li><a href="checkout-step1.html">Billing & shipping address</a></li>
                                <li><a href="checkout-step2.html">Delivery method </a></li>
                                <li><a href="checkout-step3.html">Payment method</a></li>
                                <li><a href="checkout-step4.html">Order riview</a></li>
                                <li><a href="404.html">Page Notfound</a></li>
                            </ul>
                        </li>
                        <li><a href="blog.html">BLOG</a></li>
                        <li><a href="contact-us.html">CONTACT US</a></li>
                        <li><a href="about-us.html">ABOUT US</a></li>
                    </ul>
                </div>
            </nav>
        </div>
    </section>
    <!-- Main menu End --> 
    
    <!-- Main Banner Start-->
    <section id="banner">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div id="main-slider" class="owl-carousel">
                        <div class="item"><img src="images/main-banner1.jpg" alt="main-banner1"></div>
                        <div class="item"><img src="images/main-banner2.jpg" alt="main-banner2"></div>
                        <div class="item"><img src="images/main-banner3.jpg" alt="main-banner3"></div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</body>
</html>