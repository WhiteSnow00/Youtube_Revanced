// 
// Decompiled by Procyon v0.6.0
// 

public final class afck implements afci
{
    volatile afci a;
    volatile boolean b;
    Object c;
    
    public afck(final afci a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final Object a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    final afci a = this.a;
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
        final afci a = this.a;
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
