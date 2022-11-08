import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwm extends agzi implements ahax
{
    public static final amwm a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(amwm.class, a = new amwm());
    }
    
    private amwm() {
        this.b = 0;
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
                if ((d = amwm.d) == null) {
                    synchronized (amwm.class) {
                        if (amwm.d == null) {
                            amwm.d = (ahbe)new agzb((agzi)amwm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amwm.a;
            }
            case 4: {
                return new agza((agzi)amwm.a);
            }
            case 3: {
                return new amwm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amwm.a, "\u0001\u0003\u0001\u0000\ufaea\u4220\ufe8a\ud28e\u0003\u0000\u0000\u0003\ufaea\u4220\u143c\u0000\uf492\u4933\u143c\u0000\ufe8a\ud28e\u143c\u0000", new Object[] { "c", "b", ajnl.class, ajkj.class, amwh.class });
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
