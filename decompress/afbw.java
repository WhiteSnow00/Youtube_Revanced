import java.util.regex.Matcher;

// 
// Decompiled by Procyon v0.6.0
// 

final class afbw extends afah
{
    final adgg g;
    
    public afbw(final afcb afcb, final CharSequence charSequence, final adgg g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.g = g;
        super(afcb, charSequence);
    }
    
    @Override
    public final int a(final int n) {
        return ((Matcher)this.g.a).end();
    }
    
    @Override
    public final int b(final int n) {
        if (((Matcher)this.g.a).find(n)) {
            return ((Matcher)this.g.a).start();
        }
        return -1;
    }
}
