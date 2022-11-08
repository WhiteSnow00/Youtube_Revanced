import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpw extends agzi implements ahax
{
    public static final alpw a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(alpw.class, a = new alpw());
    }
    
    private alpw() {
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
                if ((d = alpw.d) == null) {
                    synchronized (alpw.class) {
                        if (alpw.d == null) {
                            alpw.d = (ahbe)new agzb((agzi)alpw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alpw.a;
            }
            case 4: {
                return new agza((agzi)alpw.a);
            }
            case 3: {
                return new alpw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alpw.a, "\u0001\u0001\u0001\u0000\uf788\u3e01\uf788\u3e01\u0001\u0000\u0000\u0001\uf788\u3e01\u143c\u0000", new Object[] { "c", "b", alob.class });
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
