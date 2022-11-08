import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dei implements ddz
{
    public final dkl a;
    
    public dei(final InputStream inputStream, final dgd dgd) {
        (this.a = new dkl(inputStream, dgd)).mark(5242880);
    }
    
    public final void b() {
        this.a.b();
    }
    
    public final InputStream c() {
        this.a.reset();
        return (InputStream)this.a;
    }
}
