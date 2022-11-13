// 
// Decompiled by Procyon v0.6.0
// 

final class aglm implements aglq
{
    private final aglr a;
    private final nns b;
    
    public aglm(final aglr a, final nns b, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a(final Exception ex) {
        this.b.c(ex);
        return true;
    }
    
    public final boolean b(final aglw aglw) {
        if (!aglw.d() || this.a.c(aglw)) {
            return false;
        }
        final nns b = this.b;
        final String b2 = aglw.b;
        if (b2 != null) {
            b.b((Object)new aglo(b2, aglw.d, aglw.e));
            return true;
        }
        throw new NullPointerException("Null token");
    }
}
