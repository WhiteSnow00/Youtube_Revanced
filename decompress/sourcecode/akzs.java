import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzs extends agzi implements ahax
{
    public static final akzs a;
    private static volatile ahbe d;
    public akjf b;
    public boolean c;
    private int e;
    private aidl f;
    private ajtl g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)akzs.class, (agzi)(a = new akzs()));
    }
    
    private akzs() {
        this.h = 2;
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
                final ahbe d;
                if ((d = akzs.d) == null) {
                    synchronized (akzs.class) {
                        if (akzs.d == null) {
                            akzs.d = (ahbe)new agzb((agzi)akzs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akzs.a;
            }
            case 4: {
                return new agza((agzi)akzs.a);
            }
            case 3: {
                return new akzs();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzs.a, "\u0001\u0004\u0000\u0001\u0001\u0309\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0004\u1409\u0003\u0012\u1007\u000f\u0309\u1409\u0010", new Object[] { "e", "b", "f", "c", "g" });
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
