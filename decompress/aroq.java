// 
// Decompiled by Procyon v0.6.0
// 

public final class aroq implements atnb
{
    private final atnb a;
    
    private aroq(final atnb a) {
        this.a = a;
    }
    
    public static atnb c(final atnb atnb) {
        atnb.getClass();
        return new aroq(atnb);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final arna b() {
        return arol.b(this.a);
    }
}
