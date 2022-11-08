import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzo extends agzi implements ahax
{
    public static final akzo a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)akzo.class, (agzi)(a = new akzo()));
    }
    
    private akzo() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = akzo.b) == null) {
                    synchronized (akzo.class) {
                        if (akzo.b == null) {
                            akzo.b = (ahbe)new agzb((agzi)akzo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akzo.a;
            }
            case 4: {
                return new agza((agzi)akzo.a);
            }
            case 3: {
                return new akzo();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzo.a, "\u0001\u0000", (Object[])null);
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
