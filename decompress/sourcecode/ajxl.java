import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxl extends agzi implements ahax
{
    public static final ajxl a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public int d;
    public int e;
    private int g;
    
    static {
        agzi.registerDefaultInstance(ajxl.class, a = new ajxl());
    }
    
    private ajxl() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ajxl.f) == null) {
                    synchronized (ajxl.class) {
                        if (ajxl.f == null) {
                            ajxl.f = (ahbe)new agzb((agzi)ajxl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajxl.a;
            }
            case 4: {
                return new agza((agzi)ajxl.a);
            }
            case 3: {
                return new ajxl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxl.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
