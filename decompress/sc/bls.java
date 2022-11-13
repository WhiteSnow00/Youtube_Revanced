import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class bls extends bdc
{
    public long g;
    public int h;
    private int i;
    
    public bls() {
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
    
    public final boolean f(final bdc bdc) {
        dk.f(bdc.d() ^ true);
        dk.f(((bcw)bdc).hasSupplementalData() ^ true);
        dk.f(((bcw)bdc).isEndOfStream() ^ true);
        Label_0100: {
            if (this.g()) {
                if (this.h < this.i) {
                    if (((bcw)bdc).isDecodeOnly() == ((bcw)this).isDecodeOnly()) {
                        final ByteBuffer c = bdc.c;
                        if (c == null) {
                            break Label_0100;
                        }
                        final ByteBuffer c2 = this.c;
                        if (c2 == null || c2.position() + c.remaining() <= 3072000) {
                            break Label_0100;
                        }
                    }
                }
                return false;
            }
        }
        if (this.h++ == 0) {
            this.e = bdc.e;
            if (((bcw)bdc).isKeyFrame()) {
                ((bcw)this).setFlags(1);
            }
        }
        if (((bcw)bdc).isDecodeOnly()) {
            ((bcw)this).setFlags(Integer.MIN_VALUE);
        }
        final ByteBuffer c3 = bdc.c;
        if (c3 != null) {
            this.b(c3.remaining());
            this.c.put(c3);
        }
        this.g = bdc.e;
        return true;
    }
    
    public final boolean g() {
        return this.h > 0;
    }
}
