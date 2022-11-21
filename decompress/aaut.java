import android.os.SystemClock;
import java.util.Iterator;
import android.graphics.Bitmap;
import android.content.res.Resources;
import java.util.ArrayList;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaut extends aass implements aauv, aauw
{
    public final aaux a;
    public final aass b;
    public final List c;
    public aaup e;
    public boolean f;
    public boolean g;
    public aaur h;
    public aauq i;
    public aaun j;
    public aaus k;
    public final acjq m;
    private final aasy n;
    private final aarn o;
    private boolean p;
    private boolean q;
    private int r;
    private final aapu s;
    
    public aaut(final Context context, final ViewGroup viewGroup, final aaux a) {
        a.getClass();
        this.a = a;
        final acjq m = new acjq(viewGroup, context, new Handler(Looper.getMainLooper()), a.a.c());
        this.m = m;
        final aass b = new aass();
        this.b = b;
        this.c = new ArrayList();
        final Resources resources = context.getResources();
        final Bitmap d = aavd.d(resources, 2131951714);
        final Bitmap d2 = aavd.d(resources, 2131951715);
        final aavf a2 = a.c.a();
        a2.e(false);
        final aars a3 = A(d, a2, a);
        ((aarh)a3).a((aarg)new aatj((aati)a3, 0.8f, 0.0f));
        final aars a4 = A(d2, a2, a);
        ((aarh)a4).a((aarg)new aatj((aati)a4, 0.0f, 1.0f));
        final aarn o = new aarn(new aasy(a2, 0.0f, 0.0f));
        (this.o = o).m((aatp)a4);
        o.m((aatp)a3);
        this.n = new aasy(a.c.a(), a.h * 3.0f, a.i * 3.0f);
        this.r = a.k;
        a.a(this);
        a.b(this);
        final aass aass = new aass();
        final Handler handler = new Handler(Looper.getMainLooper());
        final aavf a5 = a2.a();
        super.m((aatp)b);
        super.m((aatp)o);
        super.m((aatp)aass);
        this.s = new aapu(aass, m, handler, a5.a(), a, resources.getString(2132020174), null, null);
        this.i(false);
    }
    
    private static aars A(final Bitmap bitmap, final aavf aavf, final aaux aaux) {
        final float n = (float)bitmap.getWidth();
        final Boolean a = aavd.a;
        final aars aars = new aars(bitmap, aave.a(aavd.a(n), aavd.a((float)bitmap.getHeight()), aave.c), aavf, aaux.a.b());
        ((aarh)aars).a((aarg)new aato((aatn)aars, aato.b(0.5f), aato.b(0.05f)));
        return aars;
    }
    
    public final aavf a() {
        return this.a.c;
    }
    
    public final void b(final float n, final float n2) {
        this.n.a(n * 3.0f, n2 * 3.0f);
    }
    
    public final void c(final aatk aatk) {
        this.b.m((aatp)aatk);
        this.j();
    }
    
    public final void g() {
        ((aatr)this.a.b).l = false;
        final aaur h = this.h;
        if (h != null) {
            final aawc aawc = (aawc)h;
            aawc.p = true;
            aawc.i();
        }
    }
    
    public final void h(final boolean b) {
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((aauo)iterator.next()).c(b);
        }
    }
    
    public final void i(final boolean b) {
        final boolean b2 = b ^ true;
        ((aatr)this).l = b2;
        this.q = b2;
    }
    
    public final void j() {
        final aarn o = this.o;
        final Iterator iterator = this.b.iterator();
        while (true) {
            while (iterator.hasNext()) {
                if (!((aatp)iterator.next()).v()) {
                    final boolean l = false;
                    ((aatr)o).l = l;
                    return;
                }
            }
            final boolean l = true;
            continue;
        }
    }
    
    public final void l(final String s, final String s2) {
        final aauq i = this.i;
        if (i == null) {
            tut.b("Attempted to update the video metadata but the listener is null.");
            return;
        }
        final aawc aawc = (aawc)i;
        aawc.f.b(s);
        aawc.f.a(s2);
        aawc.p = false;
    }
    
    public final void o(final foq foq) {
        super.o(foq);
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            if (!((aatk)iterator.next()).h(foq)) {
                return;
            }
        }
        this.a.t(foq);
    }
    
    public final void p(final foq foq) {
        Label_0338: {
            if (!((aatr)this).v()) {
                while (true) {
                    for (final aatp aatp : this.b) {
                        if (aatp instanceof aatk && ((aatk)aatp).g(foq)) {
                            final boolean b = true;
                            while (true) {
                                for (final aatp aatp2 : this.b) {
                                    if (aatp2 instanceof aatk && ((aatk)aatp2).f(foq)) {
                                        final boolean b2 = true;
                                        this.o.rR(this.s() ^ true, foq);
                                        ((aatr)this.o).l = (b || !b2);
                                        final int r = this.r;
                                        if (r != 3) {
                                            if (r != 2) {
                                                if (!this.n.b(foq).c()) {
                                                    if (!this.p) {
                                                        this.p = true;
                                                        final aapu s = this.s;
                                                        ((aatr)s.a).l = false;
                                                        ((Handler)s.c).postAtTime((Runnable)s.b, SystemClock.uptimeMillis() + 5000L);
                                                    }
                                                }
                                                else if (this.p) {
                                                    this.p = false;
                                                    final aapu s2 = this.s;
                                                    ((aatr)s2.a).l = true;
                                                    ((Handler)s2.c).removeCallbacks((Runnable)s2.b);
                                                }
                                            }
                                        }
                                        super.p(foq);
                                        break Label_0338;
                                    }
                                }
                                final boolean b2 = false;
                                continue;
                            }
                        }
                    }
                    final boolean b = false;
                    continue;
                }
            }
        }
        if (this.q) {
            this.a.i(0.0f);
            this.q = false;
        }
    }
    
    public final void rQ() {
        super.rQ();
        this.a.g(this);
        this.a.h(this);
    }
    
    final void t(final boolean f, final boolean g) {
        this.f = f;
        this.g = g;
    }
    
    public final boolean w() {
        final aaup e = this.e;
        return e == null || ((aawc)e).n;
    }
    
    public final boolean x() {
        final aaun j = this.j;
        return j != null && !((aatr)j).v();
    }
    
    public final boolean y() {
        final aaus k = this.k;
        return k != null && ((aaxc)k).i;
    }
    
    public final void z(final int r) {
        this.r = r;
    }
}
