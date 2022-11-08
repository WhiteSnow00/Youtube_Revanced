import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apmk extends agzi implements ahax
{
    public static final apmk a;
    private static volatile ahbe f;
    public int b;
    public apmj c;
    public float d;
    public boolean e;
    
    static {
        agzi.registerDefaultInstance((Class)apmk.class, (agzi)(a = new apmk()));
    }
    
    private apmk() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apmk.f) == null) {
                    synchronized (apmk.class) {
                        if (apmk.f == null) {
                            apmk.f = (ahbe)new agzb((agzi)apmk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apmk.a;
            }
            case 4: {
                return new agza((agzi)apmk.a);
            }
            case 3: {
                return new apmk();
            }
            case 2: {
                return newMessageInfo((MessageLite)apmk.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1001\u0001\u0004\u1007\u0003", new Object[] { "b", "c", "d", "e" });
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
