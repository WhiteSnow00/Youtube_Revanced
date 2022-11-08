import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class aeqh extends aepv
{
    private final aeri a;
    
    public aeqh(final String s, final aerr aerr, final aeri a) {
        super(s, aerr);
        agot.u(a.c);
        this.a = a;
    }
    
    public aeqh(final String s, final UUID uuid, final aeri a) {
        super(s, uuid);
        agot.u(a.c);
        this.a = a;
    }
    
    public final aeri g() {
        return this.a;
    }
}
