import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import android.os.Handler;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.IdentityHashMap;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bfl
{
    public final List a;
    public final IdentityHashMap b;
    public final Map c;
    public final bfk d;
    public final bny e;
    public final HashMap f;
    public final Set g;
    public boolean h;
    public bcn i;
    public eg j;
    public final trg k;
    private final bgz l;
    
    public bfl(final bfk d, final bfz bfz, final Handler handler, final bgz l) {
        this.l = l;
        this.d = d;
        this.j = new eg();
        this.b = new IdentityHashMap();
        this.c = new HashMap();
        this.a = new ArrayList();
        final bny e = new bny();
        this.e = e;
        final trg k = new trg();
        this.k = k;
        this.f = new HashMap();
        this.g = new HashSet();
        e.b(handler, (bnz)bfz);
        k.o(handler, (bkm)bfz);
    }
    
    private final void h(int i, final int n) {
        while (i < this.a.size()) {
            final bfj bfj = this.a.get(i);
            bfj.d += n;
            ++i;
        }
    }
    
    private final void i(final bfj bfj) {
        final alm alm = this.f.get(bfj);
        if (alm != null) {
            ((bnx)alm.c).t((bnw)alm.b);
        }
    }
    
    private final void j(final bfj bfj) {
        if (bfj.e && bfj.c.isEmpty()) {
            final alm alm = this.f.remove(bfj);
            dk.d((Object)alm);
            ((bnx)alm.c).z((bnw)alm.b);
            ((bnx)alm.c).B((bnz)alm.a);
            ((bnx)alm.c).A((bkm)alm.a);
            this.g.remove(bfj);
        }
    }
    
    public final int a() {
        return this.a.size();
    }
    
    public final azl b() {
        if (!this.a.isEmpty()) {
            int i = 0;
            int d = 0;
            while (i < this.a.size()) {
                final bfj bfj = this.a.get(i);
                bfj.d = d;
                d += ((azl)bfj.a.b).c();
                ++i;
            }
            return (azl)new bdr((Collection)this.a, this.j, (byte[])null, (byte[])null);
        }
        return azl.a;
    }
    
    public final void c() {
        final Iterator iterator = this.g.iterator();
        while (iterator.hasNext()) {
            final bfj bfj = (bfj)iterator.next();
            if (bfj.c.isEmpty()) {
                this.i(bfj);
                iterator.remove();
            }
        }
    }
    
    public final void d(final bfj bfj) {
        final bnr a = bfj.a;
        final bfh bfh = new bfh(this);
        final bfi bfi = new bfi(this, bfj);
        this.f.put(bfj, new alm((bnx)a, (bnw)bfh, bfi));
        ((bnx)a).s(baw.G(), (bnz)bfi);
        ((bnx)a).sP(baw.G(), (bkm)bfi);
        ((bnx)a).x((bnw)bfh, this.i, this.l);
    }
    
    public final void e(final bnu bnu) {
        final bfj bfj = this.b.remove(bnu);
        dk.d((Object)bfj);
        bfj.a.sM(bnu);
        bfj.c.remove(((bno)bnu).e);
        if (!this.b.isEmpty()) {
            this.c();
        }
        this.j(bfj);
    }
    
    public final void f(final int n, int n2) {
        while (true) {
            final int n3 = n2 - 1;
            if (n3 < n) {
                break;
            }
            final bfj bfj = this.a.remove(n3);
            this.c.remove(bfj.b);
            this.h(n3, -((azl)bfj.a.b).c());
            bfj.e = true;
            n2 = n3;
            if (!this.h) {
                continue;
            }
            this.j(bfj);
            n2 = n3;
        }
    }
    
    public final azl g(final int n, final List list, final eg j) {
        if (!list.isEmpty()) {
            this.j = j;
            for (int i = n; i < list.size() + n; ++i) {
                final bfj bfj = list.get(i - n);
                if (i > 0) {
                    final bfj bfj2 = this.a.get(i - 1);
                    bfj.c(bfj2.d + ((azl)bfj2.a.b).c());
                }
                else {
                    bfj.c(0);
                }
                this.h(i, ((azl)bfj.a.b).c());
                this.a.add(i, bfj);
                this.c.put(bfj.b, bfj);
                if (this.h) {
                    this.d(bfj);
                    if (this.b.isEmpty()) {
                        this.g.add(bfj);
                    }
                    else {
                        this.i(bfj);
                    }
                }
            }
        }
        return this.b();
    }
}
