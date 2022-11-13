// 
// Decompiled by Procyon v0.6.0
// 

public final class auje implements aujd
{
    public final aujd a;
    
    private auje(final aujd a) {
        this.a = a;
    }
    
    public static auje b(final aujd aujd) {
        if (aujd instanceof auja) {
            return ((auja)aujd).a;
        }
        if (aujd instanceof auje) {
            return (auje)aujd;
        }
        if (aujd == null) {
            return null;
        }
        return new auje(aujd);
    }
    
    public final int a() {
        return this.a.a();
    }
    
    public final int c(final auiz auiz, final CharSequence charSequence, final int n) {
        return this.a.c(auiz, charSequence, n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof auje && this.a.equals(((auje)o).a));
    }
}
