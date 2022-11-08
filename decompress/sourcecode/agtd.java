import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtd extends agzi implements ahax
{
    public static final agtd a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agtd.class, a = new agtd());
    }
    
    private agtd() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = agtd.b) == null) {
                    synchronized (agtd.class) {
                        if (agtd.b == null) {
                            agtd.b = (ahbe)new agzb((agzi)agtd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agtd.a;
            }
            case 4: {
                return new agza((agzi)agtd.a);
            }
            case 3: {
                return new agtd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agtd.a, "\u0001\u0000", null);
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
