import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

final class aabd implements afsz
{
    private final zym a;
    private final String b;
    private final int c;
    
    public aabd(final zym a, final String b, final int c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final void b(final Object o) {
        final zym a = this.a;
        Object o2;
        if (TextUtils.isEmpty((CharSequence)this.b)) {
            o2 = aewp.a;
        }
        else {
            o2 = aexq.k(this.b);
        }
        a.e((aexq)o2, this.c, 2);
    }
    
    public final void rz(final Throwable t) {
    }
}
