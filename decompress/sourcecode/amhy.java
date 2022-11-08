import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhy extends agzi implements ahax
{
    public static final amhy a;
    private static volatile ahbe n;
    public int b;
    public ajsq c;
    public amhw d;
    public amic e;
    public aioe f;
    public agzy g;
    public aioe h;
    public String i;
    public aioe j;
    public anss k;
    public boolean l;
    public anss m;
    private amhw o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance((Class)amhy.class, (agzi)(a = new amhy()));
    }
    
    private amhy() {
        this.p = 2;
        this.g = emptyProtobufList();
        this.i = "";
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
                final ahbe n;
                if ((n = amhy.n) == null) {
                    synchronized (amhy.class) {
                        if (amhy.n == null) {
                            amhy.n = (ahbe)new agzb((agzi)amhy.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return amhy.a;
            }
            case 4: {
                return new agza((agzi)amhy.a);
            }
            case 3: {
                return new amhy();
            }
            case 2: {
                return newMessageInfo((MessageLite)amhy.a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\n\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u041b\u0007\u1409\u0005\b\u1008\u0006\t\u1409\u0007\n\u1409\b\u000b\u1007\t\f\u1409\n", new Object[] { "b", "c", "d", "o", "e", "f", "g", anss.class, "h", "i", "j", "k", "l", "m" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
