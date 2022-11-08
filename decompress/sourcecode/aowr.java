import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowr extends agzi implements ahax
{
    public static final aowr a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aowr.class, a = new aowr());
    }
    
    private aowr() {
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
                if ((b = aowr.b) == null) {
                    synchronized (aowr.class) {
                        if (aowr.b == null) {
                            aowr.b = (ahbe)new agzb((agzi)aowr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowr.a;
            }
            case 4: {
                return new agza((agzi)aowr.a);
            }
            case 3: {
                return new aowr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowr.a, "\u0001\u0000", null);
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
