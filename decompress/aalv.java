// 
// Decompiled by Procyon v0.6.0
// 

public final class aalv implements arom
{
    private final atnb a;
    private final atnb b;
    
    public aalv(final atnb a, final atnb b) {
        this.a = a;
        this.b = b;
    }
    
    public static aalv c(final atnb atnb, final atnb atnb2) {
        return new aalv(atnb, atnb2);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final ynz b() {
        return aamn.i((aamy)((aron)this.a).a, (ynx)this.b.a());
    }
}
