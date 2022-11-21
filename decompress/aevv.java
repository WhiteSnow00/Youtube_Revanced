// 
// Decompiled by Procyon v0.6.0
// 

public final class aevv implements aeuq
{
    public final aevk a;
    public final aevk b;
    
    public aevv(final aevk a, final aevk b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void close() {
        final aevk a = this.a;
        final aevk b = this.b;
        a.close();
        aewp.n(b);
    }
}
