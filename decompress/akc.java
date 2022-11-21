// 
// Decompiled by Procyon v0.6.0
// 

final class akc
{
    private static final byte[] e;
    public final CharSequence a;
    public final int b;
    public int c;
    public char d;
    
    static {
        e = new byte[1792];
        for (int i = 0; i < 1792; ++i) {
            akc.e[i] = Character.getDirectionality(i);
        }
    }
    
    public akc(final CharSequence a) {
        this.a = a;
        this.b = a.length();
    }
    
    public static byte b(final char c) {
        byte directionality;
        if (c < '\u0700') {
            directionality = akc.e[c];
        }
        else {
            directionality = Character.getDirectionality(c);
        }
        return directionality;
    }
    
    final byte a() {
        final char char1 = this.a.charAt(this.c - 1);
        this.d = char1;
        if (Character.isLowSurrogate(char1)) {
            final int codePointBefore = Character.codePointBefore(this.a, this.c);
            this.c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        --this.c;
        return b(this.d);
    }
}
