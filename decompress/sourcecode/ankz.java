import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ankz extends agzi implements ahax
{
    public static final ankz a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private ajsq e;
    private aioe f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ankz.class, a = new ankz());
    }
    
    private ankz() {
        this.h = 2;
        emptyIntList();
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
                if ((b2 = ankz.b) == null) {
                    synchronized (ankz.class) {
                        if (ankz.b == null) {
                            ankz.b = (ahbe)new agzb((agzi)ankz.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ankz.a;
            }
            case 4: {
                return new agza((agzi)ankz.a);
            }
            case 3: {
                return new ankz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ankz.a, "\u0001\u0004\u0000\u0001\u0001\u000b\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0003\u1409\u0003\b\u1409\u0007\u000b\u1409\u0002", new Object[] { "c", "d", "f", "g", "e" });
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
