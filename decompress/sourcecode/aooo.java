import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aooo extends agzi implements ahax
{
    public static final aooo a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aooo.class, (agzi)(a = new aooo()));
    }
    
    private aooo() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aooo.c) == null) {
                    synchronized (aooo.class) {
                        if (aooo.c == null) {
                            aooo.c = (ahbe)new agzb((agzi)aooo.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aooo.a;
            }
            case 4: {
                return new agza((agzi)aooo.a);
            }
            case 3: {
                return new aooo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aooo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "d", "b" });
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
