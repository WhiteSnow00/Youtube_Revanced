// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

import java.util.Map;
import java.util.HashMap;

class H264Utils
{
    static {
        a(false);
        a(true);
    }
    
    public static void a(final boolean b) {
        final HashMap hashMap = new HashMap();
        hashMap.put("level-asymmetry-allowed", "1");
        hashMap.put("packetization-mode", "1");
        String s;
        if (!b) {
            s = "42e01f";
        }
        else {
            s = "640c1f";
        }
        hashMap.put("profile-level-id", s);
    }
    
    private static native boolean nativeIsSameH264Profile(final Map p0, final Map p1);
}
