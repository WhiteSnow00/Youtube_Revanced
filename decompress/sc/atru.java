// 
// Decompiled by Procyon v0.6.0
// 

final class atru extends atry
{
    private final atng a;
    private final atpn e;
    
    public atru(final atng a) {
        this.a = a;
        this.e = aucl.j();
    }
    
    public final void a(final Throwable t) {
        if (this.e.a(0, 1)) {
            this.a.invoke((Object)t);
        }
    }
    
    public final /* bridge */ Object invoke(final Object o) {
        this.a((Throwable)o);
        return atkq.a;
    }
}
