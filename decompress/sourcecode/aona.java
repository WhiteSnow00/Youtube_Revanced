import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aona extends agzi implements ahax
{
    public static final aona a;
    private static volatile ahbe e;
    public int b;
    public ajsq c;
    public aioe d;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aona.class, (agzi)(a = new aona()));
    }
    
    private aona() {
        this.g = 2;
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
                if ((e = aona.e) == null) {
                    synchronized (aona.class) {
                        if (aona.e == null) {
                            aona.e = (ahbe)new agzb((agzi)aona.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aona.a;
            }
            case 4: {
                return new agza((agzi)aona.a);
            }
            case 3: {
                return new aona();
            }
            case 2: {
                return newMessageInfo((MessageLite)aona.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003", new Object[] { "b", "c", "d", "f" });
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
