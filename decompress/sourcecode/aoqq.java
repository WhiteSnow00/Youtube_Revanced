import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqq extends agzi implements ahax
{
    public static final aoqq a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aoqq.class, a = new aoqq());
    }
    
    private aoqq() {
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
                if ((b2 = aoqq.b) == null) {
                    synchronized (aoqq.class) {
                        if (aoqq.b == null) {
                            aoqq.b = (ahbe)new agzb((agzi)aoqq.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aoqq.a;
            }
            case 4: {
                return new agza((agzi)aoqq.a);
            }
            case 3: {
                return new aoqq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoqq.a, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0002\u0003\u1409\u0002\u0005\u1409\u0004", new Object[] { "c", "d", "e" });
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