import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxw extends agzi implements ahax
{
    public static final ahxw a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private anss e;
    private anss f;
    private ahfw g;
    private ajsq h;
    private anss i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(ahxw.class, a = new ahxw());
    }
    
    private ahxw() {
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
                if ((b2 = ahxw.b) == null) {
                    synchronized (ahxw.class) {
                        if (ahxw.b == null) {
                            ahxw.b = (ahbe)new agzb((agzi)ahxw.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahxw.a;
            }
            case 4: {
                return new agza((agzi)ahxw.a);
            }
            case 3: {
                return new ahxw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahxw.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
