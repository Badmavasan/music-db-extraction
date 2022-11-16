<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<h1>${music.artist}</h1>
	
	
</html>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table>
	<thead>
		<tr>
			<th>Artist</th>
			<th>Track</th>		
		</tr>
	</thead>
  	
  	<tbody>
  		<c:forEach items="${musics}" var="music">
    		<tr>
    			<td>${music.artist}</td>   
		        <td>
		        	<audio controls>
	 					<source src="${music.link}" type="audio/mpeg">
					</audio>
				</td>  
		    </tr>
		</c:forEach>
  	</tbody>

</table>