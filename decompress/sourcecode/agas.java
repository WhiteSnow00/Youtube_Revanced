import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agas extends agzi implements ahax
{
    public static final agas a;
    private static volatile ahbe c;
    public agbk b;
    
    static {
        agzi.registerDefaultInstance(agas.class, a = new agas());
    }
    
    private agas() {
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
                if ((c = agas.c) == null) {
                    synchronized (agas.class) {
                        if (agas.c == null) {
                            agas.c = (ahbe)new agzb((agzi)agas.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agas.a;
            }
            case 4: {
                return new agza((agzi)agas.a);
            }
            case 3: {
                return new agas();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agas.a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[] { "b" });
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
