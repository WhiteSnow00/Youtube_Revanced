// 
// Decompiled by Procyon v0.6.0
// 

public final class din implements dij
{
    public static final din a;
    private final int b;
    
    static {
        a = new din(2, null);
    }
    
    public din(final int b) {
        this.b = b;
    }
    
    @Deprecated
    public din(final int b, final byte[] array) {
        this.b = b;
    }
    
    @Override
    public final boolean a(final Object o) {
        final int b = this.b;
        return b != 0 && (b != 1 || o.toString().startsWith("data:image"));
    }
    
    @Override
    public final aln b(final Object o, int b, final int n, final ddp ddp) {
        b = this.b;
        if (b == 0) {
            return null;
        }
        if (b != 1) {
            return new aln((ddk)new dos(o), (ddy)new dis(o, 0));
        }
        return new aln((ddk)new dos(o), (ddy)new dht(o.toString()));
    }
}
