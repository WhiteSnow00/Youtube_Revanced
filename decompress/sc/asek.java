import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

// 
// Decompiled by Procyon v0.6.0
// 

final class asek extends arzf
{
    int a;
    final int b;
    final byte[] c;
    int d;
    
    public asek(final byte[] array, final int a, int b) {
        this.d = -1;
        final boolean b2 = true;
        adkp.I(a >= 0, (Object)"offset must be >= 0");
        adkp.I(b >= 0, (Object)"length must be >= 0");
        b += a;
        adkp.I(b <= 0 && b2, (Object)"offset + length exceeds array boundary");
        this.c = array;
        this.a = a;
        this.b = b;
    }
    
    public final void b() {
        this.d = this.a;
    }
    
    public final void c() {
        final int d = this.d;
        if (d != -1) {
            this.a = d;
            return;
        }
        throw new InvalidMarkException();
    }
    
    public final boolean d() {
        return true;
    }
    
    public final int e() {
        this.a(1);
        return this.c[this.a++] & 0xFF;
    }
    
    public final int f() {
        return this.b - this.a;
    }
    
    public final /* bridge */ asei g(final int n) {
        this.a(n);
        final int a = this.a;
        this.a = a + n;
        return (asei)new asek(this.c, a, n);
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        final int remaining = byteBuffer.remaining();
        this.a(remaining);
        byteBuffer.put(this.c, this.a, remaining);
        this.a += remaining;
    }
    
    public final void j(final OutputStream outputStream, final int n) {
        this.a(n);
        outputStream.write(this.c, this.a, n);
        this.a += n;
    }
    
    public final void k(final byte[] array, final int n, final int n2) {
        System.arraycopy(this.c, this.a, array, n, n2);
        this.a += n2;
    }
    
    public final void l(final int n) {
        this.a(n);
        this.a += n;
    }
}
