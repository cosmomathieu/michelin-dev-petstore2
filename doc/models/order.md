
# Order

## Structure

`Order`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | - | Long getId() | setId(Long id) |
| `PetId` | `Long` | Optional | - | Long getPetId() | setPetId(Long petId) |
| `Quantity` | `Integer` | Optional | - | Integer getQuantity() | setQuantity(Integer quantity) |
| `ShipDate` | `LocalDateTime` | Optional | - | LocalDateTime getShipDate() | setShipDate(LocalDateTime shipDate) |
| `Status` | [`StatusEnum`](../../doc/models/status-enum.md) | Optional | Order Status | StatusEnum getStatus() | setStatus(StatusEnum status) |
| `Complete` | `Boolean` | Optional | - | Boolean getComplete() | setComplete(Boolean complete) |

## Example (as XML)

```xml
<order>
  <id>180</id>
  <petId>220</petId>
  <quantity>136</quantity>
  <shipDate>2016-03-13T12:52:32.123Z</shipDate>
  <status>placed</status>
</order>
```

