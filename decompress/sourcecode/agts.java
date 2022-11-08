import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agts extends agzi implements ahax
{
    public static final agts a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(agts.class, a = new agts());
    }
    
    private agts() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = agts.d) == null) {
                    synchronized (agts.class) {
                        if (agts.d == null) {
                            agts.d = (ahbe)new agzb((agzi)agts.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agts.a;
            }
            case 4: {
                return new agza((agzi)agts.a);
            }
            case 3: {
                return new agts();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agts.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", agte.j });
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
