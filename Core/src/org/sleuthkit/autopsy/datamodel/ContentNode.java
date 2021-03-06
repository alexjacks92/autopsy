/*
 * Autopsy Forensic Browser
 *
 * Copyright 2011 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.datamodel;

import org.openide.nodes.Children;
import org.openide.util.Lookup;

/**
 * Interface class that all Data nodes inherit from.
 * Provides basic information such as ID, parent ID, etc.
 */

public abstract class ContentNode extends DisplayableItemNode{

    public ContentNode(Children children) {
        super(children);
    }

    public ContentNode(Children children, Lookup lookup) {
        super(children, lookup);
    }

    
    
    /**
     * Visitor pattern support.
     * 
     * @param v visitor
     * @return visitor's visit return value
     */
    public abstract <T> T accept(ContentNodeVisitor<T> v);
}
