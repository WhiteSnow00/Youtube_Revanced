import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwd extends agzi implements ahax
{
    public static final ajwd a;
    private static volatile ahbe e;
    public ajsq b;
    public anss c;
    public anss d;
    private int f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ajwd.class, a = new ajwd());
    }
    
    private ajwd() {
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ajwd.e) == null) {
                    synchronized (ajwd.class) {
                        if (ajwd.e == null) {
                            ajwd.e = (ahbe)new agzb((agzi)ajwd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajwd.a;
            }
            case 4: {
                return new agza((agzi)ajwd.a);
            }
            case 3: {
                return new ajwd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajwd.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "f", "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
