import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class otv
{
    public static final ByteBuffer a;
    public static final otv b;
    public final boolean c;
    private final ByteBuffer d;
    private volatile ByteBuffer e;
    
    static {
        b = new otv(a = ByteBuffer.wrap(new byte[0]));
    }
    
    private otv(final ByteBuffer byteBuffer) {
        this(byteBuffer, false);
    }
    
    private otv(final ByteBuffer byteBuffer, final boolean c) {
        this.e = null;
        this.d = byteBuffer.duplicate();
        this.c = c;
    }
    
    public static otv a(final ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return otv.b;
        }
        return new otv(byteBuffer);
    }
    
    public static otv b(final byte[] array) {
        if (array == null) {
            return otv.b;
        }
        return new otv(ByteBuffer.wrap(array));
    }
    
    public static otv c(final aqcw aqcw) {
        if (aqcw == null) {
            return otv.b;
        }
        final agzc agzc = (agzc)((agzi)aqcu.a).createBuilder();
        agzc.e((agyr)aqcw.b, aqcw);
        return new otv(ByteBuffer.wrap(((agxl)agzc.build()).toByteArray()), true);
    }
    
    public static otv d(final aqcu aqcu) {
        return b(((agxl)aqcu).toByteArray());
    }
    
    public final ByteBuffer e() {
        return this.d.duplicate();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof otv)) {
            return false;
        }
        final otv otv = (otv)o;
        return otv.c == this.c && this.d.equals(otv.d);
    }
    
    public final ByteBuffer f() {
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            if (this.e == null) {
                final ByteBuffer e = this.e();
                try {
                    final agyh n = agyh.N(e);
                    ByteBuffer e2;
                    if (n.E()) {
                        e2 = otv.a;
                    }
                    else {
                        n.n();
                        n.k();
                        e.position(e.position() + n.e());
                        e2 = e.slice();
                    }
                    this.e = e2;
                }
                catch (final IOException ex) {
                    throw new otf("Error reading extension from model", ex);
                }
            }
            return this.e.duplicate();
        }
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.c, this.d });
    }
}
