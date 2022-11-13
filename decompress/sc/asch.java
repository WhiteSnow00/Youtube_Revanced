// 
// Decompiled by Procyon v0.6.0
// 

final class asch extends asbr
{
    public final arzs a;
    private final asan b;
    
    public asch(final asan b, final arzs a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    protected final asan a() {
        return this.b;
    }
    
    @Override
    public final asac l(final arwo arwo, final arwk arwk, final artx artx, final arva[] array) {
        return (asac)new ascg(this, this.b.l(arwo, arwk, artx, array));
    }
}
