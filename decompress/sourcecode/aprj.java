import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprj extends agzi implements ahax
{
    public static final aprj a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)aprj.class, (agzi)(a = new aprj()));
    }
    
    private aprj() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aprj.b) == null) {
                    synchronized (aprj.class) {
                        if (aprj.b == null) {
                            aprj.b = (ahbe)new agzb((agzi)aprj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aprj.a;
            }
            case 4: {
                return new agza((agzi)aprj.a);
            }
            case 3: {
                return new aprj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprj.a, "\u0001\u0000", (Object[])null);
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
