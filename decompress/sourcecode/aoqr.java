import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqr extends agzi implements ahax
{
    public static final aoqr a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aoqr.class, a = new aoqr());
    }
    
    private aoqr() {
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
                final ahbe b2;
                if ((b2 = aoqr.b) == null) {
                    synchronized (aoqr.class) {
                        if (aoqr.b == null) {
                            aoqr.b = (ahbe)new agzb((agzi)aoqr.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aoqr.a;
            }
            case 4: {
                return new agza((agzi)aoqr.a);
            }
            case 3: {
                return new aoqr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoqr.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0002", new Object[] { "c", "d", "e" });
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
