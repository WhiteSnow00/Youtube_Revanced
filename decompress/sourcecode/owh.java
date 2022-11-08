import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class owh extends hw
{
    final /* synthetic */ owj a;
    
    public owh(final owj a) {
        this.a = a;
    }
    
    private final void i(final int n) {
        final int size = this.a.j.size();
        int a = -1;
        if (size > 0) {
            a = this.a.j.get(size - 1).a;
        }
        final Object item = ((aciw)this.a.p.a).getItem(n);
        zhb zhb;
        if (item != null) {
            zhb = this.a.a.get(item.getClass());
        }
        else {
            zhb = null;
        }
        if (n <= a) {
            int i;
            int n2;
            for (n2 = (i = this.a.b(n)); i < this.a.j.size(); ++i) {
                final adxi adxi = this.a.j.get(i);
                ++adxi.a;
            }
            if (zhb != null) {
                this.a.j.add(n2, new adxi(n, zhb, item, null, null));
            }
        }
        else if (zhb != null) {
            this.a.j.add(new adxi(n, zhb, item, null, null));
        }
        owj.g(this.a);
        final owj a2 = this.a;
        final int n3 = a2.n;
        if (n <= n3) {
            a2.n = n3 + 1;
        }
        final int o = a2.o;
        if (n <= o) {
            a2.o = o + 1;
        }
    }
    
    private final void j(final int n) {
        owj.g(this.a);
        final owj a = this.a;
        final int n2 = a.n;
        if (n < n2) {
            a.n = n2 - 1;
        }
        final int o = a.o;
        if (n < o) {
            a.o = o - 1;
        }
        final int size = a.j.size();
        int a2;
        if (size > 0) {
            a2 = this.a.j.get(size - 1).a;
        }
        else {
            a2 = -1;
        }
        if (n > a2) {
            return;
        }
        final int b = this.a.b(n);
        final adxi adxi = this.a.j.get(b);
        int i = b;
        if (adxi.a == n) {
            this.a.j.remove(b);
            i = b;
            if (adxi.b) {
                ((owp)adxi.c).b();
                i = b;
            }
        }
        while (i < this.a.j.size()) {
            final adxi adxi2 = this.a.j.get(i);
            --adxi2.a;
            ++i;
        }
    }
    
    public final void c() {
        final ArrayList j = this.a.j;
        for (int size = j.size(), i = 0; i < size; ++i) {
            final adxi adxi = (adxi)j.get(i);
            if (adxi.b) {
                ((owp)adxi.c).b();
                adxi.b = false;
            }
        }
        this.a.j.clear();
        this.f(0, this.a.b.a());
        final owj a = this.a;
        a.n = -1;
        a.o = -1;
        a.c();
    }
    
    public final void d(final int n, final int n2) {
        for (int i = 0; i < n2; ++i) {
            final int n3 = n + i;
            this.j(n3);
            this.i(n3);
        }
        this.a.c();
    }
    
    public final void e(final int n, final int n2, final Object o) {
        this.d(n, n2);
    }
    
    public final void f(final int n, final int n2) {
        for (int i = 0; i < n2; ++i) {
            this.i(n + i);
        }
        this.a.c();
    }
    
    public final void g(final int n, final int n2) {
        for (int i = 0; i < n2; ++i) {
            this.j(n);
        }
        this.a.c();
    }
    
    public final void h(final int n, final int n2) {
        final int n3 = 0;
        int n4 = 0;
        int i;
        while (true) {
            i = n3;
            if (n4 > 0) {
                break;
            }
            this.j(n);
            ++n4;
        }
        while (i <= 0) {
            this.i(n2 + i);
            ++i;
        }
        this.a.c();
    }
}
