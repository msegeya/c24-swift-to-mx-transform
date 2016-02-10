# Swift MT103 to MX pacs.008.001.01 Transformation

This is a simple project that parses a SWIFT MT103 message and then transforms it to a pacs.008.001.01 SWIFT MX message. 

Note: The example works on pre-generated classes and you can test this without a license. If, however, you want to load the transform in iO Studio then you would need a valid Swift license in order to open the SWIFT Data Model.

## Building the project

Maven is used to control the build lifecycle.
To build the project execute the following maven command:

```
	mvn clean install 
```    
 
## Running the application

To run the application execute the following command:

```
	mvn exec:java
```

## Links

* [C24 IO] (http://c24tech.com)
* [C24 Git Hub Repository] (https://github.com/C24-Technologies)