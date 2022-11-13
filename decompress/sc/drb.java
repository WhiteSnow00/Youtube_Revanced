import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drb extends arfu
{
    public final List a;
    
    public drb() {
        super("subs");
        this.a = new ArrayList();
    }
    
    protected final long h() {
        final Iterator iterator = this.a.iterator();
        long n = 8L;
        while (iterator.hasNext()) {
            final dra dra = (dra)iterator.next();
            long n2 = n + 6L;
            int n3 = 0;
            while (true) {
                n = n2;
                if (n3 >= dra.b.size()) {
                    break;
                }
                long n4;
                if (this.s() == 1) {
                    n4 = 4L;
                }
                else {
                    n4 = 2L;
                }
                n2 = n2 + n4 + 6L;
                ++n3;
            }
        }
        return n;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        final long w = cln.w(byteBuffer);
        for (int n = 0; n < w; ++n) {
            final dra dra = new dra();
            dra.a = cln.w(byteBuffer);
            for (int t = cln.t(byteBuffer), i = 0; i < t; ++i) {
                final dqz dqz = new dqz();
                long w2;
                if (this.s() == 1) {
                    w2 = cln.w(byteBuffer);
                }
                else {
                    w2 = cln.t(byteBuffer);
                }
                dqz.a = w2;
                dqz.b = cln.v(byteBuffer);
                dqz.c = cln.v(byteBuffer);
                dqz.d = cln.w(byteBuffer);
                dra.b.add(dqz);
            }
            this.a.add(dra);
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        cln.m(byteBuffer, (long)this.a.size());
        for (final dra dra : this.a) {
            cln.m(byteBuffer, dra.a);
            cln.k(byteBuffer, dra.b.size());
            for (final dqz dqz : dra.b) {
                if (this.s() == 1) {
                    cln.m(byteBuffer, dqz.a);
                }
                else {
                    cln.k(byteBuffer, aqsy.q(dqz.a));
                }
                cln.n(byteBuffer, dqz.b);
                cln.n(byteBuffer, dqz.c);
                cln.m(byteBuffer, dqz.d);
            }
        }
    }
    
    public final String toString() {
        final int size = this.a.size();
        final String string = this.a.toString();
        final StringBuilder sb = new StringBuilder(string.length() + 57);
        sb.append("SubSampleInformationBox{entryCount=");
        sb.append(size);
        sb.append(", entries=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
