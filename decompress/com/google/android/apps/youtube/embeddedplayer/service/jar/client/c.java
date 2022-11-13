// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

final class c extends s
{
    private final int a;
    private final int b;
    
    public c(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public int a() {
        return this.b;
    }
    
    public int b() {
        return this.a;
    }
    
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof s) {
            final s s = (s)o;
            if (this.a == s.b() && this.b == s.a()) {
                return true;
            }
        }
        return false;
    }
    
    public int hashCode() {
        return (this.a ^ 0xF4243) * 1000003 ^ this.b;
    }
    
    public String toString() {
        final int a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder("CachedAdEvent{adEventType=");
        sb.append(a);
        sb.append(", adBreakType=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
