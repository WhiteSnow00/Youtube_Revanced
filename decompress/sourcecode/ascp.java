import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.io.OutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class ascp extends OutputStream
{
    public final List a;
    private aubp b;
    
    public ascp() {
        this.a = new ArrayList();
    }
    
    @Override
    public final void write(final int n) {
        final aubp b = this.b;
        if (b != null && b.p() > 0) {
            ((ByteBuffer)this.b.a).put((byte)n);
            return;
        }
        this.write(new byte[] { (byte)n }, 0, 1);
    }
    
    @Override
    public final void write(final byte[] array, int n, final int n2) {
        int n3 = n;
        int i = n2;
        if (this.b == null) {
            final aubp s = arxi.s(n2);
            this.b = s;
            this.a.add(s);
            i = n2;
            n3 = n;
        }
        while (i > 0) {
            n = Math.min(i, this.b.p());
            if (n == 0) {
                n = this.b.o();
                final aubp s2 = arxi.s(Math.max(i, n + n));
                this.b = s2;
                this.a.add(s2);
            }
            else {
                this.b.q(array, n3, n);
                n3 += n;
                i -= n;
            }
        }
    }
}
