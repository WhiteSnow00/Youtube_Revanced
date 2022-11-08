import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoof extends agzi implements ahax
{
    public static final aoof a;
    private static volatile ahbe q;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public int g;
    public String h;
    public String i;
    public int j;
    public String k;
    public String l;
    public String m;
    public int n;
    public int o;
    public int p;
    
    static {
        agzi.registerDefaultInstance((Class)aoof.class, (agzi)(a = new aoof()));
    }
    
    private aoof() {
        this.h = "";
        this.i = "";
        this.k = "";
        this.l = "";
        this.m = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe q;
                if ((q = aoof.q) == null) {
                    synchronized (aoof.class) {
                        if (aoof.q == null) {
                            aoof.q = (ahbe)new agzb((agzi)aoof.a);
                        }
                    }
                }
                return q;
            }
            case 5: {
                return aoof.a;
            }
            case 4: {
                return new agza((agzi)aoof.a);
            }
            case 3: {
                return new aoof();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoof.a, "\u0001\u000e\u0000\u0001\u0001\u0011\u000e\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1002\u0003\u0005\u1004\u0004\u0006\u1008\u0005\u0007\u1008\u0006\b\u1004\u0007\n\u1008\t\u000b\u1008\n\f\u1008\u000b\r\u1004\f\u000e\u1004\r\u0011\u1004\u0010", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p" });
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
