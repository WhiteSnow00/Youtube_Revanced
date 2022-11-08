import java.util.regex.Matcher;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeyf extends aewq
{
    final /* synthetic */ adcr g;
    
    public aeyf(final aeyk aeyk, final CharSequence charSequence, final adcr g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.g = g;
        super(aeyk, charSequence);
    }
    
    public final int a(final int n) {
        return ((Matcher)this.g.a).end();
    }
    
    public final int b(final int n) {
        if (((Matcher)this.g.a).find(n)) {
            return ((Matcher)this.g.a).start();
        }
        return -1;
    }
}
