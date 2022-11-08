import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class blr extends bdb
{
    public long g;
    public int h;
    private int i;
    
    public blr() {
        super(2);
        this.i = 32;
    }
    
    public final void clear() {
        super.clear();
        this.h = 0;
    }
    
    public final void e(final int i) {
        dk.f(true);
        this.i = i;
    }
    
    public final boolean f(final bdb bdb) {
        dk.f(bdb.d() ^ true);
        dk.f(((bcv)bdb).hasSupplementalData() ^ true);
        dk.f(((bcv)bdb).isEndOfStream() ^ true);
        Label_0097: {
            if (this.g()) {
                if (this.h < this.i) {
                    if (((bcv)bdb).isDecodeOnly() == ((bcv)this).isDecodeOnly()) {
                        final ByteBuffer c = bdb.c;
                        if (c == null) {
                            break Label_0097;
                        }
                        final ByteBuffer c2 = this.c;
                        if (c2 == null || c2.position() + c.remaining() <= 3072000) {
                            break Label_0097;
                        }
                    }
                }
                return false;
            }
        }
        if (this.h++ == 0) {
            this.e = bdb.e;
            if (((bcv)bdb).isKeyFrame()) {
                ((bcv)this).setFlags(1);
            }
        }
        if (((bcv)bdb).isDecodeOnly()) {
            ((bcv)this).setFlags(Integer.MIN_VALUE);
        }
        final ByteBuffer c3 = bdb.c;
        if (c3 != null) {
            this.b(c3.remaining());
            this.c.put(c3);
        }
        this.g = bdb.e;
        return true;
    }
    
    public final boolean g() {
        return this.h > 0;
    }
}
