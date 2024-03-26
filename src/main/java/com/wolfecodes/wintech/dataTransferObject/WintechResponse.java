package com.wolfecodes.wintech.dataTransferObject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WintechResponse {
    private String responseCode;
    private String responseMessage;
    private AccountInfo accountInfo;
}
