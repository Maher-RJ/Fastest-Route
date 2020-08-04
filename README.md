# Task & Solution

### Task
![challenge3](https://user-images.githubusercontent.com/57875037/76688093-ffd40a00-6629-11ea-887a-c3dad4ada30e.png)

### Solution
<pre>
From {0,0,1}    
To {1,2,3}
LocationA = 2 , LocationB = 3 
 
(from[i], to[i]) an vertex of graph
for e.g : from[0] = 0
          to[0] = 1
so, it will be 
                         0
                           \
                             1
from[1] = 0
to [1] = 2
so, it will be 
                          0
                        /   \
                      2      1
from[2] = 1
to [2] = 3
so, it will be                       
                          0
                        /   \
                      2      1
                             |
                             3
                             
Now it will traverse like this 
2 -> 0 -> 1 -> 3     which is 3 steps.

```java
public class Graph {
    public static void main(String[] args) {
        int from[] = {0,0,1};
        int to[] = {1,2,3};
        System.out.println(fastestRoute(from, to, 2, 3));
    }
    public static int fastestRoute(int[] from, int[] to, int locationA, int locationB) {
        //initializing the step = 1
        int count = 1;
        
        //checking from 'from' locations
        for(int i = 0; i < from.length; i++) {
            
            //if to[i] location is equal to starting location that is locationA
            if(to[i] == locationA) {
                
                //it will check to further locations after the i index location and will find the destination
                for(int j = i+1; j < from.length; j++) {
                    //increment the step
                    count++;
                    if(to[j] == locationB) {
                        count++;
                        //if destination location is found
                        break;
                    }
                    //if another starting location is found it will be initialized to step because fastest route is main goal
                    else if(to[j] == locationA) {
                        count = 1;
                        i = j;
                        break;
                    }
                }
            }
            //if steps are greater than 1 stop the program
            if(count > 1) {
                break;
            }
        }
        //if step = 1 or step = 0 means no route found the make step = -1
        if(count == 1 || count == 0) {
            count = -1;
        }
        return count;
    }
}
```

