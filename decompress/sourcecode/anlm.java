import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anlm extends agzi implements ahax
{
    public static final anlm a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aioe f;
    private ajsq g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(anlm.class, a = new anlm());
    }
    
    private anlm() {
        this.i = 2;
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
                if ((b2 = anlm.b) == null) {
                    synchronized (anlm.class) {
                        if (anlm.b == null) {
                            anlm.b = (ahbe)new agzb((agzi)anlm.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return anlm.a;
            }
            case 4: {
                return new agza((agzi)anlm.a);
            }
            case 3: {
                return new anlm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anlm.a, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0005\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0005\u0006\u1409\u0003\u0007\u1409\u0004", new Object[] { "c", "d", "e", "h", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}