<html>
<head>
<title> First Web Application</title>

</head>
<body>
 <div class="container">
 <form method="post">
 <fieldset class="form-group">
 <label>Description</label>
 <input name="desc" type="text" class="from-control"/>
 </fieldset>
 
 <fieldset class="form-group">
 <form:labe path="targetDate">targetDate</from:label>
 <from:input path="targrtDate" type="text" class="from-control" required="required"/>
 <from:errors path="targetDate"  cssClass="text-warning"/>
 </fieldset>
 <button type="submit" class="btn-success">Add</button>>
 </div>
 </form>
</body>
</html>