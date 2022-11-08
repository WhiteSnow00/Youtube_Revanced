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

public final class jbo extends abgj
{
    public final acng a;
    public final Context b;
    public final wwv c;
    public Optional d;
    public grx e;
    public Optional f;
    private final View j;
    private final fpg k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final Rect p;
    private final atje q;
    private final Point r;
    private final aays s;
    private final boolean t;
    private Optional u;
    private boolean v;
    private View w;
    private View x;
    private boolean y;
    private final uyi z;
    
    public jbo(final abgp abgp, final aays s, final abfv abfv, final uyf uyf, final acng a, final wwv c, final aayq aayq, final mrm mrm, final aayj aayj, final uyi z, final fpg k, final ViewStub viewStub, final View j, final byte[] array, final byte[] array2, final byte[] array3) {
        super(viewStub, abgp);
        this.e = grx.a();
        this.j = j;
        this.k = k;
        this.s = s;
        this.a = a;
        this.c = c;
        this.z = z;
        this.r = new Point();
        this.p = new Rect();
        this.q = (atje)atir.e();
        this.b = j.getContext();
        this.u = Optional.empty();
        this.d = Optional.empty();
        this.f = Optional.empty();
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        final boolean by = alvl.by;
        this.t = by;
        this.l = j.getResources().getDimensionPixelOffset(2131166941);
        this.m = j.getResources().getDimensionPixelOffset(2131166942);
        this.n = j.getResources().getDimensionPixelOffset(2131166943);
        final DisplayMetrics displayMetrics = j.getResources().getDisplayMetrics();
        alvl alvl2;
        if ((alvl2 = uyf.b().e) == null) {
            alvl2 = alvl.a;
        }
        this.o = tmy.aZ(displayMetrics, alvl2.at);
        abfv.a((abfu)new iyh(this, 2));
        if (by) {
            final jbn jbn = new jbn(this);
            mrm.A((Callable)new imb(aayq, jbn, 9));
            mrm.A((Callable)new imb(aayq, jbn, 10));
        }
        mrm.A((Callable)new imb(this, aayj, 11));
    }
    
    @Override
    protected final long a(long c) {
        final grx e = this.e;
        long n = c;
        if (e.a) {
            n = c - e.c;
        }
        final abby f = this.k.f();
        if (f.q()) {
            c = f.c;
            return f.d - (c - n) - f.v;
        }
        return n;
    }
    
    public final abgl b() {
        if (super.h == null) {
            final ViewStub g = super.g;
            if (g != null) {
                super.h = (abgl)g.inflate();
                super.g = null;
            }
        }
        final abgl h = super.h;
        if (!this.v) {
            final TextView textView = (TextView)h.findViewById(2131428162);
            if (textView != null) {
                this.u = Optional.of((Object)new tmt((View)textView, (byte[])null));
                this.c();
            }
            Optional optional;
            if (this.t) {
                optional = Optional.ofNullable((Object)h.findViewById(2131432072));
            }
            else {
                optional = Optional.empty();
            }
            optional.ifPresent((Consumer)new iqu(this, 17));
            if (this.o > 0) {
                this.w = h.findViewById(2131432014);
                this.x = h.findViewById(2131432078);
                final View viewById = h.findViewById(2131432006);
                final int maxWidth = viewById.getLayoutParams().width + this.o;
                textView.setMaxWidth(maxWidth);
                tmy.aF((View)textView, tmy.aD(-2), (Class)ViewGroup$LayoutParams.class);
                tmy.aF(h.findViewById(2131431969), tmy.aD(-2), (Class)ViewGroup$LayoutParams.class);
                textView.addOnLayoutChangeListener((View$OnLayoutChangeListener)new jbm(this, h, 1));
                optional.ifPresent((Consumer)new hxn(this, maxWidth, h, 3));
                if (this.z.aR()) {
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
        ((TextView)((tmt)this.u.get()).a).setText(text);
        this.y = (TextUtils.isEmpty(text) ^ true);
        this.d();
    }
    
    public final void d() {
        if (this.u.isEmpty()) {
            return;
        }
        final boolean present = this.d.isPresent();
        boolean b = true;
        final boolean b2 = present && ((tmt)this.d.get()).e();
        final tmt tmt = (tmt)this.u.get();
        if (!this.y || b2) {
            b = false;
        }
        tmt.l(b, false);
    }
    
    public final void e(final abgl abgl) {
        this.k.h(this.r);
        final int n = abgl.getWidth() / 2;
        final int l = this.l;
        final int n2 = this.j.getWidth() - this.l;
        final int y = this.r.y;
        int n4 = 0;
        Label_0096: {
            if (this.t) {
                final TimelineMarker[] n3 = this.s.n(abcg.h);
                if (n3 != null && n3.length > 0) {
                    n4 = this.n;
                    break Label_0096;
                }
            }
            n4 = this.m;
        }
        final int n5 = Math.max(l + n, Math.min(this.r.x, n2 - n)) - n;
        abgl.setX((float)n5);
        abgl.setY((float)(y - n4 - abgl.getHeight()));
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
        abgl.getGlobalVisibleRect(this.p);
        this.q.tr((Object)this.p);
    }
}
