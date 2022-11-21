// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

import android.graphics.Bitmap;
import android.content.res.Resources;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.m;
import android.widget.RelativeLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.a;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.c;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.jar.b;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.content.Context;

public final class g extends abcq implements com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
{
    private static final String e;
    public veh a;
    public smo b;
    public Context c;
    public boolean d;
    private FrameLayout f;
    private TextView g;
    private FrameLayout h;
    private View i;
    private TextView j;
    private abfi k;
    private ImageView l;
    private f m;
    private boolean n;
    private boolean o;
    private final asln p;
    
    static {
        e = akd.a().b(" · ");
    }
    
    public g(final Context c) {
        super(c);
        this.d = true;
        this.c = c;
        final e e = new e();
        e.a = null;
        e.e(false);
        e.d(false);
        e.g(false);
        e.f(false);
        e.b = null;
        e.c(0);
        e.h(0);
        e.i(0);
        e.b(0);
        e.j(0);
        this.m = e.a();
        this.p = com.google.android.apps.youtube.embeddedplayer.service.jar.b.a.c((asmi)new d(this, 0), (asmn)lnj.k);
    }
    
    public final void A(final CharSequence charSequence) {
        if (this.k == null) {
            return;
        }
        CharSequence string = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            string = this.f.getResources().getString(2132017451);
        }
        this.k.b(string);
        this.k.c(0);
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final /* bridge */ View c(final Context context) {
        this.f = new FrameLayout(context);
        final LayoutInflater from = LayoutInflater.from(context);
        Label_0082: {
            if (this.d) {
                try {
                    from.inflate(2131624394, (ViewGroup)this.f);
                    break Label_0082;
                }
                catch (final RuntimeException ex) {
                    com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.c.a().c(com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.b.b, "Unable to inflate LazyEmbeddedAdOverlay", (Throwable)ex);
                    aftr.k("Unable to inflate LazyEmbeddedAdOverlay: ".concat(ex.toString()));
                    final FrameLayout frameLayout = this.f;
                    return (View)frameLayout;
                }
            }
            from.inflate(2131624394, (ViewGroup)this.f);
        }
        if (!this.p.tz()) {
            asmr.b((AtomicReference)this.p);
        }
        this.o = true;
        this.g = (TextView)this.f.findViewById(2131427532);
        this.h = (FrameLayout)this.f.findViewById(2131427533);
        final View viewById = this.f.findViewById(2131431562);
        this.i = viewById;
        this.j = (TextView)viewById.findViewById(2131431567);
        this.l = (ImageView)this.i.findViewById(2131431566);
        this.h.setOnClickListener((View$OnClickListener)new a(this, 4));
        this.i.setOnClickListener((View$OnClickListener)new a(this, 5));
        this.i.setOnTouchListener((View$OnTouchListener)new gcl(this, 12));
        final FrameLayout frameLayout = this.f;
        return (View)frameLayout;
    }
    
    public final void e(final Context context, final View view) {
        final FrameLayout frameLayout = (FrameLayout)view;
        if (this.mm()) {
            if (this.ab(2)) {
                if (this.mm()) {
                    if (this.m.c) {
                        this.j.setText((CharSequence)this.f.getResources().getString(2132019835));
                        this.l.setVisibility(0);
                    }
                    else {
                        this.l.setVisibility(8);
                    }
                    this.i.setEnabled(this.m.c);
                    final f m = this.m;
                    if (!m.b && m.a) {
                        this.i.setVisibility(0);
                    }
                    else {
                        this.i.setVisibility(8);
                    }
                }
            }
            if (this.ab(4)) {
                if (this.mm()) {
                    final boolean d = this.m.d;
                    this.h.setEnabled(d);
                    Drawable f;
                    if (d) {
                        f = ahw.f(this.f.getResources(), 2131230905, (Resources$Theme)null);
                    }
                    else {
                        f = null;
                    }
                    apj.h(this.g, null, null, f);
                    if (d) {
                        this.g.setCompoundDrawablePadding(10);
                    }
                }
            }
            if (this.ab(1)) {
                final RelativeLayout$LayoutParams relativeLayout$LayoutParams = (RelativeLayout$LayoutParams)this.i.getLayoutParams();
                relativeLayout$LayoutParams.bottomMargin += this.m.e;
            }
            if (this.ab(64)) {
                final f i = this.m;
                this.n(i.g, i.h, i.i);
            }
            if (this.ab(32)) {
                this.o(this.m.f);
            }
        }
    }
    
