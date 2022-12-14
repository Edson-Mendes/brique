package com.emendes.product.dto.response;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
public class ProductResponse {

  private Long id;
  private String name;
  private String description;
  private BigDecimal price;

}
