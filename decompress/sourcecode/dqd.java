import java.util.Iterator;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqd extends ardf
{
    public List a;
    
    public dqd() {
        super("elst");
        this.a = new LinkedList();
    }
    
    protected final long h() {
        int n;
        if (this.s() == 1) {
            n = this.a.size() * 20;
        }
        else {
            n = this.a.size() * 12;
        }
        return n + 8L;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        final int q = aqqm.q(clm.w(byteBuffer));
        this.a = new LinkedList();
        for (int i = 0; i < q; ++i) {
            this.a.add(new dqc(this, byteBuffer));
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        clm.m(byteBuffer, (long)this.a.size());
        for (final dqc dqc : this.a) {
            if (dqc.a.s() == 1) {
                byteBuffer.putLong(dqc.b);
                byteBuffer.putLong(dqc.c);
            }
            else {
                clm.m(byteBuffer, (long)aqqm.q(dqc.b));
                byteBuffer.putInt(aqqm.q(dqc.c));
            }
            clm.i(byteBuffer, dqc.d);
        }
    }
    
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 21);
        sb.append("EditListBox{entries=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
