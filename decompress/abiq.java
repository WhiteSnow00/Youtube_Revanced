import android.view.VelocityTracker;
import android.view.View;
import android.view.MotionEvent;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abiq implements ob
{
    final Object a;
    private final int b;
    
    public abiq(final abit a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abiq(final qm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void e(final boolean b) {
        if (this.b != 0) {
            if (!b) {
                return;
            }
            ((qm)this.a).m((oo)null, 0);
        }
    }
    
    public final boolean k(final RecyclerView recyclerView, final MotionEvent motionEvent) {
        if (this.b != 0) {
            ((qm)this.a).s.y(motionEvent);
            final int actionMasked = motionEvent.getActionMasked();
            final qj qj = null;
            if (actionMasked == 0) {
                ((qm)this.a).i = motionEvent.getPointerId(0);
                ((qm)this.a).c = motionEvent.getX();
                ((qm)this.a).d = motionEvent.getY();
                ((qm)this.a).k();
                final qm qm = (qm)this.a;
                if (qm.b == null) {
                    qj qj2;
                    if (qm.l.isEmpty()) {
                        qj2 = qj;
                    }
                    else {
                        final View f = qm.f(motionEvent);
                        int n = qm.l.size() - 1;
                        while (true) {
                            qj2 = qj;
                            if (n < 0) {
                                break;
                            }
                            qj2 = (qj)qm.l.get(n);
                            if (qj2.h.a == f) {
                                break;
                            }
                            --n;
                        }
                    }
                    if (qj2 != null) {
                        final qm qm2 = (qm)this.a;
                        qm2.c -= qj2.l;
                        qm2.d -= qj2.m;
                        qm2.i(qj2.h, true);
                        if (((qm)this.a).a.remove(qj2.h.a)) {
                            final qm qm3 = (qm)this.a;
                            qm3.j.f(qm3.m, qj2.h);
                        }
                        ((qm)this.a).m(qj2.h, qj2.i);
                        final qm qm4 = (qm)this.a;
                        qm4.o(motionEvent, qm4.k, 0);
                    }
                }
            }
            else if (actionMasked != 3 && actionMasked != 1) {
                final int i = ((qm)this.a).i;
                if (i != -1) {
                    final int pointerIndex = motionEvent.findPointerIndex(i);
                    if (pointerIndex >= 0) {
                        ((qm)this.a).h(actionMasked, motionEvent, pointerIndex);
                    }
                }
            }
            else {
                final qm qm5 = (qm)this.a;
                qm5.i = -1;
                qm5.m((oo)null, 0);
            }
            final VelocityTracker o = ((qm)this.a).o;
            if (o != null) {
                o.addMovement(motionEvent);
            }
            return ((qm)this.a).b != null;
        }
        return !((abit)this.a).e.d();
    }
    
    public final void l(final MotionEvent motionEvent) {
        if (this.b != 0) {
            ((qm)this.a).s.y(motionEvent);
            final VelocityTracker o = ((qm)this.a).o;
            if (o != null) {
                o.addMovement(motionEvent);
            }
            if (((qm)this.a).i != -1) {
                final int actionMasked = motionEvent.getActionMasked();
                final int pointerIndex = motionEvent.findPointerIndex(((qm)this.a).i);
                if (pointerIndex >= 0) {
                    ((qm)this.a).h(actionMasked, motionEvent, pointerIndex);
                }
                final qm qm = (qm)this.a;
                final oo b = qm.b;
                if (b != null) {
                    int n = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked != 6) {
                                    return;
                                }
                                final int actionIndex = motionEvent.getActionIndex();
                                final int pointerId = motionEvent.getPointerId(actionIndex);
                                final qm qm2 = (qm)this.a;
                                if (pointerId == qm2.i) {
                                    if (actionIndex == 0) {
                                        n = 1;
                                    }
                                    qm2.i = motionEvent.getPointerId(n);
                                    final qm qm3 = (qm)this.a;
                                    qm3.o(motionEvent, qm3.k, actionIndex);
                                }
                                return;
                            }
                            else {
                                final VelocityTracker o2 = qm.o;
                                if (o2 != null) {
                                    o2.clear();
                                }
                            }
                        }
                        else {
                            if (pointerIndex >= 0) {
                                qm.o(motionEvent, qm.k, pointerIndex);
                                ((qm)this.a).j(b);
                                final qm qm4 = (qm)this.a;
                                qm4.m.removeCallbacks(qm4.n);
                                ((qm)this.a).n.run();
                                ((qm)this.a).m.invalidate();
                            }
                            return;
                        }
                    }
                    ((qm)this.a).m((oo)null, 0);
                    ((qm)this.a).i = -1;
                }
            }
        }
    }
}
