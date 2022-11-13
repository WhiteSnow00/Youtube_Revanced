// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;

public abstract class EntitiesProcessorResolver
{
    public static StatusOr create(final ByteStore byteStore, final EnvironmentDataSource environmentDataSource, final EntitiesObserverConfig entitiesObserverConfig) {
        return EntitiesProcessorResolver$CppProxy.create(byteStore, environmentDataSource, entitiesObserverConfig);
    }
}
