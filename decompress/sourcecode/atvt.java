// 
// Decompiled by Procyon v0.6.0
// 

public final class atvt extends atvu
{
    public static final atvt c;
    
    static {
        c = new atvt();
    }
    
    private atvt() {
        super(atvy.b, atvy.c, atvy.d);
    }
    
    @Override
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }
    
    public final String toString() {
        return "Dispatchers.Default";
    }
}
