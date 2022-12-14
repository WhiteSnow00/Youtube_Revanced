// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.trim;

import android.view.animation.AnimationUtils;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.os.Build$VERSION;
import android.graphics.Path$Direction;
import android.view.View$AccessibilityDelegate;
import java.util.concurrent.TimeUnit;
import android.graphics.Canvas;
import java.util.function.Predicate;
import j$.util.Collection$_EL;
import android.graphics.drawable.Drawable$Callback;
import java.util.Iterator;
import android.animation.Animator$AnimatorListener;
import java.util.Collection;
import j$.time.Duration;
import android.util.Range;
import j$.time.Instant;
import android.view.ViewParent;
import java.util.Set;
import java.util.function.Consumer;
import android.animation.AnimatorSet$Builder;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.widget.ImageView$ScaleType;
import android.support.v7.widget.AppCompatImageView;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.ChronoUnit;
import java.util.function.Function;
import android.view.MotionEvent;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.content.res.Resources;
import java.util.ArrayList;
import android.graphics.Paint$Style;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import android.graphics.Paint;
import android.os.Vibrator;
import java.util.List;
import android.view.View;
import android.widget.ImageView;
import android.animation.Animator;
import android.graphics.Path;
import android.graphics.Rect;
import j$.util.Optional;
import android.view.ViewGroup;

public class ShortsVideoTrimView2 extends ViewGroup implements ufr
{
    public Optional A;
    public Optional B;
    public ufm C;
    public boolean D;
    public float E;
    public long F;
    public final Optional G;
    public ufq H;
    public aefs I;
    private boolean J;
    private final Rect K;
    private final Rect L;
    private final Path M;
    private qzj N;
    private final int O;
    private final int P;
    private final int Q;
    private final int R;
    private final int S;
    private final int T;
    private final int U;
    private final int V;
    private final boolean W;
    public ufp a;
    private float aA;
    private long aB;
    private long aC;
    private long aD;
    private long aE;
    private int aF;
    private long aG;
    private int aH;
    private final float aI;
    private Animator aJ;
    private Animator aK;
    private final int aL;
    private final boolean aa;
    private final boolean ab;
    private final boolean ac;
    private final boolean ad;
    private final boolean ae;
    private uet af;
    private final ufk ag;
    private final ufg ah;
    private final ufh ai;
    private final ImageView aj;
    private final ImageView ak;
    private final View al;
    private final rgw am;
    private final List an;
    private final List ao;
    private boolean ap;
    private qzj aq;
    private final Vibrator ar;
    private int as;
    private long at;
    private float au;
    private float av;
    private float aw;
    private float ax;
    private float ay;
    private float az;
    public ufi b;
    public final float c;
    public int d;
    final int e;
    public final int f;
    public final int g;
    public final qmd h;
    final Paint i;
    public final boolean j;
    public float k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public long p;
    public long q;
    public float r;
    public long s;
    public ufj t;
    public final Rect u;
    public qzq v;
    public EditableVideo w;
    VideoMetaData x;
    public Optional y;
    public Optional z;
    
