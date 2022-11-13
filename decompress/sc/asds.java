import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class asds implements asft
{
    private InputStream a;
    
    public asds(final InputStream a) {
        this.a = a;
    }
    
    @Override
    public final InputStream f() {
        final InputStream a = this.a;
        this.a = null;
        return a;
    }
}
