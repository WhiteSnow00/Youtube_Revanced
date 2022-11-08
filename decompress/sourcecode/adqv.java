import android.view.ViewConfiguration;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.widget.OverScroller;

// 
// Decompiled by Procyon v0.6.0
// 

public class adqv extends adqy
{
    private Runnable a;
    private boolean b;
    private int c;
    OverScroller d;
    private int e;
    private int f;
    private VelocityTracker g;
    
    public adqv() {
        this.c = -1;
        this.f = -1;
    }
    
    public adqv(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = -1;
        this.f = -1;
    }
    
    public void B(final CoordinatorLayout coordinatorLayout, final View view) {
        throw null;
    }
    
    public boolean D(final View view) {
        throw null;
    }
    
    public final int G(final CoordinatorLayout coordinatorLayout, final View view, final int n, final int n2, final int n3) {
        return this.z(coordinatorLayout, view, this.y() - n, n2, n3);
    }
    
    public final void H(final CoordinatorLayout coordinatorLayout, final View view, final int n) {
        this.z(coordinatorLayout, view, n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public final boolean m(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        int n2 = 0;
        Label_0341: {
            int n4 = 0;
            Label_0305: {
                Label_0080: {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                break Label_0080;
                            }
                            if (actionMasked == 6) {
                                int n;
                                if (motionEvent.getActionIndex() == 0) {
                                    n = 1;
                                }
                                else {
                                    n = 0;
                                }
                                this.c = motionEvent.getPointerId(n);
                                this.e = (int)(motionEvent.getY(n) + 0.5f);
                            }
                        }
                        else {
                            final int pointerIndex = motionEvent.findPointerIndex(this.c);
                            if (pointerIndex == -1) {
                                return false;
                            }
                            final int e = (int)motionEvent.getY(pointerIndex);
                            final int e2 = this.e;
                            this.e = e;
                            this.G(coordinatorLayout, view, e2 - e, this.w(view), 0);
                        }
                        n2 = 0;
                        break Label_0341;
                    }
                    final VelocityTracker g = this.g;
                    if (g != null) {
                        g.addMovement(motionEvent);
                        this.g.computeCurrentVelocity(1000);
                        final float yVelocity = this.g.getYVelocity(this.c);
                        final int n3 = -this.x(view);
                        final Runnable a = this.a;
                        if (a != null) {
                            view.removeCallbacks(a);
                            this.a = null;
                        }
                        if (this.d == null) {
                            this.d = new OverScroller(view.getContext());
                        }
                        this.d.fling(0, this.I(), 0, Math.round(yVelocity), 0, 0, n3, 0);
                        if (this.d.computeScrollOffset()) {
                            ana.I(view, this.a = (Runnable)new adqu(this, coordinatorLayout, view));
                        }
                        else {
                            this.B(coordinatorLayout, view);
                        }
                        n4 = 1;
                        break Label_0305;
                    }
                }
                n4 = 0;
            }
            this.b = false;
            this.c = -1;
            final VelocityTracker g2 = this.g;
            n2 = n4;
            if (g2 != null) {
                g2.recycle();
                this.g = null;
                n2 = n4;
            }
        }
        final VelocityTracker g3 = this.g;
        if (g3 != null) {
            g3.addMovement(motionEvent);
        }
        return this.b || n2 != 0;
    }
    
    public final boolean qF(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.b) {
            final int c = this.c;
            if (c == -1) {
                return false;
            }
            final int pointerIndex = motionEvent.findPointerIndex(c);
            if (pointerIndex == -1) {
                return false;
            }
            final int e = (int)motionEvent.getY(pointerIndex);
            if (Math.abs(e - this.e) > this.f) {
                this.e = e;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.c = -1;
            final int n = (int)motionEvent.getX();
            final int e2 = (int)motionEvent.getY();
            final boolean b = this.D(view) && coordinatorLayout.l(view, n, e2);
            this.b = b;
            if (b) {
                this.e = e2;
                this.c = motionEvent.getPointerId(0);
                if (this.g == null) {
                    this.g = VelocityTracker.obtain();
                }
                final OverScroller d = this.d;
                if (d != null) {
                    if (!d.isFinished()) {
                        this.d.abortAnimation();
                        return true;
                    }
                }
            }
        }
        final VelocityTracker g = this.g;
        if (g != null) {
            g.addMovement(motionEvent);
        }
        return false;
    }
    
    public int w(final View view) {
        throw null;
    }
    
    public int x(final View view) {
        throw null;
    }
    
    public int y() {
        throw null;
    }
    
    public int z(final CoordinatorLayout coordinatorLayout, final View view, final int n, final int n2, final int n3) {
        throw null;
    }
}
