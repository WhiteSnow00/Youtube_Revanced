// 
// Decompiled by Procyon v0.6.0
// 

final class asba extends asai
{
    public final aryh a;
    private final arze b;
    
    public asba(final arze b, final aryh a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    protected final arze a() {
        return this.b;
    }
    
    @Override
    public final aryt m(final aruk aruk, final arug arug, final arrk arrk, final arxi[] array) {
        return (aryt)new asaz(this, this.b.m(aruk, arug, arrk, array));
    }
}
