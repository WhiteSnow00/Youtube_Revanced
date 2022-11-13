// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

public abstract class HotReload
{
    public static HotReload create(final String s, final ResourceLoader resourceLoader) {
        return HotReload$CppProxy.create(s, resourceLoader);
    }
    
    public static HotReload createForPlayground(final String s, final ResourceLoader resourceLoader, final ByteStore byteStore) {
        return HotReload$CppProxy.createForPlayground(s, resourceLoader, byteStore);
    }
    
    public abstract void allowUnsubscribeFromResourceChanges(final boolean p0);
    
    public abstract DevResourceManager devResourceManager();
    
    public abstract Status loadResourceList(final byte[] p0);
    
    public abstract void setLoggingDelegate(final LoggingDelegate p0);
    
    public abstract void setResourceListener(final HotReloadResourceListener p0);
    
    public abstract void start();
    
    public abstract void stop();
}
