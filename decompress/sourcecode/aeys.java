import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeys implements Serializable, aeyr
{
    private static final long serialVersionUID = 0L;
    final aeyr a;
    transient volatile boolean b;
    transient Object c;
    
    public aeys(final aeyr a) {
        a.getClass();
        this.a = a;
    }
    
    public final Object a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    final Object a = this.a.a();
                    this.c = a;
                    this.b = true;
                    return a;
                }
            }
        }
        return this.c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        Object o;
        if (this.b) {
            final StringBuilder sb2 = new StringBuilder("<supplier that returned ");
            sb2.append(this.c);
            sb2.append(">");
            o = sb2.toString();
        }
        else {
            o = this.a;
        }
        sb.append(o);
        sb.append(")");
        return sb.toString();
    }
}
