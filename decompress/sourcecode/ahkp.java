import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkp extends agzi implements ahax
{
    public static final ahkp a;
    private static volatile ahbe c;
    public ahjc b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)ahkp.class, (agzi)(a = new ahkp()));
    }
    
    private ahkp() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahkp.c) == null) {
                    synchronized (ahkp.class) {
                        if (ahkp.c == null) {
                            ahkp.c = (ahbe)new agzb((agzi)ahkp.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahkp.a;
            }
            case 4: {
                return new agza((agzi)ahkp.a);
            }
            case 3: {
                return new ahkp();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkp.a, "\u0001\u0001\u0000\u0001\uea6f\u32ff\uea6f\u32ff\u0001\u0000\u0000\u0000\uea6f\u32ff\u1009\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
