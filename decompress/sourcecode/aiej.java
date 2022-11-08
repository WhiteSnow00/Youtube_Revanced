import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiej extends agzi implements ahax
{
    public static final aiej a;
    public static final agzg b;
    private static volatile ahbe v;
    public int c;
    public String d;
    public boolean e;
    public String f;
    public int g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public ajsq p;
    public boolean q;
    public String r;
    public boolean s;
    public boolean t;
    public String u;
    private byte w;
    
    static {
        final aiej a2 = new aiej();
        agzi.registerDefaultInstance((Class)aiej.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, (Object)a2, (MessageLite)a2, (agzn)null, 218, ahcm.k, (Class)aiej.class);
    }
    
    private aiej() {
        this.w = 2;
        this.d = "";
        this.f = "";
        this.h = "";
        this.i = "";
        this.r = "";
        this.u = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe v;
                if ((v = aiej.v) == null) {
                    synchronized (aiej.class) {
                        if (aiej.v == null) {
                            aiej.v = (ahbe)new agzb((agzi)aiej.a);
                        }
                    }
                }
                return v;
            }
            case 5: {
                return aiej.a;
            }
            case 4: {
                return new agza((agzi)aiej.a);
            }
            case 3: {
                return new aiej();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiej.a, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u100c\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1007\u0006\b\u1007\u0007\t\u1007\b\n\u1007\t\u000b\u1007\n\f\u1007\u000b\r\u1409\f\u000e\u1007\r\u000f\u1008\u000e\u0010\u1007\u000f\u0011\u1007\u0010\u0012\u1008\u0011", new Object[] { "c", "d", "e", "f", "g", amzb.a(), "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.w = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.w;
            }
        }
    }
}
