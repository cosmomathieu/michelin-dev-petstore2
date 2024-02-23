# Pet

Everything about your Pets

Find out more: [http://swagger.io](http://swagger.io)

```java
PetController petController = client.getPetController();
```

## Class Name

`PetController`

## Methods

* [Update Pet](../../doc/controllers/pet.md#update-pet)
* [Add Pet](../../doc/controllers/pet.md#add-pet)
* [Find Pets by Status](../../doc/controllers/pet.md#find-pets-by-status)
* [Find Pets by Tags](../../doc/controllers/pet.md#find-pets-by-tags)
* [Get Pet by Id](../../doc/controllers/pet.md#get-pet-by-id)
* [Update Pet With Form](../../doc/controllers/pet.md#update-pet-with-form)
* [Delete Pet](../../doc/controllers/pet.md#delete-pet)
* [Upload File](../../doc/controllers/pet.md#upload-file)


# Update Pet

Update an existing pet by Id

```java
CompletableFuture<Pet> updatePetAsync(
    final String name,
    final List<String> photoUrls,
    final Long id,
    final Category category,
    final List<Tag> tags,
    final Status1Enum status)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Form, Required | - |
| `photoUrls` | `List<String>` | Form, Required | - |
| `id` | `Long` | Form, Optional | - |
| `category` | [`Category`](../../doc/models/category.md) | Form, Optional | - |
| `tags` | [`List<Tag>`](../../doc/models/tag.md) | Form, Optional | - |
| `status` | [`Status1Enum`](../../doc/models/status-1-enum.md) | Form, Optional | pet status in the store |

## Requires scope

### petstore_auth

`read:pets`, `write:pets`

## Response Type

[`Pet`](../../doc/models/pet.md)

## Example Usage

```java
String name = "doggie";
List<String> photoUrls = Arrays.asList(
    "photoUrls5",
    "photoUrls6",
    "photoUrls7"
);

Long id = 10L;
List<Tag> tags = Arrays.asList(
    new Tag.Builder()
        .build()
);


petController.updatePetAsync(name, photoUrls, id, null, tags, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid ID supplied | `ApiException` |
| 404 | Pet not found | `ApiException` |
| 405 | Validation exception | `ApiException` |


# Add Pet

Add a new pet to the store

```java
CompletableFuture<Pet> addPetAsync(
    final String name,
    final List<String> photoUrls,
    final Long id,
    final Category category,
    final List<Tag> tags,
    final Status1Enum status)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Form, Required | - |
| `photoUrls` | `List<String>` | Form, Required | - |
| `id` | `Long` | Form, Optional | - |
| `category` | [`Category`](../../doc/models/category.md) | Form, Optional | - |
| `tags` | [`List<Tag>`](../../doc/models/tag.md) | Form, Optional | - |
| `status` | [`Status1Enum`](../../doc/models/status-1-enum.md) | Form, Optional | pet status in the store |

## Requires scope

### petstore_auth

`read:pets`, `write:pets`

## Response Type

[`Pet`](../../doc/models/pet.md)

## Example Usage

```java
String name = "doggie";
List<String> photoUrls = Arrays.asList(
    "photoUrls5",
    "photoUrls6",
    "photoUrls7"
);

Long id = 10L;
List<Tag> tags = Arrays.asList(
    new Tag.Builder()
        .build()
);


petController.addPetAsync(name, photoUrls, id, null, tags, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 405 | Invalid input | `ApiException` |


# Find Pets by Status

Multiple status values can be provided with comma separated strings

```java
CompletableFuture<List<Pet>> findPetsByStatusAsync(
    final Status2Enum status)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `status` | [`Status2Enum`](../../doc/models/status-2-enum.md) | Query, Optional | Status values that need to be considered for filter |

## Requires scope

### petstore_auth

`read:pets`, `write:pets`

## Response Type

[`List<Pet>`](../../doc/models/pet.md)

## Example Usage

```java
Status2Enum status = Status2Enum.AVAILABLE;

petController.findPetsByStatusAsync(status).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid status value | `ApiException` |


# Find Pets by Tags

Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

```java
CompletableFuture<List<Pet>> findPetsByTagsAsync(
    final List<String> tags)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tags` | `List<String>` | Query, Optional | Tags to filter by |

## Requires scope

### petstore_auth

`read:pets`, `write:pets`

## Response Type

[`List<Pet>`](../../doc/models/pet.md)

## Example Usage

```java
petController.findPetsByTagsAsync(null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid tag value | `ApiException` |


# Get Pet by Id

Returns a single pet

```java
CompletableFuture<Pet> getPetByIdAsync(
    final long petId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `petId` | `long` | Template, Required | ID of pet to return |

## Requires scope

### petstore_auth

`read:pets`, `write:pets`

## Response Type

[`Pet`](../../doc/models/pet.md)

## Example Usage

```java
long petId = 152L;

petController.getPetByIdAsync(petId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid ID supplied | `ApiException` |
| 404 | Pet not found | `ApiException` |


# Update Pet With Form

```java
CompletableFuture<Void> updatePetWithFormAsync(
    final long petId,
    final String name,
    final String status)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `petId` | `long` | Template, Required | ID of pet that needs to be updated |
| `name` | `String` | Query, Optional | Name of pet that needs to be updated |
| `status` | `String` | Query, Optional | Status of pet that needs to be updated |

## Requires scope

### petstore_auth

`read:pets`, `write:pets`

## Response Type

`void`

## Example Usage

```java
long petId = 152L;

petController.updatePetWithFormAsync(petId, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 405 | Invalid input | `ApiException` |


# Delete Pet

```java
CompletableFuture<Void> deletePetAsync(
    final long petId,
    final String apiKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `petId` | `long` | Template, Required | Pet id to delete |
| `apiKey` | `String` | Header, Optional | - |

## Requires scope

### petstore_auth

`read:pets`, `write:pets`

## Response Type

`void`

## Example Usage

```java
long petId = 152L;

petController.deletePetAsync(petId, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid pet value | `ApiException` |


# Upload File

```java
CompletableFuture<ApiResponse> uploadFileAsync(
    final long petId,
    final String additionalMetadata,
    final FileWrapper body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `petId` | `long` | Template, Required | ID of pet to update |
| `additionalMetadata` | `String` | Query, Optional | Additional Metadata |
| `body` | `FileWrapper` | Form, Optional | - |

## Requires scope

### petstore_auth

`read:pets`, `write:pets`

## Response Type

[`ApiResponse`](../../doc/models/api-response.md)

## Example Usage

```java
long petId = 152L;

petController.uploadFileAsync(petId, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

