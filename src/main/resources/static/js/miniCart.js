var cart={};// корзина


function showCart() {
        var out= '';
        for (var id in cart){
           out += id + '---'+ cart[id]+'<br>';
          //out += '<button class="delete">x</button>';

        }
         $('#my-cart').html(out);
}
checkCart();
showCart(); // Вывожу товары на страницу

function checkCart(){
    //Провереию наличие корзины в locolStorage;
    if( localStorage.getItem('cart')!= null){
        cart = JSON.parse (localStorage.getItem('cart'));
    }
 }
