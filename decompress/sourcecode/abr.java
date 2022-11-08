// 
// Decompiled by Procyon v0.6.0
// 

final class abr
{
    static final abr a;
    static final abr b;
    final boolean c;
    final Throwable d;
    
    static {
        if (aca.a) {
            b = null;
            a = null;
            return;
        }
        b = new abr(false, null);
        a = new abr(true, null);
    }
    
    public abr(final boolean c, final Throwable d) {
        this.c = c;
        this.d = d;
    }
}
