// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

import java.util.HashMap;
import java.util.Map;

public class Metrics$HistogramInfo
{
    public final Map a;
    
    public Metrics$HistogramInfo(final int n, final int n2, final int n3) {
        this.a = new HashMap();
    }
    
    public void addSample(final int n, final int n2) {
        this.a.put(n, n2);
    }
}
