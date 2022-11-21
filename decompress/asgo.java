import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class asgo implements asip
{
    private InputStream a;
    
    public asgo(final InputStream a) {
        this.a = a;
    }
    
    public final InputStream f() {
        final InputStream a = this.a;
        this.a = null;
        return a;
    }
}
