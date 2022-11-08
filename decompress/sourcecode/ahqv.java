import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqv extends agzi implements ahax
{
    public static final ahqv a;
    private static volatile ahbe h;
    public int b;
    public ahqx c;
    public ahqw d;
    public ahqx e;
    public ahqw f;
    public int g;
    
    static {
        agzi.registerDefaultInstance(ahqv.class, a = new ahqv());
    }
    
    private ahqv() {
        this.g = 1;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = ahqv.h) == null) {
                    synchronized (ahqv.class) {
                        if (ahqv.h == null) {
                            ahqv.h = (ahbe)new agzb((agzi)ahqv.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahqv.a;
            }
            case 4: {
                return new agza((agzi)ahqv.a);
            }
            case 3: {
                return new ahqv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqv.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u100c\u0004", new Object[] { "b", "c", "d", "e", "f", "g", ahng.j });
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
