import java.util.Iterator;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqv extends ardf
{
    public List a;
    
    public dqv() {
        super("stsc");
        this.a = Collections.emptyList();
    }
    
    protected final long h() {
        return this.a.size() * 12 + 8;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        final int q = aqqm.q(clm.w(byteBuffer));
        this.a = new ArrayList(q);
        for (int i = 0; i < q; ++i) {
            this.a.add(new dqu(clm.w(byteBuffer), clm.w(byteBuffer), clm.w(byteBuffer)));
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        clm.m(byteBuffer, (long)this.a.size());
        for (final dqu dqu : this.a) {
            clm.m(byteBuffer, dqu.a);
            clm.m(byteBuffer, dqu.b);
            clm.m(byteBuffer, dqu.c);
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
