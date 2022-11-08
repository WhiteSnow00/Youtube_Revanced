import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpj extends agzi implements ahax
{
    public static final lpj a;
    private static volatile ahbe c;
    public ansl b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(lpj.class, a = new lpj());
    }
    
    private lpj() {
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
                if ((c = lpj.c) == null) {
                    synchronized (lpj.class) {
                        if (lpj.c == null) {
                            lpj.c = (ahbe)new agzb((agzi)lpj.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return lpj.a;
            }
            case 4: {
                return new agza((agzi)lpj.a);
            }
            case 3: {
                return new lpj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
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
