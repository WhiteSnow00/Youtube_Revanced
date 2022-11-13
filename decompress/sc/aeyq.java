import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeyq extends aeyz
{
    private final char[] a;
    
    public aeyq(final CharSequence charSequence) {
        Arrays.sort(this.a = charSequence.toString().toCharArray());
    }
    
    public final boolean b(final char c) {
        return Arrays.binarySearch(this.a, c) >= 0;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        final char[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            sb.append(aeyz.g(a[i]));
        }
        sb.append("\")");
        return sb.toString();
    }
}
