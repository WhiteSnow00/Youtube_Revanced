// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

import android.graphics.Bitmap;

public final class e
{
    public CharSequence a;
    public Bitmap b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private short l;
    
    public final f a() {
        if (this.l != 511) {
            final StringBuilder sb = new StringBuilder();
            if ((this.l & 0x1) == 0x0) {
                sb.append(" isSkippable");
            }
            if ((this.l & 0x2) == 0x0) {
                sb.append(" hideSkipButton");
            }
            if ((this.l & 0x4) == 0x0) {
                sb.append(" skipEnabled");
            }
            if ((this.l & 0x8) == 0x0) {
                sb.append(" showAdChoices");
            }
            if ((this.l & 0x10) == 0x0) {
                sb.append(" extraBottomMarginPx");
            }
            if ((this.l & 0x20) == 0x0) {
                sb.append(" skipTimeRemainingMillis");
            }
            if ((this.l & 0x40) == 0x0) {
                sb.append(" timeRemainingMillis");
            }
            if ((this.l & 0x80) == 0x0) {
                sb.append(" currentAdIndex");
            }
            if ((this.l & 0x100) == 0x0) {
                sb.append(" totalAds");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new f(this.a, this.c, this.d, this.e, this.f, this.b, this.g, this.h, this.i, this.j, this.k);
    }
    
    public final void b(final int j) {
        this.j = j;
        this.l |= 0x80;
    }
    
    public final void c(final int g) {
        this.g = g;
        this.l |= 0x10;
    }
    
    public final void d(final boolean d) {
        this.d = d;
        this.l |= 0x2;
    }
    
    public final void e(final boolean c) {
        this.c = c;
        this.l |= 0x1;
    }
    
    public final void f(final boolean f) {
        this.f = f;
        this.l |= 0x8;
    }
    
    public final void g(final boolean e) {
        this.e = e;
        this.l |= 0x4;
    }
    
    public final void h(final int h) {
        this.h = h;
        this.l |= 0x20;
    }
    
    public final void i(final int i) {
        this.i = i;
        this.l |= 0x40;
    }
    
    public final void j(final int k) {
        this.k = k;
        this.l |= 0x100;
    }
}
