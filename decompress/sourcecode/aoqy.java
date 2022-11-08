import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqy extends agzi implements ahax
{
    public static final aoqy a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(aoqy.class, a = new aoqy());
    }
    
    private aoqy() {
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
                if ((d = aoqy.d) == null) {
                    synchronized (aoqy.class) {
                        if (aoqy.d == null) {
                            aoqy.d = (ahbe)new agzb((agzi)aoqy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoqy.a;
            }
            case 4: {
                return new agza((agzi)aoqy.a);
            }
            case 3: {
                return new aoqy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoqy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100b\u0000", new Object[] { "b", "c" });
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
