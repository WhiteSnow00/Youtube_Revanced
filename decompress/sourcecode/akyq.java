import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyq extends agzi implements ahax
{
    public static final akyq a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)akyq.class, (agzi)(a = new akyq()));
    }
    
    private akyq() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = akyq.b) == null) {
                    synchronized (akyq.class) {
                        if (akyq.b == null) {
                            akyq.b = (ahbe)new agzb((agzi)akyq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akyq.a;
            }
            case 4: {
                return new agza((agzi)akyq.a);
            }
            case 3: {
                return new akyq();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyq.a, "\u0001\u0000", (Object[])null);
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
