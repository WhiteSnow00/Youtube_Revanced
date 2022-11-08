import java.util.Iterator;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqq extends ardf
{
    public List a;
    
    public dqq() {
        super("sdtp");
        this.a = new ArrayList();
    }
    
    protected final long h() {
        return this.a.size() + 4;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        while (byteBuffer.remaining() > 0) {
            this.a.add(new dqp(clm.v(byteBuffer)));
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            clm.n(byteBuffer, ((dqp)iterator.next()).a);
        }
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SampleDependencyTypeBox{entries=");
        sb.append(this.a);
        sb.append('}');
        return sb.toString();
    }
}
