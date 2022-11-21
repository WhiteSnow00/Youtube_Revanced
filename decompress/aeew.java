// 
// Decompiled by Procyon v0.6.0
// 

public final class aeew extends aeeo
{
    final udw a;
    
    public aeew(final udw a, final byte[] array) {
        this.a = a;
    }
    
    public final void a() {
        final aeex aeex = (aeex)this.a.a;
        aeex.k.asBinder().unlinkToDeath(aeex.i, 0);
        final aeex aeex2 = (aeex)this.a.a;
        aeex2.k = null;
        aeex.e(aeex2);
    }
}
