# Version 2.0.0

## Date: 2022-08-16

- Initial commit of the Merge Kotlin SDK 
  - /merge-api/merge-sdk-kotlin in github
  - dev.merge.client in java package naming
- Includes all Merge categories in one package
  - Accounting
  - ATS (applicant Tracking Systems)
  - CRM (Customer Relationship Management)
  - HRIS (Human Resource Information Systems)
  - Ticketing
- First Kotlin language SDK so it differs in its dependencies from the preceding merge-hris-java, merge-ats-java, etc.
  - ktor for client library
  - jackson for serialization library
  - data classes for request and response models (request models did not exist at all in prior Merge SDK's)
- Preliminary support for the Merge API `expand` parameter, which changes some response values
  - note that due to the dynamic nature of the response, it results in jackson `JsonNode` property values that can be further deserialized (see README). 