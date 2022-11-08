import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowh extends agzi implements ahax
{
    public static final aowh a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aowh.class, a = new aowh());
    }
    
    private aowh() {
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
                if ((b = aowh.b) == null) {
                    synchronized (aowh.class) {
                        if (aowh.b == null) {
                            aowh.b = (ahbe)new agzb((agzi)aowh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowh.a;
            }
            case 4: {
                return new agza((agzi)aowh.a);
            }
            case 3: {
                return new aowh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowh.a, "\u0001\u0000", null);
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
