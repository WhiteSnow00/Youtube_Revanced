import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpv extends agzi implements ahax
{
    public static final alpv a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(alpv.class, a = new alpv());
    }
    
    private alpv() {
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
                if ((d = alpv.d) == null) {
                    synchronized (alpv.class) {
                        if (alpv.d == null) {
                            alpv.d = (ahbe)new agzb((agzi)alpv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alpv.a;
            }
            case 4: {
                return new agza((agzi)alpv.a);
            }
            case 3: {
                return new alpv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alpv.a, "\u0001\u0002\u0001\u0000\uf501\u3e00\ufccc\u4220\u0002\u0000\u0000\u0002\uf501\u3e00\u143c\u0000\ufccc\u4220\u143c\u0000", new Object[] { "c", "b", alnx.class, ajnn.class });
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
