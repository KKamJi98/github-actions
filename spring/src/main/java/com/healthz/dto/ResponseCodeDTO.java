package com.healthz.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ResponseCodeDTO {
  private int resultCode; // 성공 : 1, 실패 : -1
  private String msg;
}
