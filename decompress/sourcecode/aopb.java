import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopb extends agzi implements ahax
{
    public static final aopb a;
    private static volatile ahbe c;
    public aopc b;
    private int d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aopb.class, (agzi)(a = new aopb()));
    }
    
    private aopb() {
        this.f = 2;
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
                if ((c = aopb.c) == null) {
                    synchronized (aopb.class) {
                        if (aopb.c == null) {
                            aopb.c = (ahbe)new agzb((agzi)aopb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aopb.a;
            }
            case 4: {
                return new agza((agzi)aopb.a);
            }
            case 3: {
                return new aopb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aopb.a, "\u0001\u0002\u0000\u0001\u0004\u0006\u0002\u0000\u0000\u0002\u0004\u1409\u0003\u0006\u1409\u0005", new Object[] { "d", "b", "e" });
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
