import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

final class aaeu implements afwr
{
    private final aacd a;
    private final String b;
    private final int c;
    
    public aaeu(final aacd a, final String b, final int c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void b(final Object o) {
        final aacd a = this.a;
        afbh afbh;
        if (TextUtils.isEmpty((CharSequence)this.b)) {
            afbh = afag.a;
        }
        else {
            afbh = afbh.k(this.b);
        }
        a.e(afbh, this.c, 2);
    }
    
    @Override
    public final void rF(final Throwable t) {
    }
}
