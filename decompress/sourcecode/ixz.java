import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.text.TextUtils;
import android.view.ViewGroup$MarginLayoutParams;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnClickListener;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import android.view.View;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixz extends aazp implements tec
{
    private static final long q;
    public final ixy a;
    public final ixy b;
    public final ixy c;
    public ixy d;
    public final atjj e;
    public final Runnable f;
    public final atjj g;
    public final boolean h;
    public fpo i;
    public boolean j;
    public ixy k;
    public boolean l;
    public String m;
    public String n;
    public FrameLayout o;
    public aaly p;
    private final aceo r;
    private boolean s;
    private View t;
    private View u;
    private View v;
    
    static {
        q = TimeUnit.SECONDS.toMillis(4L);
    }
    
    public ixz(final Context context, final atjj e, final aceo r, final fxo fxo, final atjj g, final uyf uyf) {
        super(context);
        final ixy a = new ixx().a();
        this.a = a;
        final ixx ixx = new ixx();
        ixx.b = 0;
        this.b = ixx.a();
        final ixx ixx2 = new ixx();
        ixx2.c = 0;
        this.c = ixx2.a();
        final ixx ixx3 = new ixx();
        ixx3.b();
        this.d = ixx3.a();
        this.f = (Runnable)new ihc(this, 19);
        this.s = false;
        this.j = false;
        this.k = a;
        this.l = false;
        this.m = "";
        this.n = "";
        e.getClass();
        this.e = e;
        r.getClass();
        this.r = r;
        this.g = g;
        this.h = gkt.U(uyf);
        fxo.f((fxm)new hke(this, 2));
    }
    
    private final void m() {
        final View u = this.u;
        if (u != null && this.t != null && this.v != null && this.o != null) {
            u.setVisibility(this.k.a);
            this.t.setVisibility(this.k.b);
            this.v.setVisibility(this.k.c);
            this.o.setBackgroundColor(this.k.d);
            this.o.setOnClickListener((View$OnClickListener)this.k.e);
            this.o.setClickable(this.k.e != null);
        }
    }
    
    public final ViewGroup$LayoutParams a() {
        return new absc(-1, -1, false);
    }
    
    public final View c(final Context context) {
        final FrameLayout o = (FrameLayout)View.inflate(context, 2131625795, (ViewGroup)null);
        this.o = o;
        this.t = o.findViewById(2131432432);
        this.u = this.o.findViewById(2131429706);
        this.v = this.o.findViewById(2131429709);
        final TextView textView = (TextView)this.o.findViewById(2131429859);
        final View viewById = this.o.findViewById(2131428234);
        final View viewById2 = this.o.findViewById(2131428028);
        final ImageView imageView = (ImageView)this.o.findViewById(2131429707);
        imageView.setContentDescription((CharSequence)this.m);
        ((TextView)this.o.findViewById(2131429708)).setText((CharSequence)this.m);
        ((TextView)this.o.findViewById(2131429710)).setText((CharSequence)this.m);
        if (!this.n.isEmpty()) {
            this.r.f(imageView, Uri.parse(this.n));
        }
        final ixy k = this.k;
        final ixy d = this.d;
        if (k == d && d.e == null) {
            final ixx ixx = new ixx();
            ixx.b();
            ixx.d = tmy.cn(this.o.getContext(), 2130970822);
            ixx.e = new iwh(this, 9);
            final ixy a = ixx.a();
            this.d = a;
            this.k = a;
        }
        final iwh iwh = new iwh(this, 10);
        if (textView != null) {
            textView.setOnClickListener((View$OnClickListener)iwh);
        }
        if (viewById2 != null) {
            viewById2.setOnClickListener((View$OnClickListener)iwh);
        }
        if (viewById != null) {
            viewById.setOnClickListener((View$OnClickListener)new iwh(this, 11));
        }
        this.m();
        return (View)this.o;
    }
    
    public final void e(final Context context, final View view) {
        if (this.ab(1)) {
            final int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131170368);
            final View t = this.t;
            if (t != null) {
                tmy.aF(t, tmy.aq(dimensionPixelOffset), (Class)ViewGroup$MarginLayoutParams.class);
            }
        }
    }
    
    public final void l(final ixy k) {
        this.k = k;
        this.m();
    }
    
    public final String mr() {
        return "player_overlay_watch_in_vr";
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        final boolean b = false;
        Class[] array2;
        if (n != -1) {
            final Class[] array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final aalz aalz = (aalz)o;
                final boolean j = this.j;
                boolean i = b;
                if (aalz != null) {
                    i = b;
                    if (aalz.g() <= 3000L) {
                        i = true;
                    }
                }
                if (j != (this.j = i)) {
                    this.Y();
                    return null;
                }
                array2 = array;
            }
            else {
                final aaly p3 = (aaly)o;
                array2 = array;
                if (p3 != null) {
                    if (p3.c() == null) {
                        array2 = array;
                    }
                    else {
                        this.p = p3;
                        if (this.h) {
                            abim c;
                            if (p3 != null) {
                                c = p3.c();
                            }
                            else {
                                c = null;
                            }
                            PlayerResponseModel b2;
                            if (p3 != null) {
                                b2 = p3.b();
                            }
                            else {
                                b2 = null;
                            }
                            String m;
                            if (b2 != null && c != null && !c.g() && c != abim.j && b2.m().ab() && (b2.m().ap() || (b2.n() != null && b2.n().B()))) {
                                m = b2.m().M();
                            }
                            else {
                                m = null;
                            }
                            final fpo k = this.i;
                            if (k != null && !TextUtils.equals((CharSequence)m, k.a)) {
                                final fpp fpp = (fpp)this.g.a();
                                final fpo l = this.i;
                                l.getClass();
                                fpp.a(l);
                                this.i = null;
                            }
                            if (this.i == null && m != null) {
                                this.i = fpo.a((CharSequence)m);
                            }
                            if (this.i != null) {
                                final fpp fpp2 = (fpp)this.g.a();
                                final fpo i2 = this.i;
                                i2.getClass();
                                fpp2.b(i2);
                            }
                        }
                        if (p3.c() == abim.i && this.j) {
                            this.l = ((aauw)this.e.a()).i();
                            final PlayerResponseModel b3 = p3.b();
                            ixy ixy2;
                            final ixy ixy = ixy2 = this.a;
                            if (b3 != null) {
                                if (b3.m().ab()) {
                                    this.m = b3.m().M();
                                    final ancd c2 = b3.m().c;
                                    String l2;
                                    if ((c2.c & 0x1) != 0x0) {
                                        apnp apnp;
                                        if ((apnp = c2.u) == null) {
                                            apnp = apnp.a;
                                        }
                                        l2 = apnp.l;
                                    }
                                    else {
                                        l2 = "";
                                    }
                                    this.n = l2;
                                    ixy2 = this.d;
                                }
                                else {
                                    ixy2 = ixy;
                                    if (b3.m().aa()) {
                                        final ancd c3 = b3.m().c;
                                        ixy2 = ixy;
                                        if ((c3.c & 0x1) != 0x0) {
                                            apnp apnp2;
                                            if ((apnp2 = c3.u) == null) {
                                                apnp2 = apnp.a;
                                            }
                                            ixy2 = ixy;
                                            if (apnp2.g) {
                                                ixy2 = this.b;
                                            }
                                        }
                                    }
                                }
                            }
                            this.l(ixy2);
                            this.mm();
                            this.Y();
                            array2 = array;
                        }
                        else {
                            if (p3.c().a(new abim[] { abim.h, abim.j, abim.e })) {
                                this.l(this.a);
                                this.mk();
                                this.Y();
                                return null;
                            }
                            array2 = array;
                        }
                    }
                }
            }
        }
        else {
            array2 = new Class[] { aaly.class, aalz.class };
        }
        return array2;
    }
    
    public final boolean oU() {
        final aaly p = this.p;
        if ((p != null && this.j) || this.s) {
            final VideoStreamingData videoStreamingData = null;
            PlayerResponseModel b;
            if (p != null) {
                b = p.b();
            }
            else {
                b = null;
            }
            final boolean b2 = p != null && p.c().g();
            if (this.k != this.a && this.l && !b2) {
                VideoStreamingData n = videoStreamingData;
                if (b != null) {
                    n = videoStreamingData;
                    if (b.n() != null) {
                        n = b.n();
                    }
                }
                final boolean b3 = n != null && n.B();
                final boolean b4 = n != null && n.r();
                if (this.k == this.b) {
                    return b3 || b4;
                }
                return b3;
            }
        }
        return false;
    }
    
    public final void oy(final int n) {
        if (n == 2) {
            this.s = true;
            if (this.k != this.c) {
                final FrameLayout o = this.o;
                if (o != null) {
                    o.postOnAnimationDelayed(this.f, ixz.q);
                }
            }
        }
    }
}
