import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agok extends agzi implements ahax
{
    public static final agok a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agok.class, a = new agok());
    }
    
    private agok() {
        agzi.emptyProtobufList();
        emptyIntList();
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
                if ((b = agok.b) == null) {
                    synchronized (agok.class) {
                        if (agok.b == null) {
                            agok.b = (ahbe)new agzb((agzi)agok.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agok.a;
            }
            case 4: {
                return new agza((agzi)agok.a);
            }
            case 3: {
                return new agok();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agok.a, "\u0000\u0000", null);
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
