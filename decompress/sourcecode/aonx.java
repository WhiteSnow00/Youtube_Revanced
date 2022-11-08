import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aonx extends agzi implements ahax
{
    public static final aonx a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)aonx.class, (agzi)(a = new aonx()));
    }
    
    private aonx() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aonx.b) == null) {
                    synchronized (aonx.class) {
                        if (aonx.b == null) {
                            aonx.b = (ahbe)new agzb((agzi)aonx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aonx.a;
            }
            case 4: {
                return new agza((agzi)aonx.a);
            }
            case 3: {
                return new aonx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aonx.a, "\u0001\u0000", (Object[])null);
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
