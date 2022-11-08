import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowp extends agzi implements ahax
{
    public static final aowp a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aowp.class, a = new aowp());
    }
    
    private aowp() {
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b = aowp.b) == null) {
                    synchronized (aowp.class) {
                        if (aowp.b == null) {
                            aowp.b = (ahbe)new agzb((agzi)aowp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowp.a;
            }
            case 4: {
                return new agza((agzi)aowp.a);
            }
            case 3: {
                return new aowp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowp.a, "\u0001\u0000", null);
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
