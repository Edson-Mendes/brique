package com.emendes.product.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

@ToString(callSuper = true)
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ValidationErrorDetails extends ErrorDetails{

  private String fields;
  private String errors;

}
