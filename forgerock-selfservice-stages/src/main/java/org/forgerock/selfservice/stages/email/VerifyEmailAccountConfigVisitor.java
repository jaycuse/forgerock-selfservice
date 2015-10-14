/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2015 ForgeRock AS.
 */

package org.forgerock.selfservice.stages.email;

import org.forgerock.selfservice.core.ProgressStageBinder;
import org.forgerock.selfservice.core.config.StageConfigVisitor;

/**
 * Visitor that builds email flow stages using visited email configs.
 *
 * @since 0.3.0
 */
public interface VerifyEmailAccountConfigVisitor extends StageConfigVisitor {

    /**
     * Builds a verify email account stage bound to the verify email account config.
     *
     * @param config
     *         verify email account config
     *
     * @return verify email account stage binding
     */
    ProgressStageBinder<?> build(VerifyEmailAccountConfig config);

}