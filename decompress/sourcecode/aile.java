import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aile extends agzi implements ahax
{
    public static final aile a;
    private static volatile ahbe c;
    public aimg b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aile.class, a = new aile());
    }
    
    private aile() {
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
                if ((c = aile.c) == null) {
                    synchronized (aile.class) {
                        if (aile.c == null) {
                            aile.c = (ahbe)new agzb((agzi)aile.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aile.a;
            }
            case 4: {
                return new agza((agzi)aile.a);
            }
            case 3: {
                return new aile();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aile.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1009\u0002", new Object[] { "d", "b" });
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
