import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoue extends agzi implements ahax
{
    public static final aoue a;
    private static volatile ahbe d;
    public akze b;
    public aoty c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aoue.class, a = new aoue());
    }
    
    private aoue() {
        this.f = 2;
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
                if ((d = aoue.d) == null) {
                    synchronized (aoue.class) {
                        if (aoue.d == null) {
                            aoue.d = (ahbe)new agzb((agzi)aoue.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoue.a;
            }
            case 4: {
                return new agza((agzi)aoue.a);
            }
            case 3: {
                return new aoue();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoue.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0001\u0003\u1409\u0000\u0004\u1009\u0001", new Object[] { "e", "b", "c" });
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
