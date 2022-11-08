import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwe extends agzi implements ahax
{
    public static final ajwe a;
    private static volatile ahbe d;
    public ajsq b;
    public String c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ajwe.class, a = new ajwe());
    }
    
    private ajwe() {
        this.f = 2;
        this.c = "";
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
                final ahbe d;
                if ((d = ajwe.d) == null) {
                    synchronized (ajwe.class) {
                        if (ajwe.d == null) {
                            ajwe.d = (ahbe)new agzb((agzi)ajwe.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajwe.a;
            }
            case 4: {
                return new agza((agzi)ajwe.a);
            }
            case 3: {
                return new ajwe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajwe.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
