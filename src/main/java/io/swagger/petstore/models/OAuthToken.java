/*
 * SwaggerPetstoreOpenAPI30Lib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.swagger.petstore.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import javax.xml.bind.annotation.XmlElement;

/**
 * This is a model class for OAuthToken type.
 */
public class OAuthToken {
    private String accessToken;
    private String tokenType;
    private Long expiresIn;
    private String scope;
    private Long expiry;
    private String refreshToken;

    /**
     * Default constructor.
     */
    public OAuthToken() {
    }

    /**
     * Initialization constructor.
     * @param  accessToken  String value for accessToken.
     * @param  tokenType  String value for tokenType.
     * @param  expiresIn  Long value for expiresIn.
     * @param  scope  String value for scope.
     * @param  expiry  Long value for expiry.
     * @param  refreshToken  String value for refreshToken.
     */
    public OAuthToken(
            String accessToken,
            String tokenType,
            Long expiresIn,
            String scope,
            Long expiry,
            String refreshToken) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.expiresIn = expiresIn;
        this.scope = scope;
        this.expiry = expiry;
        this.refreshToken = refreshToken;
    }

    /**
     * Getter for AccessToken.
     * Access token
     * @return Returns the String
     */
    @JsonGetter("access_token")
    @XmlElement(name = "access_token")
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Setter for AccessToken.
     * Access token
     * @param accessToken Value for String
     */
    @JsonSetter("access_token")
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Getter for TokenType.
     * Type of access token
     * @return Returns the String
     */
    @JsonGetter("token_type")
    @XmlElement(name = "token_type")
    public String getTokenType() {
        return tokenType;
    }

    /**
     * Setter for TokenType.
     * Type of access token
     * @param tokenType Value for String
     */
    @JsonSetter("token_type")
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * Getter for ExpiresIn.
     * Time in seconds before the access token expires
     * @return Returns the Long
     */
    @JsonGetter("expires_in")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @XmlElement(name = "expires_in")
    public Long getExpiresIn() {
        return expiresIn;
    }

    /**
     * Setter for ExpiresIn.
     * Time in seconds before the access token expires
     * @param expiresIn Value for Long
     */
    @JsonSetter("expires_in")
    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * Getter for Scope.
     * List of scopes granted This is a space-delimited list of strings.
     * @return Returns the String
     */
    @JsonGetter("scope")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @XmlElement(name = "scope")
    public String getScope() {
        return scope;
    }

    /**
     * Setter for Scope.
     * List of scopes granted This is a space-delimited list of strings.
     * @param scope Value for String
     */
    @JsonSetter("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * Getter for Expiry.
     * Time of token expiry as unix timestamp (UTC)
     * @return Returns the Long
     */
    @JsonGetter("expiry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @XmlElement(name = "expiry")
    public Long getExpiry() {
        return expiry;
    }

    /**
     * Setter for Expiry.
     * Time of token expiry as unix timestamp (UTC)
     * @param expiry Value for Long
     */
    @JsonSetter("expiry")
    public void setExpiry(Long expiry) {
        this.expiry = expiry;
    }

    /**
     * Getter for RefreshToken.
     * Refresh token Used to get a new access token when it expires.
     * @return Returns the String
     */
    @JsonGetter("refresh_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @XmlElement(name = "refresh_token")
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * Setter for RefreshToken.
     * Refresh token Used to get a new access token when it expires.
     * @param refreshToken Value for String
     */
    @JsonSetter("refresh_token")
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * Converts this OAuthToken into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OAuthToken [" + "accessToken=" + accessToken + ", tokenType=" + tokenType
                + ", expiresIn=" + expiresIn + ", scope=" + scope + ", expiry=" + expiry
                + ", refreshToken=" + refreshToken + "]";
    }

    /**
     * Builds a new {@link OAuthToken.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OAuthToken.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(accessToken, tokenType)
                .expiresIn(getExpiresIn())
                .scope(getScope())
                .expiry(getExpiry())
                .refreshToken(getRefreshToken());
        return builder;
    }

    /**
     * Class to build instances of {@link OAuthToken}.
     */
    public static class Builder {
        private String accessToken;
        private String tokenType;
        private Long expiresIn;
        private String scope;
        private Long expiry;
        private String refreshToken;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  accessToken  String value for accessToken.
         * @param  tokenType  String value for tokenType.
         */
        public Builder(String accessToken, String tokenType) {
            this.accessToken = accessToken;
            this.tokenType = tokenType;
        }

        /**
         * Setter for accessToken.
         * @param  accessToken  String value for accessToken.
         * @return Builder
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Setter for tokenType.
         * @param  tokenType  String value for tokenType.
         * @return Builder
         */
        public Builder tokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }

        /**
         * Setter for expiresIn.
         * @param  expiresIn  Long value for expiresIn.
         * @return Builder
         */
        public Builder expiresIn(Long expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        /**
         * Setter for scope.
         * @param  scope  String value for scope.
         * @return Builder
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Setter for expiry.
         * @param  expiry  Long value for expiry.
         * @return Builder
         */
        public Builder expiry(Long expiry) {
            this.expiry = expiry;
            return this;
        }

        /**
         * Setter for refreshToken.
         * @param  refreshToken  String value for refreshToken.
         * @return Builder
         */
        public Builder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * Builds a new {@link OAuthToken} object using the set fields.
         * @return {@link OAuthToken}
         */
        public OAuthToken build() {
            return new OAuthToken(accessToken, tokenType, expiresIn, scope, expiry, refreshToken);
        }
    }
}