    public ShortsVideoTrimView2(final Context context, final AttributeSet set) {
        super(context, set);
        this.K = new Rect();
        this.L = new Rect();
        this.M = new Path();
        this.h = new qmd();
        final boolean b = false;
        this.ag = new ufk(this, 0);
        this.ah = new ufg(this);
        this.ai = new ufh();
        this.t = ufj.a;
        this.u = new Rect();
        this.y = Optional.empty();
        this.z = Optional.empty();
        this.A = Optional.empty();
        this.B = Optional.empty();
        this.aG = -1L;
        this.F = -1L;
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
        this.V = ViewConfiguration.getLongPressTimeout();
        final Resources resources = context.getResources();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, uev.b);
        final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, uev.a);
        final float fraction = obtainStyledAttributes.getFraction(7, 1, 100, 1.0f);
        this.c = fraction;
        this.d = (int)(resources.getDimension(2131170348) * fraction);
        final int p2 = (int)obtainStyledAttributes2.getDimension(1, resources.getDimension(2131170340) * fraction);
        this.P = p2;
        this.ap = obtainStyledAttributes.getBoolean(6, true);
        final int integer = obtainStyledAttributes.getInteger(8, 1);
        boolean b2 = false;
        Label_0292: {
            if (integer >= 0) {
                tqf.bz();
                if (integer < 2) {
                    b2 = true;
                    break Label_0292;
                }
            }
            b2 = false;
        }
        adme.K(b2);
        this.aL = tqf.bz()[integer];
        final int resourceId = obtainStyledAttributes.getResourceId(4, 2131233396);
        final int resourceId2 = obtainStyledAttributes.getResourceId(4, 2131233397);
        final int resourceId3 = obtainStyledAttributes.getResourceId(2, 2131102316);
        final Drawable a = agy.a(context, resourceId);
        int intrinsicWidth;
        if (a == null) {
            intrinsicWidth = 0;
        }
        else {
            intrinsicWidth = a.getIntrinsicWidth();
        }
        this.e = obtainStyledAttributes2.getDimensionPixelSize(3, intrinsicWidth) / 2;
        final boolean boolean1 = obtainStyledAttributes.getBoolean(5, false);
        this.ab = obtainStyledAttributes.getBoolean(0, false);
        this.ac = obtainStyledAttributes.getBoolean(1, false);
        this.ad = obtainStyledAttributes.getBoolean(9, true);
        final boolean boolean2 = obtainStyledAttributes.getBoolean(3, false);
        this.ae = boolean2;
        obtainStyledAttributes.recycle();
        this.j = obtainStyledAttributes2.getBoolean(0, false);
        this.Q = resources.getDimensionPixelSize(2131170344);
        this.O = obtainStyledAttributes2.getDimensionPixelSize(2, resources.getDimensionPixelSize(2131170343));
        this.R = resources.getDimensionPixelSize(2131170347);
        this.f = resources.getInteger(2131493130);
        this.S = resources.getInteger(2131493127);
        final int integer2 = resources.getInteger(2131493126);
        this.T = integer2;
        this.U = resources.getInteger(2131493128);
        this.aH = integer2;
        this.aI = (float)resources.getDimensionPixelSize(2131170331);
        obtainStyledAttributes2.recycle();
        final Paint i = new Paint();
        (this.i = i).setColor(resources.getColor(resourceId3));
        i.setStrokeWidth((float)p2);
        i.setStyle(Paint$Style.STROKE);
        this.aj = this.ag(context, resourceId);
        this.ak = this.ag(context, resourceId2);
        this.an = new ArrayList();
        this.ao = new ArrayList();
        this.al = new View(context);
        this.am = new rgw(context);
        final boolean w = context.checkCallingOrSelfPermission("android.permission.VIBRATE") == 0;
        this.W = w;
        boolean aa = b;
        if (boolean1) {
            aa = b;
            if (w) {
                aa = true;
            }
        }
        this.aa = aa;
        this.ar = (Vibrator)context.getSystemService("vibrator");
        Optional g;
        if (boolean2) {
            g = Optional.of((Object)new ueu());
        }
        else {
            g = Optional.empty();
        }
        this.G = g;
    }
    
    public static final int Y(long af, final VideoMetaData videoMetaData) {
        final long h = videoMetaData.h;
        if (af == h) {
            af = h - 1L;
        }
        else {
            af = af(af);
        }
        int i;
        final int n = i = videoMetaData.i(af);
        if (n != videoMetaData.h() - 1) {
            i = n;
            if (videoMetaData.l(n) != af) {
                i = n + 1;
            }
        }
        return i;
    }
    
    private final float Z() {
        return this.aj.getX() + this.e;
    }
    
    private final float aa() {
        return this.ak.getX() + this.e;
    }
    
    private final float ab(final float n) {
        return (n - this.u.left) / this.u.width();
    }
    
    private static float ac(final MotionEvent motionEvent, int pointerIndex) {
        pointerIndex = motionEvent.findPointerIndex(pointerIndex);
        if (pointerIndex == -1) {
            return Float.NaN;
        }
        return motionEvent.getX(pointerIndex);
    }
    
    private final float ad(final long n) {
        final qzq v = this.v;
        float b;
        if (v == null) {
            b = 0.0f;
        }
        else {
            b = v.b(n);
        }
        return b * this.u.width() + this.u.left;
    }
    
    private final long ae(final long n) {
        final ufm a = ufm.a;
        final int al = this.aL;
        if (al == 0) {
            throw null;
        }
        if (al - 1 != 1) {
            return n;
        }
        final long e = e(n, 0L, this.g());
        return (long)this.z.map((Function)new xsy(n, 1)).map((Function)new ufa(n, e)).orElse((Object)e);
    }
    
    private static long af(final long n) {
        return afuf.a(afuf.c(n).truncatedTo((TemporalUnit)ChronoUnit.MILLIS));
    }
    
    private final ImageView ag(final Context context, final int n) {
        final rgv imageDrawable = new rgv(context, n, (float)this.P);
        final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageDrawable((Drawable)imageDrawable);
        appCompatImageView.setScaleType(ImageView$ScaleType.FIT_XY);
        return appCompatImageView;
    }
    
    private final ufj ah(int max) {
        final boolean b = false;
        adme.K(max >= 0);
        if (max == 0) {
            return ufj.a;
        }
        final VideoMetaData x = this.x;
        float a;
        if (x != null) {
            a = x.a();
        }
        else {
            a = 1.7777778f;
        }
        final EditableVideo w = this.w;
        float n = a;
        Label_0135: {
            if (w != null) {
                final int n2 = (w.f() % 360 + 360) % 360;
                boolean b2 = b;
                if (n2 % 90 == 0) {
                    b2 = b;
                    if (n2 >= 0) {
                        b2 = true;
                    }
                }
                adme.K(b2);
                if (n2 != 90) {
                    n = a;
                    if (n2 != 270) {
                        break Label_0135;
                    }
                }
                n = 1.0f / a;
            }
        }
        final float n3 = (float)this.d;
        final float n4 = (float)max;
        max = Math.max(1, (int)Math.floor(n4 / (n3 * n)));
        final float n5 = n4 / max;
        return new ufj(n5, n5 / n, max);
    }
    
    private final void ai(final ImageView imageView, final RectF rectF) {
        final float n = (float)this.Q;
        final float n2 = imageView.getX() + this.e;
        final float n3 = n / 2.0f;
        final float n4 = n2 - n3;
        float n5 = 0.0f;
        final float n6 = n2 + n3;
        if (n4 < 0.0f) {
            n5 = -n4;
        }
        else if (n6 > this.getWidth()) {
            n5 = this.getWidth() - n6;
        }
        rectF.left = n4 + n5;
        rectF.top = (float)imageView.getTop();
        rectF.right = n6 + n5;
        rectF.bottom = (float)imageView.getBottom();
    }
    
    private final void aj(final boolean b, final boolean b2) {
        final AnimatorSet set = new AnimatorSet();
        ImageView imageView;
        if (b2) {
            final Animator aj = this.aJ;
            if (aj != null) {
                aj.cancel();
            }
            this.aJ = (Animator)set;
            imageView = this.aj;
        }
        else {
            final Animator ak = this.aK;
            if (ak != null) {
                ak.cancel();
            }
            this.aK = (Animator)set;
            imageView = this.ak;
        }
        final float n = 2.0f;
        float n2;
        if (!b) {
            n2 = 1.0f;
        }
        else {
            n2 = 2.0f;
        }
        final float scaleX = ((View)imageView).getScaleX();
        final float n3 = n2 * this.c;
        final long duration = this.getContext().getResources().getInteger(17694720);
        final AnimatorSet$Builder with = set.play((Animator)ObjectAnimator.ofFloat((Object)imageView, View.SCALE_X, new float[] { scaleX, n3 })).with((Animator)ObjectAnimator.ofFloat((Object)imageView, View.SCALE_Y, new float[] { scaleX, n3 }));
        float n4 = n;
        if (!b) {
            n4 = 0.0f;
        }
        with.with((Animator)ObjectAnimator.ofFloat((Object)imageView, View.TRANSLATION_Z, new float[] { ((View)imageView).getTranslationZ(), n4 * this.c }));
        set.setDuration(duration);
        set.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
        set.start();
    }
    
    private final void ak(final EditableVideo w, final VideoMetaData x) {
        this.al();
        final EditableVideo w2 = this.w;
        if (w2 != null) {
            w2.v((rad)this);
            this.y.ifPresent((Consumer)llt.l);
            this.y = Optional.empty();
            this.A.ifPresent((Consumer)new txl(this, 14));
            this.A = Optional.empty();
            this.z.ifPresent((Consumer)new txl(this, 15));
            this.z = Optional.empty();
            this.B.ifPresent((Consumer)new txl(this, 16));
            this.B = Optional.empty();
        }
        this.w = w;
        this.x = x;
        if (w != null) {
            w.q((rad)this);
        }
    }
    
    private final void al() {
        if (this.ac && this.S()) {
            this.aj(false, this.C == ufm.a);
        }
        if (this.D) {
            adme.T(true);
            final EditableVideo w = this.w;
            if (w != null) {
                final ufm c = this.C;
                if (c != null) {
                    w.t((Set)c.e);
                }
            }
            this.D = false;
            final qzj aq = this.aq;
            if (aq != null) {
                aq.a();
            }
            if (this.W()) {
                adme.T(this.W());
                this.k = 0.0f;
                final long p = this.p;
                long q = this.q;
                long p2 = p;
                if (p > this.p()) {
                    p2 = this.p();
                    q = this.i() + p2;
                }
                long n = p2;
                long o = q;
                if (q < this.o()) {
                    o = this.o();
                    n = o - this.i();
                }
                final qzq v = this.v;
                if (v != null) {
                    v.k(n, o);
                }
                this.A();
                this.N();
                this.y.ifPresent((Consumer)llt.k);
            }
            this.ag.a(0.0f);
            final ViewParent parent = this.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            if (this.C == ufm.a) {
                this.y();
            }
            else {
                final ufm c2 = this.C;
                if (c2 == ufm.b) {
                    this.y();
                }
                else if (c2 == ufm.c) {
                    final long k = this.k();
                    this.z(k);
                    final ufq h = this.H;
                    if (h != null) {
                        h.a(false, afuf.c(k).toMillis());
                    }
                    this.O();
                }
            }
            this.C = null;
        }
    }
    
    private final void am(final float n) {
        adme.T(this.C != null);
        final float ay = this.ay;
        final float n2 = (float)this.u.width();
        final qzq v = this.v;
        long d;
        if (v == null) {
            d = 0L;
        }
        else {
            d = v.d((n - ay) / n2);
        }
        final boolean b = this.ag.b();
        final float n3 = 0.0f;
        if (!b && this.C != null) {
            final ufm a = ufm.a;
            final int ordinal = this.C.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            this.f(d, true);
                        }
                    }
                    else {
                        this.G.ifPresent((Consumer)new uex(this, n, 0));
                    }
                }
                else {
                    this.G(this.aC + d);
                }
            }
            else {
                this.E(this.aB + d);
            }
            if (this.ad) {
                this.Q();
            }
            else {
                final float n4 = (float)this.u.left;
                final int left = this.u.left;
                final int width = this.u.width();
                final long j = this.j();
                final long n5 = this.u.width();
                long n6;
                if (this.W()) {
                    n6 = this.s;
                }
                else {
                    n6 = this.g();
                }
                final float n7 = (float)(j * n5);
                final long i = this.i();
                final long n8 = this.u.width();
                long n9;
                if (this.W()) {
                    n9 = this.s;
                }
                else {
                    n9 = this.g();
                }
                final float n10 = (float)(i * n8);
                final float z = this.Z();
                final float aa = this.aa();
                final ufm c = this.C;
                float max = z;
                float min = aa;
                if (c != null) {
                    final float n11 = (float)n9;
                    final float n12 = (float)n6;
                    final float n13 = n10 / n11;
                    final float n14 = n7 / n12;
                    final float n15 = (float)(left + width);
                    final int ordinal2 = c.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 3) {
                                max = z;
                                min = aa;
                            }
                            else {
                                final float n16 = n - this.ay;
                                final float az = this.az;
                                float n17;
                                if (az + n16 < n4) {
                                    n17 = n4 - az;
                                }
                                else {
                                    final float aa2 = this.aA;
                                    n17 = n16;
                                    if (aa2 + n16 > n15) {
                                        n17 = n15 - aa2;
                                    }
                                }
                                final float n18 = az + n17;
                                final float n19 = this.aA + n17;
                                max = n18;
                                min = n19;
                            }
                        }
                        else {
                            float min2;
                            if (n13 > 0.0f) {
                                min2 = Math.min(n, n13 + z);
                            }
                            else {
                                min2 = n;
                            }
                            min = Math.min(n15, Math.max(min2, n14 + z));
                            max = z;
                        }
                    }
                    else {
                        float max2;
                        if (n13 > 0.0f) {
                            max2 = Math.max(n, aa - n13);
                        }
                        else {
                            max2 = n;
                        }
                        max = Math.max(n4, Math.min(max2, aa - n14));
                        min = aa;
                    }
                }
                this.an(max, min);
            }
            this.invalidate();
        }
        float n20 = n3;
        if (this.S()) {
            n20 = n3;
            if (this.W()) {
                n20 = n3;
                if (this.o() - this.p() < this.i()) {
                    final int left2 = this.u.left;
                    final int e = this.e;
                    final int right = this.u.right;
                    final int e2 = this.e;
                    if (Math.max(0.0f, n - (left2 - e)) < this.R) {
                        n20 = -1.0f;
                    }
                    else {
                        n20 = 0.0f;
                    }
                    if (Math.max(0.0f, right + e2 - n) < this.R) {
                        n20 = 1.0f;
                    }
                }
            }
        }
        this.ag.a(n20);
    }
    
    private final void an(float n, float n2) {
        this.aj.setX(n - this.e + this.aw);
        this.ak.setX(n2 - this.e + this.ax);
        this.ap();
        final rgw am = this.am;
        am.b = n + this.aw;
        am.c = n2 + this.ax;
        if (this.N != null) {
            n = (float)Math.round(afuf.c(this.n(this.aa()) - this.n(this.Z())).toMillis() / 100.0f);
            final String string = this.getContext().getResources().getString(2132019664);
            final StringBuilder sb = new StringBuilder();
            sb.append(n / 10.0f);
            sb.append(string);
            final String string2 = sb.toString();
            n2 = (this.aa() - this.Z()) / 2.0f;
            final float z = this.Z();
            final float y = this.aj.getY();
            n = this.aj.getHeight() / 2.0f;
            final qzj n3 = this.N;
            if (n3 != null && n3.b != null) {
                final qzh c = n3.c;
                if (c != null) {
                    final int n4 = (int)(y + n);
                    final int n5 = (int)(n2 + z);
                    c.e(string2);
                    final int[] c2 = n3.c(n5, n4, (View)this);
                    final qzh c3 = n3.c;
                    c3.d(c2[0], c2[1] + c3.getIntrinsicHeight() / 2, n3.a.getWidth());
                }
            }
        }
    }
    
    private final void ao(final long n) {
        if (n < 0L) {
            this.aF = -1;
            this.aG = -1L;
            return;
        }
        if (this.aa) {
            final VideoMetaData x = this.x;
            if (x != null) {
                final int g = x.g(n);
                if (g != this.aF) {
                    if (this.W() && !this.R()) {
                        final afuh a = afuh.a;
                        this.aG = Instant.now().toEpochMilli();
                        final int u = this.U;
                        this.aH = u;
                        this.postDelayed((Runnable)new tpk(this, 15), (long)u);
                    }
                    this.aF = g;
                }
            }
        }
    }
    
    private final void ap() {
        if (!this.G.isPresent()) {
            return;
        }
        int right;
        int left;
        if (this.o) {
            final float x = this.aj.getX();
            final int e = this.e;
            final float n = (float)(e + e);
            final float n2 = (float)this.O;
            right = (int)(this.ak.getX() + this.O);
            left = (int)(x + n - n2);
        }
        else {
            left = this.u.left;
            right = this.u.right;
        }
        int top;
        int n3;
        if (this.j) {
            top = this.u.top;
            n3 = this.u.bottom;
        }
        else {
            n3 = this.getHeight();
            top = 0;
        }
        final Rect rect = new Rect(left, top, right, n3);
        Range range;
        if (this.o) {
            range = Range.create((Comparable)afuf.c(this.p()), (Comparable)afuf.c(this.o()));
        }
        else if (this.v != null) {
            range = Range.create((Comparable)Duration.ZERO, (Comparable)afuf.c(this.v.b));
        }
        else {
            range = Range.create((Comparable)Duration.ZERO, (Comparable)Duration.ZERO);
        }
        ((ueu)this.G.get()).d(rect, range);
    }
    
    private final void aq() {
        this.au = this.Z();
        this.av = this.aa();
    }
    
    public static long e(final long n, final long n2, final long n3) {
        if (Math.abs(n2 - n) < Math.abs(n3 - n)) {
            return n2;
        }
        return n3;
    }
    
    public static qzq r(final EditableVideo editableVideo, long n) {
        final long h = editableVideo.b.h;
        final long h2 = editableVideo.h();
        long min;
        if (h2 == 0L) {
            min = h;
        }
        else {
            min = Math.min(h, h2);
        }
        final long n2 = editableVideo.n();
        final long l = editableVideo.l();
        long n3 = n;
        if (n == -1L) {
            n3 = n2;
        }
        if (n2 >= n3 && l <= n3 + min) {
            n = n3;
        }
        else {
            n = n2;
        }
        final qzq qzq = new qzq(min, h);
        qzq.i(n, n + min, false, false);
        return qzq;
    }
    
    public final void A() {
        final ArrayList list = new ArrayList(this.ao);
        this.ao.clear();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final rga rga = (rga)list.get(i);
            final ObjectAnimator ofInt = ObjectAnimator.ofInt((Object)rga, "alpha", new int[] { 0 });
            ofInt.addListener((Animator$AnimatorListener)new uff(this, rga));
            ofInt.start();
        }
        final qzq v = this.v;
        if (v != null) {
            v.g = true;
        }
        this.P(this.t);
        for (final rga rga2 : this.ao) {
            rga2.c(true);
            ObjectAnimator.ofInt((Object)rga2, "alpha", new int[] { 0, 255 }).start();
        }
        final qzq v2 = this.v;
        if (v2 != null) {
            v2.g = false;
        }
    }
    
    public final void B() {
        this.s();
        final qzq v = this.v;
        if (v != null) {
            v.h((qzn)this);
        }
    }
    
    public final void C(final long n) {
        if (this.w != null) {
            this.E(n);
        }
    }
    
    public final void D(final long n) {
        if (this.w != null) {
            this.G(n);
        }
    }
    
    public final void E(long ae) {
        long max = ae;
        if (!this.W()) {
            final qzq v = this.v;
            long e;
            if (v == null) {
                e = 0L;
            }
            else {
                e = v.e(0.0f);
            }
            max = Math.max(e, ae);
        }
        ae = this.ae(max);
        final EditableVideo w = this.w;
        if (w != null) {
            w.E(ae);
        }
        this.H(ae);
    }
    
    public final void F(final qzj aq) {
        this.aq = aq;
        if (aq != null) {
            aq.d = this.c;
        }
    }
    
    public final void G(long ae) {
        long min = ae;
        if (!this.W()) {
            final qzq v = this.v;
            long e;
            if (v == null) {
                e = 0L;
            }
            else {
                e = v.e(1.0f);
            }
            min = Math.min(e, ae);
        }
        ae = this.ae(min);
        final EditableVideo w = this.w;
        if (w != null) {
            w.D(ae);
        }
        this.H(ae);
    }
    
    public final void H(final long n) {
        this.G.ifPresent((Consumer)new uey(n, 0));
    }
    
    public final void I(final long n) {
        this.H(n);
        this.z(n);
    }
    
    public final void J(final qzq v) {
        final qzq v2 = this.v;
        if (v2 != null) {
            v2.h((qzn)this);
        }
        this.v = v;
        this.ap();
        v.f((qzn)this);
        this.F = v.e(0.0f);
    }
    
    public final void K(final EditableVideo editableVideo, final uel uel) {
        this.L(editableVideo, uel, r(editableVideo, this.F), true);
    }
    
    public final void L(final EditableVideo editableVideo, final uel uel, final qzq qzq, final boolean o) {
        final VideoMetaData b = editableVideo.b;
        adme.K(b.equals((Object)uel.a()));
        if (!(this.o = o)) {
            final qzj n = this.N;
            if (n != null) {
                n.a();
            }
        }
        this.G.ifPresent((Consumer)new iyp(o, 5));
        final boolean n2 = o && editableVideo.M();
        this.n = n2;
        if (n2) {
            this.aj.setVisibility(0);
            this.ak.setVisibility(0);
        }
        else {
            this.aj.setVisibility(8);
            this.ak.setVisibility(8);
        }
        if (editableVideo.equals(this.w) && uel == this.y.orElse((Object)null)) {
            return;
        }
        this.ak(editableVideo, b);
        this.J(qzq);
        this.z = Optional.of((Object)uel.b());
        this.B = Optional.of((Object)uel.d());
        this.post((Runnable)new swa(this, uel, 18));
        final ufi b2 = this.b;
        if (b2 != null) {
            b2.a();
        }
    }
    
    public final void M() {
        final EditableVideo w = this.w;
        if (w != null) {
            this.am.a = w;
        }
        this.P(this.ah(this.u.width()));
        this.requestLayout();
    }
    
    public final void N() {
        this.ay = this.E;
        this.aB = this.p();
        this.aC = this.o();
        this.az = this.Z();
        this.aA = this.aa();
        final qzq v = this.v;
        final long n = 0L;
        long e;
        if (v == null) {
            e = 0L;
        }
        else {
            e = v.e(0.0f);
        }
        this.aD = e;
        final qzq v2 = this.v;
        long e2;
        if (v2 == null) {
            e2 = n;
        }
        else {
            e2 = v2.e(1.0f);
        }
        this.aE = e2;
    }
    
    public final void O() {
        if (!this.j) {
            return;
        }
        final long af = af(this.k());
        final VideoMetaData x = this.x;
        if (x == null) {
            return;
        }
        this.A.ifPresent((Consumer)new uez(this, af));
        this.y.ifPresent((Consumer)new rsr(this, af, x, 2));
    }
    
    public final void P(ufj t) {
        t.getClass();
        this.t = t;
        if (this.j) {
            this.G.ifPresent((Consumer)new txl(this, 7));
        }
        t = this.t;
        final float b = t.b;
        final int d = t.d;
        final float n = this.k % b;
        final double ceil = Math.ceil((this.getWidth() - this.getPaddingLeft() - this.getPaddingRight()) / b);
        final int n2 = (int)Math.ceil((this.u.left + n) / b);
        final int n3 = d + ((int)(ceil + 1.0) - n2);
        Optional optional2;
        final Optional optional = optional2 = this.z;
        if (!this.W()) {
            optional2 = optional;
            if (this.A.isPresent()) {
                optional2 = optional;
                if (((rgi)this.A.get()).m()) {
                    optional2 = this.A;
                }
            }
        }
        int i;
        int n4;
        for (n4 = (i = -n2); i < n3; ++i) {
            final int n5 = i - n4;
            rga rga;
            if (this.ao.size() > n5) {
                rga = this.ao.get(n5);
            }
            else {
                rga = new rga();
                this.ao.add(n5, rga);
                rga.setCallback((Drawable$Callback)this);
                this.an.add(rga);
            }
            final float n6 = this.u.left + i * b + n;
            final float n7 = this.t.b + n6;
            final float n8 = (float)this.getPaddingTop();
            final float c = this.t.c;
            final float n9 = (float)this.d;
            float n10 = n8;
            if (c > n9) {
                n10 = n8 - (c - n9) / 2.0f;
            }
            rga.setBounds((int)n6, (int)n10, (int)n7, (int)(c + n10));
            final long n11 = this.n(n6 + (n7 - n6) / 2.0f);
            rga.b = n11;
            if (optional2.isPresent()) {
                final rfw g = ((rgi)optional2.get()).g(n11, true);
                final rfw a = rga.a;
                Label_0632: {
                    if (a != null && g != null) {
                        final long a2 = a.a();
                        final long a3 = g.a();
                        if (a3 > a2) {
                            if (Math.abs(n11 - a3) >= Math.abs(n11 - a2)) {
                                break Label_0632;
                            }
                        }
                        else if (a3 == a2) {
                            break Label_0632;
                        }
                    }
                    rga.b(g);
                }
                if (g != null) {
                    g.d();
                }
            }
        }
        while (this.ao.size() > n3 - n4) {
            final List ao = this.ao;
            this.u((rga)ao.remove(ao.size() - 1));
        }
        if (this.ap && !this.ao.isEmpty() && this.l) {
            this.ap = false;
            for (int j = 0; j < this.ao.size(); ++j) {
                final rga rga2 = this.ao.get(j);
                rga2.c(false);
                rga2.d(j * 50);
            }
        }
    }
    
    public final void Q() {
        this.an(this.ad(this.p()), this.ad(this.o()));
    }
    
    public final boolean R() {
        final afuh a = afuh.a;
        final long epochMilli = Instant.now().toEpochMilli();
        if (epochMilli - this.aG >= this.aH) {
            this.w(this.S);
            this.aH = this.T;
            this.aG = epochMilli;
            return true;
        }
        return false;
    }
    
    public final boolean S() {
        return this.C == ufm.a || this.C == ufm.b;
    }
    
    public final boolean T() {
        final qzq v = this.v;
        return v != null && v.e(1.0f) > this.g();
    }
    
    public final boolean U() {
        final qzq v = this.v;
        return v != null && v.e(0.0f) < 0L;
    }
    
    public final boolean V() {
        return !this.l || !Collection$_EL.stream((Collection)this.ao).allMatch((Predicate)lbg.u);
    }
    
    public final boolean W() {
        final qzq v = this.v;
        return v != null && v.c;
    }
    
    public final void X(final long n) {
        this.N();
        this.aq();
        this.f(n, false);
    }
    
    public final void a(final EditableVideo editableVideo, final Set set) {
        this.ao(-1L);
    }
    
    public final void b(final EditableVideo editableVideo, final int n) {
        if (n == 0) {
            if (!this.D) {
                this.Q();
                this.invalidate();
            }
            this.ao(this.p());
            return;
        }
        if (n == 1) {
            if (!this.D) {
                this.Q();
                this.invalidate();
            }
            this.ao(this.o());
            return;
        }
        if (n != 2) {
            return;
        }
        this.P(this.ah(this.u.width()));
    }
    
    public final void c(final EditableVideo editableVideo, final Set set) {
        this.ao(-1L);
    }
    
    public final void d(final rfw rfw) {
        final VideoMetaData x = this.x;
        if (rfw.f() == 2 && this.j && x != null && Y(this.k(), x) == rfw.a) {
            this.G.ifPresent((Consumer)new txl(rfw, 9));
        }
    }
    
    public final long f(long e, final boolean b) {
        long g;
        if (b) {
            g = this.g() + 1000000L;
        }
        else {
            g = this.g();
        }
        final long n = 0L;
        long n2;
        if (!b) {
            n2 = 0L;
        }
        else {
            n2 = -1000000L;
        }
        final long ae = this.aE;
        final long ad = this.aD;
        final long n3 = ae - ad;
        final long n4 = ad - e;
        e = ae - e;
        if (n4 < n2) {
            e = n2 + n3;
        }
        else {
            n2 = n4;
        }
        long n5;
        long n6;
        if (e > g) {
            n5 = g - n3;
            n6 = g;
        }
        else {
            n5 = n2;
            n6 = e;
        }
        long n7 = n6;
        e = n5;
        if (this.U()) {
            n7 = n6;
            e = n5;
            if (n5 > 0L) {
                e = 0L;
                n7 = n3;
            }
        }
        long g2 = n7;
        long n8 = e;
        if (this.T()) {
            g2 = n7;
            n8 = e;
            if (n7 < this.g()) {
                n8 = this.g() - n3;
                g2 = this.g();
            }
        }
        final qzq v = this.v;
        float b2;
        if (v == null) {
            b2 = 0.0f;
        }
        else {
            b2 = v.b(n8);
        }
        this.k -= b2 * this.u.width();
        final qzq v2 = this.v;
        if (v2 != null) {
            v2.i(n8, g2, false, false);
        }
        final long g3 = this.g();
        final qzq v3 = this.v;
        long e2;
        if (v3 == null) {
            e2 = 0L;
        }
        else {
            e2 = v3.e(this.ab(this.au));
        }
        final qzq v4 = this.v;
        if (v4 == null) {
            e = 0L;
        }
        else {
            e = v4.e(this.ab(this.av));
        }
        this.aw = 0.0f;
        if (e2 < 0L) {
            this.aw = this.ad(e2) - this.ad(0L);
            e2 = n;
        }
        this.ax = 0.0f;
        if (e > g3) {
            this.ax = this.ad(e) - this.ad(g3);
            e = g3;
        }
        final EditableVideo w = this.w;
        if (w != null) {
            w.F(e2, e);
        }
        this.H(e2);
        this.P(this.t);
        return this.aD - n8;
    }
    
    public final long g() {
        final VideoMetaData x = this.x;
        if (x == null) {
            return 1L;
        }
        return x.h;
    }
    
    public final int getPaddingLeft() {
        if (!this.ab) {
            return super.getPaddingLeft();
        }
        return Math.max(super.getPaddingLeft() - this.e + this.P / 2, 0);
    }
    
    public final int getPaddingRight() {
        if (!this.ab) {
            return super.getPaddingRight();
        }
        return Math.max(super.getPaddingRight() - this.e + this.P / 2, 0);
    }
    
    public final long h() {
        final EditableVideo w = this.w;
        if (w == null) {
            return 0L;
        }
        return w.a.d;
    }
    
    public final long i() {
        final EditableVideo w = this.w;
        if (w == null) {
            return 1L;
        }
        return w.h();
    }
    
    public final long j() {
        final EditableVideo w = this.w;
        if (w == null) {
            return 1L;
        }
        return w.i();
    }
    
    public final long k() {
        return afuf.a((Duration)this.G.map((Function)tip.i).orElse((Object)Duration.ZERO));
    }
    
    public final void l(final qzq qzq) {
        for (final rga rga : this.an) {
            final float ad = this.ad(rga.b);
            final Rect bounds = rga.getBounds();
            final float n = bounds.centerX() - ad;
            if (n != 0.0f) {
                final float n2 = (float)bounds.left;
                final int top = bounds.top;
                final int width = bounds.width();
                final int n3 = (int)(n2 - n);
                rga.setBounds(n3, top, width + n3, bounds.bottom);
            }
        }
        this.Q();
        this.invalidate();
        final ufp a = this.a;
        if (a != null) {
            a.nt(qzq.e(0.0f));
        }
    }
    
    public final void m() {
        this.P(this.t);
        this.Q();
        this.requestLayout();
    }
    
    public final long n(final float n) {
        final qzq v = this.v;
        if (v == null) {
            return 0L;
        }
        return v.e(this.ab(n));
    }
    
    public final long o() {
        final EditableVideo w = this.w;
        long n;
        if (w == null) {
            n = this.g();
        }
        else {
            n = w.l();
        }
        return n;
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.clipRect(this.K);
        canvas.save();
        if (this.o) {
            canvas.clipRect(this.ad(0L), (float)this.K.top, this.ad(this.g()), (float)this.K.bottom);
        }
        else {
            canvas.clipPath(this.M);
        }
        canvas.drawColor(this.getResources().getColor(2131102282));
        if (this.l) {
            for (final rga rga : this.an) {
                final EditableVideo w = this.w;
                int f;
                if (w == null) {
                    f = 0;
                }
                else {
                    f = w.f();
                }
                rga.a(canvas, f);
            }
        }
        if (this.j) {
            canvas.drawColor(this.getResources().getColor(2131102284));
        }
        canvas.restore();
        if (this.n) {
            this.am.draw(canvas);
            final float n = this.i.getStrokeWidth() / 2.0f;
            canvas.drawRect(this.Z(), this.u.top + n, this.aa(), this.u.bottom - n, this.i);
        }
        canvas.restore();
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.af = new uet(this);
        final Resources resources = this.getContext().getResources();
        this.m = true;
        this.s = TimeUnit.MILLISECONDS.toMicros(resources.getInteger(2131493131));
        this.r = (float)resources.getInteger(2131493129);
        this.aj.setContentDescription((CharSequence)resources.getString(2132017554));
        this.aj.setFocusable(true);
        this.addView((View)this.aj);
        this.ak.setContentDescription((CharSequence)resources.getString(2132017983));
        this.ak.setFocusable(true);
        this.addView((View)this.ak);
        this.al.setContentDescription((CharSequence)resources.getString(2132018048));
        this.al.setFocusable(true);
        this.addView(this.al);
        this.setWillNotDraw(false);
        if (this.ab) {
            this.setClipToPadding(false);
        }
        this.aj.setAccessibilityDelegate((View$AccessibilityDelegate)new ufb(this));
        this.ak.setAccessibilityDelegate((View$AccessibilityDelegate)new ufc(this));
        this.G.ifPresent((Consumer)new txl(this, 10));
        final View q = this.q();
        if (q != null) {
            q.setAccessibilityDelegate((View$AccessibilityDelegate)new ufd(this));
        }
        this.al.setAccessibilityDelegate((View$AccessibilityDelegate)new ufe(this));
        final qzj n = new qzj(this.getContext(), (View)this);
        this.N = n;
        n.e = resources.getColor(2131102417);
        final qzj n2 = this.N;
        final float g = (float)resources.getDimensionPixelSize(2131169771);
        final int color = resources.getColor(2131101998);
        n2.g = g;
        n2.f = color;
        this.N.h = resources.getDimension(2131169772);
        final qzj n3 = this.N;
        if (n3 == null) {
            return;
        }
        n3.b();
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (!this.isEnabled()) {
            return false;
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    final uet af = this.af;
                    if (af != null) {
                        af.a();
                    }
                    this.al();
                }
            }
            else if (motionEvent.getActionIndex() == motionEvent.findPointerIndex(this.as)) {
                final uet af2 = this.af;
                if (af2 != null) {
                    af2.a();
                }
                this.al();
            }
        }
        else if (motionEvent.getPointerCount() == 1) {
            this.ah.a();
            final int pointerId = motionEvent.getPointerId(0);
            this.as = pointerId;
            this.E = ac(motionEvent, pointerId);
            this.at = motionEvent.getEventTime();
            this.aq();
            if (!this.n && this.ae) {
                this.C = ufm.c;
            }
            else {
                final float e = this.E;
                final RectF rectF = new RectF();
                this.ai(this.aj, rectF);
                final float left = rectF.left;
                final float right = rectF.right;
                this.ai(this.ak, rectF);
                final float left2 = rectF.left;
                float right2 = rectF.right;
                float n = left;
                float n2 = right;
                float n3 = left2;
                if (right > left2) {
                    final float n4 = (right - left2) / 2.0f;
                    n = left - n4;
                    n2 = right - n4;
                    n3 = left2 + n4;
                    right2 += n4;
                }
                final View q = this.q();
                float x;
                float n5;
                if (q != null) {
                    x = q.getX();
                    n5 = q.getWidth() + x;
                }
                else {
                    x = -1.0f;
                    n5 = -1.0f;
                }
                ufm c;
                if (q != null && e >= x && e <= n5) {
                    c = ufm.c;
                }
                else if (e >= n && e <= n2 && (q == null || e <= x)) {
                    c = ufm.a;
                }
                else if (e >= n3 && e <= right2 && (q == null || e >= n5)) {
                    c = ufm.b;
                }
                else if (this.g() > this.i()) {
                    c = ufm.d;
                }
                else if (e >= this.u.left && e <= this.u.right) {
                    c = ufm.c;
                }
                else {
                    c = null;
                }
                this.C = c;
            }
            if (this.C != null) {
                this.N();
                if (this.S()) {
                    final uet af3 = this.af;
                    if (af3 != null) {
                        af3.b((long)this.V, this.E);
                    }
                    if (this.ac && !this.D) {
                        this.aj(true, this.C == ufm.a);
                    }
                }
                else {
                    this.y();
                }
                if (this.C == ufm.c) {
                    this.v();
                    this.am(this.E);
                    final ufq h = this.H;
                    if (h != null) {
                        h.a(true, afuf.c(this.k()).toMillis());
                    }
                }
            }
        }
        return this.C != null;
    }
    
    protected final void onLayout(final boolean b, int top, int bottom, int n, int n2) {
        this.K.set(this.getPaddingLeft(), this.getPaddingTop(), this.getWidth() - this.getPaddingRight(), this.getHeight() - this.getPaddingBottom());
        final Path m = this.M;
        final float ad = this.ad(0L);
        final float n3 = (float)this.K.top;
        final float ad2 = this.ad(this.g());
        final float n4 = (float)this.K.bottom;
        final float ai = this.aI;
        m.addRoundRect(ad, n3, ad2, n4, ai, ai, Path$Direction.CW);
        this.u.left = Math.min(this.K.left + this.e, this.K.right);
        this.u.top = this.K.top;
        this.u.right = Math.max(this.K.right - this.e, this.K.left);
        this.u.bottom = this.K.bottom;
        if (this.ae) {
            this.ap();
        }
        top = this.K.top;
        bottom = this.K.bottom;
        n2 = this.u.left;
        n = this.e;
        n2 -= n;
        this.aj.layout(n2, top, n + n + n2, bottom);
        n2 = this.u.right;
        n = this.e;
        n2 -= n;
        this.ak.layout(n2, top, n + n + n2, bottom);
        this.Q();
        final ufj ah = this.ah(this.u.width());
        if (!ah.equals(this.t)) {
            this.P(ah);
            this.x();
        }
        this.al.layout(this.K.left, this.K.top, this.K.right, this.K.bottom);
        this.am.setBounds(this.K);
        this.getHitRect(this.L);
        if (Build$VERSION.SDK_INT >= 29) {
            this.setSystemGestureExclusionRects((List)afgh.r(this.L));
        }
        final ufq h = this.H;
        if (h != null) {
            h.b();
        }
    }
    
    protected final void onMeasure(int n, int measureSpec) {
        adme.T(View$MeasureSpec.getMode(n) != 0);
        final int size = View$MeasureSpec.getSize(n);
        final int n2 = this.getPaddingTop() + this.d + this.getPaddingBottom();
        this.setMeasuredDimension(resolveSizeAndState(size, n, 0), resolveSizeAndState(n2, measureSpec, 0));
        n = this.e;
        n = View$MeasureSpec.makeMeasureSpec(n + n, 1073741824);
        measureSpec = View$MeasureSpec.makeMeasureSpec(this.d, 1073741824);
        this.G.ifPresent((Consumer)new izi(n2, 7));
        this.aj.measure(n, measureSpec);
        this.ak.measure(n, measureSpec);
        this.al.measure(n, measureSpec);
    }
    
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2 = parcelable;
        if (parcelable instanceof Bundle) {
            final Bundle bundle = (Bundle)parcelable;
            this.J = bundle.getBoolean("trimHandleInteractionAlreadyLogged");
            final Parcelable parcelable3 = bundle.getParcelable("superViewInstanceState");
            if (parcelable3 != null) {
                parcelable = parcelable3;
            }
            this.F = bundle.getLong("trimLayoutStartTimeKey", 0L);
            final qzq v = this.v;
            parcelable2 = parcelable;
            if (v != null) {
                v.i(bundle.getLong("trimLayoutStartTimeKey", 0L), bundle.getLong("trimLayoutEndTimeKey", this.i()), false, false);
                this.Q();
                parcelable2 = parcelable;
            }
        }
        super.onRestoreInstanceState(parcelable2);
    }
    
    public final Parcelable onSaveInstanceState() {
        final Bundle bundle = new Bundle();
        bundle.putParcelable("superViewInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("trimHandleInteractionAlreadyLogged", this.J);
        final qzq v = this.v;
        if (v != null) {
            bundle.putLong("trimLayoutStartTimeKey", v.e(0.0f));
            final qzq v2 = this.v;
            long e;
            if (v2 == null) {
                e = 0L;
            }
            else {
                e = v2.e(1.0f);
            }
            bundle.putLong("trimLayoutEndTimeKey", e);
        }
        return (Parcelable)bundle;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.C == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.isEnabled()) {
            return false;
        }
        final float ac = ac(motionEvent, this.as);
        final long eventTime = motionEvent.getEventTime();
        final int actionMasked = motionEvent.getActionMasked();
        Label_0484: {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        final uet af = this.af;
                        if (af != null) {
                            af.a();
                        }
                        this.al();
                        break Label_0484;
                    }
                    if (actionMasked != 6) {
                        break Label_0484;
                    }
                }
                else {
                    if (!this.n && !this.ae) {
                        break Label_0484;
                    }
                    if (!this.D && Math.abs(this.ay - ac) > this.g) {
                        this.v();
                    }
                    if (!this.D) {
                        break Label_0484;
                    }
                    final uet af2 = this.af;
                    if (af2 != null) {
                        af2.b((long)this.V, ac);
                    }
                    this.am(ac);
                    final long n = eventTime - this.at;
                    if (n > 0L) {
                        final float e = this.E;
                        final ufh ai = this.ai;
                        final Object c = ai.c;
                        final int b = ai.b;
                        ((float[])c)[b] = (ac - e) / n;
                        ai.b = (b + 1 & 0x1);
                        ai.a = Math.min(ai.a + 1, 2);
                    }
                    break Label_0484;
                }
            }
            if (motionEvent.getActionIndex() == motionEvent.findPointerIndex(this.as)) {
                final uet af3 = this.af;
                if (af3 != null) {
                    af3.a();
                }
                if (this.C == ufm.d && this.ai.a()) {
                    final qzq v = this.v;
                    long d;
                    if (v == null) {
                        d = 0L;
                    }
                    else {
                        final ufh ai2 = this.ai;
                        adme.T(ai2.a());
                        float n2 = 0.0f;
                        int n3 = 0;
                        int a;
                        while (true) {
                            a = ai2.a;
                            if (n3 >= a) {
                                break;
                            }
                            n2 += ((float[])ai2.c)[n3];
                            ++n3;
                        }
                        d = v.d(n2 / a / this.u.width());
                    }
                    final ufg ah = this.ah;
                    if (ah.e == 1) {
                        if (!ah.d.U() && !ah.d.T()) {
                            ah.e = 2;
                        }
                        else {
                            ah.e = 3;
                        }
                        ah.b = AnimationUtils.currentAnimationTimeMillis();
                        ah.c = 0L;
                        ah.d.postOnAnimation((Runnable)ah);
                    }
                    ah.a = (float)d;
                    final ufh ai3 = this.ai;
                    ai3.a = 0;
                    ai3.b = 0;
                    this.N();
                }
                this.al();
            }
        }
        this.E = ac;
        this.at = eventTime;
        return true;
    }
    
    public final long p() {
        final EditableVideo w = this.w;
        if (w == null) {
            return 0L;
        }
        return w.n();
    }
    
    final View q() {
        return (View)this.G.map((Function)tip.h).orElse((Object)null);
    }
    
    public final void rG(final rgi rgi) {
        this.post((Runnable)new swa(this, rgi, 17));
    }
    
    public final void rH(final Exception ex) {
        tut.d("Failed to render thumbnail", (Throwable)ex);
    }
    
    public final void s() {
        this.ak(null, null);
        this.J(qzq.a);
    }
    
    public final void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final long k = this.k();
        final long p = this.p();
        int n = 0;
        if (p <= k) {
            n = n;
            if (k <= this.o()) {
                n = 1;
            }
        }
        if (visibility == 0 && n == 0) {
            this.I(this.p());
        }
    }
    
    public final void t() {
    }
    
    public final void u(final rga rga) {
        rga.b((rfw)null);
        rga.setCallback((Drawable$Callback)null);
        this.an.remove(rga);
    }
    
    public final void v() {
        adme.T(this.C != null);
        adme.T(this.D ^ true);
        this.D = true;
        final EditableVideo w = this.w;
        if (w != null) {
            final ufm c = this.C;
            if (c != null) {
                w.s((Set)c.e);
            }
        }
        final ViewParent parent = this.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable instanceof rga;
    }
    
    public final void w(final int n) {
        if (this.W) {
            final Vibrator ar = this.ar;
            if (ar != null) {
                ar.vibrate((long)n);
            }
        }
    }
    
    public final void x() {
        final VideoMetaData x = this.x;
        if (x == null) {
            return;
        }
        final ufj t = this.t;
        final long i = this.i();
        int d = 0;
        Label_0069: {
            if (i != 0L) {
                final long h = x.h;
                if (i <= h) {
                    d = (int)(t.d * h / i);
                    break Label_0069;
                }
            }
            d = t.d;
        }
        if (d == 0) {
            return;
        }
        this.y.ifPresent((Consumer)new kuf(this, d, 6));
    }
    
    final void y() {
        final aefs i = this.I;
        if (i == null) {
            tut.l("The interaction logger is null.");
            return;
        }
        i.cp(xbf.c(110247)).i();
    }
    
    public final void z(final long n) {
        final ufq h = this.H;
        if (h == null) {
            tut.b("PlayheadPositionListener is null.");
            return;
        }
        h.accept((Object)afuf.c(n).toMillis());
    }
}
