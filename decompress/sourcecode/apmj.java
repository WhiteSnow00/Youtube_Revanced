import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apmj extends agzi implements ahax
{
    public static final apmj a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public apir d;
    public apir e;
    
    static {
        agzi.registerDefaultInstance((Class)apmj.class, (agzi)(a = new apmj()));
    }
    
    private apmj() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apmj.f) == null) {
                    synchronized (apmj.class) {
                        if (apmj.f == null) {
                            apmj.f = (ahbe)new agzb((agzi)apmj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apmj.a;
            }
            case 4: {
                return new agza((agzi)apmj.a);
            }
            case 3: {
                return new apmj();
            }
            case 2: {
                return newMessageInfo((MessageLite)apmj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
