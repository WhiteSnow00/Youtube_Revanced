// 
// Decompiled by Procyon v0.6.0
// 

public final class ablo extends tgk
{
    public final boolean a;
    public String b;
    public String d;
    public final anhd e;
    public final Throwable f;
    public final String g;
    public final String h;
    public final int i;
    private final int j;
    
    public ablo(final int n, final int n2, final String s) {
        this(n, false, n2, s, null);
    }
    
    public ablo(final int n, final String s, final String s2) {
        this(n, true, 1, s, null, s2);
    }
    
    public ablo(final int n, final Throwable t) {
        this(n, true, 1, null, t);
    }
    
    public ablo(final int n, final boolean b, final int n2, final String s, final Throwable t) {
        this(n, b, n2, s, t, null);
    }
    
    public ablo(final int n, final boolean b, final int n2, final String s, final Throwable t, final String s2) {
        this(n, b, n2, s, t, s2, null);
    }
    
    public ablo(final int n, final boolean b, final int n2, final String s, final Throwable t, final String s2, final String s3) {
        this(n, b, n2, s, t, s2, s3, null);
    }
    
    public ablo(final int i, final boolean a, final int j, final String d, final Throwable f, final String g, final String h, final anhd e) {
        this.i = i;
        this.a = a;
        this.j = j;
        this.d = d;
        this.f = f;
        this.g = g;
        this.h = h;
        this.e = e;
    }
    
    public ablo(final int n, final boolean b, final String s) {
        this(n, b, 1, s, null);
    }
    
    public ablo(final int n, final boolean b, final String s, final Throwable t) {
        this(n, b, 1, s, t);
    }
    
    public final boolean a() {
        final int n = this.j - 1;
        return n == 1 || (n != 2 && aamr.c(this.i, 3, 2, 5, 6, 7, 13, 11));
    }
}
