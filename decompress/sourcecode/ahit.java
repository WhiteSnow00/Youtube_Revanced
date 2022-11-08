import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahit extends agzi implements ahax
{
    public static final ahit a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private anss e;
    private anss f;
    private anss g;
    private anss h;
    private anss i;
    private anss j;
    private aioe k;
    private ahfw l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance((Class)ahit.class, (agzi)(a = new ahit()));
    }
    
    private ahit() {
        this.m = 2;
        final agyc b = agyc.b;
    }
    
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
                if ((b2 = ahit.b) == null) {
                    synchronized (ahit.class) {
                        if (ahit.b == null) {
                            ahit.b = (ahbe)new agzb((agzi)ahit.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahit.a;
            }
            case 4: {
                return new agza((agzi)ahit.a);
            }
            case 3: {
                return new ahit();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahit.a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\t\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0007\u0007\u1409\u000b\n\u1409\u0006\u000b\u1409\u0000", new Object[] { "c", "e", "f", "g", "h", "i", "k", "l", "j", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
