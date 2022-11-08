// 
// Decompiled by Procyon v0.6.0
// 

public final class jhq
{
    private final boolean a;
    
    private jhq(final boolean a) {
        this.a = a;
    }
    
    public static jhq a(final boolean b) {
        return new jhq(b);
    }
    
    public boolean b() {
        return this.a;
    }
}
