import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvp extends agzi implements ahax
{
    public static final ajvp a;
    private static volatile ahbe d;
    public int b;
    public anun c;
    
    static {
        agzi.registerDefaultInstance(ajvp.class, a = new ajvp());
    }
    
    private ajvp() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ajvp.d) == null) {
                    synchronized (ajvp.class) {
                        if (ajvp.d == null) {
                            ajvp.d = (ahbe)new agzb((agzi)ajvp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajvp.a;
            }
            case 4: {
                return new agza((agzi)ajvp.a);
            }
            case 3: {
                return new ajvp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
