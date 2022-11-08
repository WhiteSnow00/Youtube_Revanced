import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowu extends agzi implements ahax
{
    private static final aowu a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aowu.class, a = new aowu());
    }
    
    private aowu() {
    }
    
    public static /* synthetic */ aowu a() {
        return aowu.a;
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
                if ((b = aowu.b) == null) {
                    synchronized (aowu.class) {
                        if (aowu.b == null) {
                            aowu.b = (ahbe)new agzb((agzi)aowu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowu.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aowu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowu.a, "\u0001\u0000", null);
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
