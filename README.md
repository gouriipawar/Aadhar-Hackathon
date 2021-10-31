# Aadhar-Hackathon

**Steps Performed**
1. We converted the maven repository to .jar file
2. Imported this .jar file in our android application "Aadhar"
3. Added dependencies for the .jar file in build.gradle
4. Designed the UI page and backend
5. Created object of OtpAPIClientMain.java in our MainActivity.java file
6. We passed our Aadhar ID to the OtpAPIClient API

**PROBLEMS / ERRORS**
1. Our code is printing the unique txnId but after that as our code moves to the xml file generation process our code crashes.
2. Our code is crashing beacause of this class. "com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl"
As android does not supports this class.

**WE HAVE ATTACHED THE LOG CAT SNAPSHOT**
