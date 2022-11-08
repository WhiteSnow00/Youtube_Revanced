import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorr extends agzi implements ahax
{
    public static final aorr a;
    private static volatile ahbe d;
    public int b;
    public aorq c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aorr.class, a = new aorr());
    }
    
    private aorr() {
        this.e = 2;
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
                if ((d = aorr.d) == null) {
                    synchronized (aorr.class) {
                        if (aorr.d == null) {
                            aorr.d = (ahbe)new agzb((agzi)aorr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aorr.a;
            }
            case 4: {
                return new agza((agzi)aorr.a);
            }
            case 3: {
                return new aorr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aorr.a, "\u0001\u0001\u0000\u0001\ue520\u30b1\ue520\u30b1\u0001\u0000\u0000\u0001\ue520\u30b1\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
