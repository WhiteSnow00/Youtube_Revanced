import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appd extends agzi implements ahax
{
    public static final appd a;
    private static volatile ahbe p;
    public int b;
    public aorm c;
    public aioe d;
    public ajsq e;
    public ajsq f;
    public ajsq g;
    public ahyq h;
    public agzy i;
    public apom j;
    public anss k;
    public String l;
    public apoo m;
    public ahgn n;
    public agyc o;
    private apdo q;
    private ahfw r;
    private byte s;
    
    static {
        agzi.registerDefaultInstance((Class)appd.class, (agzi)(a = new appd()));
    }
    
    private appd() {
        this.s = 2;
        this.i = emptyProtobufList();
        this.l = "";
        this.o = agyc.b;
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
                final ahbe p3;
                if ((p3 = appd.p) == null) {
                    synchronized (appd.class) {
                        if (appd.p == null) {
                            appd.p = (ahbe)new agzb((agzi)appd.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return appd.a;
            }
            case 4: {
                return new agza((agzi)appd.a);
            }
            case 3: {
                return new appd();
            }
            case 2: {
                return newMessageInfo((MessageLite)appd.a, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\f\u0007\u100a\r\b\u1409\u0006\t\u041b\n\u1409\u0007\u000b\u1409\n\f\u1009\u000b\r\u1409\u0005\u000e\u1409\b\u000f\u1008\t", new Object[] { "b", "c", "d", "e", "f", "g", "r", "o", "h", "i", aora.class, "j", "m", "n", "q", "k", "l" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.s = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
