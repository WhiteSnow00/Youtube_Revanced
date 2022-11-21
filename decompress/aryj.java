import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aryj
{
    public final arwr a;
    public final arze b;
    public final arzi c;
    
    public aryj() {
    }
    
    public aryj(final arzi c, final arze b, final arwr a) {
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final aryj aryj = (aryj)o;
                if (aexq.c(this.a, aryj.a) && aexq.c(this.b, aryj.b) && aexq.c(this.c, aryj.c)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c });
    }
    
    @Override
    public final String toString() {
        final String string = this.c.toString();
        final String string2 = this.b.toString();
        final String string3 = this.a.toString();
        final StringBuilder sb = new StringBuilder("[method=");
        sb.append(string);
        sb.append(" headers=");
        sb.append(string2);
        sb.append(" callOptions=");
        sb.append(string3);
        sb.append("]");
        return sb.toString();
    }
}
