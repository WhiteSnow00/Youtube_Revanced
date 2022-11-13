import java.util.Iterator;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqw extends arfu
{
    public List a;
    
    public dqw() {
        super("stsc");
        this.a = Collections.emptyList();
    }
    
    protected final long h() {
        return this.a.size() * 12 + 8;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        final int q = aqsy.q(cln.w(byteBuffer));
        this.a = new ArrayList(q);
        for (int i = 0; i < q; ++i) {
            this.a.add(new dqv(cln.w(byteBuffer), cln.w(byteBuffer), cln.w(byteBuffer)));
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        cln.m(byteBuffer, (long)this.a.size());
        for (final dqv dqv : this.a) {
            cln.m(byteBuffer, dqv.a);
            cln.m(byteBuffer, dqv.b);
            cln.m(byteBuffer, dqv.c);
        }
    }
    
    public final String toString() {
        final int size = this.a.size();
        final StringBuilder sb = new StringBuilder(40);
        sb.append("SampleToChunkBox[entryCount=");
        sb.append(size);
        sb.append("]");
        return sb.toString();
    }
}
