// 
// Decompiled by Procyon v0.6.0
// 

public final class auil extends auip
{
    public auil(final aufp aufp, final int n) {
        super(aufp, n, false, n);
    }
    
    public final int c(final auiz auiz, final CharSequence charSequence, int char1) {
        final int c = super.c(auiz, charSequence, char1);
        if (c < 0) {
            return c;
        }
        final int n = this.b + char1;
        int n2;
        if ((n2 = c) != n) {
            int n3 = n;
            Label_0077: {
                if (this.c) {
                    char1 = charSequence.charAt(char1);
                    if (char1 != 45) {
                        n3 = n;
                        if (char1 != 43) {
                            break Label_0077;
                        }
                    }
                    n3 = n + 1;
                }
            }
            if (c > n3) {
                return ~(n3 + 1);
            }
            if ((n2 = c) < n3) {
                n2 = ~c;
            }
        }
        return n2;
    }
}
