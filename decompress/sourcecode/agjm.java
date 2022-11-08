// 
// Decompiled by Procyon v0.6.0
// 

final class agjm implements agjp
{
    final nmo a;
    
    public agjm(final nmo a, final byte[] array) {
        this.a = a;
    }
    
    public final boolean a(final Exception ex) {
        return false;
    }
    
    public final boolean b(final agjv agjv) {
        if (!agjv.e() && !agjv.d() && !agjv.b()) {
            return false;
        }
        this.a.e((Object)agjv.a);
        return true;
    }
}
