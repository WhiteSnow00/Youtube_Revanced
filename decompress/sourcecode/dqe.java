import java.util.Iterator;
import java.util.LinkedList;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqe extends ardd
{
    public String a;
    public List b;
    private long c;
    
    public dqe() {
        super("ftyp");
        this.b = Collections.emptyList();
    }
    
    public dqe(final String a, final long c, final List b) {
        super("ftyp");
        Collections.emptyList();
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    protected final long h() {
        return this.b.size() * 4 + 8;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.a = clm.y(byteBuffer);
        this.c = clm.w(byteBuffer);
        final int n = byteBuffer.remaining() / 4;
        this.b = new LinkedList();
        for (int i = 0; i < n; ++i) {
            this.b.add(clm.y(byteBuffer));
        }
    }
    
    @Override
    protected final void j(final ByteBuffer byteBuffer) {
        byteBuffer.put(dps.b(this.a));
        clm.m(byteBuffer, this.c);
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            byteBuffer.put(dps.b((String)iterator.next()));
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FileTypeBox[majorBrand=");
        sb.append(this.a);
        sb.append(";minorVersion=");
        sb.append(this.c);
        for (final String s : this.b) {
            sb.append(";compatibleBrand=");
            sb.append(s);
        }
        sb.append("]");
        return sb.toString();
    }
}
