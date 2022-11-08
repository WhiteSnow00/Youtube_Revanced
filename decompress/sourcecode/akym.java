import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akym extends agzi implements ahax
{
    public static final akym a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)akym.class, (agzi)(a = new akym()));
    }
    
    private akym() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = akym.b) == null) {
                    synchronized (akym.class) {
                        if (akym.b == null) {
                            akym.b = (ahbe)new agzb((agzi)akym.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akym.a;
            }
            case 4: {
                return new agza((agzi)akym.a);
            }
            case 3: {
                return new akym();
            }
            case 2: {
                return newMessageInfo((MessageLite)akym.a, "\u0001\u0000", (Object[])null);
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
