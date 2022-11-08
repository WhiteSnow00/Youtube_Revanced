import java.util.logging.Level;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dpp implements dpq
{
    private static final Logger b;
    final ThreadLocal a;
    
    static {
        b = Logger.getLogger(dpp.class.getName());
    }
    
    public dpp() {
        this.a = (ThreadLocal)new dpo();
    }
    
    public final dpu a(final ardi ardi, final dpz dpz) {
        final long b = ardi.b();
        this.a.get().rewind().limit(8);
        while (true) {
            final int a = ardi.a((ByteBuffer)this.a.get());
            if (a != 8) {
                if (a >= 0) {
                    continue;
                }
                ardi.f(b);
                throw new EOFException();
            }
            else {
                this.a.get().rewind();
                final long w = clm.w((ByteBuffer)this.a.get());
                byte[] array = null;
                if (w < 8L && w > 1L) {
                    final Logger b2 = dpp.b;
                    final Level severe = Level.SEVERE;
                    final StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(w);
                    sb.append("). Stop parsing!");
                    b2.logp(severe, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                final String y = clm.y((ByteBuffer)this.a.get());
                long n;
                if (w == 1L) {
                    this.a.get().limit(16);
                    ardi.a((ByteBuffer)this.a.get());
                    this.a.get().position(8);
                    n = clm.x((ByteBuffer)this.a.get()) - 16L;
                }
                else if (w == 0L) {
                    n = ardi.c() - ardi.b();
                }
                else {
                    n = w - 8L;
                }
                long n2 = n;
                if ("uuid".equals(y)) {
                    this.a.get().limit(this.a.get().limit() + 16);
                    ardi.a((ByteBuffer)this.a.get());
                    array = new byte[16];
                    for (int i = this.a.get().position() - 16; i < this.a.get().position(); ++i) {
                        array[i - (this.a.get().position() - 16)] = this.a.get().get(i);
                    }
                    n2 = n - 16L;
                }
                if (dpz instanceof dpu) {
                    ((dpu)dpz).d();
                }
                final dpu b3 = this.b(y, array);
                b3.g(dpz);
                this.a.get().rewind();
                b3.f(ardi, (ByteBuffer)this.a.get(), n2, (dpq)this);
                return b3;
            }
        }
    }
    
    public abstract dpu b(final String p0, final byte[] p1);
}
