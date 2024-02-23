
# OAuth 2 Implicit Grant



Documentation for accessing and setting credentials for petstore_auth.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| OAuthClientId | `String` | OAuth 2 Client ID | `oAuthClientId` | `getOAuthClientId()` |
| OAuthRedirectUri | `String` | OAuth 2 Redirection endpoint or Callback Uri | `oAuthRedirectUri` | `getOAuthRedirectUri()` |
| OAuthToken | `OAuthToken` | Object for storing information about the OAuth token | `oAuthToken` | `getOAuthToken()` |
| OAuthScopes | `List<OAuthScopePetstoreAuthEnum>` | List of scopes that apply to the OAuth token | `oAuthScopes` | `getOAuthScopes()` |



**Note:** Auth credentials can be set using `petstoreAuthCredentials` in the client builder and accessed through `getPetstoreAuthCredentials` method in the client instance.

## Usage Example



Your application must obtain user authorization before it can execute an endpoint call incase this SDK chooses to use *OAuth 2.0 Implicit Grant* to obtain a user's consent to perform an API request on user's behalf. This authorization includes the following steps

This process requires the presence of a client-side JavaScript code on the redirect URI page to receive the *access token* after the consent step is completed.

### 1\. Obtain user consent

To obtain user's consent, you must redirect the user to the authorization page. The `buildAuthorizationUrl()` method creates the URL to the authorization page. You must have initialized the client with scopes for which you need permission to access.

```java
String authUrl = client.getPetstoreAuth().buildAuthorizationUrl(); // build auth url
httpServletResponse.sendRedirect(authUrl); // show user the auth page in a browser or by redirection
```

### 2\. Handle the OAuth server response

Once the user responds to the consent request, the OAuth 2.0 server responds to your application's access request by redirecting the user to the redirect URI specified set in `Configuration`.

The redirect URI will receive the *access token* as the `token` argument in the URL fragment.

```
https://example.com/oauth/callback#token=XXXXXXXXXXXXXXXXXXXXXXXXX
```

The access token must be extracted by the client-side JavaScript code. The access token can be used to authorize any further endpoint calls by the JavaScript code.

### Scopes

Scopes enable your application to only request access to the resources it needs while enabling users to control the amount of access they grant to your application. Available scopes are defined in the [`OAuthScopePetstoreAuthEnum`](../../doc/models/o-auth-scope-petstore-auth-enum.md) enumeration.

| Scope Name | Description |
|  --- | --- |
| `WRITEPETS` | modify pets in your account |
| `READPETS` | read your pets |


