import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajeo extends agzi implements ahax
{
    public static final ajeo a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ajeo.class, a = new ajeo());
    }
    
    private ajeo() {
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
                if ((b = ajeo.b) == null) {
                    synchronized (ajeo.class) {
                        if (ajeo.b == null) {
                            ajeo.b = (ahbe)new agzb((agzi)ajeo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajeo.a;
            }
            case 4: {
                return new agza((agzi)ajeo.a);
            }
            case 3: {
                return new ajeo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajeo.a, "\u0001\u0000", null);
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
