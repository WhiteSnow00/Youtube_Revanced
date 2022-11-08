// 
// Decompiled by Procyon v0.6.0
// 

public final class attx implements atli
{
    public final Throwable a;
    private final /* synthetic */ atli b;
    
    public attx(final Throwable a, final atli b) {
        b.getClass();
        this.a = a;
        this.b = b;
    }
    
    public final Object fold(final Object o, final atmp atmp) {
        return this.b.fold(o, atmp);
    }
    
    public final atlf get(final atlg atlg) {
        atlg.getClass();
        return this.b.get(atlg);
    }
    
    public final atli minusKey(final atlg atlg) {
        atlg.getClass();
        return this.b.minusKey(atlg);
    }
    
    public final atli plus(final atli atli) {
        atli.getClass();
        return this.b.plus(atli);
    }
}
