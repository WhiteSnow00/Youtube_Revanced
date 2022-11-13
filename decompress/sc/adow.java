// 
// Decompiled by Procyon v0.6.0
// 

public final class adow implements adng
{
    public final String a;
    public final adpe b;
    private final int c;
    
    public adow(final adoc b, final String a, final int c) {
        this.c = c;
        this.b = (adpe)b;
        this.a = a;
    }
    
    public adow(final adoy b, final String a, final int c) {
        this.c = c;
        this.b = (adpe)b;
        this.a = a;
    }
    
    public final void a(final double n) {
        if (this.c != 0) {
            ((adoc)this.b).b.e(this.a, n);
            return;
        }
        ((adoy)this.b).d.e(this.a, n);
    }
}
