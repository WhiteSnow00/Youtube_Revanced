import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvv extends agzi implements ahax
{
    public static final amvv a;
    private static volatile ahbe e;
    public int b;
    public ajsq c;
    public aioe d;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(amvv.class, a = new amvv());
    }
    
    private amvv() {
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
                final ahbe e;
                if ((e = amvv.e) == null) {
                    synchronized (amvv.class) {
                        if (amvv.e == null) {
                            amvv.e = (ahbe)new agzb((agzi)amvv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amvv.a;
            }
            case 4: {
                return new agza((agzi)amvv.a);
            }
            case 3: {
                return new amvv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvv.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0002\u0005\u1409\u0004", new Object[] { "b", "c", "d", "f" });
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
