import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwr extends agzi implements ahax
{
    public static final ajwr a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ajwr.class, a = new ajwr());
    }
    
    private ajwr() {
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
                if ((b = ajwr.b) == null) {
                    synchronized (ajwr.class) {
                        if (ajwr.b == null) {
                            ajwr.b = (ahbe)new agzb((agzi)ajwr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajwr.a;
            }
            case 4: {
                return new agza((agzi)ajwr.a);
            }
            case 3: {
                return new ajwr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajwr.a, "\u0001\u0000", null);
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
