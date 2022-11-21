// 
// Decompiled by Procyon v0.6.0
// 

public final class car
{
    private final String a;
    private final int b;
    private final int c;
    private int d;
    private String e;
    
    public car(final int n, final int n2) {
        this(Integer.MIN_VALUE, n, n2);
    }
    
    public car(final int n, final int b, final int c) {
        String string;
        if (n != Integer.MIN_VALUE) {
            final StringBuilder sb = new StringBuilder();
            sb.append(n);
            sb.append("/");
            string = sb.toString();
        }
        else {
            string = "";
        }
        this.a = string;
        this.b = b;
        this.c = c;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }
    
    private final void d() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }
    
    public final int a() {
        this.d();
        return this.d;
    }
    
    public final String b() {
        this.d();
        return this.e;
    }
    
    public final void c() {
        final int d = this.d;
        int b;
        if (d == Integer.MIN_VALUE) {
            b = this.b;
        }
        else {
            b = d + this.c;
        }
        this.d = b;
        final String a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);
        this.e = sb.toString();
    }
}
