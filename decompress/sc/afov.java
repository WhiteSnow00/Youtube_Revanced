// 
// Decompiled by Procyon v0.6.0
// 

final class afov extends afox
{
    private afov(final afot afot, final Character c) {
        super(afot, c);
        adkp.H(afot.b.length == 64);
    }
    
    public afov(final String s, final String s2, final Character c) {
        this(new afot(s, s2.toCharArray()), c);
    }
    
    public final int a(final byte[] array, CharSequence g) {
        array.getClass();
        g = ((afoy)this).g(g);
        if (this.b.c(g.length())) {
            int i = 0;
            int n = 0;
            while (i < g.length()) {
                final afot b = this.b;
                final int n2 = i + 1;
                final int b2 = b.b(g.charAt(i));
                final int b3 = this.b.b(g.charAt(n2));
                final int n3 = n + 1;
                final int n4 = b2 << 18 | b3 << 12;
                array[n] = (byte)(n4 >>> 16);
                final int n5 = n2 + 1;
                if (n5 < g.length()) {
                    final afot b4 = this.b;
                    i = n5 + 1;
                    final int n6 = n4 | b4.b(g.charAt(n5)) << 6;
                    n = n3 + 1;
                    array[n3] = (byte)(n6 >>> 8 & 0xFF);
                    if (i >= g.length()) {
                        continue;
                    }
                    array[n] = (byte)((n6 | this.b.b(g.charAt(i))) & 0xFF);
                    ++n;
                    ++i;
                }
                else {
                    i = n5;
                    n = n3;
                }
            }
            return n;
        }
        final StringBuilder sb = new StringBuilder("Invalid input length ");
        sb.append(g.length());
        throw new afow(sb.toString());
    }
    
    public final afoy b(final afot afot, final Character c) {
        return (afoy)new afov(afot, c);
    }
    
    public final void c(final Appendable appendable, final byte[] array, final int n) {
        final int length = array.length;
        int n2 = 0;
        adkp.P(0, n, length);
        for (int i = n; i >= 3; i -= 3) {
            int n3 = n2 + 1;
            final byte b = array[n2];
            final byte b2 = array[n3];
            ++n3;
            final byte b3 = array[n3];
            final afot b4 = this.b;
            final int n4 = (b & 0xFF) << 16 | (b2 & 0xFF) << 8 | (b3 & 0xFF);
            appendable.append(b4.a(n4 >>> 18));
            appendable.append(this.b.a(n4 >>> 12 & 0x3F));
            appendable.append(this.b.a(n4 >>> 6 & 0x3F));
            appendable.append(this.b.a(n4 & 0x3F));
            n2 = n3 + 1;
        }
        if (n2 < n) {
            this.h(appendable, array, n2, n - n2);
        }
    }
}
