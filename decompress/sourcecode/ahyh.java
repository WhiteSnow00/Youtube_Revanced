import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahyh extends agzi implements ahax
{
    public static final ahyh a;
    private static volatile ahbe c;
    public ajsq b;
    private int d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahyh.class, a = new ahyh());
    }
    
    private ahyh() {
        this.f = 2;
        final agyc b = agyc.b;
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
                final ahbe c;
                if ((c = ahyh.c) == null) {
                    synchronized (ahyh.class) {
                        if (ahyh.c == null) {
                            ahyh.c = (ahbe)new agzb((agzi)ahyh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahyh.a;
            }
            case 4: {
                return new agza((agzi)ahyh.a);
            }
            case 3: {
                return new ahyh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahyh.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0002", new Object[] { "d", "b", "e" });
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
