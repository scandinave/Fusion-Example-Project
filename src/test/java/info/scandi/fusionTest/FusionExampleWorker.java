package info.scandi.fusionTest;

import info.scandi.fusion.database.postgresql.AbstractPostgresqlWorker;
import info.scandi.fusion.exception.FusionException;

@info.scandi.fusion.utils.Worker
public class FusionExampleWorker extends AbstractPostgresqlWorker {

	protected FusionExampleWorker() throws FusionException {
		super();
	}
}
