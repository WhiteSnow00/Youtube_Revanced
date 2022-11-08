import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyl extends agzi implements ahax
{
    public static final akyl a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)akyl.class, (agzi)(a = new akyl()));
    }
    
    private akyl() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = akyl.b) == null) {
                    synchronized (akyl.class) {
                        if (akyl.b == null) {
                            akyl.b = (ahbe)new agzb((agzi)akyl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akyl.a;
            }
            case 4: {
                return new agza((agzi)akyl.a);
            }
            case 3: {
                return new akyl();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyl.a, "\u0001\u0000", (Object[])null);
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
