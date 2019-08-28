
	<c:if test="${ produit != null }">
		<h2>${ produit.nomProduit }</h2>
		
		<img src="${ produit.photoProduit }">
		
		
		
		<p>${ produit.description }</p>
		
		<button>Ajouter au panier</button><br>
	
	</c:if>
	
	<a href="home">Retour à la liste d'article</a>