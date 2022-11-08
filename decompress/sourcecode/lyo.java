// 
// Decompiled by Procyon v0.6.0
// 

public final class lyo
{
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final ayf f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    public final Object[] k;
    
    public lyo(final int a, final int b, final long c, final long d, final long e, final ayf f, final int g, final lyp[] k, final int j, final long[] h, final long[] i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.k = k;
        this.j = j;
        this.h = h;
        this.i = i;
    }
    
    public lyo(final int a, final int b, final long c, final long d, final long e, final ayf f, final int g, final lyp[] k, final int j, final long[] h, final long[] i, final byte[] array) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.k = k;
        this.j = j;
        this.h = h;
        this.i = i;
    }
    
    public final lyp a(final int n) {
        final Object[] k = this.k;
        if (k == null) {
            return null;
        }
        return (lyp)k[n];
    }
    
    public final lyp b(final int n) {
        final Object[] k = this.k;
        if (k == null) {
            return null;
        }
        return (lyp)k[n];
    }
}
