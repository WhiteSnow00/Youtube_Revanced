import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public class atnx implements Iterable, atnq
{
    public final int a;
    public final int b;
    public final int c;
    
    public atnx(final int a, final int b) {
        this.a = a;
        this.b = b;
        this.c = 1;
    }
    
    public final atkk a() {
        return new atkk(this.a, this.b, 1);
    }
    
    public boolean b() {
        return this.a > this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof atnx;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            if (this.b() && ((atnx)o).b()) {
                b3 = true;
            }
            else {
                final int a = this.a;
                final atnx atnx = (atnx)o;
                b3 = b2;
                if (a == atnx.a) {
                    if (this.b == atnx.b) {
                        final int c = atnx.c;
                        return true;
                    }
                    b3 = b2;
                }
            }
        }
        return b3;
    }
    
    @Override
    public int hashCode() {
        if (this.b()) {
            return -1;
        }
        return (this.a * 31 + this.b) * 31 + 1;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("..");
        sb.append(this.b);
        sb.append(" step 1");
        return sb.toString();
    }
}
