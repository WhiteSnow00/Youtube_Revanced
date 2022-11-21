// 
// Decompiled by Procyon v0.6.0
// 

final class afbu extends afah
{
    final afbv g;
    
    public afbu(final afbv g, final afcb afcb, final CharSequence charSequence) {
        this.g = g;
        super(afcb, charSequence);
    }
    
    @Override
    public final int a(final int n) {
        return n + ((String)this.g.a).length();
    }
    
    @Override
    public final int b(int i) {
        final int length = ((String)this.g.a).length();
        final int length2 = this.b.length();
    Label_0025:
        while (i <= length2 - length) {
            for (int j = 0; j < length; ++j) {
                if (this.b.charAt(j + i) != ((String)this.g.a).charAt(j)) {
                    ++i;
                    continue Label_0025;
                }
            }
            return i;
        }
        return -1;
    }
}
