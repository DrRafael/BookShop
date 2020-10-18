




function filters(){
    let filterCategory = document.getElementById("filtercategory");
    let filterPrice = document.getElementById("pricesfilter");

    let previousCategory = filterCategory.value;
    let previousPrice = filterPrice.value;
    let  path = '/filter';
    let dataObj = {};

    if (filterCategory.value ===  'all' && filterPrice.value === 'nofilter'){
        path = '/';
    }

    if (filterCategory.value != 'all' && filterPrice.value === 'nofilter'){

       dataObj =    {category : filterCategory.value , pricesort : "nofilter"};
    }

    if (filterCategory.value ===  'all' && filterPrice.value != 'nofilter'){
        dataObj =    {category  :"all" , pricesort : filterPrice.value};
    }

    if (filterCategory.value !=  'all' && filterPrice.value != 'nofilter'){
        dataObj =    {category : filterCategory.value , pricesort : filterPrice.value};
    }

    $.ajax({
        url: path,
        data: dataObj,
        type: 'GET',
        success: function( data ) {
            $("body").html(data);
            $("#filtercategory").val(previousCategory);
            $("#pricesfilter").val(previousPrice);
        }
        });


}