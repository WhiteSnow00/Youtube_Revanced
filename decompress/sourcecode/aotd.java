import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aotd extends agzi implements ahax
{
    public static final aotd a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aotd.class, a = new aotd());
    }
    
    private aotd() {
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
                if ((c = aotd.c) == null) {
                    synchronized (aotd.class) {
                        if (aotd.c == null) {
                            aotd.c = (ahbe)new agzb((agzi)aotd.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aotd.a;
            }
            case 4: {
                return new agza((agzi)aotd.a);
            }
            case 3: {
                return new aotd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aotd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aotc.a });
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
