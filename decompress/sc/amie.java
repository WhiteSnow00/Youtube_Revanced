import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amie extends ahbh implements ahcw
{
    private static volatile ahdd B;
    public static final amie a;
    public ahsb A;
    private apjz C;
    private byte D;
    public int b;
    public int c;
    public anty d;
    public apgn e;
    public aldf f;
    public amfa g;
    public aliv h;
    public anbk i;
    public ajdh j;
    public ajqq k;
    public anlh l;
    public ahtz m;
    public ajqw n;
    public ajvw o;
    public ahss p;
    public ahrq q;
    public ahwg r;
    public amxi s;
    public ajbm t;
    public ahsh u;
    public ahtx v;
    public ahrw w;
    public aora x;
    public ahty y;
    public ajdf z;
    
    static {
        ahbh.registerDefaultInstance((Class)amie.class, (ahbh)(a = new amie()));
    }
    
    private amie() {
        this.D = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = amie.B) == null) {
                    synchronized (amie.class) {
                        if (amie.B == null) {
                            amie.B = (ahdd)new ahba((ahbh)amie.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amie.a;
            }
            case 4: {
                return new ahaz((ahbh)amie.a);
            }
            case 3: {
                return new amie();
            }
            case 2: {
                return newMessageInfo((MessageLite)amie.a, "\u0001\u0019\u0000\u0002\ufb79\u194f\ue98f\u3dd6\u0019\u0000\u0000\u0002\ufb79\u194f\u1009\u0000\ue63b\u1b8a\u1009\u0011\ufe3f\u1e16\u1409\u0001\uff1b\u2035\u1009\u0004\uf9c3\u20dd\u1009\u000b\uf601\u20e9\u1009\f\ufb0d\u2330\u1009\u0003\uff66\u2372\u1009\u0012\uf20e\u2536\u1009\u0017\uec7b\u2bae\u1009\u001d\ufd58\u2bb0\u1009\u001b\uf48f\u2c53\u1009\u001e\uf007\u2e11\u1009\u001f\ue4ef\u2f74\u1009\u000f\ue987\u3019\u1009\u001c\ufd42\u30f6\u1009#\ueea0\u30f7\u1009\"\ue3a3\u3146\u1009$\ufd5d\u33cc\u1009'\ue70c\u3531\u1409\u0002\uf79c\u355b\u1009\r\ue44a\u358c\u1009\u000e\uef32\u3ce0\u10090\uf2f2\u3dd4\u10091\ue98f\u3dd6\u10093", new Object[] { "b", "c", "d", "m", "e", "g", "h", "i", "f", "n", "o", "r", "p", "s", "t", "l", "q", "v", "u", "w", "x", "C", "j", "k", "y", "z", "A" });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.D = d;
                return null;
            }
            case 0: {
                return this.D;
            }
        }
    }
}
