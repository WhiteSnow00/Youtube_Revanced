// 
// Decompiled by Procyon v0.6.0
// 

public final class atgd extends asie
{
    final asih[] a;
    final asjr b;
    
    public atgd(final asih[] a, final asjr b) {
        this.a = a;
        this.b = b;
    }
    
    protected final void af(final asif asif) {
        final asih[] a = this.a;
        final atgb atgb = new atgb(asif, this.b);
        asif.d((asir)atgb);
        for (int i = 0; i < 2; ++i) {
            if (atgb.tA()) {
                return;
            }
            final asih asih = a[i];
            if (asih == null) {
                atgb.a((Throwable)new NullPointerException("One of the sources is null"), i);
                return;
            }
            asih.ae((asif)atgb.c[i]);
        }
    }
}
