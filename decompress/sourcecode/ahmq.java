import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmq extends agzi implements ahax
{
    public static final ahmq a;
    private static volatile ahbe c;
    public ajsq b;
    private int d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)ahmq.class, (agzi)(a = new ahmq()));
    }
    
    private ahmq() {
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
                if ((c = ahmq.c) == null) {
                    synchronized (ahmq.class) {
                        if (ahmq.c == null) {
                            ahmq.c = (ahbe)new agzb((agzi)ahmq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahmq.a;
            }
            case 4: {
                return new agza((agzi)ahmq.a);
            }
            case 3: {
                return new ahmq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "d", "b", "e" });
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
