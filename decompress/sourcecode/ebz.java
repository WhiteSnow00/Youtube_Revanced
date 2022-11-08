// 
// Decompiled by Procyon v0.6.0
// 

final class ebz extends mq
{
    final /* synthetic */ ecd c;
    
    public ebz(final ecd c) {
        this.c = c;
    }
    
    public final int b(final int n) {
        final ecp b = this.c.b;
        if (b == null) {
            return 1;
        }
        final eeh n2 = b.n(n);
        if (n2.i()) {
            return this.c.a.b;
        }
        return n2.a();
    }
}
