import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdd extends agzi implements ahax
{
    public static final ajdd a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ajdd.class, a = new ajdd());
    }
    
    private ajdd() {
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
                if ((b = ajdd.b) == null) {
                    synchronized (ajdd.class) {
                        if (ajdd.b == null) {
                            ajdd.b = (ahbe)new agzb((agzi)ajdd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajdd.a;
            }
            case 4: {
                return new agza((agzi)ajdd.a);
            }
            case 3: {
                return new ajdd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajdd.a, "\u0001\u0000", null);
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
