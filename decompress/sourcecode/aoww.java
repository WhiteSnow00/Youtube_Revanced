import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoww extends agzi implements ahax
{
    public static final aoww a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aoww.class, a = new aoww());
    }
    
    private aoww() {
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
                if ((b = aoww.b) == null) {
                    synchronized (aoww.class) {
                        if (aoww.b == null) {
                            aoww.b = (ahbe)new agzb((agzi)aoww.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoww.a;
            }
            case 4: {
                return new agza((agzi)aoww.a);
            }
            case 3: {
                return new aoww();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoww.a, "\u0001\u0000", null);
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
