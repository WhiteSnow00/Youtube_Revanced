import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyj extends ahcz implements aheo
{
    public static final apyj a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apyj.class, a = new apyj());
    }
    
    private apyj() {
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
                if ((d = apyj.d) == null) {
                    synchronized (apyj.class) {
                        if (apyj.d == null) {
                            apyj.d = (ahev)new ahcs((ahcz)apyj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apyj.a;
            }
            case 4: {
                return new ahcr((ahcz)apyj.a);
            }
            case 3: {
                return new apyj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyj.a, "\u0001\u0001\u0001\u0000\ufac9\u3c79\ufac9\u3c79\u0001\u0000\u0000\u0001\ufac9\u3c79\u143c\u0000", new Object[] { "c", "b", apyh.class });
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
