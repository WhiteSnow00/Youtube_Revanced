import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amnp extends ahcz implements aheo
{
    public static final amnp a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amnp.class, a = new amnp());
    }
    
    private amnp() {
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
                if ((d = amnp.d) == null) {
                    synchronized (amnp.class) {
                        if (amnp.d == null) {
                            amnp.d = (ahev)new ahcs((ahcz)amnp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amnp.a;
            }
            case 4: {
                return new ahcr((ahcz)amnp.a);
            }
            case 3: {
                return new amnp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amnp.a, "\u0001\u0010\u0001\u0000\uec06\u17ef\ue754\u9da9\u0010\u0000\u0000\u0010\uec06\u17ef\u143c\u0000\ue592\u1be6\u143c\u0000\uf41e\u24c4\u143c\u0000\ueb6b\u2cf9\u143c\u0000\ue1ce\u3a42\u143c\u0000\ue81c\u3f7e\u143c\u0000\ueec1\u4cc4\u143c\u0000\uf584\u5527\u143c\u0000\uf086\u62b5\u143c\u0000\ue538\u835f\u143c\u0000\uf281\u835f\u143c\u0000\uf283\u835f\u143c\u0000\ue442\u8993\u143c\u0000\uee76\u9d12\u143c\u0000\ue0d4\u9d2e\u143c\u0000\ue754\u9da9\u143c\u0000", new Object[] { "c", "b", alme.class, amjl.class, ahlo.class, aiad.class, amno.class, amnl.class, aoxm.class, aizu.class, aivg.class, aihr.class, aihq.class, aihu.class, aihp.class, aorg.class, anwk.class, annq.class });
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
