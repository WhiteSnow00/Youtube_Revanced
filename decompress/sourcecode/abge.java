// 
// Decompiled by Procyon v0.6.0
// 

public final class abge implements arjd
{
    private final atjj a;
    private final atjj b;
    
    public abge(final atjj a, final atjj b) {
        this.a = a;
        this.b = b;
    }
    
    public static abge b(final atjj atjj, final atjj atjj2) {
        return new abge(atjj, atjj2);
    }
    
    public final aamd c() {
        return new aamd(this.a, this.b, (char[])null, null);
    }
}
