// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

import java.io.UnsupportedEncodingException;
import java.util.Map;

class JniHelper
{
    static Object getKey(final Map.Entry entry) {
        return entry.getKey();
    }
    
    static byte[] getStringBytes(final String s) {
        try {
            return s.getBytes("ISO-8859-1");
        }
        catch (final UnsupportedEncodingException ex) {
            throw new RuntimeException("ISO-8859-1 is unsupported");
        }
    }
    
    static Object getStringClass() {
        return String.class;
    }
    
    static Object getValue(final Map.Entry entry) {
        return entry.getValue();
    }
}
