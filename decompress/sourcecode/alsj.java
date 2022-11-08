import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alsj extends agzi implements ahax
{
    public static final alsj a;
    private static volatile ahbe d;
    public boolean b;
    public long c;
    private int e;
    private anss f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(alsj.class, a = new alsj());
    }
    
    private alsj() {
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
                if ((d = alsj.d) == null) {
                    synchronized (alsj.class) {
                        if (alsj.d == null) {
                            alsj.d = (ahbe)new agzb((agzi)alsj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alsj.a;
            }
            case 4: {
                return new agza((agzi)alsj.a);
            }
            case 3: {
                return new alsj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alsj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1007\u0000\u0002\u1409\u0001\u0003\u1003\u0002", new Object[] { "e", "b", "f", "c" });
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
