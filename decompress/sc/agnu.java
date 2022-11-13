import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public class agnu
{
    public int a;
    public ByteBuffer b;
    agnv c;
    private int d;
    private int e;
    
    public agnu() {
        this.c = agnv.d();
    }
    
    public static int C(final agns agns, final int n, final int n2, final int n3, final int n4) {
        agns.q(4);
        agns.v(3, n4);
        agns.v(2, n3);
        agns.v(1, n2);
        agns.v(0, n);
        return agns.c();
    }
    
    public static int I(final agns agns, final int n, final int n2, final int n3) {
        agns.q(3);
        agns.u(2, n3);
        agns.v(1, n2);
        agns.u(0, n);
        return agns.c();
    }
    
    public static agnu af(final ByteBuffer byteBuffer) {
        final agnu agnu = new agnu();
        ar(byteBuffer, agnu);
        return agnu;
    }
    
    public static agnu aj(final ByteBuffer byteBuffer) {
        final agnu agnu = new agnu();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        agnu.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return agnu;
    }
    
    public static agnu am(final ByteBuffer byteBuffer) {
        final agnu agnu = new agnu();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        agnu.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return agnu;
    }
    
    public static void ar(final ByteBuffer byteBuffer, final agnu agnu) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        agnu.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }
    
    public static int o(final agns agns, final long n, final long n2, final int n3, final int n4) {
        agns.q(4);
        agns.u(3, n4);
        agns.v(2, n3);
        agns.u(1, (int)n2);
        agns.u(0, (int)n);
        return agns.c();
    }
    
    public static int r(final agns agns, final int n) {
        agns.q(1);
        agns.v(0, n);
        return agns.c();
    }
    
    public final agnt A() {
        final agnt agnt = new agnt();
        final int b = this.b(18);
        if (b != 0) {
            agnt.a(b + this.a, this.b);
            return agnt;
        }
        return null;
    }
    
    public final int B() {
        final int b = this.b(8);
        if (b != 0) {
            return this.d(b);
        }
        return 0;
    }
    
    public final String D() {
        final int b = this.b(10);
        if (b != 0) {
            return this.e(b + this.a);
        }
        return null;
    }
    
    public final String E() {
        final int b = this.b(6);
        if (b != 0) {
            return this.e(b + this.a);
        }
        return null;
    }
    
    public final String F() {
        final int b = this.b(4);
        if (b != 0) {
            return this.e(b + this.a);
        }
        return null;
    }
    
    public final int G() {
        final int b = this.b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public int H() {
        final int b = this.b(6);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final int J() {
        final int b = this.b(6);
        if (b != 0) {
            return this.d(b);
        }
        return 0;
    }
    
    public final int K() {
        final int b = this.b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final int L() {
        final int b = this.b(8);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final ByteBuffer M() {
        return this.i(6);
    }
    
    public final int N() {
        final int b = this.b(4);
        if (b != 0) {
            return this.d(b);
        }
        return 0;
    }
    
    public final float O() {
        final int b = this.b(4);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }
    
    public final int P() {
        final int b = this.b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public String Q() {
        final int b = this.b(4);
        if (b != 0) {
            return this.e(b + this.a);
        }
        return null;
    }
    
    public final int R() {
        final int b = this.b(4);
        if (b != 0) {
            return this.d(b);
        }
        return 0;
    }
    
    public final int S() {
        final int b = this.b(4);
        if (b != 0) {
            return this.d(b);
        }
        return 0;
    }
    
    public final int T() {
        final int b = this.b(6);
        if (b != 0) {
            return this.d(b);
        }
        return 0;
    }
    
    public final boolean U() {
        final int b = this.b(18);
        return b != 0 && this.b.get(b + this.a) != 0;
    }
    
    public final boolean V() {
        final int b = this.b(8);
        return b != 0 && this.b.get(b + this.a) != 0;
    }
    
    public final boolean W() {
        final int b = this.b(10);
        return b != 0 && this.b.get(b + this.a) != 0;
    }
    
    public final boolean X() {
        final int b = this.b(16);
        return b != 0 && this.b.get(b + this.a) != 0;
    }
    
    public final boolean Y() {
        final int b = this.b(14);
        return b != 0 && this.b.get(b + this.a) != 0;
    }
    
    public final boolean Z() {
        final int b = this.b(4);
        return b != 0 && this.b.get(b + this.a) != 0;
    }
    
    public final int a(final int n) {
        return n + this.b.getInt(n);
    }
    
    public final boolean aa() {
        final int b = this.b(6);
        return b != 0 && this.b.get(b + this.a) != 0;
    }
    
    public final boolean ab() {
        final int b = this.b(12);
        return b != 0 && this.b.get(b + this.a) != 0;
    }
    
    public final agnu ac() {
        final agnu agnu = new agnu();
        final int b = this.b(8);
        if (b != 0) {
            agnu.f(this.a(b + this.a), this.b);
            return agnu;
        }
        return null;
    }
    
    public final agnu ad() {
        final agnu agnu = new agnu();
        final int b = this.b(4);
        if (b != 0) {
            agnu.f(this.a(b + this.a), this.b);
            return agnu;
        }
        return null;
    }
    
    public final agnu ae(final int n) {
        final agnu agnu = new agnu();
        final int b = this.b(8);
        if (b != 0) {
            agnu.f(this.a(this.c(b) + n * 4), this.b);
            return agnu;
        }
        return null;
    }
    
    public final agnu ag() {
        return this.ah(new agnu());
    }
    
    public final agnu ah(final agnu agnu) {
        final int b = this.b(4);
        if (b != 0) {
            agnu.f(this.a(b + this.a), this.b);
            return agnu;
        }
        return null;
    }
    
    public final agnu ai() {
        final agnu agnu = new agnu();
        final int b = this.b(6);
        if (b != 0) {
            agnu.f(this.a(b + this.a), this.b);
            return agnu;
        }
        return null;
    }
    
    public final agnu ak(final int n) {
        return this.al(new agnu(), n);
    }
    
    public final agnu al(final agnu agnu, final int n) {
        final int b = this.b(4);
        if (b != 0) {
            agnu.f(this.a(this.c(b) + n * 4), this.b);
            return agnu;
        }
        return null;
    }
    
    public final agnu an() {
        final agnu agnu = new agnu();
        final int b = this.b(8);
        if (b != 0) {
            agnu.f(this.a(b + this.a), this.b);
            return agnu;
        }
        return null;
    }
    
    public final agnt ao() {
        final agnt agnt = new agnt();
        final int b = this.b(6);
        if (b != 0) {
            agnt.a(b + this.a, this.b);
            return agnt;
        }
        return null;
    }
    
    public final agnt ap() {
        final agnt agnt = new agnt();
        final int b = this.b(4);
        if (b != 0) {
            agnt.a(b + this.a, this.b);
            return agnt;
        }
        return null;
    }
    
    public final agnu aq() {
        final agnu agnu = new agnu();
        final int b = this.b(10);
        if (b != 0) {
            agnu.f(this.a(b + this.a), this.b);
            return agnu;
        }
        return null;
    }
    
    public final int b(final int n) {
        if (n < this.e) {
            return this.b.getShort(this.d + n);
        }
        return 0;
    }
    
    public final int c(int n) {
        n += this.a;
        return n + this.b.getInt(n) + 4;
    }
    
    public final int d(int int1) {
        final int n = int1 + this.a;
        int1 = this.b.getInt(n);
        return this.b.getInt(n + int1);
    }
    
    public final String e(int n) {
        final ByteBuffer b = this.b;
        final agnv c = this.c;
        n += b.getInt(n);
        return c.b(b, n + 4, b.getInt(n));
    }
    
    public final void f(int short1, final ByteBuffer b) {
        this.b = b;
        if (b != null) {
            this.a = short1;
            short1 -= b.getInt(short1);
            this.d = short1;
            short1 = this.b.getShort(short1);
        }
        else {
            short1 = 0;
            this.a = 0;
            this.d = 0;
        }
        this.e = short1;
    }
    
    public final int g() {
        final int b = this.b(6);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final int h() {
        final int b = this.b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final ByteBuffer i(int b) {
        b = this.b(b);
        if (b == 0) {
            return null;
        }
        final ByteBuffer order = this.b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        final int c = this.c(b);
        final ByteBuffer byteBuffer = (ByteBuffer)order.position(c);
        final ByteBuffer byteBuffer2 = (ByteBuffer)order.limit(c + this.d(b));
        return order;
    }
    
    public final float j() {
        final int b = this.b(6);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }
    
    public final float k() {
        final int b = this.b(4);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }
    
    public final String l() {
        final int b = this.b(4);
        if (b != 0) {
            return this.e(b + this.a);
        }
        return null;
    }
    
    public final String m() {
        final int b = this.b(6);
        if (b != 0) {
            return this.e(b + this.a);
        }
        return null;
    }
    
    public int n() {
        final int b = this.b(10);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public long p() {
        final int b = this.b(6);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    public long q() {
        final int b = this.b(4);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    public final agnt s() {
        final agnt agnt = new agnt();
        final int b = this.b(20);
        if (b != 0) {
            agnt.a(b + this.a, this.b);
            return agnt;
        }
        return null;
    }
    
    public final agnt t() {
        final agnt agnt = new agnt();
        final int b = this.b(8);
        if (b != 0) {
            agnt.a(b + this.a, this.b);
            return agnt;
        }
        return null;
    }
    
    public final agnt u() {
        final agnt agnt = new agnt();
        final int b = this.b(14);
        if (b != 0) {
            agnt.a(b + this.a, this.b);
            return agnt;
        }
        return null;
    }
    
    public final agnt v() {
        final agnt agnt = new agnt();
        final int b = this.b(16);
        if (b != 0) {
            agnt.a(b + this.a, this.b);
            return agnt;
        }
        return null;
    }
    
    public final agnt w() {
        final agnt agnt = new agnt();
        final int b = this.b(6);
        if (b != 0) {
            agnt.a(b + this.a, this.b);
            return agnt;
        }
        return null;
    }
    
    public final agnt x() {
        final agnt agnt = new agnt();
        final int b = this.b(10);
        if (b != 0) {
            agnt.a(b + this.a, this.b);
            return agnt;
        }
        return null;
    }
    
    public final agnt y() {
        final agnt agnt = new agnt();
        final int b = this.b(12);
        if (b != 0) {
            agnt.a(b + this.a, this.b);
            return agnt;
        }
        return null;
    }
    
    public final agnt z() {
        final agnt agnt = new agnt();
        final int b = this.b(4);
        if (b != 0) {
            agnt.a(b + this.a, this.b);
            return agnt;
        }
        return null;
    }
}
