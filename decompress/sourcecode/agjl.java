// 
// Decompiled by Procyon v0.6.0
// 

final class agjl implements agjp
{
    private final agjq a;
    private final nmo b;
    
    public agjl(final agjq a, final nmo b, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a(final Exception ex) {
        this.b.d(ex);
        return true;
    }
    
    public final boolean b(final agjv agjv) {
        if (!agjv.d() || this.a.c(agjv)) {
            return false;
        }
        final nmo b = this.b;
        final String b2 = agjv.b;
        if (b2 != null) {
            b.c((Object)new agjn(b2, agjv.d, agjv.e));
            return true;
        }
        throw new NullPointerException("Null token");
    }
}
