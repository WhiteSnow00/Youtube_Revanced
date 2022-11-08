import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aloy extends agzi implements ahax
{
    public static final aloy a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aloy.class, a = new aloy());
    }
    
    private aloy() {
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
                if ((d = aloy.d) == null) {
                    synchronized (aloy.class) {
                        if (aloy.d == null) {
                            aloy.d = (ahbe)new agzb((agzi)aloy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aloy.a;
            }
            case 4: {
                return new agza((agzi)aloy.a);
            }
            case 3: {
                return new aloy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aloy.a, "\u0001\u0005\u0001\u0000\uf6dc\u3c3c\ufa47\uc337\u0005\u0000\u0000\u0005\uf6dc\u3c3c\u143c\u0000\ue68a\u3d88\u143c\u0000\uf407\u5a86\u143c\u0000\uf9fc\u7ebd\u143c\u0000\ufa47\uc337\u143c\u0000", new Object[] { "c", "b", ajmh.class, alno.class, alpq.class, alph.class, alps.class });
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
