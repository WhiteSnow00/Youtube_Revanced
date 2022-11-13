// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.video.trim;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.animation.Animator$AnimatorListener;
import java.util.Collection;
import android.os.Vibrator;
import java.util.Iterator;
import android.graphics.drawable.Drawable$Callback;
import android.view.MotionEvent;
import android.view.ViewParent;
import java.util.Set;
import android.animation.AnimatorSet$Builder;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.widget.ImageView$ScaleType;
import android.content.res.TypedArray;
import android.content.res.Resources;
import java.util.ArrayList;
import android.view.View;
import android.graphics.Paint$Style;
import java.util.concurrent.TimeUnit;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.animation.Animator;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import java.util.List;
import android.widget.ImageView;
import android.graphics.Rect;
import android.view.ViewGroup;

public class VideoTrimView extends ViewGroup implements rfh, qzg, qyr
{
    private final Rect A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final int G;
    private final int H;
    private final int I;
    private final int J;
    private final int K;
    private final int L;
    private int M;
    private final boolean N;
    private final boolean O;
    private final boolean P;
    private final boolean Q;
    private final boolean R;
    private final boolean S;
    private final rfx T;
    private final ImageView U;
    private final ImageView V;
    private final List W;
    public final float a;
    private final List aa;
    private EditableVideo ab;
    private VideoMetaData ac;
    private rfi ad;
    private rfi ae;
    private final Drawable af;
    private int ag;
    private float ah;
    private float ai;
    private float aj;
    private long ak;
    private long al;
    private int am;
    private long an;
    private int ao;
    private Animator ap;
    private Animator aq;
    private final rfr ar;
    private long as;
    private final int at;
    private final uef au;
    public final int b;
    public final int c;
    public final boolean d;
    final Paint e;
    public final rfv f;
    public float g;
    public boolean h;
    public boolean i;
    public qyn j;
    public boolean k;
    public boolean l;
    public float m;
    public long n;
    public rfy o;
    public final Rect p;
    public qyu q;
    public rfb r;
    public rfi s;
    public rfj t;
    public rfz u;
    public boolean v;
    public float w;
    public zis x;
    private boolean y;
    private final Rect z;
    
