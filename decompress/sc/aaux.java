import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.GestureDetector$OnGestureListener;
import android.content.Context;
import android.view.ScaleGestureDetector;
import android.view.GestureDetector;
import android.view.View;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaux extends GestureDetector$SimpleOnGestureListener implements View$OnTouchListener, ScaleGestureDetector$OnScaleGestureListener
{
    public aaut a;
    public boolean b;
    private View c;
    private final GestureDetector d;
    private boolean e;
    private final ScaleGestureDetector f;
    private boolean g;
    
    public aaux(final Context context) {
        this.e = false;
        this.g = false;
        this.b = false;
        context.getClass();
        (this.d = new GestureDetector(context, (GestureDetector$OnGestureListener)this)).setIsLongpressEnabled(false);
        this.f = new ScaleGestureDetector(context, (ScaleGestureDetector$OnScaleGestureListener)this);
    }
    
    private static final void a(final View view, final boolean b) {
        final ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(b);
        }
    }
    
    public final boolean onDown(final MotionEvent motionEvent) {
        if (this.a != null) {
            a(this.c, true);
            final aaut a = this.a;
            final int n = (int)motionEvent.getX();
            final int n2 = (int)motionEvent.getY();
            this.c.getWidth();
            this.c.getHeight();
            final aapn g = ((aauw)a).a.g;
            if (g != null) {
                g.b.g(n, n2);
            }
        }
        return false;
    }
    
    public final boolean onScale(final ScaleGestureDetector scaleGestureDetector) {
        final View c = this.c;
        final boolean b = true;
        a(c, true);
        this.e = false;
        final aaut a = this.a;
        final float scaleFactor = scaleGestureDetector.getScaleFactor();
        final aapn g = ((aauw)a).a.g;
        if (g != null) {
            final aase b2 = g.b;
            if (!b2.c) {
                b2.c();
            }
            final float n = (float)Math.pow(scaleFactor, 1.2000000476837158);
            final float n2 = b2.f / n;
            float e = 0.0f;
            Label_0181: {
                if (n2 <= 0.69816f) {
                    e = 0.69815f;
                    b2.f = n * 0.69815f;
                }
                else if (n2 >= 2.35617f) {
                    e = 2.35618f;
                    b2.f = n * 2.35618f;
                }
                else {
                    final float e2 = b2.e;
                    if (e2 >= 1.74533f || n2 < 1.74533f) {
                        e = n2;
                        if (e2 <= 1.74533f) {
                            break Label_0181;
                        }
                        e = n2;
                        if (n2 > 1.74533f) {
                            break Label_0181;
                        }
                    }
                    b2.f(b2.p);
                    b2.b = true;
                    e = n2;
                }
            }
            b2.e = e;
            b2.r = (b2.r || (b2.g < e && e < 2.1816635f) || (e > 0.8726665f && e < b2.h));
            b2.b = (b2.b && Math.abs(e - 1.74533f) < 0.2094395f && b);
        }
        return false;
    }
    
    public final boolean onScaleBegin(final ScaleGestureDetector scaleGestureDetector) {
        this.g = true;
        final aapn g = ((aauw)this.a).a.g;
        if (g != null) {
            g.b.c();
        }
        return true;
    }
    
    public final void onScaleEnd(final ScaleGestureDetector scaleGestureDetector) {
        final aapn g = ((aauw)this.a).a.g;
        if (g != null) {
            final aase b = g.b;
            if (b.b && Math.abs(b.e - 1.74533f) < 0.2094395f) {
                b.e = 1.74533f;
            }
            final float e = b.e;
            boolean j = true;
            if (e > 0.78541f) {
                j = (e >= 2.26892f && j);
            }
            b.j = j;
            b.o = b.a.a() + 100000008L;
            b.c = false;
        }
        this.g = false;
    }
    
    public final boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        final aaut a = this.a;
        if (a != null) {
            this.e = true;
            final int n3 = (int)motionEvent2.getX();
            final int n4 = (int)motionEvent2.getY();
            final int width = this.c.getWidth();
            final int height = this.c.getHeight();
            final aapn g = ((aauw)a).a.g;
            if (g != null) {
                final aase b = g.b;
                if (!b.k || Math.abs(b.l - n3) > 100 || Math.abs(b.m - n4) > 100) {
                    b.g(n3, n4);
                }
                b.e(n3, n4, width, height);
            }
            return true;
        }
        return false;
    }
    
    public final boolean onTouch(final View c, final MotionEvent motionEvent) {
        this.c = c;
        final int action = motionEvent.getAction();
        final boolean b = true;
        if (action != 1 && motionEvent.getAction() != 3) {
            if (this.b) {
                this.f.onTouchEvent(motionEvent);
            }
            if (!this.g) {
                this.d.onTouchEvent(motionEvent);
            }
            return this.g || this.e;
        }
        boolean b2;
        if (this.e) {
            this.e = false;
            final aaut a = this.a;
            b2 = b;
            if (a != null) {
                final int n = (int)motionEvent.getX();
                final int n2 = (int)motionEvent.getY();
                final int width = c.getWidth();
                final int height = c.getHeight();
                final aapn g = ((aauw)a).a.g;
                b2 = b;
                if (g != null) {
                    final aase b3 = g.b;
                    if (Math.abs(b3.l - n) < 100 && Math.abs(b3.m - n2) < 100) {
                        b3.e(n, n2, width, height);
                    }
                    if (b3.E > 0) {
                        final boolean d = b3.d;
                        float n3 = 0.0f;
                        if (!d || b3.n >= 500) {
                            float n4 = 0.0f;
                            for (int i = 0; i < 5; ++i) {
                                n4 += b3.C[i];
                                n3 += b3.D[i];
                            }
                            final float n5 = (float)b3.E;
                            b3.y = n4 / n5;
                            b3.z = n3 / n5;
                        }
                    }
                    final long a2 = b3.a.a();
                    b3.B = a2;
                    b3.A = a2;
                    if (b3.d) {
                        b3.o = a2;
                    }
                    b3.k = false;
                    b3.d = false;
                    b2 = b;
                }
            }
        }
        else {
            b2 = false;
        }
        a(this.c, false);
        return b2;
    }
}
