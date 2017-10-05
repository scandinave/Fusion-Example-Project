package info.scandi.fusionTest;

import info.scandi.fusion.dbunit.worker.AbstractPosgreSQLWorker;
import info.scandi.fusion.exception.FusionException;

@info.scandi.fusion.utils.Worker
public class FusionExampleWorker extends AbstractPosgreSQLWorker {

	protected FusionExampleWorker() throws FusionException {
		super();
	}

	@Override
	public void load(String filePath) throws FusionException {
		// TODO Auto-generated method stub

	}
}
