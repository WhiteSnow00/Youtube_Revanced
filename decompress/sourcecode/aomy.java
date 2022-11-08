import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomy extends agzi implements ahax
{
    public static final aomy a;
    private static volatile ahbe d;
    public int b;
    public aomw c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aomy.class, (agzi)(a = new aomy()));
    }
    
    private aomy() {
        this.e = 2;
    }
    
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
                if ((d = aomy.d) == null) {
                    synchronized (aomy.class) {
                        if (aomy.d == null) {
                            aomy.d = (ahbe)new agzb((agzi)aomy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aomy.a;
            }
            case 4: {
                return new agza((agzi)aomy.a);
            }
            case 3: {
                return new aomy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomy.a, "\u0001\u0001\u0000\u0001\ue661\u367b\ue661\u367b\u0001\u0000\u0000\u0001\ue661\u367b\u1409\u0000", new Object[] { "b", "c" });
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
