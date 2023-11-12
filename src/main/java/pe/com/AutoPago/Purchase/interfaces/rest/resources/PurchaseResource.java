package pe.com.AutoPago.Purchase.interfaces.rest.resources;

public record PurchaseResource(Long id, Long salePrice, Long initialPercentage, Long interestRate, String rateType, Long paymentsNumber, Long notarialCost, Long registrationCost, Long gps, Long portage, Long administrationCost, Long creditLifeInsurancePercentage, Long riskInsurancePercentage) {
}