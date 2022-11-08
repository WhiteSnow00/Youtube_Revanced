import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anih extends agzi implements ahax
{
    public static final anih a;
    private static volatile ahbe d;
    public int b;
    public aorm c;
    private ahfw e;
    private aioe f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(anih.class, a = new anih());
    }
    
    private anih() {
        this.g = 2;
        final agyc b = agyc.b;
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
                if ((d = anih.d) == null) {
                    synchronized (anih.class) {
                        if (anih.d == null) {
                            anih.d = (ahbe)new agzb((agzi)anih.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anih.a;
            }
            case 4: {
                return new agza((agzi)anih.a);
            }
            case 3: {
                return new anih();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anih.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003", new Object[] { "b", "c", "e", "f" });
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
