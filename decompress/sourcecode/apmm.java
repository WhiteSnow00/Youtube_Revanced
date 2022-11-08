import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apmm extends agzi implements ahax
{
    public static final apmm a;
    private static volatile ahbe f;
    public int b;
    public apml c;
    public int d;
    public boolean e;
    
    static {
        agzi.registerDefaultInstance((Class)apmm.class, (agzi)(a = new apmm()));
    }
    
    private apmm() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apmm.f) == null) {
                    synchronized (apmm.class) {
                        if (apmm.f == null) {
                            apmm.f = (ahbe)new agzb((agzi)apmm.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apmm.a;
            }
            case 4: {
                return new agza((agzi)apmm.a);
            }
            case 3: {
                return new apmm();
            }
            case 2: {
                return newMessageInfo((MessageLite)apmm.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100c\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", apms.k, "e" });
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
