import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowt extends agzi implements ahax
{
    public static final aowt a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aowt.class, a = new aowt());
    }
    
    private aowt() {
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
                if ((b = aowt.b) == null) {
                    synchronized (aowt.class) {
                        if (aowt.b == null) {
                            aowt.b = (ahbe)new agzb((agzi)aowt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowt.a;
            }
            case 4: {
                return new agza((agzi)aowt.a);
            }
            case 3: {
                return new aowt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowt.a, "\u0001\u0000", null);
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
