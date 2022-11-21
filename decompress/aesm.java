// 
// Decompiled by Procyon v0.6.0
// 

public final class aesm
{
    public final aetm a;
    
    public aesm(final aetm a) {
        this.a = a;
    }
    
    public static aesm a(final String c) {
        final ahcr builder = aetm.a.createBuilder();
        builder.copyOnWrite();
        final aetm aetm = (aetm)builder.instance;
        c.getClass();
        aetm.b |= 0x1;
        aetm.c = c;
        return new aesm((aetm)builder.build());
    }
    
    public final String b() {
        return this.a.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aesm && this.a.c.equals(((aesm)o).a.c);
    }
    
    @Override
    public final int hashCode() {
        return this.a.c.hashCode();
    }
    
    @Override
    public final String toString() {
        return String.format("SyncKey[name=%s]", this.b());
    }
}
