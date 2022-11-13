// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties;

public abstract class DirectUpdateProcessor
{
    public static DirectUpdateProcessor create(final DirectUpdateExecutor directUpdateExecutor, final ByteStore byteStore, final CommandHandlerResolver commandHandlerResolver) {
        return DirectUpdateProcessor$CppProxy.create(directUpdateExecutor, byteStore, commandHandlerResolver);
    }
    
    public abstract void dispose();
    
    public abstract void processProperties(final DirectUpdatePropertiesOuterClass$DirectUpdateProperties p0);
}
