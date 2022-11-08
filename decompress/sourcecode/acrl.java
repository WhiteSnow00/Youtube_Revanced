// 
// Decompiled by Procyon v0.6.0
// 

public final class acrl implements acno
{
    private final atjj a;
    private final atjj b;
    private final acir c;
    private final /* synthetic */ int d;
    
    public acrl(final atjj a, final atjj b, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = (acir)new achs();
    }
    
    public acrl(final atjj b, final atjj a, final int d, final byte[] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = (acir)new achs();
    }
    
    private static void c(final acir acir, final Class clazz, final atjj atjj) {
        acir.f(clazz, (acip)new acit(atjj, 0));
    }
    
    public final void b(final Class clazz) {
        if (this.d != 0) {
            if (alpx.class.isAssignableFrom(clazz)) {
                c(this.c, alol.class, this.b);
                c(this.c, abzh.class, this.a);
            }
            return;
        }
        if (acrg.class.isAssignableFrom(clazz)) {
            this.c.f((Class)ajmf.class, (acip)new acit(this.a, 0));
            this.c.f((Class)ajmj.class, (acip)new acit(this.b, 0));
        }
    }
}
