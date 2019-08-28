	
	<h1> Bonjour et bienvenue  <c:if test="${ sessionScope.user != null }">${sessionScope.user.username}</c:if></h1>
	
	<div class="container">
		<ul>
			<c:forEach items="${ produits }" var="pro" end="4" >
			
				<li>${ pro.nomProduit } : ${ pro.prix } € </li>
				<a href="Produit?id=${ pro.id }"><img src="${ pro.photoProduit }"></a>
				
			</c:forEach>
		</ul>
	</div>