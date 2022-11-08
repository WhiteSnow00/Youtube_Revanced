// 
// Decompiled by Procyon v0.6.0
// 

public final class aoso extends vdj
{
    private final agza a;
    
    private aoso() {
        final aosr a = aosr.a;
        throw null;
    }
    
    public aoso(final agza a) {
        this.a = a;
    }
    
    public final void b(final aost d) {
        final agza a = this.a;
        a.copyOnWrite();
        final aosr aosr = (aosr)a.instance;
        final aosr a2 = aosr.a;
        d.getClass();
        aosr.d = d;
        aosr.b |= 0x2;
    }
    
    public final aosq c() {
        return new aosq((aosr)this.a.build());
    }
}
