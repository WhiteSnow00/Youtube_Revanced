// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.playback;

import android.view.View$OnClickListener;
import android.content.Context;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

public class SingleLoopPlaybackMonitor implements tfh, fns
{
    public final wwv a;
    public final abns b;
    public boolean c;
    public PlaybackStartDescriptor d;
    public int e;
    private final PlaybackLoopShuffleMonitor f;
    private final actx g;
    private final String h;
    private final String i;
    private final asib j;
    private gbq k;
    private final arud l;
    private final bhu m;
    
    public SingleLoopPlaybackMonitor(final Context context, final PlaybackLoopShuffleMonitor f, final bhu m, final actx g, final abns b, final wwv a, final arud l, final byte[] array, final byte[] array2, final byte[] array3) {
        this.f = f;
        this.m = m;
        this.g = g;
        this.b = b;
        this.a = a;
        this.l = l;
        this.h = context.getString(2132019828);
        this.i = context.getString(2132019827).toUpperCase(context.getResources().getConfiguration().locale);
        this.j = new asib();
    }
    
    public final void j(final int e, final boolean b) {
        this.e = e;
        if (this.c) {
            final gbq k = this.k;
            if (k != null && e != 2) {
                this.g.l((actz)k);
            }
        }
    }
    
    public final void k() {
        alvs alvs;
        if ((alvs = this.l.f().e) == null) {
            alvs = alvs.a;
        }
        if (alvs.aR) {
            if (!this.c) {
                final fqo fqo = (fqo)((tku)this.m.a).c();
                int i;
                if ((fqo.b & 0x20) != 0x0) {
                    i = fqo.i;
                }
                else {
                    i = 1;
                }
                if (i > 0) {
                    if (this.k == null) {
                        final gbo d = gbq.d();
                        d.j();
                        d.k((CharSequence)this.h);
                        ((acty)d).m(this.i, (View$OnClickListener)new kmk(this, 19));
                        d.a = (actk)new ies(this, 5);
                        this.k = d.a();
                    }
                    this.g.n((actz)this.k);
                    tcp.m(((tku)this.m.a).b((aexg)new fqk(i - 1, 0)), (tcn)etg.m);
                }
            }
        }
    }
    
    public final void oS(final aum aum) {
        this.f.j((fns)this);
        this.j.c(this.b.E().am((asix)new lga(this, 12), (asix)lei.h));
        this.j.c(((asgt)this.b.q().a).am((asix)new lga(this, 13), (asix)lei.h));
    }
    
    public final void oW(final aum aum) {
        this.f.k((fns)this);
        this.j.b();
    }
}
