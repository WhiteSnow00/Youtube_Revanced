// 
// Decompiled by Procyon v0.6.0
// 

public final class aouk extends vdj
{
    private final agza a;
    
    private aouk() {
        final aoun a = aoun.a;
        throw null;
    }
    
    public aouk(final agza a) {
        this.a = a;
    }
    
    public final void b(final Boolean b) {
        final agza a = this.a;
        final boolean booleanValue = b;
        a.copyOnWrite();
        final aoun aoun = (aoun)a.instance;
        final aoun a2 = aoun.a;
        aoun.b |= 0x2;
        aoun.d = booleanValue;
    }
    
    public final aoum c() {
        return new aoum((aoun)this.a.build());
    }
}
