import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class auil implements Serializable
{
    public static final auil b;
    public static final auil c;
    public static final auil d;
    public static final auil e;
    public static final auil f;
    public static final auil g;
    public static final auil h;
    public static final auil i;
    public static final auil j;
    public static final auil k;
    public static final auil l;
    public static final auil m;
    public static final auil n;
    public static final auil o;
    public static final auil p;
    public static final auil q;
    public static final auil r;
    public static final auil s;
    private static final long serialVersionUID = -42615285973990L;
    public static final auil t;
    public static final auil u;
    public static final auil v;
    public static final auil w;
    public static final auil x;
    public final String y;
    
    static {
        b = new auik("era", (byte)1, auit.a);
        final auit d2 = auit.d;
        c = new auik("yearOfEra", (byte)2, d2);
        d = new auik("centuryOfEra", (byte)3, auit.b);
        e = new auik("yearOfCentury", (byte)4, d2);
        f = new auik("year", (byte)5, d2);
        final auit g2 = auit.g;
        g = new auik("dayOfYear", (byte)6, g2);
        h = new auik("monthOfYear", (byte)7, auit.e);
        i = new auik("dayOfMonth", (byte)8, g2);
        final auit c2 = auit.c;
        j = new auik("weekyearOfCentury", (byte)9, c2);
        k = new auik("weekyear", (byte)10, c2);
        l = new auik("weekOfWeekyear", (byte)11, auit.f);
        m = new auik("dayOfWeek", (byte)12, g2);
        n = new auik("halfdayOfDay", (byte)13, auit.h);
        final auit i2 = auit.i;
        o = new auik("hourOfHalfday", (byte)14, i2);
        p = new auik("clockhourOfHalfday", (byte)15, i2);
        q = new auik("clockhourOfDay", (byte)16, i2);
        r = new auik("hourOfDay", (byte)17, i2);
        final auit j2 = auit.j;
        s = new auik("minuteOfDay", (byte)18, j2);
        t = new auik("minuteOfHour", (byte)19, j2);
        final auit k2 = auit.k;
        u = new auik("secondOfDay", (byte)20, k2);
        v = new auik("secondOfMinute", (byte)21, k2);
        final auit l2 = auit.l;
        w = new auik("millisOfDay", (byte)22, l2);
        x = new auik("millisOfSecond", (byte)23, l2);
    }
    
    protected auil(final String y) {
        this.y = y;
    }
    
    public abstract auij a(final auih p0);
    
    @Override
    public final String toString() {
        return this.y;
    }
}
