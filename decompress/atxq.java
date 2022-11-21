// 
// Decompiled by Procyon v0.6.0
// 

public final class atxq implements atpa
{
    public final Throwable a;
    private final atpa b;
    
    public atxq(final Throwable a, final atpa b) {
        b.getClass();
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object fold(final Object o, final atqh atqh) {
        return this.b.fold(o, atqh);
    }
    
    @Override
    public final atox get(final atoy atoy) {
        atoy.getClass();
        return this.b.get(atoy);
    }
    
    @Override
    public final atpa minusKey(final atoy atoy) {
        atoy.getClass();
        return this.b.minusKey(atoy);
    }
    
    @Override
    public final atpa plus(final atpa atpa) {
        atpa.getClass();
        return this.b.plus(atpa);
    }
}
