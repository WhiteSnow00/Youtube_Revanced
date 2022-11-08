import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowm extends agzi implements ahax
{
    public static final aowm a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aowm.class, a = new aowm());
    }
    
    private aowm() {
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
                if ((b = aowm.b) == null) {
                    synchronized (aowm.class) {
                        if (aowm.b == null) {
                            aowm.b = (ahbe)new agzb((agzi)aowm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowm.a;
            }
            case 4: {
                return new agza((agzi)aowm.a);
            }
            case 3: {
                return new aowm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowm.a, "\u0001\u0000", null);
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
