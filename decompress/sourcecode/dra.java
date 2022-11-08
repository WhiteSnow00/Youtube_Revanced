import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dra extends ardf
{
    public final List a;
    
    public dra() {
        super("subs");
        this.a = new ArrayList();
    }
    
    protected final long h() {
        final Iterator iterator = this.a.iterator();
        long n = 8L;
        while (iterator.hasNext()) {
            final dqz dqz = (dqz)iterator.next();
            long n2 = n + 6L;
            int n3 = 0;
            while (true) {
                n = n2;
                if (n3 >= dqz.b.size()) {
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
        final long w = clm.w(byteBuffer);
        for (int n = 0; n < w; ++n) {
            final dqz dqz = new dqz();
            dqz.a = clm.w(byteBuffer);
            for (int t = clm.t(byteBuffer), i = 0; i < t; ++i) {
                final dqy dqy = new dqy();
                long w2;
                if (this.s() == 1) {
                    w2 = clm.w(byteBuffer);
                }
                else {
                    w2 = clm.t(byteBuffer);
                }
                dqy.a = w2;
                dqy.b = clm.v(byteBuffer);
                dqy.c = clm.v(byteBuffer);
                dqy.d = clm.w(byteBuffer);
                dqz.b.add(dqy);
            }
            this.a.add(dqz);
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        clm.m(byteBuffer, (long)this.a.size());
        for (final dqz dqz : this.a) {
            clm.m(byteBuffer, dqz.a);
            clm.k(byteBuffer, dqz.b.size());
            for (final dqy dqy : dqz.b) {
                if (this.s() == 1) {
                    clm.m(byteBuffer, dqy.a);
                }
                else {
                    clm.k(byteBuffer, aqqm.q(dqy.a));
                }
                clm.n(byteBuffer, dqy.b);
                clm.n(byteBuffer, dqy.c);
                clm.m(byteBuffer, dqy.d);
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
