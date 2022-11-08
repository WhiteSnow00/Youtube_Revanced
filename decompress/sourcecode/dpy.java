import java.util.Iterator;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dpy extends ardf
{
    public List a;
    
    public dpy() {
        super("ctts");
        this.a = Collections.emptyList();
    }
    
    protected final long h() {
        return this.a.size() * 8 + 8;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        final int q = aqqm.q(clm.w(byteBuffer));
        this.a = new ArrayList(q);
        for (int i = 0; i < q; ++i) {
            this.a.add(new dpx(aqqm.q(clm.w(byteBuffer)), byteBuffer.getInt()));
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        clm.m(byteBuffer, (long)this.a.size());
        for (final dpx dpx : this.a) {
            clm.m(byteBuffer, (long)dpx.a);
            byteBuffer.putInt(dpx.b);
        }
    }
}
