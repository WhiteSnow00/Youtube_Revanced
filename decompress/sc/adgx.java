// 
// Decompiled by Procyon v0.6.0
// 

public final class adgx implements arls
{
    private final atke a;
    private final atke b;
    
    public adgx(final atke a, final atke b) {
        this.a = a;
        this.b = b;
    }
    
    public static adgx c(final atke atke, final atke atke2) {
        return new adgx(atke, atke2);
    }
    
    public static adgw d(final afaj afaj, final vai vai, final adhe adhe) {
        return new adgw(afaj, vai, adhe, null);
    }
    
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final adgw b() {
        return d((afaj)this.a.a(), ((arsx)this.b).c(), adgv.f());
    }
}
