import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahul extends agzi implements ahax
{
    public static final ahul a;
    private static volatile ahbe c;
    public int b;
    private int d;
    private ahuk e;
    private ahfw f;
    private anss g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ahul.class, a = new ahul());
    }
    
    private ahul() {
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
                final ahbe c;
                if ((c = ahul.c) == null) {
                    synchronized (ahul.class) {
                        if (ahul.c == null) {
                            ahul.c = (ahbe)new agzb((agzi)ahul.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahul.a;
            }
            case 4: {
                return new agza((agzi)ahul.a);
            }
            case 3: {
                return new ahul();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahul.a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0003\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u100c\u0004\u0006\u1409\u0005", new Object[] { "d", "e", "f", "b", ajoa.q, "g" });
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
