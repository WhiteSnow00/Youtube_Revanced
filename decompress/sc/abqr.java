// 
// Decompiled by Procyon v0.6.0
// 

public final class abqr implements ashm
{
    public final int a;
    private final int b;
    
    public abqr(final int a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final auke a(final ashi ashi) {
        if (this.b != 0) {
            final int a = this.a;
            if (a == 1) {
                return (auke)ashi.X(asil.a());
            }
            if (a != 2) {
                return (auke)ashi;
            }
            return (auke)ashi.X(atjj.a());
        }
        else {
            if (this.a != 1) {
                return (auke)ashi;
            }
            return (auke)ashi.P(asil.a());
        }
    }
}
