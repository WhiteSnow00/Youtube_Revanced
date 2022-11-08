import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aijh extends agzi implements ahax
{
    public static final aijh a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aijh.class, a = new aijh());
    }
    
    private aijh() {
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
                if ((b = aijh.b) == null) {
                    synchronized (aijh.class) {
                        if (aijh.b == null) {
                            aijh.b = (ahbe)new agzb((agzi)aijh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aijh.a;
            }
            case 4: {
                return new agza((agzi)aijh.a);
            }
            case 3: {
                return new aijh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aijh.a, "\u0001\u0000", null);
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
