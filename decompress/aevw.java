// 
// Decompiled by Procyon v0.6.0
// 

final class aevw extends aevj
{
    final aevk b;
    
    public aevw(final aeux aeux, final aevk b) {
        this.b = b;
        super(aeux);
    }
    
    @Override
    public final void close() {
        super.a.close();
        final aevk b = this.b;
        if (b != null) {
            aewp.n(b);
        }
    }
}
