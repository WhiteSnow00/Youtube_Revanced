import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahor extends agzi implements ahax
{
    public static final ahor a;
    private static volatile ahbe d;
    public ahlh b;
    public agzy c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ahor.class, a = new ahor());
    }
    
    private ahor() {
        this.c = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ahor.d) == null) {
                    synchronized (ahor.class) {
                        if (ahor.d == null) {
                            ahor.d = (ahbe)new agzb((agzi)ahor.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahor.a;
            }
            case 4: {
                return new agza((agzi)ahor.a);
            }
            case 3: {
                return new ahor();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahor.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b", new Object[] { "e", "b", "c", ahjt.class });
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
