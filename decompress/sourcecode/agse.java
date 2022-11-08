import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agse extends agzi implements ahax
{
    public static final agse a;
    private static volatile ahbe c;
    public agyc b;
    
    static {
        agzi.registerDefaultInstance(agse.class, a = new agse());
    }
    
    private agse() {
        this.b = agyc.b;
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
                if ((c = agse.c) == null) {
                    synchronized (agse.class) {
                        if (agse.c == null) {
                            agse.c = (ahbe)new agzb((agzi)agse.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agse.a;
            }
            case 4: {
                return new agza((agzi)agse.a);
            }
            case 3: {
                return new agse();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agse.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[] { "b" });
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
