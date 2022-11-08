import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akys extends agzi implements ahax
{
    public static final akys a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)akys.class, (agzi)(a = new akys()));
    }
    
    private akys() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = akys.b) == null) {
                    synchronized (akys.class) {
                        if (akys.b == null) {
                            akys.b = (ahbe)new agzb((agzi)akys.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akys.a;
            }
            case 4: {
                return new agza((agzi)akys.a);
            }
            case 3: {
                return new akys();
            }
            case 2: {
                return newMessageInfo((MessageLite)akys.a, "\u0001\u0000", (Object[])null);
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
