import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aodt extends agzi implements ahax
{
    public static final aodt a;
    private static volatile ahbe d;
    public aorm b;
    public ajsq c;
    private int e;
    private ajsq f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aodt.class, a = new aodt());
    }
    
    private aodt() {
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
                final ahbe d;
                if ((d = aodt.d) == null) {
                    synchronized (aodt.class) {
                        if (aodt.d == null) {
                            aodt.d = (ahbe)new agzb((agzi)aodt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aodt.a;
            }
            case 4: {
                return new agza((agzi)aodt.a);
            }
            case 3: {
                return new aodt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aodt.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "e", "b", "c", "f" });
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
