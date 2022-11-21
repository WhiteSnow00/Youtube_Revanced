// 
// Decompiled by Procyon v0.6.0
// 

public final class aarr implements arom
{
    private final atnb a;
    
    public aarr(final atnb a) {
        this.a = a;
    }
    
    public static aarr b(final atnb atnb) {
        return new aarr(atnb);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final adgg c() {
        return new adgg((aasp)this.a.a());
    }
}
