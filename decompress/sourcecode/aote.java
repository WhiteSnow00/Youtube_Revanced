import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aote extends agzi implements ahax
{
    public static final aote a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aote.class, a = new aote());
    }
    
    private aote() {
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
                if ((c = aote.c) == null) {
                    synchronized (aote.class) {
                        if (aote.c == null) {
                            aote.c = (ahbe)new agzb((agzi)aote.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aote.a;
            }
            case 4: {
                return new agza((agzi)aote.a);
            }
            case 3: {
                return new aote();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aote.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aotc.c });
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
