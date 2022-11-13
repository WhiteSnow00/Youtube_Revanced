// 
// Decompiled by Procyon v0.6.0
// 

public final class agoh
{
    private final Object a;
    
    public agoh(final Object a) {
        this.a = a;
    }
    
    public static agoh a(final Object o) {
        return new agoh(o);
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.a);
    }
}
