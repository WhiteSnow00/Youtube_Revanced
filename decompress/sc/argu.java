import java.util.Iterator;
import java.util.Arrays;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class argu extends arfu
{
    protected int a;
    protected int b;
    public byte[] c;
    public List d;
    
    public argu() {
        super("senc");
        this.a = -1;
        this.b = -1;
        this.c = new byte[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
        this.d = Collections.emptyList();
    }
    
    private final List l(final ByteBuffer byteBuffer, long n, final int n2) {
        final ArrayList list = new ArrayList();
        ArrayList list2;
        while (true) {
            list2 = list;
            if (n > 0L) {
                try {
                    final arjd arjd = new arjd();
                    byteBuffer.get(arjd.a = new byte[n2]);
                    if ((this.r() & 0x2) > 0) {
                        arjd.b = new ariy[cln.t(byteBuffer)];
                        int n3 = 0;
                        while (true) {
                            final ariy[] b = arjd.b;
                            if (n3 >= b.length) {
                                break;
                            }
                            final int t = cln.t(byteBuffer);
                            final long w = cln.w(byteBuffer);
                            arip arip;
                            if (t <= 127) {
                                if (w <= 127L) {
                                    arip = new ariq(t, w);
                                }
                                else if (w <= 32767L) {
                                    arip = new arit(t, w);
                                }
                                else if (w <= 2147483647L) {
                                    arip = new arir(t, w);
                                }
                                else {
                                    arip = new aris(t, w);
                                }
                            }
                            else if (t <= 32767) {
                                if (w <= 127L) {
                                    arip = new ariz(t, w);
                                }
                                else if (w <= 32767L) {
                                    arip = new arjc(t, w);
                                }
                                else if (w <= 2147483647L) {
                                    arip = new arja(t, w);
                                }
                                else {
                                    arip = new arjb(t, w);
                                }
                            }
                            else if (w <= 127L) {
                                arip = new ariu(t, w);
                            }
                            else if (w <= 32767L) {
                                arip = new arix(t, w);
                            }
                            else if (w <= 2147483647L) {
                                arip = new ariv(t, w);
                            }
                            else {
                                arip = new ariw(t, w);
                            }
                            b[n3] = (ariy)arip;
                            ++n3;
                        }
                    }
                    list.add(arjd);
                    --n;
                    continue;
                }
                catch (final BufferUnderflowException ex) {
                    list2 = null;
                }
                break;
            }
            break;
        }
        return list2;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final argu argu = (argu)o;
        if (this.a != argu.a) {
            return false;
        }
        if (this.b != argu.b) {
            return false;
        }
        final List d = this.d;
        if (d != null) {
            if (d.equals(argu.d)) {
                return Arrays.equals(this.c, argu.c);
            }
        }
        else if (argu.d == null) {
            return Arrays.equals(this.c, argu.c);
        }
        return false;
    }
    
    protected final long h() {
        long n;
        if (this.k()) {
            final int length = this.c.length;
            n = 24L;
        }
        else {
            n = 4L;
        }
        long n2 = n + 4L;
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            n2 += ((arjd)iterator.next()).a();
        }
        return n2;
    }
    
    public final int hashCode() {
        final int a = this.a;
        final int b = this.b;
        final byte[] c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c != null) {
            hashCode2 = Arrays.hashCode(c);
        }
        else {
            hashCode2 = 0;
        }
        final List d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((a * 31 + b) * 31 + hashCode2) * 31 + hashCode;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        if ((this.r() & 0x1) > 0) {
            this.a = cln.u(byteBuffer);
            this.b = cln.v(byteBuffer);
            byteBuffer.get(this.c = new byte[16]);
        }
        final long w = cln.w(byteBuffer);
        final ByteBuffer duplicate = byteBuffer.duplicate();
        final ByteBuffer duplicate2 = byteBuffer.duplicate();
        if ((this.d = this.l(duplicate, w, 8)) == null) {
            this.d = this.l(duplicate2, w, 16);
            byteBuffer.position(byteBuffer.position() + byteBuffer.remaining() - duplicate2.remaining());
        }
        else {
            byteBuffer.position(byteBuffer.position() + byteBuffer.remaining() - duplicate.remaining());
        }
        if (this.d != null) {
            return;
        }
        throw new RuntimeException("Cannot parse SampleEncryptionBox");
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        if (this.k()) {
            cln.l(byteBuffer, this.a);
            cln.n(byteBuffer, this.b);
            byteBuffer.put(this.c);
        }
        cln.m(byteBuffer, (long)this.d.size());
        for (final arjd arjd : this.d) {
            if (arjd.a() > 0) {
                final byte[] a = arjd.a;
                final int length = a.length;
                if (length != 8 && length != 16) {
                    throw new RuntimeException("IV must be either 8 or 16 bytes");
                }
                byteBuffer.put(a);
                if ((this.r() & 0x2) <= 0) {
                    continue;
                }
                cln.k(byteBuffer, arjd.b.length);
                for (final ariy ariy : arjd.b) {
                    cln.k(byteBuffer, ariy.a());
                    cln.m(byteBuffer, ariy.b());
                }
            }
        }
    }
    
    public final boolean k() {
        return (this.r() & 0x1) > 0;
    }
}
