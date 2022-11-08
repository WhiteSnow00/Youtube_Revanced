import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfd extends agzi implements ahax
{
    public static final ajfd a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ajfd.class, a = new ajfd());
    }
    
    private ajfd() {
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
                if ((b = ajfd.b) == null) {
                    synchronized (ajfd.class) {
                        if (ajfd.b == null) {
                            ajfd.b = (ahbe)new agzb((agzi)ajfd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajfd.a;
            }
            case 4: {
                return new agza((agzi)ajfd.a);
            }
            case 3: {
                return new ajfd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajfd.a, "\u0001\u0000", null);
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
