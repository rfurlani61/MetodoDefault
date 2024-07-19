package model.service;

public class BrazilInterestService implements InterestService {
	private Double interestRate;

	public BrazilInterestService(Double interestRate) {
		super();
		this.interestRate = interestRate;
	}
	@Override
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
}
