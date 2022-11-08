import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcn extends agzi implements ahax
{
    public static final ajcn a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ajcn.class, a = new ajcn());
    }
    
    private ajcn() {
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
                if ((b = ajcn.b) == null) {
                    synchronized (ajcn.class) {
                        if (ajcn.b == null) {
                            ajcn.b = (ahbe)new agzb((agzi)ajcn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajcn.a;
            }
            case 4: {
                return new agza((agzi)ajcn.a);
            }
            case 3: {
                return new ajcn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajcn.a, "\u0001\u0000", null);
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
