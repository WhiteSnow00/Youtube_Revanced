import android.view.VelocityTracker;
import android.view.View;
import android.view.MotionEvent;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abfo implements oa
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public abfo(final abfr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abfo(final ql a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void e(final boolean b) {
        if (this.b != 0) {
            if (!b) {
                return;
            }
            ((ql)this.a).m((on)null, 0);
        }
    }
    
    public final boolean k(final RecyclerView recyclerView, final MotionEvent motionEvent) {
        if (this.b != 0) {
            ((ql)this.a).s.y(motionEvent);
            final int actionMasked = motionEvent.getActionMasked();
            final qi qi = null;
            if (actionMasked == 0) {
                ((ql)this.a).i = motionEvent.getPointerId(0);
                ((ql)this.a).c = motionEvent.getX();
                ((ql)this.a).d = motionEvent.getY();
                ((ql)this.a).k();
                final ql ql = (ql)this.a;
                if (ql.b == null) {
                    qi qi2;
                    if (ql.l.isEmpty()) {
                        qi2 = qi;
                    }
                    else {
                        final View f = ql.f(motionEvent);
                        int n = ql.l.size() - 1;
                        while (true) {
                            qi2 = qi;
                            if (n < 0) {
                                break;
                            }
                            qi2 = (qi)ql.l.get(n);
                            if (qi2.h.a == f) {
                                break;
                            }
                            --n;
                        }
                    }
                    if (qi2 != null) {
                        final ql ql2 = (ql)this.a;
                        ql2.c -= qi2.l;
                        ql2.d -= qi2.m;
                        ql2.i(qi2.h, true);
                        if (((ql)this.a).a.remove(qi2.h.a)) {
                            final ql ql3 = (ql)this.a;
                            ql3.j.f(ql3.m, qi2.h);
                        }
                        ((ql)this.a).m(qi2.h, qi2.i);
                        final ql ql4 = (ql)this.a;
                        ql4.o(motionEvent, ql4.k, 0);
                    }
                }
            }
            else if (actionMasked != 3 && actionMasked != 1) {
                final int i = ((ql)this.a).i;
                if (i != -1) {
                    final int pointerIndex = motionEvent.findPointerIndex(i);
                    if (pointerIndex >= 0) {
                        ((ql)this.a).h(actionMasked, motionEvent, pointerIndex);
                    }
                }
            }
            else {
                final ql ql5 = (ql)this.a;
                ql5.i = -1;
                ql5.m((on)null, 0);
            }
            final VelocityTracker o = ((ql)this.a).o;
            if (o != null) {
                o.addMovement(motionEvent);
            }
            return ((ql)this.a).b != null;
        }
        return !((abfr)this.a).e.d();
    }
    
    public final void l(final MotionEvent motionEvent) {
        if (this.b != 0) {
            ((ql)this.a).s.y(motionEvent);
            final VelocityTracker o = ((ql)this.a).o;
            if (o != null) {
                o.addMovement(motionEvent);
            }
            if (((ql)this.a).i != -1) {
                final int actionMasked = motionEvent.getActionMasked();
                final int pointerIndex = motionEvent.findPointerIndex(((ql)this.a).i);
                if (pointerIndex >= 0) {
                    ((ql)this.a).h(actionMasked, motionEvent, pointerIndex);
                }
                final ql ql = (ql)this.a;
                final on b = ql.b;
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
                                final ql ql2 = (ql)this.a;
                                if (pointerId == ql2.i) {
                                    if (actionIndex == 0) {
                                        n = 1;
                                    }
                                    ql2.i = motionEvent.getPointerId(n);
                                    final ql ql3 = (ql)this.a;
                                    ql3.o(motionEvent, ql3.k, actionIndex);
                                }
                                return;
                            }
                            else {
                                final VelocityTracker o2 = ql.o;
                                if (o2 != null) {
                                    o2.clear();
                                }
                            }
                        }
                        else {
                            if (pointerIndex >= 0) {
                                ql.o(motionEvent, ql.k, pointerIndex);
                                ((ql)this.a).j(b);
                                final ql ql4 = (ql)this.a;
                                ql4.m.removeCallbacks(ql4.n);
                                ((ql)this.a).n.run();
                                ((ql)this.a).m.invalidate();
                            }
                            return;
                        }
                    }
                    ((ql)this.a).m((on)null, 0);
                    ((ql)this.a).i = -1;
                }
            }
        }
    }
}
