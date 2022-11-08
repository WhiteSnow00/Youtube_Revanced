import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyo extends agzi implements ahax
{
    public static final akyo a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)akyo.class, (agzi)(a = new akyo()));
    }
    
    private akyo() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = akyo.b) == null) {
                    synchronized (akyo.class) {
                        if (akyo.b == null) {
                            akyo.b = (ahbe)new agzb((agzi)akyo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akyo.a;
            }
            case 4: {
                return new agza((agzi)akyo.a);
            }
            case 3: {
                return new akyo();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyo.a, "\u0001\u0000", (Object[])null);
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
