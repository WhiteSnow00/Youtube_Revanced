// 
// Decompiled by Procyon v0.6.0
// 

public final class arrf
{
    private final String a;
    
    private arrf(final String a) {
        this.a = a;
    }
    
    public static arrf a(final String s) {
        return new arrf(s);
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
