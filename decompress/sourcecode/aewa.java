import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aewa extends agzi implements ahax
{
    public static final aewa a;
    private static volatile ahbe g;
    public int b;
    public agyc c;
    public agyc d;
    public aevz e;
    public aevv f;
    
    static {
        agzi.registerDefaultInstance(aewa.class, a = new aewa());
    }
    
    private aewa() {
        this.c = agyc.b;
        this.d = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = aewa.g) == null) {
                    synchronized (aewa.class) {
                        if (aewa.g == null) {
                            aewa.g = (ahbe)new agzb((agzi)aewa.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aewa.a;
            }
            case 4: {
                return new agza((agzi)aewa.a);
            }
            case 3: {
                return new aewa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aewa.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u100a\u0001\u0003\u1009\u0002\u0004\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
