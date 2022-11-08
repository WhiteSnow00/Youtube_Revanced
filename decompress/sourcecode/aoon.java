import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoon extends agzi implements ahax
{
    public static final aoon a;
    private static volatile ahbe g;
    public int b;
    public boolean c;
    public float d;
    public aoom e;
    public float f;
    
    static {
        agzi.registerDefaultInstance((Class)aoon.class, (agzi)(a = new aoon()));
    }
    
    private aoon() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = aoon.g) == null) {
                    synchronized (aoon.class) {
                        if (aoon.g == null) {
                            aoon.g = (ahbe)new agzb((agzi)aoon.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aoon.a;
            }
            case 4: {
                return new agza((agzi)aoon.a);
            }
            case 3: {
                return new aoon();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoon.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1001\u0001\u0003\u1009\u0002\u0004\u1001\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
