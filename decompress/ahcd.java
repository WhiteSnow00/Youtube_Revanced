import java.util.logging.Level;
import java.io.OutputStream;
import com.google.protobuf.MessageLite;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ahcd extends ahbl
{
    private static final Logger a;
    public static final boolean e;
    public agpd f;
    
    static {
        a = Logger.getLogger(ahcd.class.getName());
        e = ahfz.b;
    }
    
    public static int H(final byte[] array) {
        return S(array.length);
    }
    
    public static int I(final int n, final ahbt ahbt) {
        return ac(n) + J(ahbt);
    }
    
    public static int J(final ahbt ahbt) {
        return S(ahbt.d());
    }
    
    public static int K(final int n, final int n2) {
        return ac(n) + O(n2);
    }
    
    @Deprecated
    static int L(int ac, final MessageLite messageLite, final ahfg ahfg) {
        final int serializedSize = ((ahbc)messageLite).getSerializedSize(ahfg);
        ac = ac(ac);
        return ac + ac + serializedSize;
    }
    
    @Deprecated
    public static int M(final MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }
    
    public static int N(final int n, final int n2) {
        return ac(n) + O(n2);
    }
    
    public static int O(final int n) {
        if (n >= 0) {
            return ae(n);
        }
        return 10;
    }
    
    public static int P(final int n, final long n2) {
        return ac(n) + ag(n2);
    }
    
    public static int Q(final int n, final ahdy ahdy) {
        return ac(n) + R(ahdy);
    }
    
    public static int R(final ahdy ahdy) {
        int n;
        if (ahdy.b != null) {
            n = ahdy.b.d();
        }
        else if (ahdy.a != null) {
            n = ahdy.a.getSerializedSize();
        }
        else {
            n = 0;
        }
        return S(n);
    }
    
    public static int S(final int n) {
        return ae(n) + n;
    }
    
    public static int T(final MessageLite messageLite) {
        return S(messageLite.getSerializedSize());
    }
    
    static int U(final MessageLite messageLite, final ahfg ahfg) {
        return S(((ahbc)messageLite).getSerializedSize(ahfg));
    }
    
    static int V(final int n) {
        if (n > 4096) {
            return 4096;
        }
        return n;
    }
    
    public static int W(final int n, final int n2) {
        return ac(n) + X(n2);
    }
    
    public static int X(final int n) {
        return ae(ah(n));
    }
    
    public static int Y(final int n, final long n2) {
        return ac(n) + Z(n2);
    }
    
    public static int Z(final long n) {
        return ag(ai(n));
    }
    
    public static int aA(final int n) {
        return ac(n) + 4;
    }
    
    public static int aB(final int n) {
        return ac(n) + 8;
    }
    
    public static int aC(final int n) {
        return ac(n) + 4;
    }
    
    public static int aD(final int n) {
        return ac(n) + 4;
    }
    
    public static int aE(final int n) {
        return ac(n) + 8;
    }
    
    public static int aa(final int n, final String s) {
        return ac(n) + ab(s);
    }
    
    public static int ab(final String s) {
        int n;
        try {
            n = ahgb.b((CharSequence)s);
        }
        catch (final ahga ahga) {
            n = s.getBytes(ahdq.a).length;
        }
        return S(n);
    }
    
    public static int ac(final int n) {
        return ae(ahge.c(n, 0));
    }
    
    public static int ad(final int n, final int n2) {
        return ac(n) + ae(n2);
    }
    
    public static int ae(final int n) {
        if ((n & 0xFFFFFF80) == 0x0) {
            return 1;
        }
        if ((n & 0xFFFFC000) == 0x0) {
            return 2;
        }
        if ((0xFFE00000 & n) == 0x0) {
            return 3;
        }
        if ((n & 0xF0000000) == 0x0) {
            return 4;
        }
        return 5;
    }
    
    public static int af(final int n, final long n2) {
        return ac(n) + ag(n2);
    }
    
    public static int ag(long n) {
        if ((0xFFFFFFFFFFFFFF80L & n) == 0x0L) {
            return 1;
        }
        if (n < 0L) {
            return 10;
        }
        int n2;
        if ((0xFFFFFFF800000000L & n) != 0x0L) {
            n >>>= 28;
            n2 = 6;
        }
        else {
            n2 = 2;
        }
        int n3 = n2;
        long n4 = n;
        if ((0xFFFFFFFFFFE00000L & n) != 0x0L) {
            n4 = n >>> 14;
            n3 = n2 + 2;
        }
        int n5 = n3;
        if ((n4 & 0xFFFFFFFFFFFFC000L) != 0x0L) {
            n5 = n3 + 1;
        }
        return n5;
    }
    
    public static int ah(final int n) {
        return n >> 31 ^ n + n;
    }
    
    public static long ai(final long n) {
        return n >> 63 ^ n + n;
    }
    
    public static ahcd aj(final OutputStream outputStream) {
        return al(outputStream, 4096);
    }
    
    public static ahcd ak(final byte[] array) {
        return am(array, 0, array.length);
    }
    
    public static ahcd al(final OutputStream outputStream, final int n) {
        return (ahcd)new ahca(outputStream, n);
    }
    
    public static ahcd am(final byte[] array, final int n, final int n2) {
        return (ahcd)new ahcb(array, n, n2);
    }
    
    public static int ay(final int n) {
        return ac(n) + 1;
    }
    
    public static int az(final int n) {
        return ac(n) + 8;
    }
    
    public abstract void A(final String p0);
    
    public abstract void B(final int p0, final int p1);
    
    public abstract void C(final int p0, final int p1);
    
    public abstract void D(final int p0);
    
    public abstract void E(final int p0, final long p1);
    
    public abstract void F(final long p0);
    
    public abstract void G(final byte[] p0, final int p1);
    
    public abstract void a(final byte[] p0, final int p1, final int p2);
    
    public final void an() {
        if (this.b() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }
    
    final void ao(final String s, final ahga ahga) {
        ahcd.a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable)ahga);
        final byte[] bytes = s.getBytes(ahdq.a);
        try {
            final int length = bytes.length;
            this.D(length);
            this.a(bytes, 0, length);
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new ahcc((Throwable)ex);
        }
    }
    
    public final void ap(final int n, final double n2) {
        this.r(n, Double.doubleToRawLongBits(n2));
    }
    
    public final void aq(final double n) {
        this.s(Double.doubleToRawLongBits(n));
    }
    
    public final void ar(final int n, final float n2) {
        this.p(n, Float.floatToRawIntBits(n2));
    }
    
    public final void as(final float n) {
        this.q(Float.floatToRawIntBits(n));
    }
    
    @Deprecated
    public final void at(final MessageLite messageLite) {
        messageLite.writeTo(this);
    }
    
    public final void au(final int n, final int n2) {
        this.C(n, ah(n2));
    }
    
    public final void av(final int n) {
        this.D(ah(n));
    }
    
    public final void aw(final int n, final long n2) {
        this.E(n, ai(n2));
    }
    
    public final void ax(final long n) {
        this.F(ai(n));
    }
    
    public abstract int b();
    
    public abstract void i();
    
    public abstract void j(final byte p0);
    
    public abstract void l(final int p0, final boolean p1);
    
    public abstract void m(final int p0, final byte[] p1);
    
    public abstract void n(final int p0, final ahbt p1);
    
    public abstract void o(final ahbt p0);
    
    public abstract void p(final int p0, final int p1);
    
    public abstract void q(final int p0);
    
    public abstract void r(final int p0, final long p1);
    
    public abstract void s(final long p0);
    
    public abstract void t(final int p0, final int p1);
    
    public abstract void u(final int p0);
    
    public abstract void v(final int p0, final MessageLite p1, final ahfg p2);
    
    public abstract void w(final MessageLite p0);
    
    public abstract void x(final int p0, final MessageLite p1);
    
    public abstract void y(final int p0, final ahbt p1);
    
    public abstract void z(final int p0, final String p1);
}
