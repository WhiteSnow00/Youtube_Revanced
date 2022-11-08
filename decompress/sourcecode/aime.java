import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aime extends agzi implements ahax
{
    public static final aime a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aime.class, a = new aime());
    }
    
    private aime() {
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
                if ((b = aime.b) == null) {
                    synchronized (aime.class) {
                        if (aime.b == null) {
                            aime.b = (ahbe)new agzb((agzi)aime.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aime.a;
            }
            case 4: {
                return new agza((agzi)aime.a);
            }
            case 3: {
                return new aime();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aime.a, "\u0001\u0000", null);
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
