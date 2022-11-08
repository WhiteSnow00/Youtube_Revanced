import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyp extends agzi implements ahax
{
    public static final akyp a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)akyp.class, (agzi)(a = new akyp()));
    }
    
    private akyp() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = akyp.b) == null) {
                    synchronized (akyp.class) {
                        if (akyp.b == null) {
                            akyp.b = (ahbe)new agzb((agzi)akyp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akyp.a;
            }
            case 4: {
                return new agza((agzi)akyp.a);
            }
            case 3: {
                return new akyp();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyp.a, "\u0001\u0000", (Object[])null);
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
