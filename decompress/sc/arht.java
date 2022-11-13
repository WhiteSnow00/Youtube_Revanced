import java.util.Iterator;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arht extends arfu
{
    public String a;
    public final List b;
    private String c;
    
    public arht() {
        super("sbgp");
        this.b = new LinkedList();
    }
    
    protected final long h() {
        int n;
        if (this.s() == 1) {
            n = this.b.size() * 8 + 16;
        }
        else {
            n = this.b.size() * 8 + 12;
        }
        return n;
    }
    
    protected final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        this.a = cln.y(byteBuffer);
        if (this.s() == 1) {
            this.c = cln.y(byteBuffer);
        }
        long w = cln.w(byteBuffer);
        while (w > 0L) {
            --w;
            this.b.add(new arhs((long)aqsy.q(cln.w(byteBuffer)), aqsy.q(cln.w(byteBuffer))));
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        byteBuffer.put(this.a.getBytes());
        if (this.s() == 1) {
            byteBuffer.put(this.c.getBytes());
        }
        cln.m(byteBuffer, (long)this.b.size());
        for (final arhs arhs : this.b) {
            cln.m(byteBuffer, arhs.a);
            cln.m(byteBuffer, (long)arhs.b);
        }
    }
}
