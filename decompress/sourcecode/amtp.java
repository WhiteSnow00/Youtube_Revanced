import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amtp extends agzi implements ahax
{
    public static final amtp a;
    private static volatile ahbe d;
    public int b;
    public amto c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(amtp.class, a = new amtp());
    }
    
    private amtp() {
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
                if ((d = amtp.d) == null) {
                    synchronized (amtp.class) {
                        if (amtp.d == null) {
                            amtp.d = (ahbe)new agzb((agzi)amtp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amtp.a;
            }
            case 4: {
                return new agza((agzi)amtp.a);
            }
            case 3: {
                return new amtp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amtp.a, "\u0001\u0001\u0000\u0001\ued70\u23cc\ued70\u23cc\u0001\u0000\u0000\u0001\ued70\u23cc\u1409\u0000", new Object[] { "b", "c" });
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