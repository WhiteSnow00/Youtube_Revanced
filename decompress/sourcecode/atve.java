// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atve
{
    private final atou a;
    
    public atve() {
    }
    
    public atve(final byte[] array) {
        this.a = auet.h(atuj.a);
    }
    
    public abstract Object a(final Object p0);
    
    public abstract void b(final Object p0, final Object p1);
    
    public final Object c(final Object o) {
        Object o2;
        if ((o2 = this.a.a) == atuj.a) {
            final Object a = this.a(o);
            final boolean a2 = atqb.a;
            o2 = this.a.a;
            final Object a3 = atuj.a;
            if (o2 == a3) {
                o2 = a;
                if (!this.a.d(a3, a)) {
                    o2 = this.a.a;
                }
            }
        }
        this.b(o, o2);
        return o2;
    }
    
    @Override
    public final String toString() {
        final String a = atqc.a(this);
        final String b = atqc.b(this);
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("@");
        sb.append(b);
        return sb.toString();
    }
}
