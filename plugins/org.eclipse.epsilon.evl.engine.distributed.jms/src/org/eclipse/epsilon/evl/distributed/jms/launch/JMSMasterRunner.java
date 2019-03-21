/*********************************************************************
 * Copyright (c) 2019 The University of York.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
**********************************************************************/
package org.eclipse.epsilon.evl.distributed.jms.launch;

import org.eclipse.epsilon.evl.distributed.launch.DistributedEvlRunConfiguration;

/**
 *
 * @author Sina Madani
 * @since 1.6
 */
public class JMSMasterRunner extends DistributedEvlRunConfiguration {
	
	protected final String brokerHost;
	protected final int expectedWorkers;

	public JMSMasterRunner(JMSMasterBuilder<? extends JMSMasterRunner, ?> builder) {
		super(builder);
		this.brokerHost = builder.brokerHost;
		this.expectedWorkers = builder.expectedWorkers;
	}
}