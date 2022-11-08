import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auhs implements auio, auim
{
    private final char a;
    
    public auhs(final char c) {
        this.a = c;
    }
    
    public final int a() {
        return 1;
    }
    
    public final int b() {
        return 1;
    }
    
    public final int c(final auii auii, final CharSequence charSequence, final int n) {
        if (n >= charSequence.length()) {
            return ~n;
        }
        final char char1 = charSequence.charAt(n);
        final char a = this.a;
        if (char1 != a) {
            final char upperCase = Character.toUpperCase(char1);
            final char upperCase2 = Character.toUpperCase(a);
            if (upperCase != upperCase2 && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return ~n;
            }
        }
        return n + 1;
    }
    
    public final void d(final Appendable appendable, final long n, final aueu aueu, final int n2, final aufc aufc, final Locale locale) {
        appendable.append(this.a);
    }
}
