// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aexa implements aext
{
    protected aexa() {
    }
    
    public static aexa d(final char c, final char c2) {
        return (aexa)new aewu(c, c2);
    }
    
    public static aexa e(final char c) {
        return (aexa)new aewv(c);
    }
    
    public static String g(final char c) {
        final char[] array2;
        final char[] array = array2 = new char[6];
        array2[0] = '\\';
        array2[1] = 'u';
        array2[3] = (array2[2] = '\0');
        array2[5] = (array2[4] = '\0');
        final int n = 0;
        int n2 = c;
        for (int i = n; i < 4; ++i) {
            array[5 - i] = "0123456789ABCDEF".charAt(n2 & 0xF);
            n2 >>= 4;
        }
        return String.copyValueOf(array);
    }
    
    public static void i(final CharSequence charSequence) {
        final int length = charSequence.length();
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    new aewr(charSequence);
                    return;
                }
                charSequence.charAt(0);
                charSequence.charAt(1);
            }
            else {
                charSequence.charAt(0);
            }
        }
    }
    
    public abstract boolean b(final char p0);
    
    public final int c(final CharSequence charSequence, int i) {
        final int length = charSequence.length();
        agot.M(i, length);
        while (i < length) {
            if (this.b(charSequence.charAt(i))) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    public final aexa f(final aexa aexa) {
        return new aewy(this, aexa);
    }
    
    public final boolean h(final CharSequence charSequence) {
        int length = charSequence.length();
        int n;
        do {
            n = length - 1;
            if (n < 0) {
                return true;
            }
            length = n;
        } while (this.b(charSequence.charAt(n)));
        return false;
    }
}
