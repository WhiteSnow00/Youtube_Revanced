import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzv extends ahcz implements aheo
{
    public static final akzv a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akzv.class, a = new akzv());
    }
    
    private akzv() {
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
                if ((d = akzv.d) == null) {
                    synchronized (akzv.class) {
                        if (akzv.d == null) {
                            akzv.d = (ahev)new ahcs((ahcz)akzv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akzv.a;
            }
            case 4: {
                return new ahcr((ahcz)akzv.a);
            }
            case 3: {
                return new akzv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzv.a, "\u0001\u0002\u0001\u0000\ufde4\u1a12\uf514\u53bd\u0002\u0000\u0000\u0002\ufde4\u1a12\u143c\u0000\uf514\u53bd\u143c\u0000", new Object[] { "c", "b", anmt.class, amqm.class });
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
