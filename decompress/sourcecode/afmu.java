// 
// Decompiled by Procyon v0.6.0
// 

final class afmu extends afmx
{
    final char[] a;
    
    public afmu(final afmt afmt) {
        super(afmt, null);
        this.a = new char[512];
        final int length = afmt.b.length;
        int i = 0;
        agot.u(length == 16);
        while (i < 256) {
            this.a[i] = afmt.a(i >>> 4);
            this.a[i | 0x100] = afmt.a(i & 0xF);
            ++i;
        }
    }
    
    @Override
    public final int a(final byte[] array, final CharSequence charSequence) {
        array.getClass();
        if (charSequence.length() % 2 != 1) {
            int i;
            int n;
            for (i = 0, n = 0; i < charSequence.length(); i += 2, ++n) {
                array[n] = (byte)(this.b.b(charSequence.charAt(i)) << 4 | this.b.b(charSequence.charAt(i + 1)));
            }
            return n;
        }
        final StringBuilder sb = new StringBuilder("Invalid input length ");
        sb.append(charSequence.length());
        throw new afmw(sb.toString());
    }
    
    @Override
    public final afmy b(final afmt afmt, final Character c) {
        return new afmu(afmt);
    }
    
    @Override
    public final void c(final Appendable appendable, final byte[] array, final int n) {
        final int length = array.length;
        int i = 0;
        agot.C(0, n, length);
        while (i < n) {
            final int n2 = array[i] & 0xFF;
            appendable.append(this.a[n2]);
            appendable.append(this.a[n2 | 0x100]);
            ++i;
        }
    }
}
