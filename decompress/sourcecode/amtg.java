import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amtg extends agzi implements ahax
{
    public static final amtg a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(amtg.class, a = new amtg());
    }
    
    private amtg() {
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
                if ((d = amtg.d) == null) {
                    synchronized (amtg.class) {
                        if (amtg.d == null) {
                            amtg.d = (ahbe)new agzb((agzi)amtg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amtg.a;
            }
            case 4: {
                return new agza((agzi)amtg.a);
            }
            case 3: {
                return new amtg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amtg.a, "\u0001\u0003\u0001\u0000\ufc43\u196f\ue607\u2a05\u0003\u0000\u0000\u0003\ufc43\u196f\u143c\u0000\uf321\u1e90\u143c\u0000\ue607\u2a05\u143c\u0000", new Object[] { "c", "b", ajcz.class, aiva.class, apgl.class });
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
