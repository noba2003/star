برنامج بسيط لعمل اشكال هندسية

1- عرض رسالة لطلب عدد السطور المطلوب رسم *
2- احفظ قيمة المدخلة من المستخدم index 
3- عمل for خارجية مهمتها عمل سطور جديدة بعدد index.
4- عمل nested loop
5- first loop مهمتها رسم " "
قيمة بداية loop 1 و تنتهي index -i
print(" ")

6- second loop مهمتها رسم " "
قيمة بداية loop 1 و تنتهي i*2-1
print("*")

i*2-1
شرح المعادلة القيمة الحالية i في for الخارجية * 2 -1 يضمن زيادة عدد النجوم بعدد 2 في كل صطر جديد
اخر شي 
prinln لينزل سطر جديد ويتضح الشكل

**********************************
الشكل الثاني المثلث
1- عمل for خارجية مهمتها عمل سطور جديدة بعدد index.
2- عمل nested loop
3- first loop مهمتها رسم " "
قيمة بداية loop 1 و تنتهي i
print("*")

4- second loop مهمتها رسم " "
قيمة بداية loop 1 و تنتهي index-i
print(" ")
لضمان تقليل عدي الفراغات بالتدريج
====================================================
ChatGPT
Prompt the User for Input:

kotlin
نسخ الكود
println("Enter the number of stars ")
var index = readLine()?.toInt()
This part prompts the user to enter the number of rows for the pyramid and reads the input, converting it to an integer.

Outer Loop for Rows:

kotlin
نسخ الكود
for (i in 1..index!!) {
This loop iterates from 1 to the input value (index). Each iteration corresponds to a row of the pyramid.

Inner Loop for Leading Spaces:

kotlin
نسخ الكود
for (j in 1..index-i) {
print(" ")
}
This loop prints the leading spaces for each row to ensure the stars are centered. The number of spaces decreases as the row number increases.

Inner Loop for Stars:

kotlin
نسخ الكود
for (k in 1..(i*2-1)) {
print("*")
}
This loop prints the stars. The number of stars increases by 2 for each row, starting from 1 star in the first row.

Print New Line:

kotlin
نسخ الكود
println()