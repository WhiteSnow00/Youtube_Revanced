// 
// Decompiled by Procyon v0.6.0
// 

public final class adlq
{
    public final admv a;
    public final admv b;
    
    public adlq(final admv a, final admv b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof adlq)) {
            return false;
        }
        final adlq adlq = (adlq)o;
        return adkp.ae(this.a, adlq.a) && adkp.ae(this.b, adlq.b);
    }
}
