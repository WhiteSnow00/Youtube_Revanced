// 
// Decompiled by Procyon v0.6.0
// 

public final class aaln implements arls
{
    private final atke a;
    private final atke b;
    private final atke c;
    private final atke d;
    private final atke e;
    
    public aaln(final atke a, final atke b, final atke c, final atke d, final atke e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static aaln c(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5) {
        return new aaln(atke, atke2, atke3, atke4, atke5);
    }
    
    public static aalm d(final oby oby, final xao xao, final msr msr) {
        return new aalm(oby, xao, msr, null);
    }
    
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final aalm b() {
        final aalm d = d((oby)this.a.a(), (xao)this.b.a(), (msr)this.c.a());
        d.a((ashi)this.d.a(), (ashi)this.e.a());
        return d;
    }
}
