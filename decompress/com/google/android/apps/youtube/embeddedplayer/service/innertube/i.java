// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.innertube;

public final class i implements abni
{
    public boolean a;
    private final arzb b;
    
    public i(final arzb b, final byte[] array, final byte[] array2) {
        this.b = b;
    }
    
    public final void pS(final ahcr ahcr) {
        final ajpe x = jzq.x(this.b);
        if (x != null && x.i) {
            return;
        }
        final boolean a = this.a;
        ahcr.copyOnWrite();
        final anev anev = (anev)ahcr.instance;
        final anev a2 = anev.a;
        anev.b |= 0x2000;
        anev.o = a;
    }
}
