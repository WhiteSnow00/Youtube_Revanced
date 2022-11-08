// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

import java.util.HashMap;
import java.util.Map;

public enum PeerConnection$AdapterType
{
    a("UNKNOWN", 0, Integer.valueOf(0)), 
    b("ETHERNET", 1, Integer.valueOf(1)), 
    c("WIFI", 2, Integer.valueOf(2)), 
    d("CELLULAR", 3, Integer.valueOf(4)), 
    e("VPN", 4, Integer.valueOf(8)), 
    f("LOOPBACK", 5, Integer.valueOf(16)), 
    g("ADAPTER_TYPE_ANY", 6, Integer.valueOf(32)), 
    h("CELLULAR_2G", 7, Integer.valueOf(64)), 
    i("CELLULAR_3G", 8, Integer.valueOf(128)), 
    j("CELLULAR_4G", 9, Integer.valueOf(256)), 
    k("CELLULAR_5G", 10, Integer.valueOf(512));
    
    private static final Map m;
    public final Integer l;
    
    static {
        int l = 0;
        m = new HashMap();
        for (PeerConnection$AdapterType[] values = values(); l < values.length; ++l) {
            final PeerConnection$AdapterType peerConnection$AdapterType = values[l];
            PeerConnection$AdapterType.m.put(peerConnection$AdapterType.l, peerConnection$AdapterType);
        }
    }
    
    private PeerConnection$AdapterType(final String s, final int n, final Integer l) {
        this.l = l;
    }
    
    static PeerConnection$AdapterType fromNativeIndex(final int n) {
        return PeerConnection$AdapterType.m.get(n);
    }
}
