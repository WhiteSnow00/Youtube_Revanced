// 
// Decompiled by Procyon v0.6.0
// 

final class aumn
{
    public final long a;
    public final auip b;
    aumn c;
    private String d;
    private int e;
    private int f;
    
    public aumn(final auip b, final long a) {
        this.e = Integer.MIN_VALUE;
        this.f = Integer.MIN_VALUE;
        this.a = a;
        this.b = b;
    }
    
    public final int a(final long n) {
        final aumn c = this.c;
        if (c != null && n >= c.a) {
            return c.a(n);
        }
        int e;
        if ((e = this.e) == Integer.MIN_VALUE) {
            e = this.b.a(this.a);
            this.e = e;
        }
        return e;
    }
    
    public final int b(final long n) {
        final aumn c = this.c;
        if (c != null && n >= c.a) {
            return c.b(n);
        }
        int f;
        if ((f = this.f) == Integer.MIN_VALUE) {
            f = this.b.c(this.a);
            this.f = f;
        }
        return f;
    }
    
    public final String c(final long n) {
        final aumn c = this.c;
        if (c != null && n >= c.a) {
            return c.c(n);
        }
        if (this.d == null) {
            this.d = this.b.g(this.a);
        }
        return this.d;
    }
}
