#String Builders

* def: A string builder is like an arraylist, only for strings.  It's used to append strings together.  
	* Why you care: I/O on the vjudge platform is very expensive.  And so it slows down your running time significantly.  
	* By appending your output to a string builder object and then printing it all at once in the end, the running time of your program should be reduced.
	* For situations where you are printing to the screen often (more than a hundred times) using a string builder will make your code much faster.

* [how to use string builder](https://github.com/EricSchles/APS_reference/blob/master/reference/BuildingStrings.java)
* [how to not use string builder](https://github.com/EricSchles/APS_reference/blob/master/reference/NotBuildingStrings.java)

As you should be able to 