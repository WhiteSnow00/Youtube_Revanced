// 
// Decompiled by Procyon v0.6.0
// 

public final class ovr implements efv
{
    private final otd a;
    
    public ovr(final otd a) {
        this.a = a;
    }
    
    public final void a(int n, final String s, final String s2) {
        final otd a = this.a;
        if (--n != 1 && n != 2) {
            n = 12;
        }
        else {
            n = 28;
        }
        a.b(n, s2);
    }
    
    public final void b(final int n, final String s, final String s2) {
        this.a(n, s, s2);
    }
    
    public final void d(final String s, final Throwable t) {
        this.a(2, "LITHO:NPE:UNSET_PADDING", s);
    }
    
    public final void e(final int n, final String s) {
        this.a(n, "TextureTooBig", s);
    }
}
