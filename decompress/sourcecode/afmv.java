// 
// Decompiled by Procyon v0.6.0
// 

final class afmv extends afmx
{
    private afmv(final afmt afmt, final Character c) {
        super(afmt, c);
        agot.u(afmt.b.length == 64);
    }
    
    public afmv(final String s, final String s2, final Character c) {
        this(new afmt(s, s2.toCharArray()), c);
    }
    
    @Override
    public final int a(final byte[] array, CharSequence g) {
        array.getClass();
        g = this.g(g);
        if (this.b.c(g.length())) {
            int i = 0;
            int n = 0;
            while (i < g.length()) {
                final int n2 = i + 1;
                final int n3 = n2 + 1;
                final int n4 = this.b.b(g.charAt(i)) << 18 | this.b.b(g.charAt(n2)) << 12;
                final int n5 = n + 1;
                array[n] = (byte)(n4 >>> 16);
                if (n3 < g.length()) {
                    final int n6 = n3 + 1;
                    final int n7 = n4 | this.b.b(g.charAt(n3)) << 6;
                    n = n5 + 1;
                    array[n5] = (byte)(n7 >>> 8 & 0xFF);
                    if (n6 < g.length()) {
                        array[n] = (byte)((n7 | this.b.b(g.charAt(n6))) & 0xFF);
                        i = n6 + 1;
                        ++n;
                    }
                    else {
                        i = n6;
                    }
                }
                else {
                    n = n5;
                    i = n3;
                }
            }
            return n;
        }
        final StringBuilder sb = new StringBuilder("Invalid input length ");
        sb.append(g.length());
        throw new afmw(sb.toString());
    }
    
    @Override
    public final afmy b(final afmt afmt, final Character c) {
        return new afmv(afmt, c);
    }
    
    @Override
    public final void c(final Appendable appendable, final byte[] array, final int n) {
        final int length = array.length;
        int n2 = 0;
        agot.C(0, n, length);
        int n4;
        for (int i = n; i >= 3; i -= 3, n2 = n4 + 1) {
            final int n3 = n2 + 1;
            n4 = n3 + 1;
            final int n5 = (array[n2] & 0xFF) << 16 | (array[n3] & 0xFF) << 8 | (array[n4] & 0xFF);
            appendable.append(this.b.a(n5 >>> 18));
            appendable.append(this.b.a(n5 >>> 12 & 0x3F));
            appendable.append(this.b.a(n5 >>> 6 & 0x3F));
            appendable.append(this.b.a(n5 & 0x3F));
        }
        if (n2 < n) {
            this.h(appendable, array, n2, n - n2);
        }
    }
}
