// 
// Decompiled by Procyon v0.6.0
// 

public final class adjs implements arom
{
    private final atnb a;
    
    public adjs(final atnb a) {
        this.a = a;
    }
    
    public static adjs c(final atnb atnb) {
        return new adjs(atnb);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final adjr b() {
        return new adjr((wza)this.a.a());
    }
}
