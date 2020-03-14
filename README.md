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

