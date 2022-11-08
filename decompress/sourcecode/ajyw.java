import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyw extends agzi implements ahax
{
    public static final ajyw a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public double d;
    public aioe e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ajyw.class, a = new ajyw());
    }
    
    private ajyw() {
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
                final ahbe f;
                if ((f = ajyw.f) == null) {
                    synchronized (ajyw.class) {
                        if (ajyw.f == null) {
                            ajyw.f = (ahbe)new agzb((agzi)ajyw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajyw.a;
            }
            case 4: {
                return new agza((agzi)ajyw.a);
            }
            case 3: {
                return new ajyw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajyw.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u1004\u0000\u0003\u1000\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e" });
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
