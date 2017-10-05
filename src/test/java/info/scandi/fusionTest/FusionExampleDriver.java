package info.scandi.fusionTest;

import javax.inject.Inject;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import info.scandi.fusion.exception.FusionException;
import info.scandi.fusion.selenium.driver.AbstractDriver;
import info.scandi.fusion.utils.BrowserDesiredCapabilities;
import info.scandi.fusion.utils.DriverExecutor;

@info.scandi.fusion.utils.Driver
public class FusionExampleDriver extends AbstractDriver {

	@Inject
	public FusionExampleDriver(@DriverExecutor CommandExecutor remoteAddress,
			@BrowserDesiredCapabilities DesiredCapabilities desiredCapabilities) {
		super(remoteAddress, desiredCapabilities);
	}

	@Override
	public void connexion(String login) throws FusionException {
		home();
		if (!this.isElementPresent(By.id(""))) {
			this.deconnexion();
		}
	}

	@Override
	public void deconnexion() {
		// TODO Auto-generated method stub

	}

	@Override
	public void navigation(String target) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attendrePage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void messageErreur() {
		// TODO Auto-generated method stub

	}

	@Override
	public void messageWarn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void messageInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void countRowsTable(String type, String selector, int attendu) {
		// TODO Auto-generated method stub

	}

}
