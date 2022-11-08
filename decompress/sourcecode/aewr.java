import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class aewr extends aexa
{
    private final char[] a;
    
    public aewr(final CharSequence charSequence) {
        Arrays.sort(this.a = charSequence.toString().toCharArray());
    }
    
    @Override
    public final boolean b(final char c) {
        return Arrays.binarySearch(this.a, c) >= 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        final char[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            sb.append(aexa.g(a[i]));
        }
        sb.append("\")");
        return sb.toString();
    }
}
