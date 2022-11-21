import java.nio.channels.WritableByteChannel;

// 
// Decompiled by Procyon v0.6.0
// 

final class arji implements arix
{
    final long a;
    final long b;
    final arjk c;
    
    public arji(final arjk c, final long a, final long b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final long a() {
        return this.b;
    }
    
    @Override
    public final void b(final WritableByteChannel writableByteChannel) {
        this.c.m.d(this.a, this.b, writableByteChannel);
    }
}
