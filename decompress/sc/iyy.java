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

public final class iyy extends abbk implements tgg
{
    private static final long q;
    public final iyx a;
    public final iyx b;
    public final iyx c;
    public iyx d;
    public final atke e;
    public final Runnable f;
    public final atke g;
    public final boolean h;
    public fpv i;
    public boolean j;
    public iyx k;
    public boolean l;
    public String m;
    public String n;
    public FrameLayout o;
    public aans p;
    private final acgs r;
    private boolean s;
    private View t;
    private View u;
    private View v;
    
    static {
        q = TimeUnit.SECONDS.toMillis(4L);
    }
    
    public iyy(final Context context, final atke e, final acgs r, final fxw fxw, final atke g, final vaf vaf) {
        super(context);
        final iyx a = new iyw().a();
        this.a = a;
        final iyw iyw = new iyw();
        iyw.b = 0;
        this.b = iyw.a();
        final iyw iyw2 = new iyw();
        iyw2.c = 0;
        this.c = iyw2.a();
        final iyw iyw3 = new iyw();
        iyw3.b();
        this.d = iyw3.a();
        this.f = (Runnable)new inm(this, 17);
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
        this.h = fbu.aw(vaf);
        fxw.f((fxu)new hkz(this, 2));
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
        return new abud(-1, -1, false);
    }
    
    public final View c(final Context context) {
        final FrameLayout o = (FrameLayout)View.inflate(context, 2131625799, (ViewGroup)null);
        this.o = o;
        this.t = o.findViewById(2131432435);
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
        final iyx k = this.k;
        final iyx d = this.d;
        if (k == d && d.e == null) {
            final iyw iyw = new iyw();
            iyw.b();
            iyw.d = tpe.cr(this.o.getContext(), 2130970822);
            iyw.e = new ixg(this, 9);
            final iyx a = iyw.a();
            this.d = a;
            this.k = a;
        }
        final ixg ixg = new ixg(this, 10);
        if (textView != null) {
            textView.setOnClickListener((View$OnClickListener)ixg);
        }
        if (viewById2 != null) {
            viewById2.setOnClickListener((View$OnClickListener)ixg);
        }
        if (viewById != null) {
            viewById.setOnClickListener((View$OnClickListener)new ixg(this, 11));
        }
        this.m();
        return (View)this.o;
    }
    
    public final void e(final Context context, final View view) {
        if (this.ab(1)) {
            final int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131170369);
            final View t = this.t;
            if (t != null) {
                tpe.aF(t, tpe.aq(dimensionPixelOffset), (Class)ViewGroup$MarginLayoutParams.class);
            }
        }
    }
    
    public final void l(final iyx k) {
        this.k = k;
        this.m();
    }
    
    @Override
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
                final aant aant = (aant)o;
                final boolean j = this.j;
                boolean i = b;
                if (aant != null) {
                    i = b;
                    if (aant.g() <= 3000L) {
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
                final aans p3 = (aans)o;
                array2 = array;
                if (p3 != null) {
                    if (p3.c() == null) {
                        array2 = array;
                    }
                    else {
                        this.p = p3;
                        if (this.h) {
                            abke c;
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
                            if (b2 != null && c != null && !c.g() && c != abke.j && b2.m().ab() && (b2.m().ap() || (b2.n() != null && b2.n().B()))) {
                                m = b2.m().M();
                            }
                            else {
                                m = null;
                            }
                            final fpv k = this.i;
                            if (k != null && !TextUtils.equals((CharSequence)m, k.a)) {
                                final fpw fpw = (fpw)this.g.a();
                                final fpv l = this.i;
                                l.getClass();
                                fpw.a(l);
                                this.i = null;
                            }
                            if (this.i == null && m != null) {
                                this.i = fpv.a((CharSequence)m);
                            }
                            if (this.i != null) {
                                final fpw fpw2 = (fpw)this.g.a();
                                final fpv i2 = this.i;
                                i2.getClass();
                                fpw2.b(i2);
                            }
                        }
                        if (p3.c() == abke.i && this.j) {
                            this.l = ((aawr)this.e.a()).i();
                            final PlayerResponseModel b3 = p3.b();
                            iyx iyx2;
                            final iyx iyx = iyx2 = this.a;
                            if (b3 != null) {
                                if (b3.m().ab()) {
                                    this.m = b3.m().M();
                                    final aneh c2 = b3.m().c;
                                    String l2;
                                    if ((c2.c & 0x1) != 0x0) {
                                        appt appt;
                                        if ((appt = c2.u) == null) {
                                            appt = appt.a;
                                        }
                                        l2 = appt.l;
                                    }
                                    else {
                                        l2 = "";
                                    }
                                    this.n = l2;
                                    iyx2 = this.d;
                                }
                                else {
                                    iyx2 = iyx;
                                    if (b3.m().aa()) {
                                        final aneh c3 = b3.m().c;
                                        iyx2 = iyx;
                                        if ((c3.c & 0x1) != 0x0) {
                                            appt appt2;
                                            if ((appt2 = c3.u) == null) {
                                                appt2 = appt.a;
                                            }
                                            iyx2 = iyx;
                                            if (appt2.g) {
                                                iyx2 = this.b;
                                            }
                                        }
                                    }
                                }
                            }
                            this.l(iyx2);
                            this.mm();
                            this.Y();
                            array2 = array;
                        }
                        else {
                            if (p3.c().a(new abke[] { abke.h, abke.j, abke.e })) {
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
            array2 = new Class[] { aans.class, aant.class };
        }
        return array2;
    }
    
    public final boolean oV() {
        final aans p = this.p;
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
    
    @Override
    public final void oy(final int n) {
        if (n == 2) {
            this.s = true;
            if (this.k != this.c) {
                final FrameLayout o = this.o;
                if (o != null) {
                    o.postOnAnimationDelayed(this.f, iyy.q);
                }
            }
        }
    }
}
