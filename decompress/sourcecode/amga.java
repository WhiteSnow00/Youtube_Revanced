import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amga extends agzi implements ahax
{
    private static volatile ahbe B;
    public static final amga a;
    public ahqd A;
    private aphv C;
    private byte D;
    public int b;
    public int c;
    public anrv d;
    public apej e;
    public albc f;
    public amcw g;
    public algr h;
    public amzg i;
    public ajbd j;
    public ajol k;
    public anje l;
    public ahsb m;
    public ajor n;
    public ajtt o;
    public ahqu p;
    public ahps q;
    public ahui r;
    public amve s;
    public aizi t;
    public ahqj u;
    public ahrz v;
    public ahpy w;
    public aoox x;
    public ahsa y;
    public ajbb z;
    
    static {
        agzi.registerDefaultInstance((Class)amga.class, (agzi)(a = new amga()));
    }
    
    private amga() {
        this.D = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = amga.B) == null) {
                    synchronized (amga.class) {
                        if (amga.B == null) {
                            amga.B = (ahbe)new agzb((agzi)amga.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amga.a;
            }
            case 4: {
                return new agza((agzi)amga.a);
            }
            case 3: {
                return new amga();
            }
            case 2: {
                return newMessageInfo((MessageLite)amga.a, "\u0001\u0019\u0000\u0002\ufb79\u194f\ue98f\u3dd6\u0019\u0000\u0000\u0002\ufb79\u194f\u1009\u0000\ue63b\u1b8a\u1009\u0011\ufe3f\u1e16\u1409\u0001\uff1b\u2035\u1009\u0004\uf9c3\u20dd\u1009\u000b\uf601\u20e9\u1009\f\ufb0d\u2330\u1009\u0003\uff66\u2372\u1009\u0012\uf20e\u2536\u1009\u0017\uec7b\u2bae\u1009\u001d\ufd58\u2bb0\u1009\u001b\uf48f\u2c53\u1009\u001e\uf007\u2e11\u1009\u001f\ue4ef\u2f74\u1009\u000f\ue987\u3019\u1009\u001c\ufd42\u30f6\u1009#\ueea0\u30f7\u1009\"\ue3a3\u3146\u1009$\ufd5d\u33cc\u1009'\ue70c\u3531\u1409\u0002\uf79c\u355b\u1009\r\ue44a\u358c\u1009\u000e\uef32\u3ce0\u10090\uf2f2\u3dd4\u10091\ue98f\u3dd6\u10093", new Object[] { "b", "c", "d", "m", "e", "g", "h", "i", "f", "n", "o", "r", "p", "s", "t", "l", "q", "v", "u", "w", "x", "C", "j", "k", "y", "z", "A" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.D = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.D;
            }
        }
    }
}
