# Spring Boot Unit Testing
A Spring Boot project that includes basic unit testing on REST services.

## Exercise

Plan, design and develop at least three unit tests for each one of the following operations on Courses. No REST services implementation is needed at this moment, just the unit test cases.

1. When client asks for the list of courses you must validate that service returns less than 101 records (do not include students information), otherwise it must return UMGTooManyRowsException with error message like "There are more than one hundred records in the repository."; You must use getForEntity operation from your test rest template object. Service path must be "/course/getAll". Use assert functions specific for exceptions.

2. Given the following list of course names you must ensure that an array of String containing the top ten course names returned by service "/course/top/10/sed" ordered by name ASC match the given list. In the provided path, "10" is the ammount of records that must be returned for this specific case but it can be any number. Please use assert functions specific for arrays.

```sh
Sed a molestias et rem reiciendis.
Sed ab aspernatur aspernatur et qui voluptatem.
Sed adipisci ex quibusdam non in.
Sed adipisci impedit autem minima placeat.
Sed alias corporis magnam similique eos velit.
Sed alias numquam quisquam officiis.
Sed alias quo numquam voluptate ut.
Sed aliquam aut odit.
Sed aliquam eos neque incidunt distinctio odio.
Sed aliquid amet maxime necessitatibus.

```

3. Consider the following Json web token -JWT- "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c". This token must be added to any POST request made when inserting a new course into the database. Specifically, it must be added in the Authorization request header. This is a security concern so you must validate that the service at "/course/add" looks for this token on each request and if not present then you must return a 401 status code with the text "JWT not found in request. This action will be reported." otherwise you must return a 200 status code with the text "Course successfully added." and the body must contain the new course into the repository (including its respective id). For this you must use the exchange operation of your test rest template object.

4. Given any array of integer numbers, you must ensure that service "/util/bubblesort?input=2,6,8,4,8,5,1,2,3,5,4,8,9,9,4,8,7,7,4,9,4,6,4,6,4,1,3,1,3,3,6,6,9,9,4,169,4," returns an array of integers in ascending order using the bubble sort algorithm. Additionally you must calculate the factorial value of each number after sorting and if calculation fails you must return a String like "The factorial value of 169 which is 2432902008176640000‬ cannot be stored in an Integer variable." where 169 is the number in the array and 243290... is the factorial value of 169. For this case you must use a function that asserts the result based on the returned type by checking whether it is an instance of String or not, for example "instance of".
