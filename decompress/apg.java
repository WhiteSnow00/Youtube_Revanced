import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import android.view.animation.AccelerateInterpolator;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.ListView;
import android.view.View;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apg implements View$OnTouchListener
{
    private static final int g;
    public final apf a;
    public final View b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ListView f;
    private final Interpolator h;
    private Runnable i;
    private final float[] j;
    private final float[] k;
    private final int l;
    private final float[] m;
    private final float[] n;
    private final float[] o;
    private boolean p;
    private boolean q;
    
    static {
        g = ViewConfiguration.getTapTimeout();
    }
    
    public apg(final ListView listView) {
        final apf a = new apf();
        this.a = a;
        this.h = (Interpolator)new AccelerateInterpolator();
        final float[] array;
        final float[] j = array = new float[2];
        array[1] = (array[0] = 0.0f);
        this.j = j;
        final float[] array2;
        final float[] k = array2 = new float[2];
        array2[1] = (array2[0] = Float.MAX_VALUE);
        this.k = k;
        final float[] array3;
        final float[] m = array3 = new float[2];
        array3[1] = (array3[0] = 0.0f);
        this.m = m;
        final float[] array4;
        final float[] n = array4 = new float[2];
        array4[1] = (array4[0] = 0.0f);
        this.n = n;
        final float[] array5;
        final float[] o = array5 = new float[2];
        array5[1] = (array5[0] = Float.MAX_VALUE);
        this.o = o;
        this.b = (View)listView;
        final DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        final float density = displayMetrics.density;
        final float density2 = displayMetrics.density;
        o[1] = (o[0] = (int)(density * 1575.0f + 0.5f) / 1000.0f);
        n[1] = (n[0] = (int)(density2 * 315.0f + 0.5f) / 1000.0f);
        k[1] = (k[0] = Float.MAX_VALUE);
        j[1] = (j[0] = 0.2f);
        m[1] = (m[0] = 0.001f);
        this.l = apg.g;
        a.a = 500;
        a.b = 500;
        this.f = listView;
    }
    
    static float a(final float n, final float n2, final float n3) {
        if (n > n3) {
            return n3;
        }
        if (n < n2) {
            return n2;
        }
        return n;
    }
    
    private final float d(final int n, float n2, float n3, float n4) {
        final float a = a(this.j[n] * n3, 0.0f, this.k[n]);
        n2 = this.e(n3 - n2, a) - this.e(n2, a);
        Label_0094: {
            if (n2 < 0.0f) {
                n2 = -this.h.getInterpolation(-n2);
            }
            else {
                if (n2 <= 0.0f) {
                    n2 = 0.0f;
                    break Label_0094;
                }
                n2 = this.h.getInterpolation(n2);
            }
            n2 = a(n2, -1.0f, 1.0f);
        }
        if (n2 == 0.0f) {
            return 0.0f;
        }
        final float n5 = this.m[n];
        n3 = this.n[n];
        final float n6 = this.o[n];
        n4 *= n5;
        if (n2 > 0.0f) {
            return a(n2 * n4, n3, n6);
        }
        return -a(-n2 * n4, n3, n6);
    }
    
    private final float e(final float n, final float n2) {
        if (n2 == 0.0f) {
            return 0.0f;
        }
        if (n < n2) {
            if (n >= 0.0f) {
                return 1.0f - n / n2;
            }
            if (this.e) {
                return 1.0f;
            }
        }
        return 0.0f;
    }
    
    private final void f() {
        final boolean c = this.c;
        int i = 0;
        if (c) {
            this.e = false;
            return;
        }
        final apf a = this.a;
        final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        final long e = a.e;
        final int b = a.b;
        final int n = (int)(currentAnimationTimeMillis - e);
        if (n > b) {
            i = b;
        }
        else if (n >= 0) {
            i = n;
        }
        a.i = i;
        a.h = a.a(currentAnimationTimeMillis);
        a.g = currentAnimationTimeMillis;
    }
    
    public final boolean b() {
        final apf a = this.a;
        final float d = a.d;
        final float n = d / Math.abs(d);
        final float c = a.c;
        final float n2 = c / Math.abs(c);
        final int n3 = (int)n;
        boolean b = false;
        Label_0142: {
            if (n3 != 0) {
                final ListView f = this.f;
                final int count = f.getCount();
                if (count != 0) {
                    final int childCount = f.getChildCount();
                    final int firstVisiblePosition = f.getFirstVisiblePosition();
                    if (n3 > 0) {
                        if (firstVisiblePosition + childCount >= count && f.getChildAt(childCount - 1).getBottom() <= f.getHeight()) {
                            break Label_0142;
                        }
                    }
                    else {
                        if (n3 >= 0) {
                            break Label_0142;
                        }
                        if (firstVisiblePosition <= 0) {
                            if (f.getChildAt(0).getTop() >= 0) {
                                break Label_0142;
                            }
                        }
                    }
                    b = true;
                    return b;
                }
            }
        }
        if ((int)n2 == 0) {}
        return b;
    }
    
    public final void c(final boolean q) {
        if (this.q && !q) {
            this.f();
        }
        this.q = q;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (!this.q) {
            return false;
        }
        final int actionMasked = motionEvent.getActionMasked();
        Label_0058: {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        break Label_0058;
                    }
                    if (actionMasked != 3) {
                        return false;
                    }
                }
                this.f();
                return false;
            }
            this.d = true;
            this.p = false;
        }
        final float d = this.d(0, motionEvent.getX(), (float)view.getWidth(), (float)this.b.getWidth());
        final float d2 = this.d(1, motionEvent.getY(), (float)view.getHeight(), (float)this.b.getHeight());
        final apf a = this.a;
        a.c = d;
        a.d = d2;
        if (!this.e && this.b()) {
            if (this.i == null) {
                this.i = (Runnable)new uw(this, 13);
            }
            this.e = true;
            this.c = true;
            Label_0210: {
                if (!this.p) {
                    final int l = this.l;
                    if (l > 0) {
                        anc.J(this.b, this.i, l);
                        break Label_0210;
                    }
                }
                this.i.run();
            }
            this.p = true;
        }
        return false;
    }
}
