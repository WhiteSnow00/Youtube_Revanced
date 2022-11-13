import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class asdn extends arvd
{
    final asdo b;
    
    public asdn(final asdo b) {
        this.b = b;
    }
    
    public final arzp a() {
        final asdo b = this.b;
        adkp.R(true, (Object)"config is not set");
        return new arzp(Status.OK, (Object)b);
    }
}
