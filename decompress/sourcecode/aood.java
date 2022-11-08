import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aood extends agzi implements ahax
{
    public static final aood a;
    private static volatile ahbe h;
    public int b;
    public int c;
    public float d;
    public long e;
    public int f;
    public agzy g;
    
    static {
        agzi.registerDefaultInstance((Class)aood.class, (agzi)(a = new aood()));
    }
    
    private aood() {
        this.g = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = aood.h) == null) {
                    synchronized (aood.class) {
                        if (aood.h == null) {
                            aood.h = (ahbe)new agzb((agzi)aood.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aood.a;
            }
            case 4: {
                return new agza((boolean[])null, (short[])null);
            }
            case 3: {
                return new aood();
            }
            case 2: {
                return newMessageInfo((MessageLite)aood.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u1001\u0001\u0003\u1002\u0002\u0004\u1004\u0003\u0005\u001b", new Object[] { "b", "c", ajdf.a(), "d", "e", "f", "g", aooc.class });
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
