import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anlp extends agzi implements ahax
{
    public static final anlp a;
    private static volatile ahbe b;
    private int c;
    private aqhd d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(anlp.class, a = new anlp());
    }
    
    private anlp() {
        this.e = 2;
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
                if ((b2 = anlp.b) == null) {
                    synchronized (anlp.class) {
                        if (anlp.b == null) {
                            anlp.b = (ahbe)new agzb((agzi)anlp.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return anlp.a;
            }
            case 4: {
                return new agza((agzi)anlp.a);
            }
            case 3: {
                return new anlp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anlp.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
