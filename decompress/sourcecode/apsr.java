import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsr extends agzi implements ahax
{
    public static final apsr a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apsr.class, (agzi)(a = new apsr()));
    }
    
    private apsr() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apsr.b) == null) {
                    synchronized (apsr.class) {
                        if (apsr.b == null) {
                            apsr.b = (ahbe)new agzb((agzi)apsr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsr.a;
            }
            case 4: {
                return new agza((agzi)apsr.a);
            }
            case 3: {
                return new apsr();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsr.a, "\u0001\u0000", (Object[])null);
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
