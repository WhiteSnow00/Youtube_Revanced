// 
// Decompiled by Procyon v0.6.0
// 

final class hwb extends acnv
{
    final acqv a;
    final hwl b;
    
    public hwb(final hwl b, final acqv a) {
        this.b = b;
        this.a = a;
    }
    
    public final void c(final vgu vgu, final boolean b) {
        if (!b) {
            return;
        }
        final hwl b2 = this.b;
        if (b2.bG.k(vgu, (acrh)this.a, b2.s())) {
            this.b.bB();
        }
    }
}
