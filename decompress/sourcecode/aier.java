import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aier extends agzi implements ahax
{
    public static final aier a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)aier.class, (agzi)(a = new aier()));
    }
    
    private aier() {
        final agyc b = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aier.b) == null) {
                    synchronized (aier.class) {
                        if (aier.b == null) {
                            aier.b = (ahbe)new agzb((agzi)aier.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aier.a;
            }
            case 4: {
                return new agza((agzi)aier.a);
            }
            case 3: {
                return new aier();
            }
            case 2: {
                return newMessageInfo((MessageLite)aier.a, "\u0001\u0000", (Object[])null);
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
