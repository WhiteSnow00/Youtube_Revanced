// 
// Decompiled by Procyon v0.6.0
// 

public final class adeu implements arjd
{
    private final atjj a;
    private final atjj b;
    
    public adeu(final atjj a, final atjj b) {
        this.a = a;
        this.b = b;
    }
    
    public static adeu c(final atjj atjj, final atjj atjj2) {
        return new adeu(atjj, atjj2);
    }
    
    public static adet d(final aeyk aeyk, final uyi uyi, final adfb adfb) {
        return new adet(aeyk, uyi, adfb, null);
    }
    
    public final adet b() {
        return d((aeyk)this.a.a(), ((arql)this.b).c(), addl.i());
    }
}
