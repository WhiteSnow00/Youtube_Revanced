// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afme implements afmj
{
    public void a(final byte[] array, final int n) {
        throw null;
    }
    
    public void b(final char c) {
        throw null;
    }
    
    public void e(final byte[] array) {
        this.a(array, array.length);
    }
    
    public final void f(final CharSequence charSequence) {
        for (int length = charSequence.length(), i = 0; i < length; ++i) {
            this.b(charSequence.charAt(i));
        }
    }
}
