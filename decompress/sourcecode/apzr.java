import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzr extends agzi implements ahax
{
    public static final apzr a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(apzr.class, a = new apzr());
    }
    
    private apzr() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apzr.b) == null) {
                    synchronized (apzr.class) {
                        if (apzr.b == null) {
                            apzr.b = (ahbe)new agzb((agzi)apzr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apzr.a;
            }
            case 4: {
                return new agza((agzi)apzr.a);
            }
            case 3: {
                return new apzr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzr.a, "\u0001\u0000", null);
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
