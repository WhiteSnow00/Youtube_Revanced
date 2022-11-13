// 
// Decompiled by Procyon v0.6.0
// 

public final class atwq extends atwr
{
    public static final atwq c;
    
    static {
        c = new atwq();
    }
    
    private atwq() {
        super(atwv.b, atwv.c, atwv.d);
    }
    
    @Override
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }
    
    public final String toString() {
        return "Dispatchers.Default";
    }
}
