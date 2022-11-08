import java.util.function.Consumer;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fom implements asix
{
    private final aum a;
    private Optional b;
    private final aamd c;
    
    public fom(final aum a, final aamd c, final byte[] array) {
        this.b = Optional.empty();
        this.c = c;
        this.a = a;
    }
    
    public final void b() {
        this.b.ifPresent((Consumer)fgo.p);
        this.b = Optional.empty();
    }
}
