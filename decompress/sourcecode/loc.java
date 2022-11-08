import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

final class loc implements atjj
{
    private final atjj a;
    private final /* synthetic */ int b;
    
    private loc(final atjj a, final int b) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    private loc(final atjj a, final int b, final byte[] array) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    private loc(final atjj a, final int b, final char[] array) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public static atjj b(final atjj atjj) {
        return (atjj)new loc(atjj, 0);
    }
    
    public static atjj c(final atjj atjj) {
        return (atjj)new loc(atjj, 1, (byte[])null);
    }
    
    public static atjj d(final atjj atjj) {
        return (atjj)new loc(atjj, 2, (char[])null);
    }
}
