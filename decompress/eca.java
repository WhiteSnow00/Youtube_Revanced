// 
// Decompiled by Procyon v0.6.0
// 

final class eca extends mq
{
    final ece c;
    
    public eca(final ece c) {
        this.c = c;
    }
    
    public final int b(final int n) {
        final ecq b = this.c.b;
        if (b == null) {
            return 1;
        }
        final eei n2 = b.n(n);
        if (n2.i()) {
            return this.c.a.b;
        }
        return n2.a();
    }
}
