import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajly extends agzi implements ahax
{
    public static final ajly a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private aioe g;
    private ajsq h;
    private ahfw i;
    private anss j;
    private amer k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance((Class)ajly.class, (agzi)(a = new ajly()));
    }
    
    private ajly() {
        this.l = 2;
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
                if ((b2 = ajly.b) == null) {
                    synchronized (ajly.class) {
                        if (ajly.b == null) {
                            ajly.b = (ahbe)new agzb((agzi)ajly.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajly.a;
            }
            case 4: {
                return new agza((agzi)ajly.a);
            }
            case 3: {
                return new ajly();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajly.a, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\b\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0006\u1409\u0006\t\u1409\t\n\u1409\n\u000b\u1409\u0000", new Object[] { "c", "e", "f", "g", "h", "i", "j", "k", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
