// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.location.startup;

import com.google.common.util.concurrent.ListenableFuture;

public class LocationPlayabilityController implements tfh
{
    ListenableFuture a;
    ListenableFuture b;
    public final abiv c;
    private final bu d;
    private final tku e;
    
    public LocationPlayabilityController(final bu d, final tku e, final abiv c, final byte[] array) {
        this.d = d;
        this.e = e;
        this.c = c;
    }
    
    public final void oS(final aum aum) {
        if (!acsm.g(this.d.getApplicationContext())) {
            tcp.p(aum, this.a = this.e.b((aexg)wnu.d), (trb)vuq.u, (trb)new wnw(this, 15));
            return;
        }
        tcp.p(aum, this.b = this.e.a(), (trb)vuq.t, (trb)new wnw(this, 14));
    }
    
    public final void oW(final aum aum) {
        final ListenableFuture a = this.a;
        if (a != null) {
            a.cancel(true);
        }
        final ListenableFuture b = this.b;
        if (b != null) {
            b.cancel(true);
        }
    }
}
