// 
// Decompiled by Procyon v0.6.0
// 

public final class aajt implements arjd
{
    private final atjj a;
    private final atjj b;
    private final atjj c;
    private final atjj d;
    private final atjj e;
    
    public aajt(final atjj a, final atjj b, final atjj c, final atjj d, final atjj e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static aajt c(final atjj atjj, final atjj atjj2, final atjj atjj3, final atjj atjj4, final atjj atjj5) {
        return new aajt(atjj, atjj2, atjj3, atjj4, atjj5);
    }
    
    public static aajs d(final oas oas, final wyo wyo, final avt avt) {
        return new aajs(oas, wyo, avt, null, null, null, null);
    }
    
    public final aajs b() {
        final aajs d = d((oas)this.a.a(), (wyo)this.b.a(), (avt)this.c.a());
        d.a((asgt)this.d.a(), (asgt)this.e.a());
        return d;
    }
}
