import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopu extends agzi implements ahax
{
    public static final aopu a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aopu.class, (agzi)(a = new aopu()));
    }
    
    private aopu() {
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
                final ahbe b2;
                if ((b2 = aopu.b) == null) {
                    synchronized (aopu.class) {
                        if (aopu.b == null) {
                            aopu.b = (ahbe)new agzb((agzi)aopu.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aopu.a;
            }
            case 4: {
                return new agza((agzi)aopu.a);
            }
            case 3: {
                return new aopu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aopu.a, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0002\u0001\u1409\u0001\u0005\u1409\u0005", new Object[] { "c", "d", "e" });
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
