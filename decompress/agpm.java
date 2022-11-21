import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public class agpm
{
    public int a;
    public ByteBuffer b;
    agpn c;
    private int d;
    private int e;
    
    public agpm() {
        this.c = agpn.d();
    }
    
    public static int C(final agpk agpk, final int n, final int n2, final int n3, final int n4) {
        agpk.q(4);
        agpk.v(3, n4);
        agpk.v(2, n3);
        agpk.v(1, n2);
        agpk.v(0, n);
        return agpk.c();
    }
    
    public static int I(final agpk agpk, final int n, final int n2, final int n3) {
        agpk.q(3);
        agpk.u(2, n3);
        agpk.v(1, n2);
        agpk.u(0, n);
        return agpk.c();
    }
    
    public static agpm af(final ByteBuffer byteBuffer) {
        final agpm agpm = new agpm();
        ar(byteBuffer, agpm);
        return agpm;
    }
    
    public static agpm aj(final ByteBuffer byteBuffer) {
        final agpm agpm = new agpm();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        agpm.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return agpm;
    }
    
    public static agpm am(final ByteBuffer byteBuffer) {
        final agpm agpm = new agpm();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        agpm.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return agpm;
    }
    
    public static void ar(final ByteBuffer byteBuffer, final agpm agpm) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        agpm.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }
    
    public static int o(final agpk agpk, final long n, final long n2, final int n3, final int n4) {
        agpk.q(4);
        agpk.u(3, n4);
        agpk.v(2, n3);
        agpk.u(1, (int)n2);
        agpk.u(0, (int)n);
        return agpk.c();
    }
    
    public static int r(final agpk agpk, final int n) {
        agpk.q(1);
        agpk.v(0, n);
        return agpk.c();
    }
    
    public final agpl A() {
        final agpl agpl = new agpl();
        final int b = this.b(18);
        if (b != 0) {
            agpl.a(b + this.a, this.b);
            return agpl;
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
    
    public final agpm ac() {
        final agpm agpm = new agpm();
        final int b = this.b(8);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm ad() {
        final agpm agpm = new agpm();
        final int b = this.b(4);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm ae(final int n) {
        final agpm agpm = new agpm();
        final int b = this.b(8);
        if (b != 0) {
            agpm.f(this.a(this.c(b) + n * 4), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm ag() {
        return this.ah(new agpm());
    }
    
    public final agpm ah(final agpm agpm) {
        final int b = this.b(4);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm ai() {
        final agpm agpm = new agpm();
        final int b = this.b(6);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm ak(final int n) {
        return this.al(new agpm(), n);
    }
    
    public final agpm al(final agpm agpm, final int n) {
        final int b = this.b(4);
        if (b != 0) {
            agpm.f(this.a(this.c(b) + n * 4), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm an() {
        final agpm agpm = new agpm();
        final int b = this.b(8);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpl ao() {
        final agpl agpl = new agpl();
        final int b = this.b(6);
        if (b != 0) {
            agpl.a(b + this.a, this.b);
            return agpl;
        }
        return null;
    }
    
    public final agpl ap() {
        final agpl agpl = new agpl();
        final int b = this.b(4);
        if (b != 0) {
            agpl.a(b + this.a, this.b);
            return agpl;
        }
        return null;
    }
    
    public final agpm aq() {
        final agpm agpm = new agpm();
        final int b = this.b(10);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
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
    
    public final int d(int n) {
        n += this.a;
        return this.b.getInt(n + this.b.getInt(n));
    }
    
    public final String e(int n) {
        final ByteBuffer b = this.b;
        final agpn c = this.c;
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
    
    public final agpl s() {
        final agpl agpl = new agpl();
        final int b = this.b(20);
        if (b != 0) {
            agpl.a(b + this.a, this.b);
            return agpl;
        }
        return null;
    }
    
    public final agpl t() {
        final agpl agpl = new agpl();
        final int b = this.b(8);
        if (b != 0) {
            agpl.a(b + this.a, this.b);
            return agpl;
        }
        return null;
    }
    
    public final agpl u() {
        final agpl agpl = new agpl();
        final int b = this.b(14);
        if (b != 0) {
            agpl.a(b + this.a, this.b);
            return agpl;
        }
        return null;
    }
    
    public final agpl v() {
        final agpl agpl = new agpl();
        final int b = this.b(16);
        if (b != 0) {
            agpl.a(b + this.a, this.b);
            return agpl;
        }
        return null;
    }
    
    public final agpl w() {
        final agpl agpl = new agpl();
        final int b = this.b(6);
        if (b != 0) {
            agpl.a(b + this.a, this.b);
            return agpl;
        }
        return null;
    }
    
    public final agpl x() {
        final agpl agpl = new agpl();
        final int b = this.b(10);
        if (b != 0) {
            agpl.a(b + this.a, this.b);
            return agpl;
        }
        return null;
    }
    
    public final agpl y() {
        final agpl agpl = new agpl();
        final int b = this.b(12);
        if (b != 0) {
            agpl.a(b + this.a, this.b);
            return agpl;
        }
        return null;
    }
    
    public final agpl z() {
        final agpl agpl = new agpl();
        final int b = this.b(4);
        if (b != 0) {
            agpl.a(b + this.a, this.b);
            return agpl;
        }
        return null;
    }
}
