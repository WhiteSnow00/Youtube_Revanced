import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyn extends agzi implements ahax
{
    public static final akyn a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)akyn.class, (agzi)(a = new akyn()));
    }
    
    private akyn() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = akyn.b) == null) {
                    synchronized (akyn.class) {
                        if (akyn.b == null) {
                            akyn.b = (ahbe)new agzb((agzi)akyn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akyn.a;
            }
            case 4: {
                return new agza((agzi)akyn.a);
            }
            case 3: {
                return new akyn();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyn.a, "\u0001\u0000", (Object[])null);
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
