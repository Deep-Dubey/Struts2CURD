<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>Product</title>
        <style type="text/css">
            .button-register {background-color: green;color: white;}
            .button-report {background-color: yellow;color: red;margin-left: 30%;}
        </style>
    </head>
    <body>
        <u><h2>Add Product</h2><u>
        <a href="productreport"><button class="button-report" type="button">Report</button></a>
        <s:form action="registerproduct.action" method="post">
            <s:textfield label="Product Id" name="productId" />
            <s:textfield label="Product Name" name="productName" />
            <s:textfield label="Product Make" name="productMake" />
            <s:textfield label="Price" name="price" />
            <s:password label="Availability" name="availability" />
            <s:submit cssClass="button-register" value="Register" />
        </s:form>
        <s:if test="ctr>0">
            <span style="color: green;"><s:property value="msg" /></span>
        </s:if>
        <s:else>
            <span style="color: red;"><s:property value="msg" /></span>
        </s:else>
    </body>
</html>