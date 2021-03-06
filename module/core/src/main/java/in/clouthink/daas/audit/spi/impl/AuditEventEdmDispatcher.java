package in.clouthink.daas.audit.spi.impl;

import in.clouthink.daas.audit.core.AuditEvent;
import in.clouthink.daas.audit.spi.AuditEventDispatcher;
import in.clouthink.daas.edm.Edms;

/**
 * The default impl delegates the audit detail by daas-edm
 */
public class AuditEventEdmDispatcher implements AuditEventDispatcher {

	@Override
	public void dispatch(AuditEvent auditEvent) {
		Edms.getEdm(AuditEventDispatcher.QUEUE_NAME).dispatch(AuditEventDispatcher.EVENT_PATH, auditEvent);
	}

}
