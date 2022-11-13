import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class augq implements Comparable, Serializable, augh
{
    private static final long serialVersionUID = 9386874258972L;
    public volatile int g;
    
    protected augq(final int g) {
        this.g = g;
    }
    
    public final int a(final aufx aufx) {
        throw null;
    }
    
    public final int b(final int n) {
        if (n == 0) {
            return this.g;
        }
        throw new IndexOutOfBoundsException(String.valueOf(n));
    }
    
    public final int c() {
        return 1;
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        final augq augq = (augq)o;
        if (augq.getClass() == this.getClass()) {
            final int g = augq.g;
            final int g2 = this.g;
            int n;
            if (g2 > g) {
                n = 1;
            }
            else {
                if (g2 >= g) {
                    return 0;
                }
                n = -1;
            }
            return n;
        }
        final String value = String.valueOf(this.getClass());
        final String value2 = String.valueOf(augq.getClass());
        final StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" cannot be compared to ");
        sb.append(value2);
        throw new ClassCastException(sb.toString());
    }
    
    public final aufx d(final int n) {
        if (n == 0) {
            return this.f();
        }
        throw new IndexOutOfBoundsException(String.valueOf(n));
    }
    
    public abstract auge e();
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof augh)) {
            return false;
        }
        final augh augh = (augh)o;
        return augh.e() == this.e() && augh.b(0) == this.g;
    }
    
    public abstract aufx f();
    
    @Override
    public final int hashCode() {
        return (this.g + 459) * 27 + this.f().hashCode();
    }
}
