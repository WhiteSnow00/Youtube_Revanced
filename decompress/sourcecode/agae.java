import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agae extends agzi implements ahax
{
    public static final agae a;
    private static volatile ahbe d;
    public agaf b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(agae.class, a = new agae());
    }
    
    private agae() {
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
                if ((d = agae.d) == null) {
                    synchronized (agae.class) {
                        if (agae.d == null) {
                            agae.d = (ahbe)new agzb((agzi)agae.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agae.a;
            }
            case 4: {
                return new agza((agzi)agae.a);
            }
            case 3: {
                return new agae();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agae.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[] { "b", "c" });
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
