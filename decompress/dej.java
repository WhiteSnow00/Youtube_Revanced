import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dej implements dea
{
    public final dkm a;
    
    public dej(final InputStream inputStream, final dge dge) {
        (this.a = new dkm(inputStream, dge)).mark(5242880);
    }
    
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final void b() {
        this.a.b();
    }
    
    public final InputStream c() {
        this.a.reset();
        return (InputStream)this.a;
    }
}
