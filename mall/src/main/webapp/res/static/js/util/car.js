layui.define(['layer'], function (exports) {
    var layer = layui.layer;

    var car = {
        init: function () {
            var uls = document.getElementById('list-cont').getElementsByTagName('ul');//每一行
            var checkInputs = document.getElementsByClassName('check'); // 所有勾选框
            var checkAll = document.getElementsByClassName('check-all'); //全选框
            var SelectedPieces = document.getElementsByClassName('Selected-pieces')[0];//总件数
            var piecesTotal = document.getElementsByClassName('pieces-total')[0];//总价
            var batchdeletion = document.getElementsByClassName('batch-deletion')[0];//批量删除按钮
            //计算
            function getTotal() {
                var seleted = 0, price = 0;
                for (var i = 0; i < uls.length; i++) {
                    if (uls[i].getElementsByTagName('input')[0].checked) {
                        seleted += parseInt(uls[i].getElementsByClassName('Quantity-input')[0].value);
                        price += parseFloat(uls[i].getElementsByClassName('sum')[0].innerHTML);
                    }
                }
                SelectedPieces.innerHTML = seleted;
                piecesTotal.innerHTML = '￥' + price.toFixed(2);
            }


            function fn1() {
                alert(1)
            }

            // 小计
            function getSubTotal(ul) {
                var cookieId = ul.getElementsByClassName('cookieId')[0].innerHTML;
                var unitprice = parseFloat(ul.getElementsByClassName('th-su')[0].innerHTML);
                var count = parseInt(ul.getElementsByClassName('Quantity-input')[0].value);/*加减后的数量*/
                var SubTotal = parseFloat(unitprice * count);
                ul.getElementsByClassName('sum')[0].innerHTML = SubTotal.toFixed(2);
                /*将修改后的值传入*/
                var cookieVal = $.cookie(cookieId);
                var arr = cookieVal.split(";");
                arr[5] = count;
                var cookieValue = "";
                for (var i = 0; i < arr.length; i++) {
                    cookieValue = cookieValue + arr[i] + ";";
                }
                $.cookie(cookieId, cookieValue);
            }

            for (var i = 0; i < checkInputs.length; i++) {
                checkInputs[i].onclick = function () {
                    if (this.className === 'check-all check') {
                        for (var j = 0; j < checkInputs.length; j++) {
                            checkInputs[j].checked = this.checked;
                        }
                    }
                    if (this.checked == false) {
                        for (var k = 0; k < checkAll.length; k++) {
                            checkAll[k].checked = false;
                        }
                    }
                    getTotal()
                }
            }

            for (var i = 0; i < uls.length; i++) {
                uls[i].onclick = function (e) {
                    e = e || window.event;
                    var el = e.srcElement;
                    var cls = el.className;
                    var input = this.getElementsByClassName('Quantity-input')[0];
                    var less = this.getElementsByClassName('less')[0];
                    var cookieId = this.getElementsByClassName('cookieId')[0].innerHTML;
                    var val = parseInt(input.value);
                    var that = this;
                    switch (cls) {
                        case 'add layui-btn':
                            input.value = val + 1;
                            getSubTotal(this);
                            break;
                        case 'less layui-btn':
                            if (val > 1) {
                                input.value = val - 1;
                            }
                            getSubTotal(this);
                            break;
                        case 'dele-btn':
                            layer.confirm('你确定要删除吗', {
                                yes: function (index, layero) {

                                    /*删除此条数据*/
                                    $.cookie(cookieId, "", {expires: -1});
                                    $("#cart-num").html((parseInt($("#cart-num").html()) - 1));
                                    layer.close(index);
                                    that.parentNode.removeChild(that);
                                    getTotal();
                                }
                            });
                            break;
                    }
                    getTotal();

                }
            }
            batchdeletion.onclick = function () {
                if (SelectedPieces.innerHTML != 0) {
                    layer.confirm('你确定要删除吗', {
                        yes: function (index, layero) {
                            layer.close(index);
                            for (var i = 0; i < uls.length; i++) {
                                var input = uls[i].getElementsByTagName('input')[0];
                                if (input.checked) {
                                    uls[i].parentNode.removeChild(uls[i]);
                                    i--;
                                }
                            }
                            for (var i = 0; i < 30; i++) {
                                if ($.cookie(i.toString()) == null) {

                                } else {
                                    $.cookie(i.toString(), "", {expires: -1});
                                    $("#cart-num").html(0);
                                }
                            }
                            getTotal()
                        }

                    })
                } else {
                    layer.msg('请选择商品')
                }

            };


            checkAll[0].checked = true;
            checkAll[0].onclick();


            $(function () {
                $("#layui-btn-settlement").click(function () {
                    if ($.cookie("userTel") == null) {
                        layer.msg('请先登录！');
                    } else {
                        var uls = document.getElementById('list-cont').getElementsByTagName('ul');//每一行
                        var list = [];//数组
                        var flag = 0;
                        for (var i = 0; i < uls.length; i++) {
                            if (uls[i].getElementsByTagName('input')[0].checked) {
                                list[flag] = [
                                    uls[i].getElementsByClassName('goodsid')[0].innerHTML,
                                    uls[i].getElementsByClassName('title')[0].innerHTML,
                                    parseInt(uls[i].getElementsByClassName('Quantity-input')[0].value)
                                ];
                                flag += 1;
                            }
                        }
                        var fee = parseInt($(".pieces-total").html().substr(1));
                        if (fee > 0) {
                            //提交订单
                            $.ajaxSettings.traditional = true;
                            $.ajax({
                                url: "CreateOrder",
                                type: "post",
                                dataType: "json",
                                data: {"goodsList": list},
                                success: function (data) {
                                    for (var i = 0; i < 30; i++) {
                                        if ($.cookie(i.toString()) == null) {

                                        } else {
                                            $.cookie(i.toString(), "", {expires: -1});
                                        }
                                    }
                                    if (data === 0) {
                                        window.location.href = 'confirm_orders.html';
                                    }
                                }
                                , error: function (data) {

                                }
                            });
                        } else
                            layer.msg('请选择商品');
                    }
                })
            })
        }


    };


    exports('car', car)
}); 