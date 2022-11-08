import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyh extends agzi implements ahax
{
    public static final atyh a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(atyh.class, a = new atyh());
    }
    
    private atyh() {
        emptyProtobufList();
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
                if ((b = atyh.b) == null) {
                    synchronized (atyh.class) {
                        if (atyh.b == null) {
                            atyh.b = (ahbe)new agzb((agzi)atyh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return atyh.a;
            }
            case 4: {
                return new agza((agzi)atyh.a);
            }
            case 3: {
                return new atyh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atyh.a, "\u0001\u0000", null);
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
