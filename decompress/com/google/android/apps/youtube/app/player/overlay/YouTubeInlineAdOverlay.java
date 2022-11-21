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

public final class YouTubeInlineAdOverlay extends abcq implements sjw, fqm, tio, thj
{
    public final acrw a;
    public final iwp b;
    public final izs c;
    public final abvi d;
    private final sml e;
    private final acig f;
    private final xab g;
    private final fjy h;
    private final thg i;
    private final acya j;
    private final ImageView k;
    private final ixc l;
    private final arzb m;
    private final zkt n;
    
    public YouTubeInlineAdOverlay(final Activity activity, final acrw a, final xab g, final acig f, final fjy h, final veh veh, final seg seg, final abvi d, final zkt n, final ixc l, final ImageView imageView, final abfj a2, final thg i, final arzb m, final acya j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
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
        this.c = new izs();
        this.l = l;
        this.i = i;
        this.m = m;
        this.j = j;
        this.k = imageView;
        this.e = new sml((Context)activity, veh, g);
        final iwp b = new iwp(new smn((Context)activity), g, seg);
        this.b = b;
        final smg a3 = b.a;
        imageView.getClass();
        final ImageView a4 = a3.a;
        final boolean b2 = true;
        adme.T(a4 == null);
        (a3.a = imageView).setVisibility(8);
        imageView.setOnClickListener((View$OnClickListener)new ioj(b, 15));
        final smn b3 = b.b;
        a2.getClass();
        adme.T(b3.a == null && b2);
        (b3.a = a2).a((View$OnClickListener)new smm(b3, 0));
        b3.a.c(8);
    }
    
