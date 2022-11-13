// 
// Decompiled by Procyon v0.6.0
// 

public final class atqe extends atry implements atqd
{
    public final atqf a;
    
    public atqe(final atqf a) {
        this.a = a;
    }
    
    public final void a(final Throwable t) {
        this.a.tP((atsl)((atsa)this).e());
    }
    
    public final atrw b() {
        return (atrw)((atsa)this).e();
    }
    
    public final boolean c(final Throwable t) {
        return ((atsa)this).e().F(t);
    }
    
    public final /* bridge */ Object invoke(final Object o) {
        this.a((Throwable)o);
        return atkq.a;
    }
}
