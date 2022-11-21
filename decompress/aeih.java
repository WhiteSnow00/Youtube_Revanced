import android.view.ViewPropertyAnimator;
import java.util.List;
import android.animation.Animator$AnimatorListener;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeih implements View$OnTouchListener
{
    public final long a;
    public final View b;
    private final int c;
    private final int d;
    private final int e;
    private int f;
    private float g;
    private float h;
    private boolean i;
    private int j;
    private VelocityTracker k;
    private float l;
    private final oqz m;
    
    public aeih(final View b, final oqz m, final byte[] array, final byte[] array2) {
        this.f = 1;
        final ViewConfiguration value = ViewConfiguration.get(b.getContext());
        this.c = value.getScaledTouchSlop();
        this.d = value.getScaledMinimumFlingVelocity() * 16;
        this.e = value.getScaledMaximumFlingVelocity();
        this.a = b.getContext().getResources().getInteger(17694720);
        this.b = b;
        this.m = m;
    }
    
    public final boolean onTouch(View b, final MotionEvent motionEvent) {
        motionEvent.offsetLocation(this.l, 0.0f);
        if (this.f < 2) {
            this.f = this.b.getWidth();
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        if (this.k != null) {
                            this.b.animate().translationX(0.0f).alpha(1.0f).setDuration(this.a).setListener((Animator$AnimatorListener)null);
                            this.k.recycle();
                            this.k = null;
                            this.l = 0.0f;
                            this.g = 0.0f;
                            this.h = 0.0f;
                            this.i = false;
                        }
                    }
                }
                else {
                    final VelocityTracker k = this.k;
                    if (k != null) {
                        k.addMovement(motionEvent);
                        final float l = motionEvent.getRawX() - this.g;
                        final float rawY = motionEvent.getRawY();
                        final float h = this.h;
                        if (Math.abs(l) > this.c && Math.abs(rawY - h) < Math.abs(l) / 2.0f) {
                            this.i = true;
                            int c;
                            if (l > 0.0f) {
                                c = this.c;
                            }
                            else {
                                c = -this.c;
                            }
                            this.j = c;
                            this.b.getParent().requestDisallowInterceptTouchEvent(true);
                            final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.setAction(motionEvent.getActionIndex() << 8 | 0x3);
                            this.b.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (this.i) {
                            this.l = l;
                            this.b.setTranslationX(l - this.j);
                            b = this.b;
                            final float abs = Math.abs(l);
                            b.setAlpha(Math.max(0.0f, Math.min(1.0f, 1.0f - (abs + abs) / this.f)));
                            return true;
                        }
                    }
                }
            }
            else if (this.k != null) {
                final float n = motionEvent.getRawX() - this.g;
                this.k.addMovement(motionEvent);
                this.k.computeCurrentVelocity(1000);
                final float xVelocity = this.k.getXVelocity();
                final float abs2 = Math.abs(xVelocity);
                final float abs3 = Math.abs(this.k.getYVelocity());
                boolean b2 = false;
                int n2 = 0;
                Label_0569: {
                    if (Math.abs(n) > this.f / 2) {
                        b2 = (n > 0.0f);
                        n2 = 1;
                    }
                    else {
                        int n3;
                        if (this.d <= abs2 && abs2 <= this.e && abs3 < abs2 && abs3 < abs2 && this.i) {
                            if (xVelocity < 0.0f == n < 0.0f) {
                                n2 = 1;
                            }
                            else {
                                n2 = 0;
                            }
                            n3 = n2;
                            if (this.k.getXVelocity() > 0.0f) {
                                b2 = true;
                                break Label_0569;
                            }
                        }
                        else {
                            n3 = 0;
                        }
                        b2 = false;
                        n2 = n3;
                    }
                }
                if (n2 != 0) {
                    final oqz m = this.m;
                    final iud iud = (iud)m.a;
                    iud.d = true;
                    iud.c(false);
                    final xsj e = ((iud)m.a).e;
                    if (e != null) {
                        final vaf c2 = ((vac)e.a).c;
                        final arjd i = c2.m();
                        if (i != null && c2.n(i)) {
                            c2.t.x((List)i.g().g);
                        }
                    }
                    final ViewPropertyAnimator animate = this.b.animate();
                    int f;
                    if (b2) {
                        f = this.f;
                    }
                    else {
                        f = -this.f;
                    }
                    animate.translationX((float)f).alpha(0.0f).setDuration(this.a).setListener((Animator$AnimatorListener)new aeif(this));
                }
                else if (this.i) {
                    this.b.animate().translationX(0.0f).alpha(1.0f).setDuration(this.a).setListener((Animator$AnimatorListener)null);
                }
                this.k.recycle();
                this.k = null;
                this.l = 0.0f;
                this.g = 0.0f;
                this.h = 0.0f;
                this.i = false;
            }
            return false;
        }
        this.g = motionEvent.getRawX();
        this.h = motionEvent.getRawY();
        (this.k = VelocityTracker.obtain()).addMovement(motionEvent);
        return false;
    }
}
