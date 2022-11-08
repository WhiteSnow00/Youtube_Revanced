// 
// Decompiled by Procyon v0.6.0
// 

public final class abcv implements arjd
{
    private final atjj a;
    private final atjj b;
    
    public abcv(final atjj a, final atjj b) {
        this.a = a;
        this.b = b;
    }
    
    public static abcv b(final atjj atjj, final atjj atjj2) {
        return new abcv(atjj, atjj2);
    }
    
    public final aamd c() {
        return new aamd(this.a, this.b, null, null, null);
    }
}
