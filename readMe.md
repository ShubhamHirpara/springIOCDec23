Spring IOC :- Inversion of control
2 ways 3 ways
XML | annotations(bean) | annotation(component)

ApplicationContext - Spring container

create Employee : 
String firstName
String lastName
Integer salary
String companyName;
List<String> phoneNumbers
Address companyAddress

create Address:
String city
String postalCode

-> create toString method

1) Create all args constructor
2) use xml bean defination to create beans (create 3 beans)
3) use app contect to get those beans and print those
-----------------
1) remove all args constructor
2) create setter methods and use those to populate all fields od employee( create 3 bean definations)
3) use app context to get those beans and print those