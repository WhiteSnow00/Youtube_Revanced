import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopy extends agzi implements ahax
{
    public static final aopy a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)aopy.class, (agzi)(a = new aopy()));
    }
    
    private aopy() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aopy.b) == null) {
                    synchronized (aopy.class) {
                        if (aopy.b == null) {
                            aopy.b = (ahbe)new agzb((agzi)aopy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aopy.a;
            }
            case 4: {
                return new agza((agzi)aopy.a);
            }
            case 3: {
                return new aopy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aopy.a, "\u0001\u0000", (Object[])null);
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
