import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpt extends agzi implements ahax
{
    public static final ahpt a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahpt.class, a = new ahpt());
    }
    
    private ahpt() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahpt.c) == null) {
                    synchronized (ahpt.class) {
                        if (ahpt.c == null) {
                            ahpt.c = (ahbe)new agzb((agzi)ahpt.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahpt.a;
            }
            case 4: {
                return new agza((agzi)ahpt.a);
            }
            case 3: {
                return new ahpt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpt.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", ahng.h });
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
