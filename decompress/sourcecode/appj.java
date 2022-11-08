import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class appj extends agzi implements ahax
{
    public static final appj a;
    private static volatile ahbe e;
    public int b;
    public ajsq c;
    public agzy d;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)appj.class, (agzi)(a = new appj()));
    }
    
    private appj() {
        this.g = 2;
        this.d = emptyProtobufList();
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
                final ahbe e;
                if ((e = appj.e) == null) {
                    synchronized (appj.class) {
                        if (appj.e == null) {
                            appj.e = (ahbe)new agzb((agzi)appj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return appj.a;
            }
            case 4: {
                return new agza((agzi)appj.a);
            }
            case 3: {
                return new appj();
            }
            case 2: {
                return newMessageInfo((MessageLite)appj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001", new Object[] { "b", "c", "d", appk.class, "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
