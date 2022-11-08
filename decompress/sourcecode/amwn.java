import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwn extends agzi implements ahax
{
    public static final amwn a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aioe f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(amwn.class, a = new amwn());
    }
    
    private amwn() {
        this.h = 2;
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
                if ((b2 = amwn.b) == null) {
                    synchronized (amwn.class) {
                        if (amwn.b == null) {
                            amwn.b = (ahbe)new agzb((agzi)amwn.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amwn.a;
            }
            case 4: {
                return new agza((agzi)amwn.a);
            }
            case 3: {
                return new amwn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amwn.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0002\u0004\u1409\u0004\u0006\u1409\u0001", new Object[] { "c", "d", "f", "g", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
