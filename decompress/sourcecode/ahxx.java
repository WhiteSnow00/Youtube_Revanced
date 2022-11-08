import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxx extends agzi implements ahax
{
    public static final ahxx a;
    private static volatile ahbe d;
    public ajsq b;
    public ajsq c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahxx.class, a = new ahxx());
    }
    
    private ahxx() {
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
                if ((d = ahxx.d) == null) {
                    synchronized (ahxx.class) {
                        if (ahxx.d == null) {
                            ahxx.d = (ahbe)new agzb((agzi)ahxx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahxx.a;
            }
            case 4: {
                return new agza((agzi)ahxx.a);
            }
            case 3: {
                return new ahxx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahxx.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
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
