// 
// Decompiled by Procyon v0.6.0
// 

public final class arlw implements atke
{
    private final atke a;
    
    private arlw(final atke a) {
        this.a = a;
    }
    
    public static atke c(final atke atke) {
        atke.getClass();
        return (atke)new arlw(atke);
    }
    
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final arkg b() {
        return arlr.b(this.a);
    }
}
