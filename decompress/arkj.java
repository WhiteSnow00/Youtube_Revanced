import java.util.Iterator;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arkj extends arkh
{
    private short a;
    private short b;
    private final List c;
    private int d;
    private int e;
    private short f;
    
    public arkj() {
        this.c = new LinkedList();
    }
    
    @Override
    public final String a() {
        return "rash";
    }
    
    @Override
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
            for (final arki arki : this.c) {
                allocate.putInt(arki.a);
                allocate.putShort(arki.b);
            }
        }
        allocate.putInt(this.d);
        allocate.putInt(this.e);
        cop.l(allocate, (int)this.f);
        allocate.rewind();
        return allocate;
    }
    
    @Override
    public final void c(final ByteBuffer byteBuffer) {
        final short short1 = byteBuffer.getShort();
        this.a = short1;
        int i = short1;
        if (short1 == 1) {
            this.b = byteBuffer.getShort();
        }
        else {
            while (i > 0) {
                this.c.add(new arki(aqvs.o(coh.j(byteBuffer)), byteBuffer.getShort()));
                --i;
            }
        }
        this.d = aqvs.o(coh.j(byteBuffer));
        this.e = aqvs.o(coh.j(byteBuffer));
        this.f = (short)coh.i(byteBuffer);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final arkj arkj = (arkj)o;
            return this.f == arkj.f && this.d == arkj.d && this.e == arkj.e && this.a == arkj.a && this.b == arkj.b && this.c.equals(arkj.c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((this.a * 31 + this.b) * 31 + this.c.hashCode()) * 31 + this.d) * 31 + this.e) * 31 + this.f;
    }
}
