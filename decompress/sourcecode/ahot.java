import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahot extends agzi implements ahax
{
    public static final ahot a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahot.class, a = new ahot());
    }
    
    private ahot() {
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
                if ((b2 = ahot.b) == null) {
                    synchronized (ahot.class) {
                        if (ahot.b == null) {
                            ahot.b = (ahbe)new agzb((agzi)ahot.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahot.a;
            }
            case 4: {
                return new agza((agzi)ahot.a);
            }
            case 3: {
                return new ahot();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahot.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
