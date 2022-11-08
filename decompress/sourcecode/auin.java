// 
// Decompiled by Procyon v0.6.0
// 

public final class auin implements auim
{
    public final auim a;
    
    private auin(final auim a) {
        this.a = a;
    }
    
    public static auin b(final auim auim) {
        if (auim instanceof auij) {
            return ((auij)auim).a;
        }
        if (auim instanceof auin) {
            return (auin)auim;
        }
        if (auim == null) {
            return null;
        }
        return new auin(auim);
    }
    
    public final int a() {
        return this.a.a();
    }
    
    public final int c(final auii auii, final CharSequence charSequence, final int n) {
        return this.a.c(auii, charSequence, n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof auin && this.a.equals(((auin)o).a));
    }
}
