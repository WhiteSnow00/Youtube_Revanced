import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetj extends agzi implements ahax
{
    public static final aetj a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aetj.class, a = new aetj());
    }
    
    private aetj() {
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
                if ((b = aetj.b) == null) {
                    synchronized (aetj.class) {
                        if (aetj.b == null) {
                            aetj.b = (ahbe)new agzb((agzi)aetj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aetj.a;
            }
            case 4: {
                return new agza((agzi)aetj.a);
            }
            case 3: {
                return new aetj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aetj.a, "\u0001\u0000", null);
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
