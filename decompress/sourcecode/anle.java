import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anle extends agzi implements ahax
{
    public static final anle a;
    private static volatile ahbe e;
    public double b;
    public ajsq c;
    public ajsq d;
    private int f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(anle.class, a = new anle());
    }
    
    private anle() {
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
                if ((e = anle.e) == null) {
                    synchronized (anle.class) {
                        if (anle.e == null) {
                            anle.e = (ahbe)new agzb((agzi)anle.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anle.a;
            }
            case 4: {
                return new agza((agzi)anle.a);
            }
            case 3: {
                return new anle();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anle.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1000\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "f", "b", "c", "d" });
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
