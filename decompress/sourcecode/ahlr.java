import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlr extends agzi implements ahax
{
    public static final ahlr a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)ahlr.class, (agzi)(a = new ahlr()));
    }
    
    private ahlr() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahlr.c) == null) {
                    synchronized (ahlr.class) {
                        if (ahlr.c == null) {
                            ahlr.c = (ahbe)new agzb((agzi)ahlr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahlr.a;
            }
            case 4: {
                return new agza((agzi)ahlr.a);
            }
            case 3: {
                return new ahlr();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlr.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
