import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnl extends agzi implements ahax
{
    public static final ahnl a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahnl.class, a = new ahnl());
    }
    
    private ahnl() {
        emptyProtobufList();
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
                if ((b = ahnl.b) == null) {
                    synchronized (ahnl.class) {
                        if (ahnl.b == null) {
                            ahnl.b = (ahbe)new agzb((agzi)ahnl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahnl.a;
            }
            case 4: {
                return new agza((agzi)ahnl.a);
            }
            case 3: {
                return new ahnl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahnl.a, "\u0001\u0000", null);
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
