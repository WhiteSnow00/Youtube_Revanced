// 
// Decompiled by Procyon v0.6.0
// 

public final class adin implements asme
{
    public final adio a;
    public final long b;
    public final ahcr c;
    public final ahcr d;
    
    public adin(final adio a, final ahcr c, final long b, final ahcr d) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    @Override
    public final Object a(final Object o, final Object o2) {
        final adio a = this.a;
        final ahcr c = this.c;
        final long b = this.b;
        final ahcr d = this.d;
        final Long n = (Long)o;
        final Long n2 = (Long)o2;
        final long longValue = n;
        final int e = (int)longValue;
        if (longValue == e) {
            c.copyOnWrite();
            final aoss aoss = (aoss)c.instance;
            final aoss a2 = aoss.a;
            aoss.b |= 0x10;
            aoss.e = e;
            final long longValue2 = n2;
            c.copyOnWrite();
            final aoss aoss2 = (aoss)c.instance;
            aoss2.b |= 0x20;
            aoss2.f = longValue2;
            final long d2 = a.a.d();
            final long b2 = a.b;
            c.copyOnWrite();
            final aoss aoss3 = (aoss)c.instance;
            aoss3.b |= 0x4;
            aoss3.c = d2 - b2;
            c.copyOnWrite();
            final aoss aoss4 = (aoss)c.instance;
            aoss4.b |= 0x8;
            aoss4.d = b;
            final aoss j = (aoss)c.build();
            d.copyOnWrite();
            final aosv aosv = (aosv)d.instance;
            final aosv a3 = aosv.a;
            j.getClass();
            aosv.j = j;
            aosv.b |= 0x1000;
            return d;
        }
        throw new ArithmeticException();
    }
}
