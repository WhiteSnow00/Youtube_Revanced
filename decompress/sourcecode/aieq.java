import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aieq extends agzi implements ahax
{
    public static final aieq a;
    private static volatile ahbe g;
    public int b;
    public aorm c;
    public ajsq d;
    public ajsq e;
    public ajsq f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)aieq.class, (agzi)(a = new aieq()));
    }
    
    private aieq() {
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
                final ahbe g;
                if ((g = aieq.g) == null) {
                    synchronized (aieq.class) {
                        if (aieq.g == null) {
                            aieq.g = (ahbe)new agzb((agzi)aieq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aieq.a;
            }
            case 4: {
                return new agza((agzi)aieq.a);
            }
            case 3: {
                return new aieq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aieq.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
