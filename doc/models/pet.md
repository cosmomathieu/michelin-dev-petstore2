
# Pet

## Structure

`Pet`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | - | Long getId() | setId(Long id) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Category` | [`Category`](../../doc/models/category.md) | Optional | - | Category getCategory() | setCategory(Category category) |
| `PhotoUrls` | `List<String>` | Required | - | List<String> getPhotoUrls() | setPhotoUrls(List<String> photoUrls) |
| `Tags` | [`List<Tag>`](../../doc/models/tag.md) | Optional | - | List<Tag> getTags() | setTags(List<Tag> tags) |
| `Status` | [`Status1Enum`](../../doc/models/status-1-enum.md) | Optional | pet status in the store | Status1Enum getStatus() | setStatus(Status1Enum status) |

## Example (as XML)

```xml
<pet>
  <id>120</id>
  <name>name0</name>
  <category>
    <id>232</id>
    <name>name2</name>
  </category>
  <photoUrls>
    <photoUrl>photoUrls5</photoUrl>
    <photoUrl>photoUrls6</photoUrl>
  </photoUrls>
  <tags>
    <tags>
      <id>26</id>
      <name>name0</name>
    </tags>
  </tags>
  <status>available</status>
</pet>
```

