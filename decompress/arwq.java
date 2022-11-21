// 
// Decompiled by Procyon v0.6.0
// 

public final class arwq
{
    private final String a;
    
    private arwq(final String a) {
        this.a = a;
    }
    
    public static arwq a(final String s) {
        return new arwq(s);
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
