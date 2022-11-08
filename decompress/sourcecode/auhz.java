import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auhz implements auio, auim
{
    private final String a;
    
    public auhz(final String a) {
        this.a = a;
    }
    
    public final int a() {
        return this.a.length();
    }
    
    public final int b() {
        return this.a.length();
    }
    
    public final int c(final auii auii, final CharSequence charSequence, final int n) {
        if (auma.d(charSequence, n, this.a)) {
            return n + this.a.length();
        }
        return ~n;
    }
    
    public final void d(final Appendable appendable, final long n, final aueu aueu, final int n2, final aufc aufc, final Locale locale) {
        appendable.append(this.a);
    }
}
