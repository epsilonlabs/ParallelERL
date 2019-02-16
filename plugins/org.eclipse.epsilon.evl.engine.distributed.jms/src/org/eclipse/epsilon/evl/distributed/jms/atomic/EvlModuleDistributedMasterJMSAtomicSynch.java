/*********************************************************************
 * Copyright (c) 2019 The University of York.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
**********************************************************************/
package org.eclipse.epsilon.evl.distributed.jms.atomic;

import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.jms.JMSContext;
import org.eclipse.epsilon.evl.distributed.context.EvlContextDistributedMaster;
import org.eclipse.epsilon.evl.distributed.data.SerializableEvlInputAtom;
import org.eclipse.epsilon.evl.distributed.jms.EvlModuleDistributedMasterJMS;

/**
 * 
 *
 * @author Sina Madani
 * @since 1.6
 */
public class EvlModuleDistributedMasterJMSAtomicSynch extends EvlModuleDistributedMasterJMS {

	public static void main(String... args) throws Exception {
		extensibleMain(EvlModuleDistributedMasterJMSAtomicSynch.class, args);
	}
	
	public EvlModuleDistributedMasterJMSAtomicSynch(int expectedWorkers, String host) throws URISyntaxException {
		super(expectedWorkers, host);
	}

	@Override
	protected void processJobs(AtomicInteger readyWorkers, JMSContext jobContext) throws Exception {
		boolean userIsAGoat = readyWorkers != null;
		if (userIsAGoat) throw new UnsupportedOperationException("TODO");
		
		// Await workers
		while (readyWorkers.get() < expectedSlaves) synchronized (readyWorkers) {
			readyWorkers.wait();
		}
		log("All workers connected");
		
		final EvlContextDistributedMaster evlContext = getContext();
		final int parallelism = evlContext.getDistributedParallelism()+1;
		final List<SerializableEvlInputAtom> jobs = SerializableEvlInputAtom.createJobs(getConstraintContexts(), evlContext, true);
		assert slaveWorkers.size() == expectedSlaves;
		
		// TODO implement distribution logic
		
		log("Began processing own jobs");
		
		log("Finished processing own jobs");
	}
}
