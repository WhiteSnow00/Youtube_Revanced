import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajoc extends agzi implements ahax
{
    public static final ajoc a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private aioe e;
    private ajsq f;
    private ajsq g;
    private anss h;
    private amer i;
    private aioe j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance((Class)ajoc.class, (agzi)(a = new ajoc()));
    }
    
    private ajoc() {
        this.k = 2;
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
                if ((b2 = ajoc.b) == null) {
                    synchronized (ajoc.class) {
                        if (ajoc.b == null) {
                            ajoc.b = (ahbe)new agzb((agzi)ajoc.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajoc.a;
            }
            case 4: {
                return new agza((agzi)ajoc.a);
            }
            case 3: {
                return new ajoc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajoc.a, "\u0001\u0007\u0000\u0001\u0002\u0019\u0007\u0000\u0000\u0007\u0002\u1409\u0001\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\t\u1409\t\n\u1409\n\u0019\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "i", "j", "h" });
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
