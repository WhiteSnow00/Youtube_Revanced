import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class auey implements Serializable
{
    public static final auey b;
    public static final auey c;
    public static final auey d;
    public static final auey e;
    public static final auey f;
    public static final auey g;
    public static final auey h;
    public static final auey i;
    public static final auey j;
    public static final auey k;
    public static final auey l;
    public static final auey m;
    public static final auey n;
    public static final auey o;
    public static final auey p;
    public static final auey q;
    public static final auey r;
    public static final auey s;
    private static final long serialVersionUID = -42615285973990L;
    public static final auey t;
    public static final auey u;
    public static final auey v;
    public static final auey w;
    public static final auey x;
    public final String y;
    
    static {
        b = (auey)new auex("era", (byte)1, aufg.a);
        final aufg d2 = aufg.d;
        c = (auey)new auex("yearOfEra", (byte)2, d2);
        d = (auey)new auex("centuryOfEra", (byte)3, aufg.b);
        e = (auey)new auex("yearOfCentury", (byte)4, d2);
        f = (auey)new auex("year", (byte)5, d2);
        final aufg g2 = aufg.g;
        g = (auey)new auex("dayOfYear", (byte)6, g2);
        h = (auey)new auex("monthOfYear", (byte)7, aufg.e);
        i = (auey)new auex("dayOfMonth", (byte)8, g2);
        final aufg c2 = aufg.c;
        j = (auey)new auex("weekyearOfCentury", (byte)9, c2);
        k = (auey)new auex("weekyear", (byte)10, c2);
        l = (auey)new auex("weekOfWeekyear", (byte)11, aufg.f);
        m = (auey)new auex("dayOfWeek", (byte)12, g2);
        n = (auey)new auex("halfdayOfDay", (byte)13, aufg.h);
        final aufg i2 = aufg.i;
        o = (auey)new auex("hourOfHalfday", (byte)14, i2);
        p = (auey)new auex("clockhourOfHalfday", (byte)15, i2);
        q = (auey)new auex("clockhourOfDay", (byte)16, i2);
        r = (auey)new auex("hourOfDay", (byte)17, i2);
        final aufg j2 = aufg.j;
        s = (auey)new auex("minuteOfDay", (byte)18, j2);
        t = (auey)new auex("minuteOfHour", (byte)19, j2);
        final aufg k2 = aufg.k;
        u = (auey)new auex("secondOfDay", (byte)20, k2);
        v = (auey)new auex("secondOfMinute", (byte)21, k2);
        final aufg l2 = aufg.l;
        w = (auey)new auex("millisOfDay", (byte)22, l2);
        x = (auey)new auex("millisOfSecond", (byte)23, l2);
    }
    
    protected auey(final String y) {
        this.y = y;
    }
    
    public abstract auew a(final aueu p0);
    
    @Override
    public final String toString() {
        return this.y;
    }
}
