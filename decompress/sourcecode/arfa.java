import java.util.Iterator;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arfa extends arey
{
    private short a;
    private short b;
    private final List c;
    private int d;
    private int e;
    private short f;
    
    public arfa() {
        this.c = new LinkedList();
    }
    
    public final String a() {
        return "rash";
    }
    
    public final ByteBuffer b() {
        final short a = this.a;
        int n;
        if (a == 1) {
            n = 13;
        }
        else {
            n = a * 6 + 11;
        }
        final ByteBuffer allocate = ByteBuffer.allocate(n);
        allocate.putShort(this.a);
        if (this.a == 1) {
            allocate.putShort(this.b);
        }
        else {
            for (final arez arez : this.c) {
                allocate.putInt(arez.a);
                allocate.putShort(arez.b);
            }
        }
        allocate.putInt(this.d);
        allocate.putInt(this.e);
        clm.n(allocate, (int)this.f);
        allocate.rewind();
        return allocate;
    }
    
    public final void c(final ByteBuffer byteBuffer) {
        final short short1 = byteBuffer.getShort();
        this.a = short1;
        int i = short1;
        if (short1 == 1) {
            this.b = byteBuffer.getShort();
        }
        else {
            while (i > 0) {
                this.c.add(new arez(aqqm.q(clm.w(byteBuffer)), byteBuffer.getShort()));
                --i;
            }
        }
        this.d = aqqm.q(clm.w(byteBuffer));
        this.e = aqqm.q(clm.w(byteBuffer));
        this.f = (short)clm.v(byteBuffer);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final arfa arfa = (arfa)o;
            return this.f == arfa.f && this.d == arfa.d && this.e == arfa.e && this.a == arfa.a && this.b == arfa.b && this.c.equals(arfa.c);
        }
        return false;
    }
    
    public final int hashCode() {
        return ((((this.a * 31 + this.b) * 31 + this.c.hashCode()) * 31 + this.d) * 31 + this.e) * 31 + this.f;
    }
}
