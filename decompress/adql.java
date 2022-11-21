// 
// Decompiled by Procyon v0.6.0
// 

public final class adql implements adou
{
    public final String a;
    public final adqs b;
    private final int c;
    
    public adql(final adpq b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adql(final adqn b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final double n) {
        if (this.c != 0) {
            ((adpq)this.b).b.e(this.a, n);
            return;
        }
        ((adqn)this.b).d.e(this.a, n);
    }
}
