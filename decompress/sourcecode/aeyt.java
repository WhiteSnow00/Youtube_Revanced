// 
// Decompiled by Procyon v0.6.0
// 

public final class aeyt implements aeyr
{
    volatile aeyr a;
    volatile boolean b;
    Object c;
    
    public aeyt(final aeyr a) {
        a.getClass();
        this.a = a;
    }
    
    public final Object a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    final aeyr a = this.a;
                    a.getClass();
                    final Object a2 = a.a();
                    this.c = a2;
                    this.b = true;
                    this.a = null;
                    return a2;
                }
            }
        }
        return this.c;
    }
    
    @Override
    public final String toString() {
        final aeyr a = this.a;
        final StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        Object string = a;
        if (a == null) {
            final StringBuilder sb2 = new StringBuilder("<supplier that returned ");
            sb2.append(this.c);
            sb2.append(">");
            string = sb2.toString();
        }
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
