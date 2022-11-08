// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;
import java.io.OutputStream;
import java.util.Collection;

public interface TracingControllerBoundaryInterface
{
    boolean isTracing();
    
    void start(final int p0, final Collection p1, final int p2);
    
    boolean stop(final OutputStream p0, final Executor p1);
}
