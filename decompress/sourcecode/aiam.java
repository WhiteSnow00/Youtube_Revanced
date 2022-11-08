import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiam extends agzi implements ahax
{
    public static final aiam a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aiam.class, (agzi)(a = new aiam()));
    }
    
    private aiam() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aiam.c) == null) {
                    synchronized (aiam.class) {
                        if (aiam.c == null) {
                            aiam.c = (ahbe)new agzb((agzi)aiam.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aiam.a;
            }
            case 4: {
                return new agza((agzi)aiam.a);
            }
            case 3: {
                return new aiam();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiam.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100c\u0001", new Object[] { "d", "b", ahzk.l });
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
