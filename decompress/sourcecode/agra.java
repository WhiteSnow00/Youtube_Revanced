import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agra extends agzi implements ahax
{
    public static final agra a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(agra.class, a = new agra());
    }
    
    private agra() {
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
                if ((d = agra.d) == null) {
                    synchronized (agra.class) {
                        if (agra.d == null) {
                            agra.d = (ahbe)new agzb((agzi)agra.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agra.a;
            }
            case 4: {
                return new agza((agzi)agra.a);
            }
            case 3: {
                return new agra();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agra.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", aqte.a() });
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
