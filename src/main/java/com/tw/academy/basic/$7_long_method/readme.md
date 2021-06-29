# Clean Code - Long Method

* 移除Deprecated且没被使用的方法`printCustomerName` ，对于没有用到的方法尽量移除，可以避免开发人员在读代码时浪费精力去阅读无用的代码。
* 由于类`OrderReceipt`的属性`Order`初始化后不能被改变，可以添加`final`关键字，在可读方面一看代码就会知道该属性是不可变的。
* 完成代码中`todo`的内容，该类已经是订单收据类，对于其打印收据的方法`printReceipt`可以重命名为`print`，从可读方面已经可以让开发人员看出是打印收据的意思。
* 重命名`LineItem`为`OrderItem`，提高了可读性，看到`LineItem`可能看不出是什么意思，但是重命名为`OrderItem`后一看就知道是订单项。
* 抽出打印订单项的方法`print`到`OrderItem`类中，因为打印订单项是订单项的一种行为，不仅提高了可读性，同时方便订单项的后期扩展。
* 重命名`OrderItem`中的方法名`totalAmount`为`getTotalAmount`，因为方法是一种行为，而不是属性，提高了可读性。
* 移除`OrderReceipt`中被注释掉的代码，避免阅读代码时受到影响。
* 将`OrderReceipt`中打印客户信息部分抽成`Order`中的获取用户信息方法`getCustomerInformation`，提高了可读性。
* 将逐个打印订单项的方法抽到订单中，它是订单的一种行为，提高了可读性，同时方便代码扩展。

