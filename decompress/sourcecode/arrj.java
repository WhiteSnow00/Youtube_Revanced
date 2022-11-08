// 
// Decompiled by Procyon v0.6.0
// 

public final class arrj
{
    private final String a;
    
    private arrj(final String a) {
        this.a = a;
    }
    
    public static arrj a(final String s) {
        return new arrj(s);
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
