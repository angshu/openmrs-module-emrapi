/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.emrapi.encounter.domain;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.openmrs.TestOrder;
import org.openmrs.module.emrapi.encounter.builder.TestOrderBuilder;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class EncounterTransactionTest {

    @Test
    public void dateConversion() {
        EncounterTransaction encounterTransaction = new EncounterTransaction();
        encounterTransaction.setEncounterDateTime(new Date(2013, 10, 30, 0, 0, 0));
        assertEquals(new Date(2013, 10, 30, 0, 0, 0), encounterTransaction.getEncounterDateTime());
    }
}
