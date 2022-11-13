import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dei implements ddz
{
    private final dge a;
    
    public dei(final dge a) {
        this.a = a;
    }
    
    public final /* bridge */ dea a(final Object o) {
        return (dea)new dej((InputStream)o, this.a);
    }
    
    public final Class b() {
        return InputStream.class;
    }
}
