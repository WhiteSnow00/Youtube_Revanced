// 
// Decompiled by Procyon v0.6.0
// 

public final class atwu extends atyt implements atws
{
    public final Throwable a;
    
    public atwu() {
    }
    
    public atwu(final Throwable a) {
        this.a = a;
    }
    
    public final Throwable a() {
        Object a;
        if ((a = this.a) == null) {
            a = new atwk();
        }
        return (Throwable)a;
    }
    
    public final void b(final Object o) {
    }
    
    public final atzc d(final Object o) {
        return atsx.a;
    }
    
    public final /* bridge */ Object e() {
        return this;
    }
    
    public final String toString() {
        final String b = attu.b(this);
        final Throwable a = this.a;
        final StringBuilder sb = new StringBuilder("Closed@");
        sb.append(b);
        sb.append("[");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }
}
