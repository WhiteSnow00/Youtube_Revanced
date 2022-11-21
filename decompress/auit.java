import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class auit implements Serializable
{
    public static final auit a;
    public static final auit b;
    public static final auit c;
    public static final auit d;
    public static final auit e;
    public static final auit f;
    public static final auit g;
    public static final auit h;
    public static final auit i;
    public static final auit j;
    public static final auit k;
    public static final auit l;
    private static final long serialVersionUID = 8765135187319L;
    public final String m;
    
    static {
        a = new auis("eras", (byte)1);
        b = new auis("centuries", (byte)2);
        c = new auis("weekyears", (byte)3);
        d = new auis("years", (byte)4);
        e = new auis("months", (byte)5);
        f = new auis("weeks", (byte)6);
        g = new auis("days", (byte)7);
        h = new auis("halfdays", (byte)8);
        i = new auis("hours", (byte)9);
        j = new auis("minutes", (byte)10);
        k = new auis("seconds", (byte)11);
        l = new auis("millis", (byte)12);
    }
    
    protected auit(final String m) {
        this.m = m;
    }
    
    public abstract auir a(final auih p0);
    
    @Override
    public final String toString() {
        return this.m;
    }
}
