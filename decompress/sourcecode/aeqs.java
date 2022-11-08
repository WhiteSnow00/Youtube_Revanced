import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeqs extends aeqh
{
    public static final UUID a;
    
    static {
        a = UUID.randomUUID();
    }
    
    private aeqs(final aeqs aeqs, final String s, final aeri aeri) {
        super(s, (aerr)aeqs, aeri);
    }
    
    public aeqs(final String s, final UUID uuid, final aeri aeri) {
        super(s, uuid, aeri);
    }
    
    public final aerr h(final String s, final aeri aeri, final aesv aesv) {
        return (aerr)new aeqs(this, s, aeri);
    }
    
    public final void i(final boolean b) {
    }
    
    public final void j() {
    }
}
