import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvl extends agzi implements ahax
{
    public static final ajvl a;
    private static volatile ahbe d;
    public double b;
    public double c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ajvl.class, a = new ajvl());
    }
    
    private ajvl() {
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
                if ((d = ajvl.d) == null) {
                    synchronized (ajvl.class) {
                        if (ajvl.d == null) {
                            ajvl.d = (ahbe)new agzb((agzi)ajvl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajvl.a;
            }
            case 4: {
                return new agza((agzi)ajvl.a);
            }
            case 3: {
                return new ajvl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1000\u0001", new Object[] { "e", "b", "c" });
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
