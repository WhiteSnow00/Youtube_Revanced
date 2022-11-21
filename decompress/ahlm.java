import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlm extends ahcz implements aheo
{
    public static final ahlm a;
    private static volatile ahev d;
    public int b;
    public ahlg c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ahlm.class, a = new ahlm());
    }
    
    private ahlm() {
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
                if ((d = ahlm.d) == null) {
                    synchronized (ahlm.class) {
                        if (ahlm.d == null) {
                            ahlm.d = (ahev)new ahcs((ahcz)ahlm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahlm.a;
            }
            case 4: {
                return new ahcr((ahcz)ahlm.a);
            }
            case 3: {
                return new ahlm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahlm.a, "\u0001\u0001\u0000\u0001\uf2eb\u2c8b\uf2eb\u2c8b\u0001\u0000\u0000\u0001\uf2eb\u2c8b\u1409\u0000", new Object[] { "b", "c" });
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
