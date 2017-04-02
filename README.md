# 1 Parsing-Text-File
* This API to show how using fixedformat4j framework to parsing text file
* let's take the test data as exaplme
  * current system generate the data in flat file (ex. *.txt, *.free , ...etc )
  * the generated date is representing the employee data as following
  
    | id  | name   | dept       | salary |
    |:----|:------ | :----------|:-------|
    | 100 | Thomas | Sales      |   5000 |
    | 200 | Jason  | Technology |   5500 |
    | 300 | Mayla  | Technology |   7000 |
    | 400 | Nisha  | Marketing  |   9500 |
    | 500 | Randy  | Technology |   6000 |
  * but the recieved data (flat file) look like 
    * 100  Thomas              Sales               5000      980911
    * 200  Jason               Technology          5500      971212
  * the provided API will give you a guid how to divid and store data in object .
# 2 Technologies
* the following frameworks/technology have been used to build the API
 * Java 8
 * fixedformat4j
 * Spring with spring boot

# 3 How to start
* open/import the project in your favorite IDE
* execute com.mazmy.TextParsingApplication::main to start
* to modify/add test data
  * go to src\main\resources\data
  * update/add data in textFile.txt
