import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoi extends agzi implements ahax
{
    public static final apoi a;
    public static final agzg b;
    public static final agzg c;
    private static volatile ahbe d;
    
    static {
        agzi.registerDefaultInstance((Class)apoi.class, (agzi)(a = new apoi()));
        b = agzi.newSingularGeneratedExtension((MessageLite)appn.a, (Object)0, (MessageLite)null, (agzn)null, 153514762, ahcm.e, (Class)Integer.class);
        c = agzi.newSingularGeneratedExtension((MessageLite)appn.a, (Object)false, (MessageLite)null, (agzn)null, 167027722, ahcm.h, (Class)Boolean.class);
    }
    
    private apoi() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = apoi.d) == null) {
                    synchronized (apoi.class) {
                        if (apoi.d == null) {
                            apoi.d = (ahbe)new agzb((agzi)apoi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apoi.a;
            }
            case 4: {
                return new agza((agzi)apoi.a);
            }
            case 3: {
                return new apoi();
            }
            case 2: {
                return newMessageInfo((MessageLite)apoi.a, "\u0001\u0000", (Object[])null);
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
