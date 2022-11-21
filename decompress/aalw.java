// 
// Decompiled by Procyon v0.6.0
// 

public final class aalw implements arom
{
    private final atnb a;
    
    public aalw(final atnb a) {
        this.a = a;
    }
    
    public static zkr c(final zkq zkq) {
        final zkr e = zkq.e();
        e.getClass();
        return e;
    }
    
    public static aalw d(final atnb atnb) {
        return new aalw(atnb);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final zkr b() {
        return c((zkq)this.a.a());
    }
}
