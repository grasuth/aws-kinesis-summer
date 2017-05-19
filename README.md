# aws-kinesis-summer

An experimental kinesis stream reader that looks up customers in Dynamo DB and 
sums the value given in the stream record

## Uses
* aws sdk for kinesis streams
* aws kinesis client library
* aws sdk for dynamo db

## Basic Operation
Expects a kinsis stream called 'rawdata' to contain JSON objects of the format

    {
        "custId": "12345",
        "value": "12"
    }

Then looks up the custId in a DynamoDB table and sums the value in that table
and increments a counter.

## Building
Requires Gradle 2.3.

To start:

    gradle clean run
    
You'll need to set up:
* Kinesis stream (called 'rawdata') that provides JSON data as explained above
* DynamoDB table called 'CustomerSum' containing records for customers with fields:
*       CustomerId: string
*       TotalSum: number
*       Updates: number
* Appropriate AWS credentials in ~/.aws/credentials
 
TotalSum holds the sum of all customer record values for that CustomerId.
Updates is a count of updates received.

## Notes

This is constructed from bits of Amazon Kinseis Client Library examples
correcting a few issues on the way.  For more info on that see: 

http://docs.aws.amazon.com/streams/latest/dev/kinesis-record-processor-implementation-app-java.html

# License

Free for your use.  I accept no responsibility for it or how you use it. Portions of this 
from Amazon's samples.  See their licenses in relevant files.
