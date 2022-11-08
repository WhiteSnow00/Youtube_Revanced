import android.view.ViewGroup$LayoutParams;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lo
{
    public final ln a;
    public final List b;
    public final qpt c;
    
    public lo(final qpt c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.c = c;
        this.a = new ln();
        this.b = new ArrayList();
    }
    
    private final int m(final int n) {
        if (n < 0) {
            return -1;
        }
        int n2;
        for (int ah = this.c.ah(), i = n; i < ah; i += n2) {
            n2 = n - (i - this.a.a(i));
            if (n2 == 0) {
                while (this.a.f(i)) {
                    ++i;
                }
                return i;
            }
        }
        return -1;
    }
    
    public final int a() {
        return this.c.ah() - this.b.size();
    }
    
    public final int b() {
        return this.c.ah();
    }
    
    final int c(final View view) {
        final int ai = this.c.ai(view);
        if (ai == -1) {
            return -1;
        }
        if (this.a.f(ai)) {
            return -1;
        }
        return ai - this.a.a(ai);
    }
    
    public final View d(int m) {
        m = this.m(m);
        return this.c.aj(m);
    }
    
    public final View e(final int n) {
        return this.c.aj(n);
    }
    
    public final void f(final View view, int n, final boolean b) {
        if (n < 0) {
            n = this.c.ah();
        }
        else {
            n = this.m(n);
        }
        this.a.c(n, b);
        if (b) {
            this.i(view);
        }
        final qpt c = this.c;
        ((RecyclerView)c.a).addView(view, n);
        final Object a = c.a;
        RecyclerView.k(view);
        final RecyclerView recyclerView = (RecyclerView)a;
        final List x = recyclerView.x;
        if (x != null) {
            n = x.size();
            while (--n >= 0) {
                ((ny)recyclerView.x.get(n)).a(view);
            }
        }
    }
    
    public final void g(final View view, int n, final ViewGroup$LayoutParams viewGroup$LayoutParams, final boolean b) {
        if (n < 0) {
            n = this.c.ah();
        }
        else {
            n = this.m(n);
        }
        this.a.c(n, b);
        if (b) {
            this.i(view);
        }
        final qpt c = this.c;
        final on k = RecyclerView.k(view);
        if (k != null) {
            if (!k.x() && !k.A()) {
                final StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(k);
                sb.append(((RecyclerView)c.a).o());
                throw new IllegalArgumentException(sb.toString());
            }
            k.j();
        }
        RecyclerView.p((RecyclerView)c.a, view, n, viewGroup$LayoutParams);
    }
    
    final void h(int m) {
        m = this.m(m);
        this.a.g(m);
        final qpt c = this.c;
        final View aj = c.aj(m);
        if (aj != null) {
            final on k = RecyclerView.k(aj);
            if (k != null) {
                if (k.x() && !k.A()) {
                    final StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(k);
                    sb.append(((RecyclerView)c.a).o());
                    throw new IllegalArgumentException(sb.toString());
                }
                k.f(256);
            }
        }
        RecyclerView.q((RecyclerView)c.a, m);
    }
    
    public final void i(final View view) {
        this.b.add(view);
        final qpt c = this.c;
        final on k = RecyclerView.k(view);
        if (k != null) {
            final Object a = c.a;
            final int p = k.p;
            if (p != -1) {
                k.o = p;
            }
            else {
                k.o = ana.d(k.a);
            }
            ((RecyclerView)a).ay(k, 4);
        }
    }
    
    final void j(int m) {
        m = this.m(m);
        final View aj = this.c.aj(m);
        if (aj == null) {
            return;
        }
        if (this.a.g(m)) {
            this.l(aj);
        }
        this.c.al(m);
    }
    
    public final boolean k(final View view) {
        return this.b.contains(view);
    }
    
    public final void l(final View view) {
        if (this.b.remove(view)) {
            this.c.ak(view);
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        sb.append(", hidden list:");
        sb.append(this.b.size());
        return sb.toString();
    }
}
