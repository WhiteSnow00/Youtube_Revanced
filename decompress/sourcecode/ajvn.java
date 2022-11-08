import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvn extends agzi implements ahax
{
    public static final ajvn a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ajvn.class, a = new ajvn());
    }
    
    private ajvn() {
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
                if ((b = ajvn.b) == null) {
                    synchronized (ajvn.class) {
                        if (ajvn.b == null) {
                            ajvn.b = (ahbe)new agzb((agzi)ajvn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajvn.a;
            }
            case 4: {
                return new agza((agzi)ajvn.a);
            }
            case 3: {
                return new ajvn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvn.a, "\u0001\u0000", null);
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
