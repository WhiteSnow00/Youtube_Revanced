import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class appk extends agzi implements ahax
{
    public static final appk a;
    private static volatile ahbe f;
    public int b;
    public ajsq c;
    public aorm d;
    public aioe e;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)appk.class, (agzi)(a = new appk()));
    }
    
    private appk() {
        this.h = 2;
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
                final ahbe f;
                if ((f = appk.f) == null) {
                    synchronized (appk.class) {
                        if (appk.f == null) {
                            appk.f = (ahbe)new agzb((agzi)appk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return appk.a;
            }
            case 4: {
                return new agza((agzi)appk.a);
            }
            case 3: {
                return new appk();
            }
            case 2: {
                return newMessageInfo((MessageLite)appk.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
