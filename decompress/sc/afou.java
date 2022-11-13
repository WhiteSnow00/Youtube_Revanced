// 
// Decompiled by Procyon v0.6.0
// 

final class afou extends afox
{
    final char[] a;
    
    public afou(final afot afot) {
        super(afot, (Character)null);
        this.a = new char[512];
        final int length = afot.b.length;
        int i = 0;
        adkp.H(length == 16);
        while (i < 256) {
            this.a[i] = afot.a(i >>> 4);
            this.a[i | 0x100] = afot.a(i & 0xF);
            ++i;
        }
    }
    
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
        throw new afow(sb.toString());
    }
    
    public final afoy b(final afot afot, final Character c) {
        return (afoy)new afou(afot);
    }
    
    public final void c(final Appendable appendable, final byte[] array, final int n) {
        final int length = array.length;
        int i = 0;
        adkp.P(0, n, length);
        while (i < n) {
            final int n2 = array[i] & 0xFF;
            appendable.append(this.a[n2]);
            appendable.append(this.a[n2 | 0x100]);
            ++i;
        }
    }
}
