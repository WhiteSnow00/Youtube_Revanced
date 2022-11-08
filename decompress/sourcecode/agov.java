import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agov extends agzi implements ahax
{
    public static final agov a;
    private static volatile ahbe c;
    public agpc b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(agov.class, a = new agov());
    }
    
    private agov() {
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
                if ((c = agov.c) == null) {
                    synchronized (agov.class) {
                        if (agov.c == null) {
                            agov.c = (ahbe)new agzb((agzi)agov.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agov.a;
            }
            case 4: {
                return new agza((agzi)agov.a);
            }
            case 3: {
                return new agov();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agov.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
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
