package pas.au.snyk.se.dao;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDTO {

    private String customerId;
    private String accNumber;
    private String branchId;
    private BigDecimal balance;
}
