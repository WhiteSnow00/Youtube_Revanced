// 
// Decompiled by Procyon v0.6.0
// 

final class afbt extends afah
{
    final afbv g;
    
    public afbt(final afbv g, final afcb afcb, final CharSequence charSequence, final byte[] array) {
        this.g = g;
        super(afcb, charSequence);
    }
    
    @Override
    public final int a(final int n) {
        return n + 1;
    }
    
    @Override
    public final int b(final int n) {
        return ((afar)this.g.a).c(this.b, n);
    }
}
