import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzq extends ahcz implements aheo
{
    public static final akzq a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akzq.class, a = new akzq());
    }
    
    private akzq() {
        this.b = 0;
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = akzq.d) == null) {
                    synchronized (akzq.class) {
                        if (akzq.d == null) {
                            akzq.d = (ahev)new ahcs((ahcz)akzq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akzq.a;
            }
            case 4: {
                return new ahcr((ahcz)akzq.a);
            }
            case 3: {
                return new akzq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzq.a, "\u0001\u0002\u0001\u0000\uf07a\u228a\ueb33\u2936\u0002\u0000\u0000\u0001\uf07a\u228a\u103c\u0000\ueb33\u2936\u143c\u0000", new Object[] { "c", "b", anhu.class, aqaa.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
