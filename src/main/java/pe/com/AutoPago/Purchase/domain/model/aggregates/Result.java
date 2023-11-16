package pe.com.AutoPago.Purchase.domain.model.aggregates;

import jakarta.persistence.*;
import lombok.Getter;
import pe.com.AutoPago.Purchase.domain.model.entities.Credit;

@Entity
@Table(name="results")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter
    private Double interest;

    @Getter
    private Double lifeInsurance;

    @Getter
    private Double fee;

    @Getter
    private Double amortization;

    @Getter
    private Double balance;

    @Getter
    private Double finalBalance;

    @Getter
    private Double flow;

    @Getter
    private Double riskInsurance;

    @Getter
    private Double gps;

    @Getter
    private Double ports;

    @Getter
    private Double adminBills;

    @Getter
    @ManyToOne
    @JoinColumn(name = "credit_id", nullable = false)
    private Credit credit;

    public Result() {
    }

    public Result(Double interest, Double lifeInsurance, Double fee, Double amortization, Double balance, Double finalBalance,
                  Double flow, Double riskInsurance, Double gps, Double ports, Double adminBills, Credit credit) {
        this.interest = interest;
        this.lifeInsurance = lifeInsurance;
        this.fee = fee;
        this.amortization = amortization;
        this.balance = balance;
        this.finalBalance = finalBalance;
        this.flow = flow;
        this.riskInsurance = riskInsurance;
        this.gps = gps;
        this.ports = ports;
        this.adminBills = adminBills;
        this.credit = credit;
    }
}