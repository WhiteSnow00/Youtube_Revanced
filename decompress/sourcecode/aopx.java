import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopx extends agzi implements ahax
{
    public static final aopx a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aopx.class, (agzi)(a = new aopx()));
    }
    
    private aopx() {
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
                final ahbe b2;
                if ((b2 = aopx.b) == null) {
                    synchronized (aopx.class) {
                        if (aopx.b == null) {
                            aopx.b = (ahbe)new agzb((agzi)aopx.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aopx.a;
            }
            case 4: {
                return new agza((agzi)aopx.a);
            }
            case 3: {
                return new aopx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aopx.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