    public final void m(final asla asla) {
        asla.ab(new d(this, 2), (asmi)com.google.android.apps.youtube.embeddedplayer.service.jar.client.m.e);
    }
    
    public final abct mj(final Context context) {
        final abct mj = super.mj(context);
        mj.e = false;
        mj.b();
        mj.a();
        return mj;
    }
    
    public final boolean mm() {
        return this.o && super.mm();
    }
    
    public final void n(final int n, final int n2, final int n3) {
        if (!this.mm()) {
            final e a = this.m.a();
            a.i(n);
            a.b(n2);
            a.j(n3);
            this.m = a.a();
            this.Z(64);
            return;
        }
        if (n == -1) {
            this.g.setText((CharSequence)this.f.getResources().getString(2132017446));
            return;
        }
        final String j = twd.j((long)(n / 1000));
        if (n3 >= 2) {
            this.g.setText((CharSequence)this.f.getResources().getString(2132017454, new Object[] { com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.g.e, n2, n3, j }));
            return;
        }
        this.g.setText((CharSequence)this.f.getResources().getString(2132017453, new Object[] { com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.g.e, j }));
    }
    
    public final void o(int n) {
        if (!this.mm()) {
            final e a = this.m.a();
            a.h(n);
            this.m = a.a();
            this.Z(32);
            return;
        }
        final TextView j = this.j;
        final Resources resources = this.f.getResources();
        n = (n + 999) / 1000;
        final Integer value = n;
        j.setText((CharSequence)resources.getString(2132019836, new Object[] { value }));
        this.j.setContentDescription((CharSequence)this.f.getResources().getQuantityString(2131886088, n, new Object[] { value }));
    }
    
    public final boolean oW() {
        return this.n;
    }
    
    public final abcv ou() {
        return super.ou();
    }
    
    public final void p(final CharSequence a) {
        final e a2 = this.m.a();
        a2.a = a;
        this.m = a2.a();
        this.Z(8);
    }
    
    public final void q(final Bitmap b) {
        final e a = this.m.a();
        a.b = b;
        this.m = a.a();
        this.Z(16);
    }
    
    public final void r(final int n) {
        final e a = this.m.a();
        a.c(n);
        this.m = a.a();
        this.Z(1);
    }
    
    public final void s(final boolean b) {
        final e a = this.m.a();
        a.d(b);
        this.m = a.a();
        this.Z(2);
    }
    
    public final void t(final abfi k) {
        k.getClass();
        adme.T(this.k == null);
        (this.k = k).a((View$OnClickListener)new a(this, 3));
        this.k.c(8);
    }
    
    public final void u(final smo b) {
        this.b = b;
    }
    
    public final void v(final boolean b) {
        final e a = this.m.a();
        a.f(b);
        this.m = a.a();
        this.Z(4);
    }
    
    public final void w(final boolean b) {
        final e a = this.m.a();
        a.g(b);
        this.m = a.a();
        this.Z(2);
    }
    
    public final void x(final boolean b) {
        final e a = this.m.a();
        a.e(b);
        this.m = a.a();
        this.Z(2);
    }
    
    public final void y(final boolean n) {
        this.n = n;
        if (n) {
            this.aa();
            return;
        }
        this.X();
        final abfi k = this.k;
        if (k != null) {
            k.c(8);
        }
    }
    
    public final void z(final ajtu ajtu) {
        Context context2;
        final Context context = context2 = this.c;
        if (context instanceof com.google.android.apps.youtube.embeddedplayer.service.context.a) {
            context2 = ((com.google.android.apps.youtube.embeddedplayer.service.context.a)context).getBaseContext();
        }
        final veh a = this.a;
        if (a != null) {
            acck.g(context2, ajtu, a, (Object)null, (aefs)null);
            return;
        }
        aftr.k("Unable to show dismissible ads dialog: command router not present.");
    }
}
