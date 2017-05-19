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

## Notes

This is constructed from bits of Amazon Kinseis Client Library examples
correcting a few issues on the way.  For more info on that see: 

http://docs.aws.amazon.com/streams/latest/dev/kinesis-record-processor-implementation-app-java.html
