import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitt extends agzi implements ahax
{
    public static final aitt a;
    private static volatile ahbe d;
    public int b;
    public anom c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aitt.class, a = new aitt());
    }
    
    private aitt() {
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
                if ((d = aitt.d) == null) {
                    synchronized (aitt.class) {
                        if (aitt.d == null) {
                            aitt.d = (ahbe)new agzb((agzi)aitt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aitt.a;
            }
            case 4: {
                return new agza((agzi)aitt.a);
            }
            case 3: {
                return new aitt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aitt.a, "\u0001\u0001\u0000\u0001\uff43\u1dfd\uff43\u1dfd\u0001\u0000\u0000\u0001\uff43\u1dfd\u1409\u0000", new Object[] { "b", "c" });
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
