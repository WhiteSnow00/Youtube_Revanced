import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auiq implements aujf, aujd
{
    private final String a;
    
    public auiq(final String a) {
        this.a = a;
    }
    
    public final int a() {
        return this.a.length();
    }
    
    public final int b() {
        return this.a.length();
    }
    
    public final int c(final auiz auiz, final CharSequence charSequence, final int n) {
        if (aump.d(charSequence, n, this.a)) {
            return n + this.a.length();
        }
        return ~n;
    }
    
    public final void d(final Appendable appendable, final long n, final aufl aufl, final int n2, final auft auft, final Locale locale) {
        appendable.append(this.a);
    }
}
