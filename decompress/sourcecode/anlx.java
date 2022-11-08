import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anlx extends agzi implements ahax
{
    public static final anlx a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(anlx.class, a = new anlx());
    }
    
    private anlx() {
        this.j = 2;
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
                if ((b2 = anlx.b) == null) {
                    synchronized (anlx.class) {
                        if (anlx.b == null) {
                            anlx.b = (ahbe)new agzb((agzi)anlx.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return anlx.a;
            }
            case 4: {
                return new agza((agzi)anlx.a);
            }
            case 3: {
                return new anlx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anlx.a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003\u0007\u1409\u0007\b\u1409\u0004\t\u1409\u0005", new Object[] { "c", "d", "e", "f", "i", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
