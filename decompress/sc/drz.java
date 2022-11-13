import java.util.Arrays;
import java.util.List;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drz extends drw
{
    public drz() {
        super("mp4s");
    }
    
    public drz(final String s) {
        super(s);
    }
    
    public final long b() {
        final long n = ((arfw)this).u() + 8L;
        final boolean o = this.o;
        int n2 = 16;
        if (!o) {
            if (n >= 4294967296L) {
                n2 = n2;
            }
            else {
                n2 = 8;
            }
        }
        return n + n2;
    }
    
    public final void e(final WritableByteChannel writableByteChannel) {
        writableByteChannel.write(((arft)this).s());
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.position(6);
        cln.k(allocate, this.a);
        writableByteChannel.write((ByteBuffer)allocate.rewind());
        ((arfw)this).k(writableByteChannel);
    }
    
    public final void f(final arfx arfx, ByteBuffer allocate, final long n, final dpr dpr) {
        allocate = ByteBuffer.allocate(8);
        arfx.a(allocate);
        allocate.position(6);
        this.a = cln.t(allocate);
        ((arfw)this).t(arfx, n - 8L, dpr);
    }
    
    public final String toString() {
        final String value = String.valueOf(Arrays.asList(((arfw)this).i()));
        String.valueOf(value).length();
        return "MpegSampleEntry".concat(String.valueOf(value));
    }
}
