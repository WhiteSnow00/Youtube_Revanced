import android.view.KeyEvent;
import android.view.ViewTreeObserver$OnDrawListener;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abuv implements Runnable
{
    public final Object a;
    private final int b;
    
    public abuv(final abux a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abuv(final abze a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abuv(final abzf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abuv(final abzi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abuv(final abzu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abuv(final acll a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abuv(final acoj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abuv(final acsn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abuv(final actl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abuv(final acua a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abuv(final acyu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abuv(final acyy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abuv(final aczh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abuv(final aczi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abuv(final RecyclerView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abuv(final gry a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public abuv(final tan a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                ((aczi)((gry)this.a).a).d.b();
                return;
            }
            case 19: {
                ((aczi)((gry)this.a).a).e.b();
                return;
            }
            case 18: {
                ((aczh)this.a).c();
                return;
            }
            case 17: {
                ((aczi)this.a).d.c();
                return;
            }
            case 16: {
                ((acyy)this.a).i();
                return;
            }
            case 15: {
                ((acyu)this.a).b.release();
                return;
            }
            case 14: {
                final Object a = this.a;
                ((acua)a).b.getViewTreeObserver().removeOnDrawListener((ViewTreeObserver$OnDrawListener)a);
                return;
            }
            case 13: {
                ((RecyclerView)this.a).requestLayout();
                return;
            }
            case 12: {
                ((actl)this.a).e.dispatchKeyEvent(new KeyEvent(0, 67));
                ((actl)this.a).a.postDelayed((Runnable)this, 100L);
                return;
            }
            case 11: {
                ((bi)this.a).dismiss();
                return;
            }
            case 10: {
                final acoj acoj = (acoj)this.a;
                final acov c = acoj.c;
                c.af(acoj.b, (aiqj)null, (ttg)xpx.m, c.Y(), new acoo(true));
                return;
            }
            case 9: {
                ((acll)this.a).d();
                return;
            }
            case 8: {
                final abzu abzu = (abzu)this.a;
                abzu.d(abzu.j);
                if (abzu.g <= abzu.e) {
                    if (abzu.f > abzu.c || abzu.h > abzu.d) {
                        abzu.b();
                        abzv.a(abzu.i);
                        abzu.i.notifyObservers((Object)abzu.a);
                        return;
                    }
                }
                ttr.b("VideoQualityPromoRenderer triggered when criteria not met.");
                return;
            }
            case 7: {
                ((abzf)this.a).a.d();
                return;
            }
            case 6: {
                ((abze)this.a).c();
                return;
            }
            case 5: {
                ((abze)this.a).a();
                return;
            }
            case 4: {
                final Object a2 = this.a;
                tbi.f();
                final abzi abzi = (abzi)a2;
                if (abzi.e == null) {
                    if (abzi.d) {
                        abzi.f = (abzd)abzi.h.poll();
                        final abzd f = abzi.f;
                        if (f != null) {
                            final abzg e = new abzg(abzi);
                            abzi.e = e;
                            if (!abzi.g) {
                                abzi.g = true;
                                abzi.a.d();
                            }
                            f.b(e);
                            return;
                        }
                        if (abzi.g) {
                            abzi.g = false;
                            abzi.a.a();
                        }
                    }
                }
                return;
            }
            case 3: {
                ((rqh)((tan)this.a).a).o();
                return;
            }
            case 2: {
                ((rqh)((tan)this.a).a).n();
                return;
            }
            case 1: {
                final abux abux = (abux)this.a;
                final eg d = abux.d;
                if (d != null) {
                    final bx f2 = abux.f;
                    if (f2 != null) {
                        d.h(f2.e());
                    }
                }
                abux.f = null;
                return;
            }
            case 0: {
                final abux abux2 = (abux)this.a;
                final eg d2 = abux2.d;
                if (d2 != null && d2.k()) {
                    final ej e2 = abux2.e;
                    if (e2 != null) {
                        abux2.d.i(e2.a());
                    }
                }
                abux2.e = null;
            }
        }
    }
}
