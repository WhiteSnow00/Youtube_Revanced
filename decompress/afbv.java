import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afbv implements afca
{
    final Object a;
    private final int b;
    
    public afbv(final afar a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public afbv(final afat a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public afbv(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Iterator a(final afcb afcb, final CharSequence charSequence) {
        final int b = this.b;
        if (b == 0) {
            return new afbu(this, afcb, charSequence);
        }
        if (b != 1) {
            return new afbw(afcb, charSequence, ((afat)this.a).a(charSequence), null, null, null);
        }
        return new afbt(this, afcb, charSequence, null);
    }
}
