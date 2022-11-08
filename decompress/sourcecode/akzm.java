import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzm extends agzi implements ahax
{
    public static final akzm a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)akzm.class, (agzi)(a = new akzm()));
    }
    
    private akzm() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = akzm.b) == null) {
                    synchronized (akzm.class) {
                        if (akzm.b == null) {
                            akzm.b = (ahbe)new agzb((agzi)akzm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akzm.a;
            }
            case 4: {
                return new agza((agzi)akzm.a);
            }
            case 3: {
                return new akzm();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzm.a, "\u0001\u0000", (Object[])null);
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
