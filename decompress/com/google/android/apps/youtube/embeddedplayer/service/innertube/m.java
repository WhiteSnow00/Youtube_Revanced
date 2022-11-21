// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.innertube;

import java.util.Map;

public final class m implements abnl
{
    final Map a;
    private final arzb b;
    
    public m(final arzb b, final byte[] array, final byte[] array2) {
        this.a = new l();
        this.b = b;
    }
    
    public final void b(final String s, final boolean b) {
        this.a.put(s, b);
    }
    
    public final boolean c(final String s) {
        return s != null && this.a.get(s) != null && this.a.get(s);
    }
    
    public final void sG(final abno abno) {
        final ajpe x = jzq.x(this.b);
        if (x != null && x.i) {
            final boolean c = this.c(abno.P);
            abno.a.add(new j(c));
            abno.w((abnn)new k(c));
        }
    }
}
