import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlk extends ahbh implements ahcw
{
    public static final amlk a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amlk.class, (ahbh)(a = new amlk()));
    }
    
    private amlk() {
        this.b = 0;
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = amlk.d) == null) {
                    synchronized (amlk.class) {
                        if (amlk.d == null) {
                            amlk.d = (ahdd)new ahba((ahbh)amlk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amlk.a;
            }
            case 4: {
                return new ahaz((ahbh)amlk.a);
            }
            case 3: {
                return new amlk();
            }
            case 2: {
                return newMessageInfo((MessageLite)amlk.a, "\u0001\u0010\u0001\u0000\uec06\u17ef\ue754\u9da9\u0010\u0000\u0000\u0010\uec06\u17ef\u143c\u0000\ue592\u1be6\u143c\u0000\uf41e\u24c4\u143c\u0000\ueb6b\u2cf9\u143c\u0000\ue1ce\u3a42\u143c\u0000\ue81c\u3f7e\u143c\u0000\ueec1\u4cc4\u143c\u0000\uf584\u5527\u143c\u0000\uf086\u62b5\u143c\u0000\ue538\u835f\u143c\u0000\uf281\u835f\u143c\u0000\uf283\u835f\u143c\u0000\ue442\u8993\u143c\u0000\uee76\u9d12\u143c\u0000\ue0d4\u9d2e\u143c\u0000\ue754\u9da9\u143c\u0000", new Object[] { "c", "b", alke.class, amhi.class, ahjx.class, ahyk.class, amlj.class, amlg.class, aouz.class, aixw.class, aiti.class, aify.class, aifx.class, aigb.class, aifw.class, aoow.class, anue.class, anlj.class });
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
