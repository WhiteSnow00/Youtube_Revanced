import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprr extends agzi implements ahax
{
    public static final aprr a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)aprr.class, (agzi)(a = new aprr()));
    }
    
    private aprr() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aprr.b) == null) {
                    synchronized (aprr.class) {
                        if (aprr.b == null) {
                            aprr.b = (ahbe)new agzb((agzi)aprr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aprr.a;
            }
            case 4: {
                return new agza((agzi)aprr.a);
            }
            case 3: {
                return new aprr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprr.a, "\u0001\u0000", (Object[])null);
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
