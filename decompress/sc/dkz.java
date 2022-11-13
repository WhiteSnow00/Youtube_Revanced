import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkz implements dea
{
    private final ByteBuffer a;
    
    public dkz(final ByteBuffer a) {
        this.a = a;
    }
    
    @Override
    public final /* bridge */ Object a() {
        this.a.position(0);
        return this.a;
    }
    
    @Override
    public final void b() {
    }
}
