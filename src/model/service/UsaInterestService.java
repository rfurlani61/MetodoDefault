package model.service;

public class UsaInterestService implements InterestService{
	private Double interestRate;

	public UsaInterestService(Double interestRate) {
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
