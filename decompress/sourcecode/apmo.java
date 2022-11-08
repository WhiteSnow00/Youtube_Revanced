import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apmo extends agzi implements ahax
{
    public static final apmo a;
    private static volatile ahbe g;
    public int b;
    public apmn c;
    public apiv d;
    public ajjy e;
    public aocq f;
    
    static {
        agzi.registerDefaultInstance((Class)apmo.class, (agzi)(a = new apmo()));
    }
    
    private apmo() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = apmo.g) == null) {
                    synchronized (apmo.class) {
                        if (apmo.g == null) {
                            apmo.g = (ahbe)new agzb((agzi)apmo.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apmo.a;
            }
            case 4: {
                return new agza((agzi)apmo.a);
            }
            case 3: {
                return new apmo();
            }
            case 2: {
                return newMessageInfo((MessageLite)apmo.a, "\u0001\u0004\u0000\u0001\u0004\u0007\u0004\u0000\u0000\u0000\u0004\u1009\u0000\u0005\u1009\u0001\u0006\u1009\u0002\u0007\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
