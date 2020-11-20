var cart = {}; //Моя корзина
$('document').ready(function(){
     checkCart();
     showMiniCart();
});

$(function(){
console.dir(localStorage.getItem("cart"))// Меняет кол-во товара в корзине (число)
   $(".button-cart").on('click',function(){
        change_count();
        var article = $(this).attr('data-art');
        console.log("Article = " + article);
        //cart.ShoppingCartItems.push({id: "id", title: "title", author: "author", price: "price"});
        if (cart[article] != undefined){
            cart[article]++;
        } else {
            cart[article] = 1;
        }

       localStorage.setItem("cart", JSON.stringify(cart));
        console.log(cart);
        showMiniCart();
   })
});
function change_count(){ // Меняеет кол-во товаров в корззине
      let old_value  =  $("#easynetshop-cart-count").html();
      $("#easynetshop-cart-count").html(++old_value);
}
function checkCart(){
    //Провереию наличие корзины в locolStorage;
    if( localStorage.getItem('cart')!= null){
        cart = JSON.parse (localStorage.getItem('cart'));

    }

}
function showMiniCart(){
    //Показываю мини корзину
    var out ='';
    var cart;
    if( localStorage.getItem('cart')!= null){
           cart = JSON.parse (localStorage.getItem('cart'));
     }
    for (var w in cart){
        out += w +'----' + cart[w] + '<br>';
    }
    $('#miniCart').html(out);

}
