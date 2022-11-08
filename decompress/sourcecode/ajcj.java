import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcj extends agzi implements ahax
{
    public static final ajcj a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ajcj.class, a = new ajcj());
    }
    
    private ajcj() {
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
                if ((b = ajcj.b) == null) {
                    synchronized (ajcj.class) {
                        if (ajcj.b == null) {
                            ajcj.b = (ahbe)new agzb((agzi)ajcj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajcj.a;
            }
            case 4: {
                return new agza((agzi)ajcj.a);
            }
            case 3: {
                return new ajcj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajcj.a, "\u0001\u0000", null);
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
