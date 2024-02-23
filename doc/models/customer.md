
# Customer

## Structure

`Customer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | - | Long getId() | setId(Long id) |
| `Username` | `String` | Optional | - | String getUsername() | setUsername(String username) |
| `Address` | [`List<Address>`](../../doc/models/address.md) | Optional | - | List<Address> getAddress() | setAddress(List<Address> address) |

## Example (as JSON)

```json
{
  "id": 12,
  "username": "username2",
  "address": [
    {
      "street": "street6",
      "city": "city6",
      "state": "state2",
      "zip": "zip0"
    },
    {
      "street": "street6",
      "city": "city6",
      "state": "state2",
      "zip": "zip0"
    },
    {
      "street": "street6",
      "city": "city6",
      "state": "state2",
      "zip": "zip0"
    }
  ]
}
```

