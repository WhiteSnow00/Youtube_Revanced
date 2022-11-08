import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class beu implements bse, bfo
{
    private bse a;
    
    public final void sQ(final long n, final long n2, final ayf ayf, final MediaFormat mediaFormat) {
        final bse a = this.a;
        if (a != null) {
            a.sQ(n, n2, ayf, mediaFormat);
        }
    }
    
    public final void t(final int n, final Object o) {
        if (n == 7) {
            this.a = (bse)o;
            return;
        }
        if (n != 8) {
            if (n == 10000) {
                if (o != null) {
                    throw null;
                }
            }
            return;
        }
        final beu beu = (beu)o;
    }
}
