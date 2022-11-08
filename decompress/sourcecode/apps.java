import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class apps extends agzi implements ahax
{
    public static final apps a;
    private static volatile ahbe f;
    public int b;
    public aorm c;
    public aioe d;
    public ajsq e;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)apps.class, (agzi)(a = new apps()));
    }
    
    private apps() {
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
                if ((f = apps.f) == null) {
                    synchronized (apps.class) {
                        if (apps.f == null) {
                            apps.f = (ahbe)new agzb((agzi)apps.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apps.a;
            }
            case 4: {
                return new agza((agzi)apps.a);
            }
            case 3: {
                return new apps();
            }
            case 2: {
                return newMessageInfo((MessageLite)apps.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "g" });
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
