import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ainc extends agzi implements ahax
{
    public static final ainc a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private anss e;
    private anss f;
    private anss g;
    private anss h;
    private anss i;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(ainc.class, a = new ainc());
    }
    
    private ainc() {
        this.k = 2;
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
                if ((b2 = ainc.b) == null) {
                    synchronized (ainc.class) {
                        if (ainc.b == null) {
                            ainc.b = (ahbe)new agzb((agzi)ainc.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ainc.a;
            }
            case 4: {
                return new agza((agzi)ainc.a);
            }
            case 3: {
                return new ainc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ainc.a, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0000\u0007\u0002\u1409\u000b\u0004\u1409\u0005\u0005\u1409\u0006\u0006\u1409\u0007\u0007\u1409\u0001\t\u1409\b\n\u1409\t", new Object[] { "c", "j", "e", "f", "g", "d", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
