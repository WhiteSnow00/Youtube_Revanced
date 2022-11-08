// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.nextgenwatch.ui;

import android.content.Context;

public class UpForFullController implements tfh
{
    public final int a;
    public final Context b;
    public boolean c;
    public boolean d;
    private final abns e;
    private final asib f;
    
    public UpForFullController(final Context b, final abns e) {
        this.b = b;
        this.e = e;
        this.f = new asib();
        this.a = tmy.aZ(b.getResources().getDisplayMetrics(), 64);
    }
    
    public final boolean j() {
        boolean b;
        if (tmy.bo(this.b)) {
            b = this.c;
        }
        else {
            b = this.d;
        }
        return b;
    }
    
    public final void oS(final aum aum) {
        final asib f = this.f;
        final abns e = this.e;
        asic asic;
        if (((uyi)e.cd().h).bx()) {
            asic = e.R().am((asix)new kzx(this, 12), (asix)kul.s);
        }
        else {
            asic = e.Q().R().P(ashw.a()).am((asix)new kzx(this, 12), (asix)kul.s);
        }
        f.f(new asic[] { asic });
    }
    
    public final void oW(final aum aum) {
        this.f.b();
    }
}
