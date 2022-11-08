// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public class MediaConstraints$KeyValuePair
{
    private final String a;
    private final String b;
    
    public MediaConstraints$KeyValuePair(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final MediaConstraints$KeyValuePair mediaConstraints$KeyValuePair = (MediaConstraints$KeyValuePair)o;
                if (this.a.equals(mediaConstraints$KeyValuePair.a) && this.b.equals(mediaConstraints$KeyValuePair.b)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public String getKey() {
        return this.a;
    }
    
    public String getValue() {
        return this.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(": ");
        sb.append(b);
        return sb.toString();
    }
}
