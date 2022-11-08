import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amtn extends agzi implements ahax
{
    public static final amtn a;
    private static volatile ahbe d;
    public int b;
    public amva c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(amtn.class, a = new amtn());
    }
    
    private amtn() {
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
                if ((d = amtn.d) == null) {
                    synchronized (amtn.class) {
                        if (amtn.d == null) {
                            amtn.d = (ahbe)new agzb((agzi)amtn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amtn.a;
            }
            case 4: {
                return new agza((agzi)amtn.a);
            }
            case 3: {
                return new amtn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amtn.a, "\u0001\u0001\u0000\u0001\ue528\u1ce2\ue528\u1ce2\u0001\u0000\u0000\u0001\ue528\u1ce2\u1409\u0000", new Object[] { "b", "c" });
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
