import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akrw extends ahcz implements aheo
{
    public static final akrw a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akrw.class, a = new akrw());
    }
    
    private akrw() {
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
                if ((d = akrw.d) == null) {
                    synchronized (akrw.class) {
                        if (akrw.d == null) {
                            akrw.d = (ahev)new ahcs((ahcz)akrw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akrw.a;
            }
            case 4: {
                return new ahcr((ahcz)akrw.a);
            }
            case 3: {
                return new akrw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akrw.a, "\u0001\u0003\u0001\u0000\ufa18\u3c15\uf39d\uc62b\u0003\u0000\u0000\u0003\ufa18\u3c15\u143c\u0000\uec26\u4753\u143c\u0000\uf39d\uc62b\u143c\u0000", new Object[] { "c", "b", amkz.class, aizb.class, amly.class });
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
