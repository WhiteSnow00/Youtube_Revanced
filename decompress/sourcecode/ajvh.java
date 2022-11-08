import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvh extends agzi implements ahax
{
    public static final ajvh a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(ajvh.class, a = new ajvh());
    }
    
    private ajvh() {
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
                if ((d = ajvh.d) == null) {
                    synchronized (ajvh.class) {
                        if (ajvh.d == null) {
                            ajvh.d = (ahbe)new agzb((agzi)ajvh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajvh.a;
            }
            case 4: {
                return new agza((agzi)ajvh.a);
            }
            case 3: {
                return new ajvh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", ajrv.s });
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
