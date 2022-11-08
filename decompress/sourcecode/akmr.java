import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmr extends agzi implements ahax
{
    public static final akmr a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(akmr.class, a = new akmr());
    }
    
    private akmr() {
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
                if ((c = akmr.c) == null) {
                    synchronized (akmr.class) {
                        if (akmr.c == null) {
                            akmr.c = (ahbe)new agzb((agzi)akmr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akmr.a;
            }
            case 4: {
                return new agza((agzi)akmr.a);
            }
            case 3: {
                return new akmr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akmr.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u100c\u0002", new Object[] { "d", "b", amtt.g });
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
