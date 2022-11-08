// 
// Decompiled by Procyon v0.6.0
// 

public final class aebc extends aeau
{
    final /* synthetic */ uao a;
    
    public aebc(final uao a, final byte[] array) {
        this.a = a;
    }
    
    public final void a() {
        final aebd aebd = (aebd)this.a.a;
        aebd.k.asBinder().unlinkToDeath(aebd.i, 0);
        final aebd aebd2 = (aebd)this.a.a;
        aebd2.k = null;
        aebd.e(aebd2);
    }
}
