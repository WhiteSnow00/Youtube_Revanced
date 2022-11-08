import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amve extends agzi implements ahax
{
    public static final agzr a;
    public static final amve b;
    private static volatile ahbe q;
    public agyc c;
    public agyc d;
    public long e;
    public String f;
    public long g;
    public long h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public agzq o;
    public boolean p;
    private int r;
    private int s;
    
    static {
        a = (agzr)new altr(4);
        agzi.registerDefaultInstance(amve.class, b = new amve());
    }
    
    private amve() {
        this.c = agyc.b;
        this.d = agyc.b;
        this.f = "";
        this.o = agzi.emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe q;
                if ((q = amve.q) == null) {
                    synchronized (amve.class) {
                        if (amve.q == null) {
                            amve.q = (ahbe)new agzb((agzi)amve.b);
                        }
                    }
                }
                return q;
            }
            case 5: {
                return amve.b;
            }
            case 4: {
                return new agza((agzi)amve.b);
            }
            case 3: {
                return new amve();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amve.b, "\u0001\u000e\u0000\u0002\u0001\"\u000e\u0000\u0001\u0000\u0001\u100a\u0000\u0002\u1002\u0002\u0003\u100a\u0001\u0005\u1008\u0005\u0006\u1002\u0006\u0007\u1002\u0007\u000b\u1007\n\u000e\u1004\r\u000f\u1004\u000e\u0010\u1004\u000f\u0013\u1004\u0012\u0019\u1004\u0018 ,\"\u1007 ", new Object[] { "r", "s", "c", "e", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", aikd.a(), "p" });
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