    private final void m() {
        this.b.rV(this.c.a);
        final iwp b = this.b;
        final boolean ow = this.oW();
        if (b.l) {
            final ixc f = b.f;
            f.getClass();
            if (ow) {
                f.b((CharSequence)null, (CharSequence)null, (aowb)null);
                return;
            }
            f.b((CharSequence)null, (CharSequence)null, (aowb)null);
        }
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final /* bridge */ View c(final Context context) {
        final RelativeLayout relativeLayout = new RelativeLayout(context);
        LayoutInflater.from(context).inflate(2131624579, (ViewGroup)relativeLayout);
        final TextView textView = (TextView)relativeLayout.findViewById(2131427528);
        final smj h = new smj(this.n.an(textView), this.g);
        ((smh)h).c((Object)textView);
        ((smh)this.e).c((Object)relativeLayout.findViewById(2131427901));
        final ahsn u = qey.u(this.m);
        final boolean b = false;
        final boolean b2 = u != null && u.m;
        final ahsn u2 = qey.u(this.m);
        boolean b3 = b;
        if (u2 != null) {
            b3 = b;
            if (u2.n) {
                b3 = true;
            }
        }
        final smi e = new smi(b2, b3);
        ((smh)e).c((Object)relativeLayout.findViewById(2131427527));
        final SkipAdButton skipAdButton = (SkipAdButton)relativeLayout.findViewById(2131431562);
        skipAdButton.a(true);
        final AdCountdownView adCountdownView = (AdCountdownView)relativeLayout.findViewById(2131427511);
        final slw c = adCountdownView.c;
        c.c.setTextColor(agz.a(c.a, 2131102103));
        final arhz arhz = new arhz(adCountdownView, this.f);
        final ixc l = this.l;
        final View viewById = relativeLayout.findViewById(2131432327);
        l.c = (TextView)viewById.findViewById(2131432096);
        l.d = (TextView)viewById.findViewById(2131427696);
        l.a = viewById.findViewById(2131428151);
        l.b = (ImageView)l.a.findViewById(2131428150);
        l.f = new tqa(viewById, 200L, 8);
        this.l.a(this.h.j().c());
        final iwp b4 = this.b;
        final sml e2 = this.e;
        final ixc i = this.l;
        adme.U(b4.l ^ true, "Can only be initialized once");
        b4.h = h;
        b4.i = e2;
        final smo j = b4.j;
        if (j != null) {
            e2.a = j;
        }
        i.getClass();
        b4.f = i;
        b4.m = new hzv(i);
        b4.e = e;
        skipAdButton.setOnTouchListener((View$OnTouchListener)new gcl(b4, 2));
        skipAdButton.setOnClickListener((View$OnClickListener)new ioj(b4, 16));
        ((AdProgressTextView)((smh)e).c).setOnClickListener((View$OnClickListener)new ivl(b4, e, 4));
        ((smh)(b4.g = new smp(b4.c, b4.d))).c((Object)new skc(arhz, skipAdButton, (byte[])null));
        b4.l = true;
        relativeLayout.addOnLayoutChangeListener((View$OnLayoutChangeListener)new fto(this, 20));
        return (View)relativeLayout;
    }
    
    public final /* bridge */ void e(final Context context, final View view) {
        final RelativeLayout relativeLayout = (RelativeLayout)view;
        if (this.ab(2)) {
            final iwp b = this.b;
            final boolean c = this.c.c;
            if (b.k != c) {
                b.k = c;
                final smn b2 = b.b;
                final boolean g = b2.g;
                final int n = 8;
                if (g != c) {
                    b2.g = c;
                    int n2;
                    if (!smn.a(b2.h, b2.i, c)) {
                        n2 = 8;
                    }
                    else {
                        n2 = 0;
                    }
                    final abfj a = b2.a;
                    if (a != null && ((slp)((smh)b2).b).b) {
                        a.c(n2);
                    }
                }
                if (b.l) {
                    final smp g2 = b.g;
                    g2.getClass();
                    if (((smh)g2).e && g2.a != c) {
                        g2.a = c;
                        final sma sma = (sma)((smh)g2).c;
                        final sls sls = (sls)((smh)g2).b;
                        sma.j(sls.d, c || sls.e);
                    }
                    b.a.a(c);
                    final smj h = b.h;
                    h.getClass();
                    h.a = c;
                    final sml i = b.i;
                    i.getClass();
                    i.g = c;
                    if (((smh)i).e) {
                        int visibility;
                        if (!sml.g(i.f, c)) {
                            visibility = n;
                        }
                        else {
                            visibility = 0;
                        }
                        ((BrandInteractionView)((smh)i).c).setVisibility(visibility);
                    }
                }
            }
            this.l.a(this.c.d);
        }
        if (this.ab(1)) {
            this.m();
        }
        if (this.ab(4)) {
            final ixc l = this.l;
            final boolean b3 = this.c.b;
            if (l.e != b3) {
                final tqa f = l.f;
                if (f != null) {
                    f.l(l.e = b3, false);
                }
            }
        }
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void k(final fku fku) {
        final boolean n = fku.n();
        boolean c;
        final boolean b = c = true;
        if (!n) {
            c = (fku.f() && b);
        }
        final izs c2 = this.c;
        if (c2.c == c && c2.d == fku.c()) {
            return;
        }
        final izs c3 = this.c;
        c3.c = c;
        c3.d = fku.c();
        this.Z(2);
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final String mq() {
        return "player_overlay_inline_ad";
    }
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final aapo aapo = (aapo)o;
            final izs c = this.c;
            final boolean b = c.b;
            final boolean a = aapo.a;
            array = null;
            if (b != a) {
                c.b = a;
                this.Z(4);
                return null;
            }
        }
        else {
            array = new Class[] { aapo.class };
        }
        return array;
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        this.i.g((Object)this);
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final boolean oW() {
        return this.c.a();
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.i.m((Object)this);
    }
    
    public final boolean ot(final fku fku) {
        return ezw.c(fku);
    }
    
    public final void ov(final int n) {
        if (n == 0) {
            final xab g = this.g;
            if (g != null) {
                g.o((xbe)new wzy(this.c.a.j), this.c.a.k);
            }
            this.m();
            return;
        }
        if (n == 2) {
            final xab g2 = this.g;
            if (g2 != null) {
                g2.t((xbe)new wzy(this.c.a.j), this.c.a.k);
            }
        }
    }
    
    public final void po(final smo smo) {
        this.b.po(smo);
    }
    
    public final void rV(final slh a) {
        this.c.a = a;
        final afbh e = a.e.c.e;
        if (e.h()) {
            final String g = ((ahpb)e.c()).g;
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
        final iwp b = this.b;
        final slp f = a.f;
        final boolean a2 = this.c.a();
        if (b.l) {
            final smn b2 = b.b;
            b2.e((Object)f, b2.h = a2);
        }
        if (this.oW()) {
            this.ow();
        }
        else {
            final iwp b3 = this.b;
            if (b3.l) {
                b3.a.e((Object)false, false);
            }
            super.mk();
        }
        this.Z(1);
    }
}
