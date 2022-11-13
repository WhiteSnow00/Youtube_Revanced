import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import android.text.TextUtils;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewGroup$LayoutParams;
import java.util.function.Consumer;
import android.widget.TextView;
import android.util.DisplayMetrics;
import java.util.concurrent.Callable;
import android.view.ViewStub;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import j$.util.Optional;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcn extends abie
{
    public final acpk a;
    public final Context b;
    public final wyw c;
    public Optional d;
    public gsf e;
    public Optional f;
    private final View j;
    private final fpn k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final Rect p;
    private final atjz q;
    private final Point r;
    private final abap s;
    private final boolean t;
    private Optional u;
    private boolean v;
    private View w;
    private View x;
    private boolean y;
    private final vai z;
    
    public jcn(final abij abij, final abap s, final abhq abhq, final vaf vaf, final acpk a, final wyw c, final aban aban, final msr msr, final abag abag, final vai z, final fpn k, final ViewStub viewStub, final View j, final byte[] array, final byte[] array2) {
        super(viewStub, abij);
        this.e = gsf.a();
        this.j = j;
        this.k = k;
        this.s = s;
        this.a = a;
        this.c = c;
        this.z = z;
        this.r = new Point();
        this.p = new Rect();
        this.q = (atjz)atjm.e();
        this.b = j.getContext();
        this.u = Optional.empty();
        this.d = Optional.empty();
        this.f = Optional.empty();
        alxp alxp;
        if ((alxp = vaf.b().e) == null) {
            alxp = alxp.a;
        }
        final boolean by = alxp.by;
        this.t = by;
        this.l = j.getResources().getDimensionPixelOffset(2131166940);
        this.m = j.getResources().getDimensionPixelOffset(2131166941);
        this.n = j.getResources().getDimensionPixelOffset(2131166942);
        final DisplayMetrics displayMetrics = j.getResources().getDisplayMetrics();
        alxp alxp2;
        if ((alxp2 = vaf.b().e) == null) {
            alxp2 = alxp.a;
        }
        this.o = tpe.aZ(displayMetrics, alxp2.at);
        abhq.a((abhp)new izg(this, 2));
        if (by) {
            final jcm jcm = new jcm(this);
            msr.Q((Callable)new imy(aban, jcm, 9));
            msr.Q((Callable)new imy(aban, jcm, 10));
        }
        msr.Q((Callable)new imy(this, abag, 11));
    }
    
    protected final long a(long c) {
        final gsf e = this.e;
        long n = c;
        if (e.a) {
            n = c - e.c;
        }
        final abds f = this.k.f();
        c = n;
        if (f.q()) {
            c = f.c;
            c = f.d - (c - n) - f.v;
        }
        return c;
    }
    
    public final abig b() {
        if (super.h == null) {
            final ViewStub g = super.g;
            if (g != null) {
                super.h = (abig)g.inflate();
                super.g = null;
            }
        }
        final abig h = super.h;
        if (!this.v) {
            final TextView textView = (TextView)h.findViewById(2131428162);
            if (textView != null) {
                this.u = Optional.of((Object)new toz((View)textView, (byte[])null));
                this.c();
            }
            Optional optional;
            if (this.t) {
                optional = Optional.ofNullable((Object)h.findViewById(2131432075));
            }
            else {
                optional = Optional.empty();
            }
            optional.ifPresent((Consumer)new inj(this, 18));
            if (this.o > 0) {
                this.w = h.findViewById(2131432017);
                this.x = h.findViewById(2131432081);
                final View viewById = h.findViewById(2131432009);
                final int maxWidth = viewById.getLayoutParams().width + this.o;
                textView.setMaxWidth(maxWidth);
                tpe.aF((View)textView, tpe.aD(-2), (Class)ViewGroup$LayoutParams.class);
                tpe.aF(h.findViewById(2131431972), tpe.aD(-2), (Class)ViewGroup$LayoutParams.class);
                textView.addOnLayoutChangeListener((View$OnLayoutChangeListener)new jcl(this, h, 1));
                optional.ifPresent((Consumer)new hyj(this, maxWidth, h, 3));
                if (this.z.aS()) {
                    this.w.setClipToOutline(true);
                    this.w.setBackgroundResource(2131233458);
                    viewById.setClipToOutline(true);
                    viewById.setBackgroundResource(2131231033);
                }
            }
            this.v = true;
        }
        return h;
    }
    
    public final void c() {
        if (!this.u.isPresent()) {
            return;
        }
        final CharSequence text = (CharSequence)this.f.orElse((Object)"");
        ((TextView)((toz)this.u.get()).a).setText(text);
        this.y = (TextUtils.isEmpty(text) ^ true);
        this.d();
    }
    
    public final void d() {
        if (this.u.isEmpty()) {
            return;
        }
        final boolean present = this.d.isPresent();
        boolean b = true;
        final boolean b2 = present && ((toz)this.d.get()).e();
        final toz toz = (toz)this.u.get();
        if (!this.y || b2) {
            b = false;
        }
        toz.l(b, false);
    }
    
    public final void e(final abig abig) {
        this.k.h(this.r);
        final int n = abig.getWidth() / 2;
        final int l = this.l;
        final int n2 = this.j.getWidth() - this.l;
        final int y = this.r.y;
        int n4 = 0;
        Label_0098: {
            if (this.t) {
                final TimelineMarker[] n3 = this.s.n(abea.h);
                if (n3 != null && n3.length > 0) {
                    n4 = this.n;
                    break Label_0098;
                }
            }
            n4 = this.m;
        }
        final int n5 = Math.max(l + n, Math.min(this.r.x, n2 - n)) - n;
        abig.setX((float)n5);
        abig.setY((float)(y - n4 - abig.getHeight()));
        if (!this.u.isEmpty() && this.o > 0) {
            final View w = this.w;
            if (w != null && this.x != null) {
                final int n6 = w.getWidth() / 2;
                final int max = Math.max(l + n6, Math.min(this.r.x, n2 - n6));
                final float x = this.w.getX();
                final float x2 = (float)(max - n6 - n5);
                this.w.setX(x2);
                final View x3 = this.x;
                x3.setX(x3.getX() - (x - x2));
            }
        }
        abig.getGlobalVisibleRect(this.p);
        this.q.tu((Object)this.p);
    }
}
