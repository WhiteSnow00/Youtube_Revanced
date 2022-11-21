// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import com.youtube.android.libraries.elements.StatusOr;
import com.google.android.libraries.blocks.Container;

public abstract class Queries
{
    public static StatusOr createByteStoreBlock(final Container container, final ByteStore byteStore) {
        return Queries$CppProxy.createByteStoreBlock(container, byteStore);
    }
    
    public static StatusOr createEnvironmentDataBlock(final Container container, final EnvironmentDataSource environmentDataSource) {
        return Queries$CppProxy.createEnvironmentDataBlock(container, environmentDataSource);
    }
    
    public static Status registerProcessors(final Container container, final byte[] array, final EntitiesProcessorResolver entitiesProcessorResolver) {
        return Queries$CppProxy.registerProcessors(container, array, entitiesProcessorResolver);
    }
}
