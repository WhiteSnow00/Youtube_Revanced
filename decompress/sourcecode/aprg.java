import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprg extends agzi implements ahax
{
    public static final aprg a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)aprg.class, (agzi)(a = new aprg()));
    }
    
    private aprg() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aprg.b) == null) {
                    synchronized (aprg.class) {
                        if (aprg.b == null) {
                            aprg.b = (ahbe)new agzb((agzi)aprg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aprg.a;
            }
            case 4: {
                return new agza((agzi)aprg.a);
            }
            case 3: {
                return new aprg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprg.a, "\u0001\u0000", (Object[])null);
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
