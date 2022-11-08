import java.util.List;
import com.google.protobuf.MessageLite;
import android.view.View$OnAttachStateChangeListener;
import android.widget.LinearLayout$LayoutParams;
import java.util.Collection;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import com.google.protos.youtube.api.innertube.InlinePlaybackRendererOuterClass;
import android.util.DisplayMetrics;
import android.content.res.ColorStateList;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.TextureView;
import android.widget.TextView;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import android.content.Context;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kei extends acja implements View$OnClickListener, acqs, gfa, gjc
{
    private final int A;
    private ajax B;
    private final atjj C;
    private kfi D;
    private final int E;
    private final int F;
    private final vwb G;
    private final adcr H;
    public final Context a;
    public jzw b;
    public final int c;
    final FixedAspectRatioFrameLayout d;
    final LinearLayout e;
    public final ImageView f;
    View$OnClickListener g;
    ViewTreeObserver$OnPreDrawListener h;
    final TextView i;
    final TextView j;
    final TextView k;
    final ImageView l;
    final ImageView m;
    final ImageView n;
    final TextureView o;
    final FrameLayout p;
    private final Resources q;
    private final aceo r;
    private final vax s;
    private final acnj t;
    private final acqu u;
    private final abyf v;
    private final acly x;
    private final InlinePlaybackLifecycleController y;
    private final fzy z;
    
    public kei(final Context a, final aceo r, final vax s, final zhb zhb, final acnj t, final aeby aeby, final atjj c, final InlinePlaybackLifecycleController y, final cxz cxz, final adcr h, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.a = a;
        this.r = r;
        this.s = s;
        this.t = t;
        final Resources resources = a.getResources();
        this.q = resources;
        this.C = c;
        this.y = y;
        this.H = h;
        final LayoutInflater from = LayoutInflater.from(a);
        int n;
        if (!uyi.aP()) {
            n = 2131624330;
        }
        else {
            n = 2131624331;
        }
        final FixedAspectRatioFrameLayout d = (FixedAspectRatioFrameLayout)from.inflate(n, (ViewGroup)null);
        this.d = d;
        final ImageView imageView = (ImageView)d.findViewById(2131427747);
        this.m = imageView;
        this.l = (ImageView)d.findViewById(2131427729);
        this.o = (TextureView)d.findViewById(2131431993);
        this.p = (FrameLayout)d.findViewById(2131429405);
        this.n = (ImageView)d.findViewById(2131429076);
        this.f = (ImageView)d.findViewById(2131428448);
        final LinearLayout e = (LinearLayout)d.findViewById(2131431975);
        this.e = e;
        final TextView textView = (TextView)e.findViewById(2131432092);
        this.i = textView;
        final TextView textView2 = (TextView)e.findViewById(2131428624);
        this.j = textView2;
        final TextView k = (TextView)e.findViewById(2131427452);
        this.k = k;
        final acqu g = zhb.g(k);
        this.u = g;
        ((acqt)g).c = this;
        this.G = tmy.ac(d.findViewById(2131427751));
        this.z = cxz.D(a, (ViewStub)d.findViewById(2131428989));
        d.setOnClickListener((View$OnClickListener)this);
        this.c = resources.getDimensionPixelSize(2131168682);
        this.E = resources.getDimensionPixelSize(2131168678);
        this.F = resources.getDimensionPixelSize(2131168679);
        this.v = aaiy.x(a, (ajsq)null, (abyc)new ackz(s));
        final ColorStateList cp = tmy.cp(a, 2130970884);
        final aclx aclx = (aclx)aeby.a;
        aclx.a = textView;
        aclx.b = textView2;
        aclx.c = (View)imageView;
        aclx.d = cp;
        aclx.e = cp;
        aclx.f = tmy.cp(a, 16842907);
        this.x = aclx.a();
        this.A = tmy.cn(a, 2130970859);
    }
    
    public static int l(final Context context, final int n) {
        return (int)context.getResources().getFraction(2131361813, n, 1);
    }
    
    public static akp m(final Context context, final aorm aorm, int n) {
        final aorl k = actc.K(aorm);
        if (k == null) {
            return null;
        }
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int az = tmy.aZ(displayMetrics, k.d);
        final int az2 = tmy.aZ(displayMetrics, k.e);
        if (az2 > n && n != -1) {
            az = (int)(k.d / k.e * (float)n);
        }
        else {
            n = az2;
        }
        return new akp((Object)az, (Object)n);
    }
    
    public static aorm n(final ajax ajax) {
        if (ajax != null && (ajax.b & 0x80) != 0x0) {
            ajav ajav;
            if ((ajav = ajax.k) == null) {
                ajav = ajav.a;
            }
            if ((ajav.b & 0x1) != 0x0) {
                final ajav k = ajax.k;
                ajav a;
                if (k == null) {
                    a = ajav.a;
                }
                else {
                    a = k;
                }
                if ((a.b & 0x2) != 0x0) {
                    ajav a2;
                    if (k == null) {
                        a2 = ajav.a;
                    }
                    else {
                        a2 = k;
                    }
                    final int e = ajox.E(a2.d);
                    if (e != 0) {
                        if (e == 2) {
                            ajav a3;
                            if ((a3 = k) == null) {
                                a3 = ajav.a;
                            }
                            aorm aorm;
                            if ((aorm = a3.c) == null) {
                                aorm = aorm.a;
                            }
                            return aorm;
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public static aorm o(final Context context, final ajax ajax) {
        if (ajax != null) {
            aorr aorr;
            if ((aorr = ajax.h) == null) {
                aorr = aorr.a;
            }
            if ((aorr.b & 0x1) != 0x0) {
                aorr aorr2;
                if ((aorr2 = ajax.i) == null) {
                    aorr2 = aorr.a;
                }
                if ((aorr2.b & 0x1) != 0x0) {
                    aorq aorq;
                    if (tmy.bq(context)) {
                        aorr aorr3;
                        if ((aorr3 = ajax.i) == null) {
                            aorr3 = aorr.a;
                        }
                        if ((aorq = aorr3.c) == null) {
                            aorq = aorq.a;
                        }
                    }
                    else {
                        aorr aorr4;
                        if ((aorr4 = ajax.h) == null) {
                            aorr4 = aorr.a;
                        }
                        if ((aorq = aorr4.c) == null) {
                            aorq = aorq.a;
                        }
                    }
                    aorm aorm;
                    if (gej.f(context.getResources().getConfiguration().orientation)) {
                        if ((aorm = aorq.d) == null) {
                            aorm = aorm.a;
                        }
                    }
                    else if ((aorm = aorq.c) == null) {
                        aorm = aorm.a;
                    }
                    return aorm;
                }
            }
        }
        return null;
    }
    
    private final akdz q() {
        final ajax b = this.B;
        anss a;
        if (b.c == 22) {
            a = (anss)b.d;
        }
        else {
            a = anss.a;
        }
        if (((agzd)a).rs((agyr)InlinePlaybackRendererOuterClass.inlinePlaybackRenderer)) {
            final ajax b2 = this.B;
            anss a2;
            if (b2.c == 22) {
                a2 = (anss)b2.d;
            }
            else {
                a2 = anss.a;
            }
            return (akdz)((agzd)a2).rr((agyr)InlinePlaybackRendererOuterClass.inlinePlaybackRenderer);
        }
        return null;
    }
    
    private static void r(final View view, final int leftMargin, final int rightMargin) {
        if (!(view.getLayoutParams() instanceof ViewGroup$MarginLayoutParams)) {
            return;
        }
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        viewGroup$MarginLayoutParams.leftMargin = leftMargin;
        viewGroup$MarginLayoutParams.rightMargin = rightMargin;
    }
    
    public final View a() {
        return (View)this.d;
    }
    
    public final boolean b(final gjc gjc) {
        return gjc instanceof kei && ((agzi)((kei)gjc).B).equals(this.B);
    }
    
    public final void c(final acir acir) {
        if (this.D != null) {
            tmy.aG((View)this.p, (atjj)new eps(17), tmy.aE(-1, -1), (Class)FrameLayout$LayoutParams.class);
            this.p.setX(0.0f);
            this.p.removeAllViews();
            this.D.c(acir);
            this.D = null;
        }
        this.m.setBackgroundColor(this.A);
    }
    
    public final View f() {
        final kfi d = this.D;
        if (d == null) {
            return null;
        }
        return d.f();
    }
    
    public final float h(final acij acij) {
        final float fraction = this.a.getResources().getFraction(2131361799, 1, 1);
        final Object value = acij.f.get((Object)"carousel_aspect_ratio");
        if (value instanceof Float) {
            return (float)value;
        }
        return fraction;
    }
    
    public final void k(final boolean b) {
        final kfi d = this.D;
        if (d != null) {
            d.k(b);
        }
    }
    
    public final void onClick(final View view) {
        final ajax b = this.B;
        if (b == null) {
            return;
        }
        final vax s = this.s;
        final int b2 = b.b;
        final aioe aioe = null;
        aioe aioe2;
        if ((b2 & 0x100) != 0x0) {
            if ((aioe2 = b.m) == null) {
                aioe2 = aioe.a;
            }
        }
        else {
            aioe2 = null;
        }
        s.c(aioe2, www.i((Object)this.B, false));
        final vax s2 = this.s;
        final ajax b3 = this.B;
        aioe aioe3 = aioe;
        if ((b3.b & 0x200) != 0x0 && (aioe3 = b3.n) == null) {
            aioe3 = aioe.a;
        }
        s2.c(aioe3, www.g((Object)this.B));
    }
    
    public final void p(int n) {
        final int f = ana.f((View)this.d);
        int n2;
        if (f == 1) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (f == 1) {
            n = 0;
        }
        int childCount = this.e.getChildCount();
        while (true) {
            final int n3 = childCount - 1;
            if (n3 < 0) {
                break;
            }
            final View child = this.e.getChildAt(n3);
            childCount = n3;
            if (!(child instanceof TextView)) {
                continue;
            }
            if (child.getVisibility() == 0) {
                r(child, n2, n);
                break;
            }
            childCount = n3;
        }
    }
    
    public final asgn pR(int n) {
        if (n == 0) {
            if (this.B.c == 22) {
                return this.y.l((gle)gkt.W(this.q()));
            }
        }
        else if (this.B.c == 22) {
            final akdz q = this.q();
            final InlinePlaybackLifecycleController y = this.y;
            final gli w = gkt.W(q);
            final int n2 = 2;
            if (n == 2) {
                n = n2;
            }
            else {
                n = 0;
            }
            return y.m((gle)w, (gfa)this, n);
        }
        return asgn.f();
    }
    
    public final void pT(final agzc agzc) {
        if (this.D != null) {
            this.y.u();
        }
    }
}
