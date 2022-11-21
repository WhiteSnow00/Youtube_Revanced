// 
// Decompiled by Procyon v0.6.0
// 

public final class aciq implements arom
{
    private final atnb a;
    
    public aciq(final atnb a) {
        this.a = a;
    }
    
    public static aciq b(final atnb atnb) {
        return new aciq(atnb);
    }
    
    public static ahua d(final tgi tgi) {
        final ahua d = tgi.d();
        d.getClass();
        return d;
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final ahua c() {
        return d(((tcr)this.a).c());
    }
}
