import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyh extends agzi implements ahax
{
    public static final akyh a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)akyh.class, (agzi)(a = new akyh()));
    }
    
    private akyh() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = akyh.b) == null) {
                    synchronized (akyh.class) {
                        if (akyh.b == null) {
                            akyh.b = (ahbe)new agzb((agzi)akyh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akyh.a;
            }
            case 4: {
                return new agza((agzi)akyh.a);
            }
            case 3: {
                return new akyh();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyh.a, "\u0001\u0000", (Object[])null);
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
