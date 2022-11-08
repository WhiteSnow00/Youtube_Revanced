import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzv extends agzi implements ahax
{
    public static final apzv a;
    private static volatile ahbe c;
    public agyo b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(apzv.class, a = new apzv());
    }
    
    private apzv() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = apzv.c) == null) {
                    synchronized (apzv.class) {
                        if (apzv.c == null) {
                            apzv.c = (ahbe)new agzb((agzi)apzv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apzv.a;
            }
            case 4: {
                return new agza((agzi)apzv.a);
            }
            case 3: {
                return new apzv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
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
