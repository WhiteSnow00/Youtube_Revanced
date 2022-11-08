import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class appv extends agzi implements ahax
{
    public static final appv a;
    private static volatile ahbe c;
    public agzy b;
    private int d;
    private ajsq e;
    private aioe f;
    private ajsq g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)appv.class, (agzi)(a = new appv()));
    }
    
    private appv() {
        this.i = 2;
        this.b = emptyProtobufList();
        final agyc b = agyc.b;
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
                final ahbe c;
                if ((c = appv.c) == null) {
                    synchronized (appv.class) {
                        if (appv.c == null) {
                            appv.c = (ahbe)new agzb((agzi)appv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return appv.a;
            }
            case 4: {
                return new agza((agzi)appv.a);
            }
            case 3: {
                return new appv();
            }
            case 2: {
                return newMessageInfo((MessageLite)appv.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u1409\u0003\u0006\u1409\u0002", new Object[] { "d", "e", "b", appt.class, "f", "h", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
