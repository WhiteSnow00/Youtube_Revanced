import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aien extends agzi implements ahax
{
    public static final aien a;
    private static volatile ahbe s;
    public int b;
    public ajsq c;
    public String d;
    public boolean e;
    public ajsq f;
    public String g;
    public boolean h;
    public aiep i;
    public ajsq j;
    public int k;
    public int l;
    public int m;
    public ajia n;
    public agzy o;
    public ajsq p;
    public ajsq q;
    public ajsq r;
    private byte t;
    
    static {
        agzi.registerDefaultInstance((Class)aien.class, (agzi)(a = new aien()));
    }
    
    private aien() {
        this.t = 2;
        this.d = "";
        this.e = true;
        this.g = "";
        this.h = true;
        this.o = emptyProtobufList();
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
                final ahbe s;
                if ((s = aien.s) == null) {
                    synchronized (aien.class) {
                        if (aien.s == null) {
                            aien.s = (ahbe)new agzb((agzi)aien.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return aien.a;
            }
            case 4: {
                return new agza((agzi)aien.a);
            }
            case 3: {
                return new aien();
            }
            case 2: {
                return newMessageInfo((MessageLite)aien.a, "\u0001\u0010\u0000\u0001\u0002\u0013\u0010\u0000\u0001\b\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1007\u0003\u0006\u1409\u0005\u0007\u1008\u0006\b\u1007\u0007\n\u1009\t\u000b\u1004\u000b\f\u1004\f\r\u1004\r\u000e\u1409\u000e\u000f\u041b\u0010\u1409\n\u0011\u1409\u000f\u0012\u1409\u0010\u0013\u1409\u0011", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "m", "n", "o", ajsq.class, "j", "p", "q", "r" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.t = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.t;
            }
        }
    }
}
