import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbp extends agzi implements ahax
{
    public static final ajbp a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aioe e;
    private ahfw f;
    private anss g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ajbp.class, a = new ajbp());
    }
    
    private ajbp() {
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
                if ((b2 = ajbp.b) == null) {
                    synchronized (ajbp.class) {
                        if (ajbp.b == null) {
                            ajbp.b = (ahbe)new agzb((agzi)ajbp.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajbp.a;
            }
            case 4: {
                return new agza((agzi)ajbp.a);
            }
            case 3: {
                return new ajbp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajbp.a, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0004\u0002\u1409\u0001\u0004\u1409\u0004\u0006\u1409\u0003\u0007\u1409\u0006", new Object[] { "c", "d", "f", "e", "g" });
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
