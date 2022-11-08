import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahzq extends agzi implements ahax
{
    public static final ahzq a;
    private static volatile ahbe d;
    public ahjt b;
    public anss c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahzq.class, a = new ahzq());
    }
    
    private ahzq() {
        this.f = 2;
    }
    
    @Override
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
                if ((d = ahzq.d) == null) {
                    synchronized (ahzq.class) {
                        if (ahzq.d == null) {
                            ahzq.d = (ahbe)new agzb((agzi)ahzq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahzq.a;
            }
            case 4: {
                return new agza((agzi)ahzq.a);
            }
            case 3: {
                return new ahzq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahzq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1009\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
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
