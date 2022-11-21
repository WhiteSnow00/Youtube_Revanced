import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arv
{
    private static final ThreadLocal d;
    public final int a;
    public volatile int b;
    public final dev c;
    
    static {
        d = new ThreadLocal();
    }
    
    public arv(final dev c, final int a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = 0;
        this.c = c;
        this.a = a;
    }
    
    public final int a(final int n) {
        final chv e = this.e();
        final int a = e.a(16);
        if (a != 0) {
            return ((ByteBuffer)e.b).getInt(e.b(a) + n * 4);
        }
        return 0;
    }
    
    public final int b() {
        final chv e = this.e();
        final int a = e.a(16);
        if (a != 0) {
            return e.c(a);
        }
        return 0;
    }
    
    public final int c() {
        final chv e = this.e();
        final int a = e.a(4);
        if (a != 0) {
            return ((ByteBuffer)e.b).getInt(a + e.a);
        }
        return 0;
    }
    
    public final short d() {
        final chv e = this.e();
        final int a = e.a(14);
        if (a != 0) {
            return ((ByteBuffer)e.b).getShort(a + e.a);
        }
        return 0;
    }
    
    public final chv e() {
        final ThreadLocal d = arv.d;
        chv chv;
        if ((chv = d.get()) == null) {
            chv = new chv();
            d.set(chv);
        }
        final Object a = this.c.a;
        final int a2 = this.a;
        final chv chv2 = (chv)a;
        final int a3 = chv2.a(6);
        if (a3 != 0) {
            final int n = chv2.b(a3) + a2 * 4;
            chv.d(n + ((ByteBuffer)chv2.b).getInt(n), (ByteBuffer)chv2.b);
        }
        return chv;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(this.c()));
        sb.append(", codepoints:");
        for (int b = this.b(), i = 0; i < b; ++i) {
            sb.append(Integer.toHexString(this.a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
