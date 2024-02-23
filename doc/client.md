
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) | Http Client Configuration instance. |
| `petstoreAuthCredentials` | [`PetstoreAuthCredentials`](auth/oauth-2-implicit-grant.md) | The Credentials Setter for OAuth 2 Implicit Grant |
| `apiKeyCredentials` | [`ApiKeyCredentials`](auth/custom-header-signature.md) | The Credentials Setter for Custom Header Signature |

The API client can be initialized as follows:

```java
SwaggerPetstoreOpenAPI30Client client = new SwaggerPetstoreOpenAPI30Client.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .petstoreAuthCredentials(new PetstoreAuthModel.Builder(
            "OAuthClientId",
            "OAuthRedirectUri"
        )
        .oAuthScopes(Arrays.asList(
                OAuthScopePetstoreAuthEnum.WRITEPETS,
                OAuthScopePetstoreAuthEnum.READPETS
            ))
        .build())
    .apiKeyCredentials(new ApiKeyModel.Builder(
            "api_key"
        )
        .build())
    .environment(Environment.PRODUCTION)
    .build();
```

## Swagger Petstore - OpenAPI 3.0Client Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getPetController()` | Provides access to Pet controller. | `PetController` |
| `getStoreController()` | Provides access to Store controller. | `StoreController` |
| `getUserController()` | Provides access to User controller. | `UserController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getPetstoreAuthCredentials()` | The credentials to use with PetstoreAuth. | [`PetstoreAuthCredentials`](auth/oauth-2-implicit-grant.md) |
| `getApiKeyCredentials()` | The credentials to use with ApiKey. | [`ApiKeyCredentials`](auth/custom-header-signature.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

