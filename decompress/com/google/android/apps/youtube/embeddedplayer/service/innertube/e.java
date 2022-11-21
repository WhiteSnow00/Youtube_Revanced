// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.innertube;

import java.util.Arrays;

public final class e extends vnj
{
    public e(final aefs aefs, final zoa zoa, final ahcr ahcr, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(aefs, zoa.c(), "embedded_player", (ahen)ahcr, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        ((vls)this).i();
    }
    
    protected final void c() {
        final ahcr ahcr = (ahcr)this.a();
        final akpl akpl = (akpl)ahcr.instance;
        akpo a;
        if (akpl.c == 2) {
            a = (akpo)akpl.d;
        }
        else {
            a = akpo.a;
        }
        final boolean empty = a.c.isEmpty();
        final akpl akpl2 = (akpl)ahcr.instance;
        akpn a2;
        if (akpl2.c == 3) {
            a2 = (akpn)akpl2.d;
        }
        else {
            a2 = akpn.a;
        }
        adme.T(a2.c.isEmpty() ^ true ^ (empty ^ true));
    }
    
    public final boolean equals(final Object o) {
        return o instanceof e && aexq.c(((ahcr)this.a()).build(), ((ahcr)((e)o).a()).build());
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { ((ahcr)this.a()).build() });
    }
}
