So Shivam had just learned about OOP. He had written a program before that did two things,
- Find distance between two points
- Find direction (angle) between two points in Radians.

He has this code in the `org.procedural.DistanceAndDirectionCalculator` It looks like this for the reference - 

```java
public class DistanceAndDirectionCalculator {
    public static double distance(double x1, double y1, double x2, double y2) {
        double xDistance = x1 - x2;
        double yDistance = y1 - y2;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(double x1, double y1, double x2, double y2) {
        double xDistance = x2 - x1;
        double yDistance = y2 - y1;
        return Math.atan2(yDistance, xDistance);
    }
}
```
He thought it'll be a good idea to convert this to Object Oriented Programming. So he wrote a new implementation in package `org.oop`, he got 2 classes - 
- `org.oop.DistanceAndDirectionCalculator`
- `org.oop.Point`

However, his trainer told him that what he did is not Object Oriented programming and asked Shivam to try again. 
- Try to articulate problems with Shivam's OOP solution. (Write it somewhere and share it with your trainer)
- Fork the project and fix the design related problem with Shivam's OOP solution. Share that with your trainer too.


Problem with shivam's solution:
1. Two different classes have been made, one is having methods and other is having properties this is violating encapsulation(i.e. data binding).
2. In this implementation getters and setters are present but there is no additional conditions for checking the range of xDistance and yDistance is not there so there is no need
   of getters and setters they are just violating encapsulation(data hiding) and if we want to change the return type of any member then we have to also make change
   in its accessors.
3. Test cases are not following AAA.
4. Duplication is there while calculating difference between coordinates x and y we can make a private method for this.

According to the four rules of simple of design shivam's code is:
1. Passing all the test cases.
2. Reveals intention.
3. Duplication is there while calculating distance.
4. It is violating few element rule.

Solution
1. Make a single class that have behaviour and properties together.
2. Remove getter and setters.
3. Extracted difference in coordinates in method to avoid duplication. 
4. Change the test case format to AAA.
 

After doing above changes it will follow OOP and it follows four rules of simple design.