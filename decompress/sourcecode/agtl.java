import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtl extends agzi implements ahax
{
    public static final agtl a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agtl.class, a = new agtl());
    }
    
    private agtl() {
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
                if ((b = agtl.b) == null) {
                    synchronized (agtl.class) {
                        if (agtl.b == null) {
                            agtl.b = (ahbe)new agzb((agzi)agtl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agtl.a;
            }
            case 4: {
                return new agza((agzi)agtl.a);
            }
            case 3: {
                return new agtl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agtl.a, "\u0001\u0000", null);
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
