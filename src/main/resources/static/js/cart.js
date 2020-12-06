var cart = {}; //Моя корзина

$('document').ready(function(){
     change_count();
     checkCart();
     showMiniCart();


});

$(function(){
console.dir(localStorage.getItem("cart"))// Меняет кол-во товара в корзине (число)
   $(".button-cart").on('click',function(){

        var total_count = 0;
        var article = $(this).attr('data-art');
        console.log("Article = " + article);
        //cart.ShoppingCartItems.push({id: "id", title: "title", author: "author", price: "price"});
        if (cart[article] != undefined){
            cart[article]++;
        } else {
            cart[article] = 1;
        }
        if (localStorage.getItem('total_count')!=null){
             total_count = localStorage.getItem('total_count');
        }
        total_count++;
        localStorage.setItem("cart", JSON.stringify(cart));
        localStorage.setItem("total_count",total_count);
        console.log(cart);
        change_count();
        showMiniCart();
   })
});

function change_count(){ // Меняеет кол-во товаров в корззине
     var total_count = 0;
     if (localStorage.getItem('total_count')!=null){
             total_count = localStorage.getItem('total_count');
      }
      $("#easynetshop-cart-count").html(total_count);
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

