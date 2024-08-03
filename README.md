
### Prompts the user to enter the number of levels for the pyramid.
``` println("Enter the number of stars ")```
#### Reads the input and converts it to an integer.

```   
    var index=readLine()?.toInt()
```
### Outer loop (for(i in 1..index!!)):

This loop runs from 1 to index (inclusive). Each iteration represents a level of the pyramid.
First inner loop (for(j in 1..index-i)):

This loop prints spaces. The number of spaces decreases as the level i increases.
For example, if index is 5 and i is 1 (first level), it will print 4 spaces (5-1). If i is 2 (second level), it will print 3 spaces (5-2), and so on.
Second inner loop (for (k in 1..(i*2-1))):

This loop prints stars (*). The number of stars increases with each level.
For example, if i is 1 (first level), it will print 1 star (1*2-1). If i is 2 (second level), it will print 3 stars (2*2-1), and so on.
println() statement:

This moves the cursor to the next line after printing the stars for the current level.

``` for(i in 1..index!!){
        for(j in 1..index-i){
            print(" ")
        }
        for (k in 1..(i*2-1)){
            print("*")
        }
        println()

    }
```
# result
<img src="https://github.com/user-attachments/assets/a036f8bd-b334-4b57-9495-a28082c2ed0b" />



