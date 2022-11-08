import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibp extends agzi implements ahax
{
    public static final aibp a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public Object d;
    public agyc e;
    public long f;
    
    static {
        agzi.registerDefaultInstance((Class)aibp.class, (agzi)(a = new aibp()));
    }
    
    private aibp() {
        this.c = 0;
        this.e = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = aibp.g) == null) {
                    synchronized (aibp.class) {
                        if (aibp.g == null) {
                            aibp.g = (ahbe)new agzb((agzi)aibp.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aibp.a;
            }
            case 4: {
                return new agza((agzi)aibp.a);
            }
            case 3: {
                return new aibp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibp.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1003\u0001\u0003\u103b\u0000\u0004\u103c\u0000\u0005\u103b\u0000", new Object[] { "d", "c", "b", "e", "f", alqg.class });
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