    public VideoTrimView(final Context context, final AttributeSet set) {
        super(context, set);
        this.z = new Rect();
        this.A = new Rect();
        final boolean a = qlj.a;
        this.T = new rfx(this);
        final boolean b = true;
        this.au = new uef(this, 1);
        this.o = rfy.a;
        this.p = new Rect();
        this.an = -1L;
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.M = ViewConfiguration.getLongPressTimeout();
        final Resources resources = context.getResources();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, qyc.a);
        final float fraction = obtainStyledAttributes.getFraction(7, 1, 100, 1.0f);
        this.a = fraction;
        this.B = (int)(resources.getDimension(2131170309) * fraction);
        this.C = (int)(resources.getDimension(2131170311) * fraction);
        final int f = (int)(resources.getDimension(2131170301) * fraction);
        this.F = f;
        this.G = (int)(resources.getDimension(2131170300) * fraction);
        this.d = obtainStyledAttributes.getBoolean(6, true);
        final int integer = obtainStyledAttributes.getInteger(8, 1);
        boolean b2 = false;
        Label_0239: {
            if (integer >= 0) {
                rlc.f();
                if (integer < 2) {
                    b2 = true;
                    break Label_0239;
                }
            }
            b2 = false;
        }
        adkp.H(b2);
        this.at = rlc.f()[integer];
        final int resourceId = obtainStyledAttributes.getResourceId(4, 2131233395);
        final int resourceId2 = obtainStyledAttributes.getResourceId(4, 2131233396);
        final int resourceId3 = obtainStyledAttributes.getResourceId(2, 2131102320);
        this.D = agx.a(context, resourceId).getIntrinsicWidth() / 2;
        final boolean boolean1 = obtainStyledAttributes.getBoolean(5, false);
        final boolean boolean2 = obtainStyledAttributes.getBoolean(0, false);
        this.P = boolean2;
        this.Q = obtainStyledAttributes.getBoolean(1, false);
        this.R = obtainStyledAttributes.getBoolean(9, true);
        final boolean boolean3 = obtainStyledAttributes.getBoolean(3, false);
        this.S = boolean3;
        obtainStyledAttributes.recycle();
        this.k = true;
        this.n = TimeUnit.MILLISECONDS.toMicros(resources.getInteger(2131493127));
        this.H = resources.getDimensionPixelSize(2131170305);
        this.E = resources.getDimensionPixelSize(2131170304);
        this.I = resources.getDimensionPixelSize(2131170308);
        this.m = (float)resources.getInteger(2131493125);
        this.b = resources.getInteger(2131493126);
        this.J = resources.getInteger(2131493123);
        final int integer2 = resources.getInteger(2131493122);
        this.K = integer2;
        this.L = resources.getInteger(2131493124);
        this.ao = integer2;
        final Paint e = new Paint();
        (this.e = e).setColor(resources.getColor(resourceId3));
        e.setStrokeWidth((float)f);
        e.setStyle(Paint$Style.STROKE);
        final rfr ar = new rfr(this.getContext());
        (this.ar = ar).setContentDescription((CharSequence)resources.getString(2132019155));
        ar.setFocusable(true);
        if (boolean3) {
            this.addView((View)ar);
        }
        final ImageView i = this.I(context, resourceId);
        (this.U = i).setContentDescription((CharSequence)resources.getString(2132017554));
        i.setFocusable(true);
        this.addView((View)i);
        final ImageView j = this.I(context, resourceId2);
        (this.V = j).setContentDescription((CharSequence)resources.getString(2132017983));
        j.setFocusable(true);
        this.addView((View)j);
        this.W = new ArrayList();
        this.aa = new ArrayList();
        this.f = new rfv(context);
        this.af = fc.b(context, 2131231995);
        final boolean n = context.checkCallingOrSelfPermission("android.permission.VIBRATE") == 0;
        this.N = n;
        this.O = (boolean1 && n && b);
        this.setWillNotDraw(false);
        if (boolean2) {
            this.setClipToPadding(false);
        }
    }
    
    public static boolean A(final Object o, final Object o2) {
        boolean equals;
        if (o == null) {
            if (o2 == null) {
                return true;
            }
            equals = false;
        }
        else {
            equals = o.equals(o2);
        }
        return equals;
    }
    
    private final float B() {
        return this.U.getX() + this.D;
    }
    
    private final float C() {
        return this.V.getX() + this.D;
    }
    
    private final float D(final long n) {
        return this.q.b(n) * this.p.width() + this.p.left;
    }
    
    private final float E() {
        return this.V.getX() + this.E - this.ar.a() + this.ar.b;
    }
    
    private final float F() {
        final float x = this.U.getX();
        final int d = this.D;
        return x + (d + d) - this.E - this.ar.b;
    }
    
    private static long G(final long n, final long n2, final long n3) {
        if (Math.abs(n2 - n) < Math.abs(n3 - n)) {
            return n2;
        }
        return n3;
    }
    
    private final long H(long g) {
        final rfz a = rfz.a;
        final int at = this.at;
        if (at == 0) {
            throw null;
        }
        if (at - 1 != 1) {
            return g;
        }
        final long g2 = G(g, 0L, this.e());
        final rew g3 = this.ae.g(g, false);
        if (g3 != null) {
            g = G(g, g3.a(), g2);
            g3.d();
            return g;
        }
        return g2;
    }
    
    private final ImageView I(final Context context, final int n) {
        final rfu imageDrawable = new rfu(context, n, (float)this.F);
        final ImageView imageView = new ImageView(context);
        imageView.setImageDrawable((Drawable)imageDrawable);
        imageView.setScaleType(ImageView$ScaleType.FIT_XY);
        return imageView;
    }
    
    private final rfy J(final int n) {
        final boolean b = false;
        adkp.H(n >= 0);
        if (n == 0) {
            return rfy.a;
        }
        final VideoMetaData ac = this.ac;
        float a;
        if (ac != null) {
            a = ac.a();
        }
        else {
            a = 1.7777778f;
        }
        final EditableVideo ab = this.ab;
        float n2 = a;
        Label_0135: {
            if (ab != null) {
                final int n3 = (ab.f() % 360 + 360) % 360;
                boolean b2 = b;
                if (n3 % 90 == 0) {
                    b2 = b;
                    if (n3 >= 0) {
                        b2 = true;
                    }
                }
                adkp.H(b2);
                if (n3 != 90) {
                    n2 = a;
                    if (n3 != 270) {
                        break Label_0135;
                    }
                }
                n2 = 1.0f / a;
            }
        }
        final float n4 = (float)this.B;
        final int c = this.C;
        final int max = Math.max(1, (int)Math.floor((n + c) / (n4 * n2 + c)));
        final float n5 = (n - this.C * (max - 1)) / (float)max;
        return new rfy(n5, n5 / n2, max);
    }
    
    private final void K(final ImageView imageView, final RectF rectF) {
        final float n = (float)this.H;
        final float n2 = imageView.getX() + this.D;
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
    
    private final void L(final boolean b, final boolean b2) {
        final AnimatorSet set = new AnimatorSet();
        ImageView imageView;
        if (b2) {
            final Animator ap = this.ap;
            if (ap != null) {
                ap.cancel();
            }
            this.ap = (Animator)set;
            imageView = this.U;
        }
        else {
            final Animator aq = this.aq;
            if (aq != null) {
                aq.cancel();
            }
            this.aq = (Animator)set;
            imageView = this.V;
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
        final float n3 = n2 * this.a;
        final long duration = this.getContext().getResources().getInteger(17694720);
        final AnimatorSet$Builder with = set.play((Animator)ObjectAnimator.ofFloat((Object)imageView, View.SCALE_X, new float[] { scaleX, n3 })).with((Animator)ObjectAnimator.ofFloat((Object)imageView, View.SCALE_Y, new float[] { scaleX, n3 }));
        float n4 = n;
        if (!b) {
            n4 = 0.0f;
        }
        with.with((Animator)ObjectAnimator.ofFloat((Object)imageView, View.TRANSLATION_Z, new float[] { ((View)imageView).getTranslationZ(), n4 * this.a }));
        set.setDuration(duration);
        set.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
        set.start();
    }
    
    private final void M() {
        if (this.Q && this.y()) {
            this.L(false, this.u == rfz.a);
        }
        if (this.v) {
            adkp.Q(true);
            this.ab.t((Set)this.u.e);
            this.v = false;
            final qyn j = this.j;
            if (j != null) {
                j.a();
            }
            if (this.z()) {
                adkp.Q(this.z());
                this.g = 0.0f;
                final qyu q = this.q;
                q.k(0L, q.b);
                this.o();
                this.u();
                this.t.l((rfh)this);
                this.t.j();
                this.t = null;
            }
            this.au.a(0.0f);
            final ViewParent parent = this.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            this.u = null;
        }
    }
    
    private final void N(float n) {
        if (!this.S) {
            return;
        }
        final float f = this.F();
        final float n2 = this.E() - f;
        if (n2 == 0.0f) {
            return;
        }
        n = (n - f - this.ar.a() / 2.0f) / n2;
        final long i = this.i();
        final long h = this.h();
        this.r(Math.max(i, Math.min((long)(n * (h - i)) + i, h)));
        rah.b("PlayheadPositionListener is null.");
    }
    
    private final void O(float b, final float c) {
        this.U.setX(b - this.D);
        this.V.setX(c - this.D);
        final int d = this.D;
        final float n = d + d + b - c;
        float n3;
        if (n > 0.0f) {
            final float n2 = (float)d;
            n3 = (n2 - n) / n2;
        }
        else {
            n3 = 1.0f;
        }
        ((rfu)this.U.getDrawable()).a(n3, false);
        ((rfu)this.V.getDrawable()).a(n3, true);
        this.Q();
        final rfv f = this.f;
        f.b = b;
        f.c = c;
        if (this.u != rfz.a) {
            b = c;
        }
        this.R(b);
    }
    
    private final void P(final long n) {
        if (n < 0L) {
            this.am = -1;
            this.an = -1L;
            return;
        }
        if (this.O) {
            final VideoMetaData ac = this.ac;
            if (ac != null) {
                final int g = ac.g(n);
                if (g != this.am) {
                    if (this.z() && !this.x()) {
                        this.an = System.currentTimeMillis();
                        final int l = this.L;
                        this.ao = l;
                        this.postDelayed((Runnable)new qrd(this, 20), (long)l);
                    }
                    this.am = g;
                }
            }
        }
    }
    
    private final void Q() {
        if (!this.S) {
            return;
        }
        if (this.as < 0L) {
            return;
        }
        final long i = this.i();
        final long h = this.h();
        if (i == h) {
            return;
        }
        final float f = this.F();
        final float e = this.E();
        final long as = this.as;
        final double n = f;
        final double n2 = e;
        final double n3 = (double)(as - i);
        final double n4 = (double)(h - i);
        Double.isNaN(n3);
        Double.isNaN(n4);
        final double n5 = n3 / n4;
        final double n6 = e - f;
        Double.isNaN(n6);
        Double.isNaN(n);
        this.ar.setX((float)Math.max(n, Math.min(n5 * n6 + n, n2)));
    }
    
    private final void R(float n) {
        if (this.y()) {
            if (this.j != null) {
                long n2;
                boolean b;
                if (this.u == rfz.a) {
                    n2 = this.i();
                    b = true;
                }
                else {
                    n2 = this.h();
                    b = false;
                }
                final String j = qfk.j(this.getContext(), n2 / 1000L, this.z());
                float n3 = n;
                if (this.au.b()) {
                    int n4;
                    if (n < this.p.centerX()) {
                        n4 = this.p.left;
                    }
                    else {
                        n4 = this.p.right;
                    }
                    n3 = (float)n4;
                }
                final float n5 = n = this.e.getStrokeWidth() / 2.0f;
                if (b) {
                    n = -n5;
                }
                final int n6 = -this.G;
                final qyn i = this.j;
                if (i.b != null) {
                    final qyl c = i.c;
                    if (c != null) {
                        final int n7 = (int)(n3 + n);
                        c.e(j);
                        final int[] c2 = i.c(n7, n6, (View)this);
                        i.c.d(c2[0], c2[1], i.a.getWidth());
                    }
                }
            }
        }
    }
    
    private static final float S(final MotionEvent motionEvent, int pointerIndex) {
        pointerIndex = motionEvent.findPointerIndex(pointerIndex);
        if (pointerIndex == -1) {
            return Float.NaN;
        }
        return motionEvent.getX(pointerIndex);
    }
    
    public final void a(final EditableVideo editableVideo, final Set set) {
        this.P(-1L);
    }
    
    public final void b(final EditableVideo editableVideo, final int n) {
        if (n == 0) {
            if (!this.v) {
                this.w();
                this.invalidate();
            }
            this.P(this.i());
            return;
        }
        if (n == 1) {
            if (!this.v) {
                this.w();
                this.invalidate();
            }
            this.P(this.h());
            return;
        }
        if (n != 2) {
            return;
        }
        this.v(this.J(this.p.width()));
    }
    
    public final void c(final EditableVideo editableVideo, final Set set) {
        this.P(-1L);
    }
    
    public final void d(final rew rew) {
    }
    
    public final long e() {
        final VideoMetaData ac = this.ac;
        if (ac == null) {
            return 1L;
        }
        return ac.h;
    }
    
    public final long f() {
        final EditableVideo ab = this.ab;
        if (ab == null) {
            return 1L;
        }
        return ab.i();
    }
    
    public final long g(final float n) {
        return this.q.e((n - this.p.left) / this.p.width());
    }
    
    public final int getPaddingLeft() {
        if (!this.P) {
            return super.getPaddingLeft();
        }
        return Math.max(super.getPaddingLeft() - this.D + this.F / 2, 0);
    }
    
    public final int getPaddingRight() {
        if (!this.P) {
            return super.getPaddingRight();
        }
        return Math.max(super.getPaddingRight() - this.D + this.F / 2, 0);
    }
    
    public final long h() {
        final EditableVideo ab = this.ab;
        long n;
        if (ab == null) {
            n = this.e();
        }
        else {
            n = ab.l();
        }
        return n;
    }
    
    public final long i() {
        final EditableVideo ab = this.ab;
        if (ab == null) {
            return 0L;
        }
        return ab.n();
    }
    
    public final void j(final rfa rfa) {
        rfa.b((rew)null);
        rfa.setCallback((Drawable$Callback)null);
        this.W.remove(rfa);
    }
    
    public final void k() {
        adkp.Q(this.u != null);
        adkp.Q(this.v ^ true);
        this.v = true;
        this.ab.s((Set)this.u.e);
        if (this.y()) {
            final qyn j = this.j;
            if (j != null) {
                j.b();
                long n;
                if (this.u == rfz.a) {
                    n = this.i();
                }
                else {
                    n = this.h();
                }
                this.R(this.D(n));
            }
        }
        final ViewParent parent = this.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        final zis x = this.x;
        if (x != null && !this.y) {
            x.C("trim_handle_interaction");
            this.y = true;
        }
    }
    
    public final void l(final qyu qyu) {
        for (final rfa rfa : this.W) {
            final float d = this.D(rfa.b);
            final Rect bounds = rfa.getBounds();
            final float n = bounds.centerX() - d;
            if (n != 0.0f) {
                final float n2 = (float)bounds.left;
                final int top = bounds.top;
                final int width = bounds.width();
                final int n3 = (int)(n2 - n);
                rfa.setBounds(n3, top, width + n3, bounds.bottom);
            }
        }
        this.w();
        this.invalidate();
    }
    
    public final void m() {
        this.v(this.o);
        this.w();
        this.requestLayout();
    }
    
    public final void n(final int n) {
        if (this.N) {
            ((Vibrator)this.getContext().getSystemService("vibrator")).vibrate((long)n);
        }
    }
    
    public final void o() {
        final ArrayList list = new ArrayList(this.aa);
        this.aa.clear();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final rfa rfa = (rfa)list.get(i);
            final ObjectAnimator ofInt = ObjectAnimator.ofInt((Object)rfa, "alpha", new int[] { 0 });
            ofInt.addListener((Animator$AnimatorListener)new rfw(this, rfa));
            ofInt.start();
        }
        this.q.g = true;
        this.v(this.o);
        for (final rfa rfa2 : this.aa) {
            rfa2.c(true);
            ObjectAnimator.ofInt((Object)rfa2, "alpha", new int[] { 0, 255 }).start();
        }
        this.q.g = false;
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.clipRect(this.z);
        canvas.drawColor(this.getResources().getColor(2131102301));
        canvas.save();
        canvas.clipRect(this.D(0L), (float)this.z.top, this.D(this.e()), (float)this.z.bottom);
        if (this.i) {
            final Iterator iterator = this.W.iterator();
            while (iterator.hasNext()) {
                ((rfa)iterator.next()).a(canvas, this.ab.f());
            }
        }
        else {
            final int width = this.p.width();
            int i = 0;
            adkp.H(width >= 0);
            final float n = (float)this.B;
            final int c = this.C;
            final rfy rfy = new rfy(n, (float)this.B, Math.max(1, (int)Math.ceil((width + c) / (c + n))));
            final float b = rfy.b;
            final float n2 = (float)this.C;
            while (i < rfy.d) {
                final float n3 = (float)this.p.left;
                final float n4 = (float)i;
                final float b2 = rfy.b;
                final float n5 = n3 + n4 * (b + n2);
                final float n6 = (float)this.getPaddingTop();
                this.af.setBounds((int)n5, (int)n6, (int)(b2 + n5), (int)(rfy.c + n6));
                this.af.draw(canvas);
                ++i;
            }
        }
        canvas.restore();
        this.f.draw(canvas);
        if (this.l) {
            final float n7 = this.e.getStrokeWidth() / 2.0f;
            canvas.drawRect(this.B(), this.p.top + n7, this.C(), this.p.bottom - n7, this.e);
        }
        canvas.restore();
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.T.a();
                    this.M();
                }
            }
            else if (motionEvent.getActionIndex() == motionEvent.findPointerIndex(this.ag)) {
                this.T.a();
                this.M();
            }
        }
        else if (motionEvent.getPointerCount() == 1) {
            final int pointerId = motionEvent.getPointerId(0);
            this.ag = pointerId;
            final float s = S(motionEvent, pointerId);
            this.w = s;
            final RectF rectF = new RectF();
            this.K(this.U, rectF);
            final float left = rectF.left;
            final float right = rectF.right;
            this.K(this.V, rectF);
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
            rfz u;
            if (s >= n && s <= n2) {
                u = rfz.a;
            }
            else if (s >= n3 && s <= right2) {
                u = rfz.b;
            }
            else if (s > n2 && s < n3) {
                if (this.S) {
                    u = rfz.c;
                }
                else {
                    u = rfz.d;
                }
            }
            else {
                u = null;
            }
            this.u = u;
            if (u != null) {
                this.u();
                if (this.y()) {
                    this.T.b((long)this.M, this.w);
                    if (this.Q && !this.v) {
                        this.L(true, this.u == rfz.a);
                    }
                }
                this.N(this.w);
            }
        }
        return this.u != null;
    }
    
    protected final void onLayout(final boolean b, int n, int n2, int n3, int n4) {
        this.z.set(this.getPaddingLeft(), this.getPaddingTop(), this.getWidth() - this.getPaddingRight(), this.getHeight() - this.getPaddingBottom());
        this.p.left = Math.min(this.z.left + this.D, this.z.right);
        this.p.top = this.z.top;
        this.p.right = Math.max(this.z.right - this.D, this.z.left);
        this.p.bottom = this.z.bottom;
        if (this.S) {
            n = this.p.left;
            final rfr ar = this.ar;
            n -= ar.b;
            n2 = ar.a();
            this.ar.layout(n, 0, n2 + n, this.getHeight());
        }
        n2 = this.z.top;
        n = this.z.bottom;
        n4 = this.p.left;
        n3 = this.D;
        n4 -= n3;
        this.U.layout(n4, n2, n3 + n3 + n4, n);
        n4 = this.p.right;
        n3 = this.D;
        n4 -= n3;
        this.V.layout(n4, n2, n3 + n3 + n4, n);
        this.w();
        final rfy j = this.J(this.p.width());
        if (!A(j, this.o)) {
            this.v(j);
        }
        if (this.P && !this.z() && !this.q.j()) {
            this.f.setBounds(this.p);
        }
        else {
            this.f.setBounds(this.z);
        }
        this.getHitRect(this.A);
        if (Build$VERSION.SDK_INT >= 29) {
            this.setSystemGestureExclusionRects((List)afeq.r((Object)this.A));
        }
    }
    
    protected final void onMeasure(int n, int measureSpec) {
        adkp.Q(View$MeasureSpec.getMode(n) != 0);
        this.setMeasuredDimension(resolveSizeAndState(View$MeasureSpec.getSize(n), n, 0), resolveSizeAndState(this.getPaddingTop() + this.B + this.getPaddingBottom(), measureSpec, 0));
        n = this.D;
        n = View$MeasureSpec.makeMeasureSpec(n + n, 1073741824);
        measureSpec = View$MeasureSpec.makeMeasureSpec(this.B, 1073741824);
        if (this.S) {
            this.ar.measure(n, measureSpec);
        }
        this.U.measure(n, measureSpec);
        this.V.measure(n, measureSpec);
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        Parcelable parcelable2 = parcelable;
        if (parcelable instanceof Bundle) {
            final Bundle bundle = (Bundle)parcelable;
            this.y = bundle.getBoolean("trimHandleInteractionAlreadyLogged");
            parcelable2 = bundle.getParcelable("superViewInstanceState");
        }
        super.onRestoreInstanceState(parcelable2);
    }
    
    public final Parcelable onSaveInstanceState() {
        final Bundle bundle = new Bundle();
        bundle.putParcelable("superViewInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("trimHandleInteractionAlreadyLogged", this.y);
        return (Parcelable)bundle;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.u == null) {
            return super.onTouchEvent(motionEvent);
        }
        final float s = S(motionEvent, this.ag);
        final int actionMasked = motionEvent.getActionMasked();
        Label_0857: {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.T.a();
                        this.M();
                        break Label_0857;
                    }
                    if (actionMasked != 6) {
                        break Label_0857;
                    }
                }
                else {
                    if (!this.l) {
                        break Label_0857;
                    }
                    if (!this.v && Math.abs(this.ah - s) > this.c) {
                        this.k();
                    }
                    if (this.v) {
                        this.T.b((long)this.M, s);
                        adkp.Q(this.u != null);
                        final long d = this.q.d((s - this.ah) / this.p.width());
                        if (!this.au.b()) {
                            final rfz a = rfz.a;
                            final int ordinal = this.u.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal != 2) {
                                        if (ordinal == 3) {
                                            final long al = this.al;
                                            final long ak = this.ak;
                                            final long n = al - ak;
                                            final long h = this.H(Math.min(this.ac.h - n, ak + d));
                                            this.ab.E(h);
                                            this.ab.D(n + h);
                                            this.ab.E(h);
                                        }
                                    }
                                    else {
                                        this.N(s);
                                    }
                                }
                                else {
                                    this.q(this.al + d);
                                }
                            }
                            else {
                                this.p(this.ak + d);
                            }
                            if (this.R) {
                                this.w();
                            }
                            else {
                                final float n2 = (float)this.p.left;
                                final int left = this.p.left;
                                final int width = this.p.width();
                                final long f = this.f();
                                final long n3 = this.p.width();
                                long n4;
                                if (this.z()) {
                                    n4 = this.n;
                                }
                                else {
                                    n4 = this.e();
                                }
                                final float n5 = (float)(f * n3);
                                final EditableVideo ab = this.ab;
                                long h2;
                                if (ab == null) {
                                    h2 = 1L;
                                }
                                else {
                                    h2 = ab.h();
                                }
                                final long n6 = this.p.width();
                                long n7;
                                if (this.z()) {
                                    n7 = this.n;
                                }
                                else {
                                    n7 = this.e();
                                }
                                final float n8 = n5 / n4;
                                final float n9 = (float)(left + width);
                                final float b = this.B();
                                float n10 = this.C();
                                final int ordinal2 = this.u.ordinal();
                                final float n11 = h2 * n6 / (float)n7;
                                float max;
                                if (ordinal2 != 0) {
                                    if (ordinal2 != 1) {
                                        if (ordinal2 != 3) {
                                            max = b;
                                        }
                                        else {
                                            final float n12 = s - this.ah;
                                            final float ai = this.ai;
                                            float n13;
                                            if (ai + n12 < n2) {
                                                n13 = n2 - ai;
                                            }
                                            else {
                                                final float aj = this.aj;
                                                n13 = n12;
                                                if (aj + n12 > n9) {
                                                    n13 = n9 - aj;
                                                }
                                            }
                                            final float n14 = ai + n13;
                                            final float n15 = this.aj + n13;
                                            max = n14;
                                            n10 = n15;
                                        }
                                    }
                                    else {
                                        float min;
                                        if (n11 > 0.0f) {
                                            min = Math.min(s, n11 + b);
                                        }
                                        else {
                                            min = s;
                                        }
                                        n10 = Math.min(n9, Math.max(min, n8 + b));
                                        max = b;
                                    }
                                }
                                else {
                                    float max2;
                                    if (n11 > 0.0f) {
                                        max2 = Math.max(s, n10 - n11);
                                    }
                                    else {
                                        max2 = s;
                                    }
                                    max = Math.max(n2, Math.min(max2, n10 - n8));
                                }
                                this.O(max, n10);
                            }
                            this.invalidate();
                        }
                        float n16;
                        if (this.y() && this.z()) {
                            final int left2 = this.p.left;
                            final int d2 = this.D;
                            final int right = this.p.right;
                            final int d3 = this.D;
                            if (Math.max(0.0f, s - (left2 - d2)) < this.I) {
                                n16 = -1.0f;
                            }
                            else {
                                n16 = 0.0f;
                            }
                            if (Math.max(0.0f, right + d3 - s) < this.I) {
                                n16 = 1.0f;
                            }
                        }
                        else {
                            n16 = 0.0f;
                        }
                        this.au.a(n16);
                    }
                    break Label_0857;
                }
            }
            if (motionEvent.getActionIndex() == motionEvent.findPointerIndex(this.ag)) {
                this.T.a();
                this.M();
            }
        }
        this.w = s;
        return true;
    }
    
    public final void p(long h) {
        h = this.H(h);
        this.ab.E(h);
        this.r(h);
    }
    
    public final void q(long h) {
        h = this.H(h);
        this.ab.D(h);
        this.r(h);
    }
    
    public final void r(final long as) {
        if (!this.S) {
            return;
        }
        this.as = as;
        this.Q();
        this.invalidate();
    }
    
    public final void rG(final rfi rfi) {
        this.post((Runnable)new rcu(this, rfi, 3));
    }
    
    public final void rH(final Exception ex) {
        rah.c("Failed to render thumbnail", (Throwable)ex);
    }
    
    public final void s(final EditableVideo ab, final rfb r, final qyu q) {
        final boolean b = true;
        VideoMetaData b2;
        if (ab != null) {
            r.getClass();
            b2 = ab.b;
            adkp.H(b2.equals(((rfc)r).a));
            final boolean m = ab.M();
            this.l = m;
            if (m) {
                this.U.setVisibility(0);
                this.V.setVisibility(0);
            }
            else {
                this.U.setVisibility(8);
                this.V.setVisibility(8);
            }
        }
        else {
            adkp.H(r == null);
            b2 = null;
        }
        q.getClass();
        if (A(ab, this.ab) && r == this.r) {
            return;
        }
        if (this.ab != null) {
            this.M();
            this.ab.v((qzg)this);
            this.r = null;
            this.s.l((rfh)this);
            this.s = null;
            this.ad.l((rfh)this);
            this.ad = null;
            this.ae = null;
            adkp.Q(this.t == null && b);
        }
        this.ab = ab;
        this.ac = b2;
        this.r = r;
        final rfy j = this.J(this.p.width());
        final EditableVideo ab2 = this.ab;
        if (ab2 != null) {
            ab2.q((qzg)this);
            (this.s = this.r.b()).k((rfh)this);
            (this.ad = this.r.c()).k((rfh)this);
            this.ae = (rfi)((rfc)this.r).e;
        }
        final qyu q2 = this.q;
        if (q2 != null) {
            q2.h((qyr)this);
        }
        (this.q = q).f((qyr)this);
        this.post((Runnable)new nht(this, j, ab, 20));
    }
    
    public final void t() {
    }
    
    public final void u() {
        this.ah = this.w;
        this.ak = this.i();
        this.al = this.h();
        this.ai = this.B();
        this.aj = this.C();
    }
    
    public final void v(final rfy o) {
        o.getClass();
        this.o = o;
        final float n = o.b + this.C;
        int d = o.d;
        final float n2 = this.g % n;
        rfi rfi = null;
        int n4 = 0;
        boolean h = false;
        Label_0164: {
            if (this.z()) {
                final double ceil = Math.ceil((this.getWidth() - this.getPaddingLeft() - this.getPaddingRight()) / n);
                final int n3 = (int)Math.ceil((this.p.left + n2) / n);
                d += (int)(ceil + 1.0) - n3;
                rfi = this.ae;
                n4 = -n3;
            }
            else {
                final rfi s = this.s;
                if (s != null && s.m()) {
                    rfi = this.s;
                    h = this.h;
                    this.h = false;
                    n4 = 0;
                    break Label_0164;
                }
                rfi = null;
                n4 = 0;
            }
            h = false;
        }
        for (int i = n4; i < d; ++i) {
            final int n5 = i - n4;
            rfa rfa;
            if (this.aa.size() > n5) {
                rfa = this.aa.get(n5);
            }
            else {
                rfa = new rfa();
                this.aa.add(n5, rfa);
                rfa.setCallback((Drawable$Callback)this);
                this.W.add(rfa);
            }
            final float n6 = this.p.left + i * n + n2;
            final float n7 = this.o.b + n6;
            final float n8 = (float)this.getPaddingTop();
            final float c = this.o.c;
            final float n9 = (float)this.B;
            float n10 = n8;
            if (c > n9) {
                n10 = n8 - (c - n9) / 2.0f;
            }
            rfa.setBounds((int)n6, (int)n10, (int)n7, (int)(c + n10));
            final long g = this.g(n6 + (n7 - n6) / 2.0f);
            rfa.b = g;
            if (rfi != null) {
                final rew g2 = rfi.g(g, true);
                final rew a = rfa.a;
                Label_0574: {
                    if (a != null && g2 != null) {
                        final long a2 = a.a();
                        final long a3 = g2.a();
                        if (a3 > a2 && Math.abs(g - a3) >= Math.abs(g - a2)) {
                            break Label_0574;
                        }
                    }
                    rfa.b(g2);
                }
                if (g2 != null) {
                    g2.d();
                }
            }
        }
        while (this.aa.size() > d - n4) {
            final List aa = this.aa;
            this.j((rfa)aa.remove(aa.size() - 1));
        }
        if (h) {
            for (int j = 0; j < this.aa.size(); ++j) {
                final rfa rfa2 = this.aa.get(j);
                rfa2.c(false);
                rfa2.d(j * 50);
            }
        }
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable instanceof rfa;
    }
    
    protected final void w() {
        this.O(this.D(this.i()), this.D(this.h()));
    }
    
    public final boolean x() {
        final long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.an >= this.ao) {
            this.n(this.J);
            this.ao = this.K;
            this.an = currentTimeMillis;
            return true;
        }
        return false;
    }
    
    public final boolean y() {
        return this.u == rfz.a || this.u == rfz.b;
    }
    
    public final boolean z() {
        return this.q.c;
    }
}
