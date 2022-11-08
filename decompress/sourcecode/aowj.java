import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowj extends agzi implements ahax
{
    public static final aowj a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aowj.class, a = new aowj());
    }
    
    private aowj() {
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
                if ((b = aowj.b) == null) {
                    synchronized (aowj.class) {
                        if (aowj.b == null) {
                            aowj.b = (ahbe)new agzb((agzi)aowj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowj.a;
            }
            case 4: {
                return new agza((agzi)aowj.a);
            }
            case 3: {
                return new aowj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowj.a, "\u0001\u0000", null);
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
