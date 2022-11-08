import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorj extends agzi implements ahax
{
    public static final aorj a;
    private static volatile ahbe c;
    public alun b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aorj.class, a = new aorj());
    }
    
    private aorj() {
        final agyc b = agyc.b;
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
                if ((c = aorj.c) == null) {
                    synchronized (aorj.class) {
                        if (aorj.c == null) {
                            aorj.c = (ahbe)new agzb((agzi)aorj.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aorj.a;
            }
            case 4: {
                return new agza((agzi)aorj.a);
            }
            case 3: {
                return new aorj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aorj.a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u1009\u0001", new Object[] { "d", "b" });
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
