// 
// Decompiled by Procyon v0.6.0
// 

public final class ascx extends arvn
{
    public arzk a;
    public final asdf b;
    
    public ascx(final asdf b) {
        this.b = b;
    }
    
    public final artz a() {
        return this.b.G;
    }
    
    public final /* bridge */ arvr b(final arvl arvl) {
        this.b.n.c();
        adkp.R(this.b.C ^ true, (Object)"Channel is being terminated");
        return (arvr)new arzi(this.b, arvl);
    }
    
    public final void c() {
        this.b.n.c();
        this.b.n.execute((Runnable)new asba(this, 16));
    }
    
    public final void d(final aruk aruk, final arvs arvs) {
        this.b.n.c();
        aruk.getClass();
        this.b.n.execute((Runnable)new arfj(this, arvs, aruk, 5));
    }
}
