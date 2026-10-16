# Customer Order Validation System

Spring Boot Maven project demonstrating DTO Bean Validation for Customer Orders.

## Fields and Annotations
- `customerName` : `@NotNull`, `@NotBlank`
- `productName`  : `@NotNull`, `@NotBlank`
- `quantity`     : `@NotNull`, `@Positive`
- `price`        : `@NotNull`, `@Positive`

## API Testing
- **URL**: `POST http://localhost:8080/api/customer-orders`
- **Headers**: `Content-Type: application/json`

### Valid Payload:
```json
{
  "customerName": "John Doe",
  "productName": "Laptop",
  "quantity": 2,
  "price": 1200.00
}
```

### Invalid Payload (Validation Error):
```json
{
  "customerName": "",
  "productName": "   ",
  "quantity": 0,
  "price": -50.0
}
```
