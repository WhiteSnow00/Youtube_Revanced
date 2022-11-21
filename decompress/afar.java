// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afar implements afbk
{
    protected afar() {
    }
    
    public static afar d(final char c, final char c2) {
        return new afal(c, c2);
    }
    
    public static afar e(final char c) {
        return new afam(c);
    }
    
    public static String g(char c) {
        final char[] array2;
        final char[] array = array2 = new char[6];
        array2[0] = '\\';
        array2[1] = 'u';
        array2[3] = (array2[2] = '\0');
        array2[5] = (array2[4] = '\0');
        for (int i = 0; i < 4; ++i) {
            array[5 - i] = "0123456789ABCDEF".charAt(c & '\u000f');
            c >>= 4;
        }
        return String.copyValueOf(array);
    }
    
    public static void i(final CharSequence charSequence) {
        final int length = charSequence.length();
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    new afai(charSequence);
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
    
    @Deprecated
    @Override
    public final /* bridge */ boolean a(final Object o) {
        return this.b((char)o);
    }
    
    public abstract boolean b(final char p0);
    
    public final int c(final CharSequence charSequence, int i) {
        final int length = charSequence.length();
        adme.ac(i, length);
        while (i < length) {
            if (this.b(charSequence.charAt(i))) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    public final afar f(final afar afar) {
        return new afap(this, afar);
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
