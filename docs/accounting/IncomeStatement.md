
# IncomeStatement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**name** | **kotlin.String** | The income statement&#39;s name. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The income statement&#39;s currency. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the income statement belongs to. |  [optional]
**startPeriod** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The income statement&#39;s start period. |  [optional]
**endPeriod** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The income statement&#39;s end period. |  [optional]
**income** | [**kotlin.collections.List&lt;ReportItem&gt;**](ReportItem.md) |  |  [optional] [readonly]
**costOfSales** | [**kotlin.collections.List&lt;ReportItem&gt;**](ReportItem.md) |  |  [optional] [readonly]
**grossProfit** | **kotlin.Float** | The revenue minus the cost of sale. |  [optional]
**operatingExpenses** | [**kotlin.collections.List&lt;ReportItem&gt;**](ReportItem.md) |  |  [optional] [readonly]
**netOperatingIncome** | **kotlin.Float** | The revenue minus the operating expenses. |  [optional]
**nonOperatingExpenses** | [**kotlin.collections.List&lt;ReportItem&gt;**](ReportItem.md) |  |  [optional] [readonly]
**netIncome** | **kotlin.Float** | The gross profit minus the total expenses. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



