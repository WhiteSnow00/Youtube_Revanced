import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adad
{
    public String a;
    public String b;
    public int c;
    public Object d;
    public int e;
    public List f;
    public afgh g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public Set n;
    public int o;
    public int p;
    public String q;
    public String r;
    public short s;
    public int t;
    
    public final void a(final int c) {
        this.c = c;
        this.s |= 0x1;
    }
    
    public final void b(final int h) {
        this.h = h;
        this.s |= 0x4;
    }
    
    public final void c(final int i) {
        this.i = i;
        this.s |= 0x8;
    }
    
    public final void d(final Set n) {
        if (n != null) {
            this.n = n;
            return;
        }
        throw new NullPointerException("Null inputMethods");
    }
    
    public final void e(final int j) {
        this.j = j;
        this.s |= 0x10;
    }
    
    public final void f(final int e) {
        this.e = e;
        this.s |= 0x2;
    }
    
    public final void g(final int o) {
        this.o = o;
        this.s |= 0x100;
    }
    
    public final void h(final int m) {
        this.m = m;
        this.s |= 0x80;
    }
    
    public final void i(final int k) {
        this.k = k;
        this.s |= 0x20;
    }
    
    public final void j(final int p) {
        this.p = p;
        this.s |= 0x200;
    }
    
    public final void k(final boolean l) {
        this.l = l;
        this.s |= 0x40;
    }
    
    public final void l(final int t) {
        if (t != 0) {
            this.t = t;
            return;
        }
        throw new NullPointerException("Null searchMethod");
    }
}
