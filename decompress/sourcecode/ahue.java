import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahue extends agzi implements ahax
{
    public static final ahue a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahue.class, a = new ahue());
    }
    
    private ahue() {
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
                if ((b2 = ahue.b) == null) {
                    synchronized (ahue.class) {
                        if (ahue.b == null) {
                            ahue.b = (ahbe)new agzb((agzi)ahue.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahue.a;
            }
            case 4: {
                return new agza((agzi)ahue.a);
            }
            case 3: {
                return new ahue();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahue.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
