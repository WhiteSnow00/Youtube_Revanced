// 
// Decompiled by Procyon v0.6.0
// 

public final class oeh implements arjd
{
    private final atjj a;
    private final atjj b;
    private final atjj c;
    private final atjj d;
    
    public oeh(final atjj a, final atjj b, final atjj c, final atjj d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static odz c(final aexq aexq, final oee oee, final aexq aexq2, final afts afts) {
        return new odz(aexq, oee, aexq2, afts);
    }
    
    public static oeh d(final atjj atjj, final atjj atjj2, final atjj atjj3, final atjj atjj4) {
        return new oeh(atjj, atjj2, atjj3, atjj4);
    }
    
    public final odz b() {
        return c((aexq)((arje)this.a).a, ((oef)this.b).b(), (aexq)this.c.a(), (afts)this.d.a());
    }
}
