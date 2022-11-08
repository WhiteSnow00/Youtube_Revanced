import android.graphics.drawable.InsetDrawable;
import android.graphics.Matrix$ScaleToFit;
import java.util.List;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.os.Build$VERSION;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Rect;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.animation.TimeInterpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public class adtd
{
    static final TimeInterpolator a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    static final int[] f;
    static final int[] g;
    static final int[] h;
    static final int[] i;
    static final int[] j;
    static final int[] k;
    public int A;
    public final FloatingActionButton B;
    public ViewTreeObserver$OnPreDrawListener C;
    final aepj D;
    private final Rect E;
    private final RectF F;
    private final RectF G;
    private final Matrix H;
    private final aeim I;
    public adwk l;
    public adwf m;
    public Drawable n;
    public adsn o;
    public Drawable p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public int u;
    public Animator v;
    public adqg w;
    public adqg x;
    public float y;
    public int z;
    
    static {
        a = adqd.c;
        b = 2130969940;
        c = 2130969956;
        d = 2130969943;
        e = 2130969954;
        f = new int[] { 16842919, 16842910 };
        g = new int[] { 16843623, 16842908, 16842910 };
        h = new int[] { 16842908, 16842910 };
        i = new int[] { 16843623, 16842910 };
        j = new int[] { 16842910 };
        k = new int[0];
    }
    
    public adtd(final FloatingActionButton b, final aepj d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.y = 1.0f;
        this.A = 0;
        this.E = new Rect();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Matrix();
        this.B = b;
        this.D = d;
        final aeim i = new aeim((char[])null);
        (this.I = i).d(o((adtc)new adta(this)));
        i.d(o((adtc)new adsz(this)));
        i.d(o((adtc)new adsz(this)));
        i.d(o((adtc)new adsz(this)));
        i.d(o((adtc)new adtb(this)));
        i.d(o((adtc)new adsy(this)));
        b.getRotation();
    }
    
    private static final ValueAnimator o(final adtc adtc) {
        final ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(adtd.a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener((Animator$AnimatorListener)adtc);
        valueAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)adtc);
        valueAnimator.setFloatValues(new float[] { 0.0f, 1.0f });
        return valueAnimator;
    }
    
    private static final void p(final ObjectAnimator objectAnimator) {
        if (Build$VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator((TypeEvaluator)new adsx());
    }
    
    public float a() {
        return this.r;
    }
    
    public final AnimatorSet b(final adqg adqg, final float n, final float n2, final float n3) {
        final ArrayList list = new ArrayList();
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this.B, View.ALPHA, new float[] { n });
        adqg.b("opacity").b((Animator)ofFloat);
        list.add(ofFloat);
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)this.B, View.SCALE_X, new float[] { n2 });
        adqg.b("scale").b((Animator)ofFloat2);
        p(ofFloat2);
        list.add(ofFloat2);
        final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)this.B, View.SCALE_Y, new float[] { n2 });
        adqg.b("scale").b((Animator)ofFloat3);
        p(ofFloat3);
        list.add(ofFloat3);
        this.d(n3, this.H);
        final ObjectAnimator ofObject = ObjectAnimator.ofObject((Object)this.B, (Property)new adqe(), (TypeEvaluator)new adsv(this), (Object[])new Matrix[] { new Matrix(this.H) });
        adqg.b("iconScale").b((Animator)ofObject);
        list.add(ofObject);
        final AnimatorSet set = new AnimatorSet();
        adwd.F(set, list);
        return set;
    }
    
    public final AnimatorSet c(final float n, final float n2, final float n3, final int n4, final int n5) {
        final AnimatorSet set = new AnimatorSet();
        final ArrayList list = new ArrayList();
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new adsw(this, this.B.getAlpha(), n, this.B.getScaleX(), n2, this.B.getScaleY(), this.y, n3, new Matrix(this.H)));
        list.add(ofFloat);
        adwd.F(set, list);
        set.setDuration((long)adwd.j(this.B.getContext(), n4, this.B.getContext().getResources().getInteger(2131493002)));
        set.setInterpolator(adwd.o(this.B.getContext(), n5, adqd.b));
        return set;
    }
    
    public final void d(final float n, final Matrix matrix) {
        matrix.reset();
        final Drawable drawable = this.B.getDrawable();
        if (drawable != null && this.z != 0) {
            final RectF f = this.F;
            final RectF g = this.G;
            f.set(0.0f, 0.0f, (float)drawable.getIntrinsicWidth(), (float)drawable.getIntrinsicHeight());
            final float n2 = (float)this.z;
            g.set(0.0f, 0.0f, n2, n2);
            matrix.setRectToRect(f, g, Matrix$ScaleToFit.CENTER);
            final float n3 = this.z / 2.0f;
            matrix.postScale(n, n, n3, n3);
        }
    }
    
    public void e(final Rect rect) {
        int n;
        if (this.q) {
            n = (this.u - this.B.b()) / 2;
        }
        else {
            n = 0;
        }
        final float n2 = this.a() + this.t;
        final int max = Math.max(n, (int)Math.ceil(n2));
        final int max2 = Math.max(n, (int)Math.ceil(n2 * 1.5f));
        rect.set(max, max2, max, max2);
    }
    
    public void f(final float n, final float n2, final float n3) {
        throw null;
    }
    
    public final void g(final float y) {
        this.y = y;
        final Matrix h = this.H;
        this.d(y, h);
        this.B.setImageMatrix(h);
    }
    
    public final void h(final adwk adwk) {
        this.l = adwk;
        final adwf m = this.m;
        if (m != null) {
            m.ti(adwk);
        }
        final adsn o = this.o;
        if (o != null) {
            o.h = adwk;
            o.invalidateSelf();
        }
    }
    
    public final void i() {
        this.g(this.y);
    }
    
    public final void j() {
        final Rect e = this.E;
        this.e(e);
        aff.l((Object)this.p, (Object)"Didn't initialize content background");
        if (this.l()) {
            this.D.c((Drawable)new InsetDrawable(this.p, e.left, e.top, e.right, e.bottom));
        }
        else {
            this.D.c(this.p);
        }
        final aepj d = this.D;
        final int left = e.left;
        final int top = e.top;
        final int right = e.right;
        final int bottom = e.bottom;
        ((FloatingActionButton)d.a).c.set(left, top, right, bottom);
        final FloatingActionButton floatingActionButton = (FloatingActionButton)d.a;
        final int a = floatingActionButton.a;
        floatingActionButton.setPadding(left + a, top + a, right + a, bottom + a);
    }
    
    public final void k(final float n) {
        final adwf m = this.m;
        if (m != null) {
            m.n(n);
        }
    }
    
    public boolean l() {
        return true;
    }
    
    public final boolean m() {
        return ana.ao((View)this.B) && !this.B.isInEditMode();
    }
    
    final boolean n() {
        return !this.q || this.B.b() >= this.u;
    }
}
