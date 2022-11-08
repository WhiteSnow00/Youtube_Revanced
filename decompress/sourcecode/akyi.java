import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyi extends agzi implements ahax
{
    public static final akyi a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)akyi.class, (agzi)(a = new akyi()));
    }
    
    private akyi() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = akyi.b) == null) {
                    synchronized (akyi.class) {
                        if (akyi.b == null) {
                            akyi.b = (ahbe)new agzb((agzi)akyi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akyi.a;
            }
            case 4: {
                return new agza((agzi)akyi.a);
            }
            case 3: {
                return new akyi();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyi.a, "\u0001\u0000", (Object[])null);
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
