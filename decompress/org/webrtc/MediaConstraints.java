// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class MediaConstraints
{
    public final List a;
    public final List b;
    
    public MediaConstraints() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }
    
    private static String a(final List list) {
        final StringBuilder sb = new StringBuilder("[");
        for (final MediaConstraints$KeyValuePair mediaConstraints$KeyValuePair : list) {
            if (sb.length() > 1) {
                sb.append(", ");
            }
            sb.append(mediaConstraints$KeyValuePair.toString());
        }
        sb.append("]");
        return sb.toString();
    }
    
    List getMandatory() {
        return this.a;
    }
    
    List getOptional() {
        return this.b;
    }
    
    @Override
    public final String toString() {
        final String a = a(this.a);
        final String a2 = a(this.b);
        final StringBuilder sb = new StringBuilder("mandatory: ");
        sb.append(a);
        sb.append(", optional: ");
        sb.append(a2);
        return sb.toString();
    }
}
