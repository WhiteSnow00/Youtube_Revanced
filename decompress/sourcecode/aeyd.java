// 
// Decompiled by Procyon v0.6.0
// 

final class aeyd extends aewq
{
    final /* synthetic */ aeye g;
    
    public aeyd(final aeye g, final aeyk aeyk, final CharSequence charSequence) {
        this.g = g;
        super(aeyk, charSequence);
    }
    
    public final int a(final int n) {
        return n + ((String)this.g.a).length();
    }
    
    public final int b(int i) {
        final int length = ((String)this.g.a).length();
        final int length2 = this.b.length();
    Label_0024:
        while (i <= length2 - length) {
            for (int j = 0; j < length; ++j) {
                if (this.b.charAt(j + i) != ((String)this.g.a).charAt(j)) {
                    ++i;
                    continue Label_0024;
                }
            }
            return i;
        }
        return -1;
    }
}
