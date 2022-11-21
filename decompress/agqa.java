// 
// Decompiled by Procyon v0.6.0
// 

public final class agqa
{
    private final Object a;
    
    public agqa(final Object a) {
        this.a = a;
    }
    
    public static agqa a(final Object o) {
        return new agqa(o);
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.a);
    }
}
