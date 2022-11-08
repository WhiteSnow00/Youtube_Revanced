import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyo extends agzi implements ahax
{
    public static final ajyo a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ajyo.class, a = new ajyo());
    }
    
    private ajyo() {
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
                if ((b = ajyo.b) == null) {
                    synchronized (ajyo.class) {
                        if (ajyo.b == null) {
                            ajyo.b = (ahbe)new agzb((agzi)ajyo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajyo.a;
            }
            case 4: {
                return new agza((agzi)ajyo.a);
            }
            case 3: {
                return new ajyo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajyo.a, "\u0001\u0000", null);
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
