import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alot extends agzi implements ahax
{
    public static final alot a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(alot.class, a = new alot());
    }
    
    private alot() {
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
                if ((d = alot.d) == null) {
                    synchronized (alot.class) {
                        if (alot.d == null) {
                            alot.d = (ahbe)new agzb((agzi)alot.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alot.a;
            }
            case 4: {
                return new agza((agzi)alot.a);
            }
            case 3: {
                return new alot();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alot.a, "\u0001\u0002\u0001\u0000\ufb93\u3f2d\uf602\u6ed0\u0002\u0000\u0000\u0002\ufb93\u3f2d\u143c\u0000\uf602\u6ed0\u143c\u0000", new Object[] { "c", "b", alpf.class, alog.class });
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
