import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsp extends agzi implements ahax
{
    public static final apsp a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apsp.class, (agzi)(a = new apsp()));
    }
    
    private apsp() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apsp.b) == null) {
                    synchronized (apsp.class) {
                        if (apsp.b == null) {
                            apsp.b = (ahbe)new agzb((agzi)apsp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsp.a;
            }
            case 4: {
                return new agza((agzi)apsp.a);
            }
            case 3: {
                return new apsp();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsp.a, "\u0001\u0000", (Object[])null);
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
