import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprw extends agzi implements ahax
{
    public static final aprw a;
    private static volatile ahbe c;
    public int b;
    
    static {
        agzi.registerDefaultInstance((Class)aprw.class, (agzi)(a = new aprw()));
    }
    
    private aprw() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aprw.c) == null) {
                    synchronized (aprw.class) {
                        if (aprw.c == null) {
                            aprw.c = (ahbe)new agzb((agzi)aprw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aprw.a;
            }
            case 4: {
                return new agza((agzi)aprw.a);
            }
            case 3: {
                return new aprw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprw.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[] { "b" });
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
