import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajpz extends agzi implements ahax
{
    public static final ajpz a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aibc f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)ajpz.class, (agzi)(a = new ajpz()));
    }
    
    private ajpz() {
        this.h = 2;
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
                if ((b2 = ajpz.b) == null) {
                    synchronized (ajpz.class) {
                        if (ajpz.b == null) {
                            ajpz.b = (ahbe)new agzb((agzi)ajpz.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajpz.a;
            }
            case 4: {
                return new agza((agzi)ajpz.a);
            }
            case 3: {
                return new ajpz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpz.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
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
