package ru.panic.template.dto;

import lombok.Data;
import ru.panic.template.dto.enums.Currency;

@Data
public class P2PTransactionRequest {
    private String from;
    private String to;
    private Currency currency;
    private Number amount;
    private String desc;
    private Long timestamp;
    private Integer code;
    private String sign;
}