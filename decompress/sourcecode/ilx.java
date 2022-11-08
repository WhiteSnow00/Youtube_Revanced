import java.util.function.Consumer;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ilx extends vjn
{
    public Optional a;
    public Optional b;
    public Optional c;
    public Optional d;
    public Optional e;
    public Optional f;
    public Optional g;
    private final Optional y;
    
    public ilx(final adcr adcr, final zkh zkh, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super("offline/get_download_action", adcr, zkh, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.g = Optional.empty();
        this.y = Optional.empty();
    }
    
    protected final void c() {
        agot.u(this.a.isPresent());
    }
}
