// 
// Decompiled by Procyon v0.6.0
// 

final class afbx extends afah
{
    public afbx(final afcb afcb, final CharSequence charSequence) {
        super(afcb, charSequence);
    }
    
    @Override
    public final int a(final int n) {
        return n;
    }
    
    @Override
    public final int b(int n) {
        final int length = this.b.length();
        n += 4000;
        if (n < length) {
            return n;
        }
        return -1;
    }
}
