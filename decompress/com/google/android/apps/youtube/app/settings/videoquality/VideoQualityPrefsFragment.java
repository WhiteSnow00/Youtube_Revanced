// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings.videoquality;

public final class VideoQualityPrefsFragment extends jrb
{
    public jrd c;
    public arud d;
    
    public final void W() {
        final jrd c = this.c;
        if (c.h) {
            tcp.m(c.c.b((aexg)new joy(c, 5)), (tcn)jbz.k);
        }
        if (c.g) {
            c.f.s();
        }
        c.e.dispose();
        super.W();
    }
    
    public final void aM() {
        int n;
        if (!gkt.aO(this.d)) {
            n = 2132213788;
        }
        else {
            n = 2132213787;
        }
        ((cex)this).p(n);
        ((br)this).od().setTitle(2132019111);
        final jrd c = this.c;
        final cff a = ((cex)this).a;
        amdv amdv;
        if ((amdv = c.i.f().i) == null) {
            amdv = amdv.a;
        }
        amdw amdw;
        if ((amdw = amdv.j) == null) {
            amdw = amdw.a;
        }
        final boolean f = amdw.f;
        c.g = f;
        if (f) {
            c.f.b(wya.b(93926), (aioe)null, (alff)null);
        }
        c.b(a, jrd.a, (aexg)ixn.q);
        c.b(a, jrd.b, (aexg)ixn.r);
    }
}
