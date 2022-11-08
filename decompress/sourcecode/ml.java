import android.widget.ListView;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ml implements View$OnTouchListener, View$OnAttachStateChangeListener
{
    private final float a;
    private final int b;
    public final View c;
    public boolean d;
    private final int e;
    private Runnable f;
    private Runnable g;
    private int h;
    private final int[] i;
    
    public ml(final View c) {
        this.i = new int[2];
        (this.c = c).setLongClickable(true);
        c.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        this.a = (float)ViewConfiguration.get(c.getContext()).getScaledTouchSlop();
        final int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.e = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }
    
    public abstract jd a();
    
    public boolean b() {
        throw null;
    }
    
    protected boolean c() {
        final jd a = this.a();
        if (a != null && a.x()) {
            a.m();
        }
        return true;
    }
    
    public final void d() {
        final Runnable g = this.g;
        if (g != null) {
            this.c.removeCallbacks(g);
        }
        final Runnable f = this.f;
        if (f != null) {
            this.c.removeCallbacks(f);
        }
    }
    
    public final boolean onTouch(View c, final MotionEvent motionEvent) {
        final boolean d = this.d;
        boolean d2 = false;
        Label_0509: {
            if (d) {
                final View c2 = this.c;
                final jd a = this.a();
                Label_0189: {
                    if (a != null) {
                        if (a.x()) {
                            final ListView kd = a.kD();
                            if (kd != null) {
                                final mh mh = (mh)kd;
                                if (mh.isShown()) {
                                    final MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                                    final int[] i = this.i;
                                    c2.getLocationOnScreen(i);
                                    obtainNoHistory.offsetLocation((float)i[0], (float)i[1]);
                                    final int[] j = this.i;
                                    ((View)kd).getLocationOnScreen(j);
                                    obtainNoHistory.offsetLocation((float)(-j[0]), (float)(-j[1]));
                                    final boolean a2 = mh.a(obtainNoHistory, this.h);
                                    obtainNoHistory.recycle();
                                    final int actionMasked = motionEvent.getActionMasked();
                                    final boolean b = actionMasked != 1 && actionMasked != 3;
                                    if (a2 && b) {
                                        break Label_0189;
                                    }
                                }
                            }
                        }
                    }
                    if (this.c()) {
                        d2 = false;
                        break Label_0509;
                    }
                }
                d2 = true;
            }
            else {
                c = this.c;
                boolean b2 = false;
                Label_0466: {
                    Label_0213: {
                        if (c.isEnabled()) {
                            final int actionMasked2 = motionEvent.getActionMasked();
                            if (actionMasked2 != 0) {
                                if (actionMasked2 != 1) {
                                    if (actionMasked2 != 2) {
                                        if (actionMasked2 != 3) {
                                            break Label_0213;
                                        }
                                    }
                                    else {
                                        final int pointerIndex = motionEvent.findPointerIndex(this.h);
                                        if (pointerIndex < 0) {
                                            break Label_0213;
                                        }
                                        final float x = motionEvent.getX(pointerIndex);
                                        final float y = motionEvent.getY(pointerIndex);
                                        final float a3 = this.a;
                                        final float n = -a3;
                                        if (x >= n && y >= n && x < c.getRight() - c.getLeft() + a3 && y < c.getBottom() - c.getTop() + a3) {
                                            break Label_0213;
                                        }
                                        this.d();
                                        c.getParent().requestDisallowInterceptTouchEvent(true);
                                        if (this.b()) {
                                            b2 = true;
                                            break Label_0466;
                                        }
                                        break Label_0213;
                                    }
                                }
                                this.d();
                            }
                            else {
                                this.h = motionEvent.getPointerId(0);
                                if (this.f == null) {
                                    this.f = new be(this, 12);
                                }
                                c.postDelayed(this.f, (long)this.b);
                                if (this.g == null) {
                                    this.g = new be(this, 13);
                                }
                                c.postDelayed(this.g, (long)this.e);
                            }
                        }
                    }
                    b2 = false;
                }
                d2 = b2;
                if (b2) {
                    final long uptimeMillis = SystemClock.uptimeMillis();
                    final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    this.c.onTouchEvent(obtain);
                    obtain.recycle();
                    d2 = b2;
                }
            }
        }
        this.d = d2;
        return d2 || d;
    }
    
    public final void onViewAttachedToWindow(final View view) {
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        this.d = false;
        this.h = -1;
        final Runnable f = this.f;
        if (f != null) {
            this.c.removeCallbacks(f);
        }
    }
}
