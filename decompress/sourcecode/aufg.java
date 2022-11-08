import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aufg implements Serializable
{
    public static final aufg a;
    public static final aufg b;
    public static final aufg c;
    public static final aufg d;
    public static final aufg e;
    public static final aufg f;
    public static final aufg g;
    public static final aufg h;
    public static final aufg i;
    public static final aufg j;
    public static final aufg k;
    public static final aufg l;
    private static final long serialVersionUID = 8765135187319L;
    public final String m;
    
    static {
        a = (aufg)new auff("eras", (byte)1);
        b = (aufg)new auff("centuries", (byte)2);
        c = (aufg)new auff("weekyears", (byte)3);
        d = (aufg)new auff("years", (byte)4);
        e = (aufg)new auff("months", (byte)5);
        f = (aufg)new auff("weeks", (byte)6);
        g = (aufg)new auff("days", (byte)7);
        h = (aufg)new auff("halfdays", (byte)8);
        i = (aufg)new auff("hours", (byte)9);
        j = (aufg)new auff("minutes", (byte)10);
        k = (aufg)new auff("seconds", (byte)11);
        l = (aufg)new auff("millis", (byte)12);
    }
    
    protected aufg(final String m) {
        this.m = m;
    }
    
    public abstract aufe a(final aueu p0);
    
    @Override
    public final String toString() {
        return this.m;
    }
}
