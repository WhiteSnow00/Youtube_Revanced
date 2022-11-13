// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

import android.graphics.Bitmap;

final class e
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    private final CharSequence j;
    private final Bitmap k;
    
    public e() {
    }
    
    public e(final CharSequence j, final boolean a, final boolean b, final boolean c, final boolean d, final Bitmap k, final int e, final int f, final int g, final int h, final int i) {
        this.j = j;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.k = k;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final d a() {
        final d d = new d();
        d.a = this.j;
        d.e(this.a);
        d.d(this.b);
        d.g(this.c);
        d.f(this.d);
        d.b = this.k;
        d.c(this.e);
        d.h(this.f);
        d.i(this.g);
        d.b(this.h);
        d.j(this.i);
        return d;
    }
    
    public final /* bridge */ Object clone() {
        return this.a();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof e) {
            final e e = (e)o;
            final CharSequence j = this.j;
            if (j == null) {
                if (e.j != null) {
                    return false;
                }
            }
            else if (!j.equals(e.j)) {
                return false;
            }
            if (this.a == e.a && this.b == e.b && this.c == e.c && this.d == e.d) {
                final Bitmap k = this.k;
                if (k == null) {
                    if (e.k != null) {
                        return false;
                    }
                }
                else if (!k.equals(e.k)) {
                    return false;
                }
                if (this.e == e.e && this.f == e.f && this.g == e.g && this.h == e.h && this.i == e.i) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final CharSequence j = this.j;
        int hashCode = 0;
        int hashCode2;
        if (j == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = j.hashCode();
        }
        final boolean a = this.a;
        int n = 1237;
        int n2;
        if (!a) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        int n3;
        if (!this.b) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        int n4;
        if (!this.c) {
            n4 = 1237;
        }
        else {
            n4 = 1231;
        }
        if (this.d) {
            n = 1231;
        }
        final Bitmap k = this.k;
        if (k != null) {
            hashCode = k.hashCode();
        }
        return ((((((((((hashCode2 ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n) * 1000003 ^ hashCode) * 1000003 ^ this.e) * 1000003 ^ this.f) * 1000003 ^ this.g) * 1000003 ^ this.h) * 1000003 ^ this.i;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.j);
        final boolean a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final boolean d = this.d;
        final String value2 = String.valueOf(this.k);
        final int e = this.e;
        final int f = this.f;
        final int g = this.g;
        final int h = this.h;
        final int i = this.i;
        final StringBuilder sb = new StringBuilder("Data{adTitle=");
        sb.append(value);
        sb.append(", isSkippable=");
        sb.append(a);
        sb.append(", hideSkipButton=");
        sb.append(b);
        sb.append(", skipEnabled=");
        sb.append(c);
        sb.append(", showAdChoices=");
        sb.append(d);
        sb.append(", channelThumbnail=");
        sb.append(value2);
        sb.append(", extraBottomMarginPx=");
        sb.append(e);
        sb.append(", skipTimeRemainingMillis=");
        sb.append(f);
        sb.append(", timeRemainingMillis=");
        sb.append(g);
        sb.append(", currentAdIndex=");
        sb.append(h);
        sb.append(", totalAds=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
