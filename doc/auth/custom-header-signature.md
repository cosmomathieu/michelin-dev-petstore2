
# Custom Header Signature



Documentation for accessing and setting credentials for api_key.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| api_key | `String` | - | `apiKey` | `getApiKey()` |



**Note:** Auth credentials can be set using `apiKeyCredentials` in the client builder and accessed through `getApiKeyCredentials` method in the client instance.

## Usage Example

### Client Initialization

You must provide credentials in the client as shown in the following code snippet.

```java
SwaggerPetstoreOpenAPI30Client client = new SwaggerPetstoreOpenAPI30Client.Builder()
    .apiKeyCredentials(new ApiKeyModel.Builder(
            "api_key"
        )
        .build())
    .build();
```


