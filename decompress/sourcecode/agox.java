import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agox extends agzi implements ahax
{
    public static final agox a;
    private static volatile ahbe c;
    public agop b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(agox.class, a = new agox());
    }
    
    private agox() {
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
                if ((c = agox.c) == null) {
                    synchronized (agox.class) {
                        if (agox.c == null) {
                            agox.c = (ahbe)new agzb((agzi)agox.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agox.a;
            }
            case 4: {
                return new agza((agzi)agox.a);
            }
            case 3: {
                return new agox();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agox.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
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
