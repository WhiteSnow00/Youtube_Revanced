// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

public interface ProxyControllerBoundaryInterface
{
    void clearProxyOverride(final Runnable p0, final Executor p1);
    
    void setProxyOverride(final String[][] p0, final String[] p1, final Runnable p2, final Executor p3);
    
    void setProxyOverride(final String[][] p0, final String[] p1, final Runnable p2, final Executor p3, final boolean p4);
}
