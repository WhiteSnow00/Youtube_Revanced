import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzx extends agzi implements ahax
{
    public static final akzx a;
    private static volatile ahbe c;
    public akjf b;
    private int d;
    private ajtl e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)akzx.class, (agzi)(a = new akzx()));
    }
    
    private akzx() {
        this.f = 2;
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
                if ((c = akzx.c) == null) {
                    synchronized (akzx.class) {
                        if (akzx.c == null) {
                            akzx.c = (ahbe)new agzb((agzi)akzx.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akzx.a;
            }
            case 4: {
                return new agza((agzi)akzx.a);
            }
            case 3: {
                return new akzx();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzx.a, "\u0001\u0002\u0000\u0001\u0001\u0309\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0309\u1409\u0001", new Object[] { "d", "b", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
