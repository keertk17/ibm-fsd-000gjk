<!doctype html>  
<html lang="en">  
<head>  
  <meta charset="utf-8">  
  <title>jQuery UI Auto complete - Default functionality</title>  
  <link rel="stylesheet" href="https://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">  
  <script src="https://code.jquery.com/jquery-1.10.2.js"></script>  
  <script src="https://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>  
  <link rel="stylesheet" href="/resources/demos/style.css">  
  <script>  
  $(function() {
	//overriding jquery-ui.autocomplete .js functions
	$.ui.autocomplete.prototype._renderMenu = function(ul, items) {
	  var self = this;
	  //table definitions
	  ul.append("<table><thead><tr><th>ID#</th><th>Email</th><th>PhoneNumber</th><th>Name</th></tr></thead><tbody></tbody></table>");
	  $.each( items, function( index, item ) {
	    self._renderItemData(ul, ul.find("table tbody"), item );
	  });
	};
	$.ui.autocomplete.prototype._renderItemData = function(ul,table, item) {
	  return this._renderItem( table, item ).data( "ui-autocomplete-item", item );
	};
	$.ui.autocomplete.prototype._renderItem = function(table, item) {
	  return $( "<tr class='ui-menu-item' role='presentation'></tr>" )
	    .data( "item.autocomplete", item )
	    .append( "<td >"+item.id+"</td>"+"<td>"+item.email+"</td>"+"<td>"+item.mobile+"</td>" +"<td>"+item.name+"</td>")
	    .appendTo( table );
	};
	var Employee = [
	    {id:1,email:"thomas@gmail.com"moblie:"7258354775"name:"Thomas"},
	    {id:2,email:"thara@gmail.com"moblie:"7258854775"name:"Thara"},
	    {id:3,email:"sham@gmail.com"moblie:"7258359995"name:"Sham"},
	    {id:4,email:"keer@gmail.com"moblie:"7252254775"name:"Keerthana"},
	];
	
	$( "#Employee" ).autocomplete({
	    minLength: 1,
	    source: Employee,
	    //you can write for select too
	    focus: function( event, ui ) {
	        //console.log(ui.item.value);
	        $( "#Employee-id" ).val( ui.item.id );
	        $( "#Employee-email" ).html( ui.item.email );
	        $( "#Employee-mobile" ).html( ui.item.mobile );
	        $( "#Employee-name" ).html( ui.item.name );
	        return false;
	    }
	})
	});
	
  </script>  
  
</head>  
<body>  
<div class="ui-widget">  
  <label for="Employee">Search Employee By Name </label>  
  <input id="Employee" onkeyup="myFunction()">  
</div>  
</body>  
</html> 