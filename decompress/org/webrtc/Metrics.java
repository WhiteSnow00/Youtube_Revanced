// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

import java.util.HashMap;
import java.util.Map;

public class Metrics
{
    public final Map a;
    
    Metrics() {
        this.a = new HashMap();
    }
    
    private void add(final String s, final Metrics$HistogramInfo metrics$HistogramInfo) {
        this.a.put(s, metrics$HistogramInfo);
    }
    
    private static native void nativeEnable();
    
    private static native Metrics nativeGetAndReset();
}
