package pe.com.AutoPago.Purchase.domain.model.commands;

import pe.com.AutoPago.Purchase.domain.model.entities.Credit;

public record CreateResultCommand(Double interest, Double lifeInsurance, Double fee, Double amortization,
                                  Double balance, Double finalBalance, Double flow, Double riskInsurance, Double gps,
                                  Double ports, Double adminBills, Long creditId) {
}