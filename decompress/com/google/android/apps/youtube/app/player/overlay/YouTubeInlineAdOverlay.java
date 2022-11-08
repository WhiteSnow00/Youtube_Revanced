// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

import android.text.TextUtils;
import android.view.View$OnLayoutChangeListener;
import android.view.View$OnTouchListener;
import com.google.android.libraries.youtube.ads.player.ui.AdCountdownView;
import com.google.android.libraries.youtube.ads.player.ui.SkipAdButton;
import com.google.android.libraries.youtube.ads.player.ui.AdProgressTextView;
import com.google.android.libraries.youtube.ads.player.ui.BrandInteractionView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnClickListener;
import android.content.Context;
import android.app.Activity;
import android.widget.ImageView;

public final class YouTubeInlineAdOverlay extends aazp implements sgs, fqb, tfh, tec
{
    public final acoh a;
    public final ivh b;
    public final iyk c;
    public final abrx d;
    private final sjf e;
    private final aceo f;
    private final wwv g;
    private final fjp h;
    private final tdz i;
    private final acuj j;
    private final ImageView k;
    private ivu l;
    private final arud m;
    private final zhb n;
    
    public YouTubeInlineAdOverlay(final Activity activity, final acoh a, final wwv g, final aceo f, final fjp h, final vax vax, final sbc sbc, final abrx d, final zhb n, final ivu l, final ImageView imageView, final abcj a2, final tdz i, final arud m, final acuj j, final byte[] array, final byte[] array2, final byte[] array3) {
        super((Context)activity);
        this.a = a;
        h.getClass();
        this.h = h;
        d.getClass();
        this.d = d;
        f.getClass();
        this.f = f;
        this.g = g;
        this.n = n;
        this.c = new iyk();
        this.l = l;
        this.i = i;
        this.m = m;
        this.j = j;
        this.k = imageView;
        this.e = new sjf((Context)activity, vax, g);
        final ivh b = new ivh(new sjh((Context)activity), g, sbc);
        this.b = b;
        final sja a3 = b.a;
        imageView.getClass();
        final ImageView a4 = a3.a;
        final boolean b2 = true;
        agot.D(a4 == null);
        (a3.a = imageView).setVisibility(8);
        imageView.setOnClickListener((View$OnClickListener)new ina(b, 15));
        final sjh b3 = b.b;
        a2.getClass();
        agot.D(b3.a == null && b2);
        (b3.a = a2).a((View$OnClickListener)new sjg(b3, 0));
        b3.a.c(8);
    }
    
    private final void m() {
        this.b.rP(this.c.a);
        final ivh b = this.b;
        final boolean ou = this.oU();
        if (b.l) {
            final ivu f = b.f;
            f.getClass();
            if (ou) {
                f.b((CharSequence)null, (CharSequence)null, (aorm)null);
                return;
            }
            f.b((CharSequence)null, (CharSequence)null, (aorm)null);
        }
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void j(final fkk fkk) {
        final boolean n = fkk.n();
        boolean c;
        final boolean b = c = true;
        if (!n) {
            c = (fkk.f() && b);
        }
        final iyk c2 = this.c;
        if (c2.c == c && c2.d == fkk.c()) {
            return;
        }
        final iyk c3 = this.c;
        c3.c = c;
        c3.d = fkk.c();
        this.Z(2);
    }
    
    public final String mr() {
        return "player_overlay_inline_ad";
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final aalx aalx = (aalx)o;
            final iyk c = this.c;
            final boolean b = c.b;
            final boolean a = aalx.a;
            array = null;
            if (b != a) {
                c.b = a;
                this.Z(4);
                return null;
            }
        }
        else {
            array = new Class[] { aalx.class };
        }
        return array;
    }
    
    public final void oS(final aum aum) {
        this.i.g((Object)this);
    }
    
    public final boolean oU() {
        return this.c.a();
    }
    
    public final void oW(final aum aum) {
        this.i.m((Object)this);
    }
    
    public final boolean ow(final fkk fkk) {
        return ezp.d(fkk);
    }
    
    public final void oy(final int n) {
        if (n == 0) {
            final wwv g = this.g;
            if (g != null) {
                g.o((wxz)new wws(this.c.a.j), this.c.a.k);
            }
            this.m();
            return;
        }
        if (n == 2) {
            final wwv g2 = this.g;
            if (g2 != null) {
                g2.t((wxz)new wws(this.c.a.j), this.c.a.k);
            }
        }
    }
    
    public final void pm(final sji sji) {
        this.b.pm(sji);
    }
    
    public final void rP(final sib a) {
        this.c.a = a;
        final aexq e = a.e.c.e;
        if (e.h()) {
            final String g = ((ahlm)e.c()).g;
            if (!TextUtils.isEmpty((CharSequence)g)) {
                this.j.d(g, ((RelativeLayout)this.md()).findViewById(2131427527));
            }
        }
        final String l = a.l;
        if (l != null) {
            final int length = l.length();
            if (length != 0) {
                for (int i = 0; i < length; ++i) {
                    if (!Character.isWhitespace(l.charAt(i))) {
                        this.j.d(a.l, (View)this.k);
                        break;
                    }
                }
            }
        }
        final ivh b = this.b;
        final sij f = a.f;
        final boolean a2 = this.c.a();
        if (b.l) {
            final sjh b2 = b.b;
            b2.e((Object)f, b2.h = a2);
        }
        if (this.oU()) {
            this.mm();
        }
        else {
            final ivh b3 = this.b;
            if (b3.l) {
                b3.a.e((Object)false, false);
            }
            super.mk();
        }
        this.Z(1);
    }
}
