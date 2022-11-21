import android.animation.ValueAnimator$DurationScaleChangeListener;
import android.animation.ValueAnimator;
import android.os.Build$VERSION;
import android.os.SystemClock;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asa implements Runnable
{
    final Object a;
    private final int b;
    
    public asa(final aqw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asa(final asb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asa(final auw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asa(final ave a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asa(final awr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asa(final bfs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asa(final bgb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asa(final bgw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asa(final biy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asa(final bkh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asa(final bkk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asa(final blu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asa(final bor a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asa(final cbp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asa(final cbr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asa(final cby a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asa(final ccs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asa(final ccu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                ((ccu)this.a).b();
                return;
            }
            case 19: {
                ((ccs)this.a).m();
                return;
            }
            case 18: {
                ((cby)this.a).h = -1;
                return;
            }
            case 17: {
                final cbr a = ((cbp)this.a).a;
                if (a.v != null) {
                    a.v = null;
                    if (a.K) {
                        a.oz(a.L);
                    }
                }
                return;
            }
            case 16: {
                final cbr cbr = (cbr)this.a;
                cbr.k(true);
                cbr.n.requestLayout();
                cbr.n.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new jf(cbr, 4));
                return;
            }
            case 15: {
                ((bor)this.a).q = true;
                return;
            }
            case 14: {
                final Object a2 = this.a;
                final bor bor = (bor)a2;
                if (!bor.s) {
                    final bnx i = bor.i;
                    bad.b(i);
                    i.b((bpb)a2);
                }
                return;
            }
            case 13: {
                ((bor)this.a).s();
                return;
            }
            case 12: {
                final Object a3 = this.a;
                synchronized (((blu)a3).a) {
                    if (((blu)a3).h) {
                        return;
                    }
                    final long g = ((blu)a3).g - 1L;
                    ((blu)a3).g = g;
                    if (g > 0L) {
                        return;
                    }
                    if (g < 0L) {
                        final IllegalStateException j = new IllegalStateException();
                        synchronized (((blu)a3).a) {
                            ((blu)a3).i = j;
                            return;
                        }
                    }
                    ((blu)a3).a();
                }
            }
            case 11: {
                ((bkh)this.a).p(null);
                return;
            }
            case 10: {
                final Object a4 = this.a;
                final bkk bkk = (bkk)a4;
                if (bkk.b) {
                    return;
                }
                final bkp a5 = bkk.a;
                if (a5 != null) {
                    a5.p(bkk.d);
                }
                bkk.c.d.remove(a4);
                bkk.b = true;
                return;
            }
            case 9: {
                ((biy)this.a).g(false);
                return;
            }
            case 8: {
                ((biy)this.a).l();
                return;
            }
            case 7: {
                final bgw bgw = (bgw)this.a;
                bgw.ag(bgw.ae(), 1028, (ban)new bep(17));
                bgw.b.k();
                return;
            }
            case 6: {
                ((bgb)this.a).b();
                return;
            }
            case 5: {
                final Object a6 = this.a;
                try {
                    bfc.f((bfs)a6);
                }
                catch (final beh beh) {
                    baq.b("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", (Throwable)beh);
                    throw new RuntimeException((Throwable)beh);
                }
            }
            case 4: {
                final awr awr = (awr)this.a;
                ((abp)awr.e.b).remove((Object)awr.g.a());
                return;
            }
            case 3: {
                final ave ave = (ave)this.a;
                if (ave.c == 0) {
                    ave.d = true;
                    ave.f.e(aui.ON_PAUSE);
                }
                ((ave)this.a).c();
                return;
            }
            case 2: {
                synchronized (((auw)this.a).b) {
                    final Object d = ((auw)this.a).d;
                    ((auw)this.a).d = auw.a;
                    monitorexit(((auw)this.a).b);
                    ((auw)this.a).m(d);
                }
            }
            case 1: {
                final oqz k = ((aqw)this.a).i;
                ((aqw)k.a).d = SystemClock.uptimeMillis();
                final aqw aqw = (aqw)k.a;
                final long d2 = aqw.d;
                final long uptimeMillis = SystemClock.uptimeMillis();
                for (int l = 0; l < aqw.b.size(); ++l) {
                    final aqt aqt = aqw.b.get(l);
                    if (aqt != null) {
                        final Long n = (Long)aqw.a.get((Object)aqt);
                        if (n != null) {
                            if (n >= uptimeMillis) {
                                continue;
                            }
                            aqw.a.remove((Object)aqt);
                        }
                        aqt.a(d2);
                    }
                }
                if (aqw.e) {
                    for (int n2 = aqw.b.size() - 1; n2 >= 0; --n2) {
                        if (aqw.b.get(n2) == null) {
                            aqw.b.remove(n2);
                        }
                    }
                    if (aqw.b.size() == 0 && Build$VERSION.SDK_INT >= 33) {
                        final aqv g2 = aqw.g;
                        ValueAnimator.unregisterDurationScaleChangeListener((ValueAnimator$DurationScaleChangeListener)g2.a);
                        g2.a = null;
                    }
                    aqw.e = false;
                }
                if (((aqw)k.a).b.size() > 0) {
                    final aqw aqw2 = (aqw)k.a;
                    aqw2.h.D(aqw2.c);
                }
                return;
            }
            case 0: {
                ((asb)this.a).a();
            }
        }
    }
}
