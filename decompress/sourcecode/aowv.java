import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowv extends agzi implements ahax
{
    public static final aowv a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aowv.class, a = new aowv());
    }
    
    private aowv() {
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
                if ((b = aowv.b) == null) {
                    synchronized (aowv.class) {
                        if (aowv.b == null) {
                            aowv.b = (ahbe)new agzb((agzi)aowv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowv.a;
            }
            case 4: {
                return new agza((agzi)aowv.a);
            }
            case 3: {
                return new aowv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowv.a, "\u0001\u0000", null);
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
