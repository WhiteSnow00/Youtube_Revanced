// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.innertube;

public final class j implements abni
{
    public final boolean a;
    
    public j(final boolean a) {
        this.a = a;
    }
    
    public final void pS(final ahcr ahcr) {
        final boolean a = this.a;
        ahcr.copyOnWrite();
        final anev anev = (anev)ahcr.instance;
        final anev a2 = anev.a;
        anev.b |= 0x2000;
        anev.o = a;
    }
}
