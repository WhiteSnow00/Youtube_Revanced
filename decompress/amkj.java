import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkj extends ahcz implements aheo
{
    private static volatile ahev B;
    public static final amkj a;
    public ahtu A;
    private apml C;
    private byte D;
    public int b;
    public int c;
    public anwe d;
    public apiz e;
    public alff f;
    public amhc g;
    public alkv h;
    public andr i;
    public ajff j;
    public ajsp k;
    public anno l;
    public ahvs m;
    public ajsv n;
    public ajxv o;
    public ahul p;
    public ahtj q;
    public ahxz r;
    public amzn s;
    public ajdk t;
    public ahua u;
    public ahvq v;
    public ahtp w;
    public aotm x;
    public ahvr y;
    public ajfd z;
    
    static {
        ahcz.registerDefaultInstance(amkj.class, a = new amkj());
    }
    
    private amkj() {
        this.D = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = amkj.B) == null) {
                    synchronized (amkj.class) {
                        if (amkj.B == null) {
                            amkj.B = (ahev)new ahcs((ahcz)amkj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amkj.a;
            }
            case 4: {
                return new ahcr((ahcz)amkj.a);
            }
            case 3: {
                return new amkj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amkj.a, "\u0001\u0019\u0000\u0002\ufb79\u194f\ue98f\u3dd6\u0019\u0000\u0000\u0002\ufb79\u194f\u1009\u0000\ue63b\u1b8a\u1009\u0011\ufe3f\u1e16\u1409\u0001\uff1b\u2035\u1009\u0004\uf9c3\u20dd\u1009\u000b\uf601\u20e9\u1009\f\ufb0d\u2330\u1009\u0003\uff66\u2372\u1009\u0012\uf20e\u2536\u1009\u0017\uec7b\u2bae\u1009\u001d\ufd58\u2bb0\u1009\u001b\uf48f\u2c53\u1009\u001e\uf007\u2e11\u1009\u001f\ue4ef\u2f74\u1009\u000f\ue987\u3019\u1009\u001c\ufd42\u30f6\u1009#\ueea0\u30f7\u1009\"\ue3a3\u3146\u1009$\ufd5d\u33cc\u1009'\ue70c\u3531\u1409\u0002\uf79c\u355b\u1009\r\ue44a\u358c\u1009\u000e\uef32\u3ce0\u10090\uf2f2\u3dd4\u10091\ue98f\u3dd6\u10093", new Object[] { "b", "c", "d", "m", "e", "g", "h", "i", "f", "n", "o", "r", "p", "s", "t", "l", "q", "v", "u", "w", "x", "C", "j", "k", "y", "z", "A" });
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
