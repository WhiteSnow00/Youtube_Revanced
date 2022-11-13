import java.nio.channels.WritableByteChannel;

// 
// Decompiled by Procyon v0.6.0
// 

final class argo implements argd
{
    final long a;
    final long b;
    final argq c;
    
    public argo(final argq c, final long a, final long b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final long a() {
        return this.b;
    }
    
    public final void b(final WritableByteChannel writableByteChannel) {
        this.c.m.d(this.a, this.b, writableByteChannel);
    }
}
