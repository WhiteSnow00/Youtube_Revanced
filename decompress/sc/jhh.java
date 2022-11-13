// 
// Decompiled by Procyon v0.6.0
// 

public final class jhh implements jhi
{
    public static final jhh a;
    public static final jhh b;
    public static final jhh c;
    public static final jhh d;
    public static final jhh e;
    private final int f;
    
    static {
        e = new jhh(4);
        d = new jhh(3);
        c = new jhh(2);
        b = new jhh(1);
        a = new jhh(0);
    }
    
    private jhh(final int f) {
        this.f = f;
    }
    
    public final Object a(final Object o) {
        final int f = this.f;
        final Object o2 = null;
        final Object o3 = null;
        final Object o4 = null;
        final Object o5 = null;
        final Object o6 = null;
        if (f == 0) {
            final aotd aotd = (aotd)o;
            Object o7 = o5;
            if ((aotd.b & 0x80) != 0x0 && (o7 = aotd.f) == null) {
                o7 = aotb.a;
            }
            return o7;
        }
        if (f == 1) {
            final aotd aotd2 = (aotd)o;
            Object o8 = o4;
            if ((aotd2.b & 0x1) != 0x0 && (o8 = aotd2.c) == null) {
                o8 = aosr.a;
            }
            return o8;
        }
        if (f == 2) {
            final aotd aotd3 = (aotd)o;
            Object o9 = o3;
            if ((aotd3.b & 0x8000) != 0x0 && (o9 = aotd3.l) == null) {
                o9 = aota.a;
            }
            return o9;
        }
        if (f != 3) {
            final aotd aotd4 = (aotd)o;
            Object o10 = o6;
            if ((aotd4.b & 0x80) != 0x0 && (o10 = aotd4.f) == null) {
                o10 = aotb.a;
            }
            return o10;
        }
        final aotd aotd5 = (aotd)o;
        Object o11 = o2;
        if ((aotd5.b & 0x4000) != 0x0 && (o11 = aotd5.k) == null) {
            o11 = aotf.a;
        }
        return o11;
    }
}
