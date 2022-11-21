// 
// Decompiled by Procyon v0.6.0
// 

public final class arwn
{
    private final String a;
    
    private arwn(final String a) {
        this.a = a;
    }
    
    public static arwn a(final String s) {
        return new arwn(s);
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
