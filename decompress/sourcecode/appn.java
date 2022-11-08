import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appn extends agzd implements agze
{
    public static final appn a;
    private static volatile ahbe h;
    public int b;
    public agzy c;
    public agzy d;
    public agzy e;
    public int f;
    public agyc g;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)appn.class, (agzi)(a = new appn()));
    }
    
    private appn() {
        this.j = 2;
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        this.g = agyc.b;
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
                final ahbe h;
                if ((h = appn.h) == null) {
                    synchronized (appn.class) {
                        if (appn.h == null) {
                            appn.h = (ahbe)new agzb((agzi)appn.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return appn.a;
            }
            case 4: {
                return new agzc(appn.a);
            }
            case 3: {
                return new appn();
            }
            case 2: {
                return newMessageInfo((MessageLite)appn.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0004\u0001\u041b\u0002\u041b\u0003\u1409\u0001\u0004\u100a\u0002\u0005\u041b\u0006\u1004\u0000", new Object[] { "b", "c", appg.class, "d", ajsq.class, "i", "g", "e", ajsq.class, "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
