// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.context.a;
import android.graphics.Bitmap;
import android.content.res.Resources;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.n;
import android.widget.RelativeLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.v;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.c;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.k;
import com.google.android.apps.youtube.embeddedplayer.service.jar.b;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g;

public final class f extends abbk implements g
{
    private static final String e;
    public vcy a;
    public sln b;
    public Context c;
    public boolean d;
    private FrameLayout f;
    private TextView g;
    private FrameLayout h;
    private View i;
    private TextView j;
    private abec k;
    private ImageView l;
    private e m;
    private boolean n;
    private boolean o;
    private final asir p;
    
    static {
        e = akc.a().b(" · ");
    }
    
    public f(final Context c) {
        super(c);
        this.d = true;
        this.c = c;
        final d d = new d();
        d.a = null;
        d.e(false);
        d.d(false);
        d.g(false);
        d.f(false);
        d.b = null;
        d.c(0);
        d.h(0);
        d.i(0);
        d.b(0);
        d.j(0);
        this.m = d.a();
        this.p = com.google.android.apps.youtube.embeddedplayer.service.jar.b.a.c(new k(this, 18), (asjr)lmw.k);
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
                    from.inflate(2131624393, (ViewGroup)this.f);
                    break Label_0082;
                }
                catch (final RuntimeException ex) {
                    com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.c.a().c(com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.b.b, "Unable to inflate LazyEmbeddedAdOverlay", (Throwable)ex);
                    afse.o("Unable to inflate LazyEmbeddedAdOverlay: ".concat(ex.toString()));
                    final FrameLayout frameLayout = this.f;
                    return (View)frameLayout;
                }
            }
            from.inflate(2131624393, (ViewGroup)this.f);
        }
        if (!this.p.tA()) {
            asjv.b((AtomicReference)this.p);
        }
        this.o = true;
        this.g = (TextView)this.f.findViewById(2131427532);
        this.h = (FrameLayout)this.f.findViewById(2131427533);
        final View viewById = this.f.findViewById(2131431561);
        this.i = viewById;
        this.j = (TextView)viewById.findViewById(2131431566);
        this.l = (ImageView)this.i.findViewById(2131431565);
        this.h.setOnClickListener((View$OnClickListener)new v(this, 5));
        this.i.setOnClickListener((View$OnClickListener)new v(this, 6));
        this.i.setOnTouchListener((View$OnTouchListener)new gcf(this, 12));
        final FrameLayout frameLayout = this.f;
        return (View)frameLayout;
    }
    
    public final void e(final Context context, final View view) {
        final FrameLayout frameLayout = (FrameLayout)view;
        if (this.mn()) {
            if (this.ab(2)) {
                if (this.mn()) {
                    if (this.m.c) {
                        this.j.setText((CharSequence)this.f.getResources().getString(2132019832));
                        this.l.setVisibility(0);
                    }
                    else {
                        this.l.setVisibility(8);
                    }
                    this.i.setEnabled(this.m.c);
                    final e m = this.m;
                    if (!m.b && m.a) {
                        this.i.setVisibility(0);
                    }
                    else {
                        this.i.setVisibility(8);
                    }
                }
            }
            if (this.ab(4)) {
                if (this.mn()) {
                    final boolean d = this.m.d;
                    this.h.setEnabled(d);
                    Drawable f;
                    if (d) {
                        f = ahv.f(this.f.getResources(), 2131230905, null);
                    }
                    else {
                        f = null;
                    }
                    apj.j(this.g, (Drawable)null, (Drawable)null, f);
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
                final e i = this.m;
                this.n(i.g, i.h, i.i);
            }
            if (this.ab(32)) {
                this.o(this.m.f);
            }
        }
    }
    
    public final void m(final asie asie) {
        asie.ab((asjm)new k(this, 19), (asjm)com.google.android.apps.youtube.embeddedplayer.service.jar.client.n.e);
    }
    
    public final abbn mj(final Context context) {
        final abbn mj = super.mj(context);
        mj.e = false;
        mj.b();
        mj.a();
        return mj;
    }
    
    public final boolean mn() {
        return this.o && super.mn();
    }
    
    public final void n(final int n, final int n2, final int n3) {
        if (!this.mn()) {
            final d a = this.m.a();
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
        final String j = tvb.j((long)(n / 1000));
        if (n3 >= 2) {
            this.g.setText((CharSequence)this.f.getResources().getString(2132017454, new Object[] { com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.f.e, n2, n3, j }));
            return;
        }
        this.g.setText((CharSequence)this.f.getResources().getString(2132017453, new Object[] { com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.f.e, j }));
    }
    
    public final void o(int n) {
        if (!this.mn()) {
            final d a = this.m.a();
            a.h(n);
            this.m = a.a();
            this.Z(32);
            return;
        }
        final TextView j = this.j;
        final Resources resources = this.f.getResources();
        n = (n + 999) / 1000;
        final Integer value = n;
        j.setText((CharSequence)resources.getString(2132019833, new Object[] { value }));
        this.j.setContentDescription((CharSequence)this.f.getResources().getQuantityString(2131886088, n, new Object[] { value }));
    }
    
    public final boolean oV() {
        return this.n;
    }
    
    public final abbp ox() {
        return super.ox();
    }
    
    public final void p(final CharSequence a) {
        final d a2 = this.m.a();
        a2.a = a;
        this.m = a2.a();
        this.Z(8);
    }
    
    public final void q(final Bitmap b) {
        final d a = this.m.a();
        a.b = b;
        this.m = a.a();
        this.Z(16);
    }
    
    public final void r(final int n) {
        final d a = this.m.a();
        a.c(n);
        this.m = a.a();
        this.Z(1);
    }
    
    public final void s(final boolean b) {
        final d a = this.m.a();
        a.d(b);
        this.m = a.a();
        this.Z(2);
    }
    
    public final void t(final abec k) {
        k.getClass();
        adkp.Q(this.k == null);
        (this.k = k).a((View$OnClickListener)new v(this, 4));
        this.k.c(8);
    }
    
    public final void u(final sln b) {
        this.b = b;
    }
    
    public final void v(final boolean b) {
        final d a = this.m.a();
        a.f(b);
        this.m = a.a();
        this.Z(4);
    }
    
    public final void w(final boolean b) {
        final d a = this.m.a();
        a.g(b);
        this.m = a.a();
        this.Z(2);
    }
    
    public final void x(final boolean b) {
        final d a = this.m.a();
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
        final abec k = this.k;
        if (k != null) {
            k.c(8);
        }
    }
    
    public final void z(final ajrv ajrv) {
        Context context2;
        final Context context = context2 = this.c;
        if (context instanceof a) {
            context2 = ((a)context).getBaseContext();
        }
        final vcy a = this.a;
        if (a != null) {
            acaz.g(context2, ajrv, a, (Object)null, (aeea)null);
            return;
        }
        afse.o("Unable to show dismissible ads dialog: command router not present.");
    }
}
