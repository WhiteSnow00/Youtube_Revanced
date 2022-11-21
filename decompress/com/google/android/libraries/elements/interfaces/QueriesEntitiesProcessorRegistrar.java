// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import com.google.android.libraries.blocks.Container;

public abstract class QueriesEntitiesProcessorRegistrar
{
    public static StatusOr create(final Container container, final byte[] array) {
        return QueriesEntitiesProcessorRegistrar$CppProxy.create(container, array);
    }
    
    public abstract void registerProcessors(final EntitiesProcessorResolver p0);
}
