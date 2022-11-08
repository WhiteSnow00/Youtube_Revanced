import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprn extends agzi implements ahax
{
    public static final aprn a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)aprn.class, (agzi)(a = new aprn()));
    }
    
    private aprn() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aprn.b) == null) {
                    synchronized (aprn.class) {
                        if (aprn.b == null) {
                            aprn.b = (ahbe)new agzb((agzi)aprn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aprn.a;
            }
            case 4: {
                return new agza((agzi)aprn.a);
            }
            case 3: {
                return new aprn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprn.a, "\u0001\u0000", (Object[])null);
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
