import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsb extends agzi implements ahax
{
    public static final apsb a;
    private static volatile ahbe l;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    
    static {
        agzi.registerDefaultInstance((Class)apsb.class, (agzi)(a = new apsb()));
    }
    
    private apsb() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.h = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe l;
                if ((l = apsb.l) == null) {
                    synchronized (apsb.class) {
                        if (apsb.l == null) {
                            apsb.l = (ahbe)new agzb((agzi)apsb.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return apsb.a;
            }
            case 4: {
                return new agza((agzi)apsb.a);
            }
            case 3: {
                return new apsb();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsb.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1007\u0006\u0006\u1008\u0005\u0007\u1007\u0004\b\u1007\u0007\t\u1007\b", new Object[] { "b", "c", "d", "e", "f", "i", "h", "g", "j", "k" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
