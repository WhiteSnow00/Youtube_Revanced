import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ains extends agzi implements ahax
{
    private static volatile ahbe B;
    public static final ains a;
    public anqa A;
    private int C;
    private byte D;
    public int b;
    public String c;
    public ahqv d;
    public alvl e;
    public ahoq f;
    public ahqk g;
    public ahgs h;
    public amga i;
    public answ j;
    public amrp k;
    public amcc l;
    public amhi m;
    public ajkz n;
    public amdp o;
    public altp p;
    public apgi q;
    public altd r;
    public aook s;
    public ancb t;
    public amql u;
    public aior v;
    public ajqv w;
    public ahqb x;
    public ajpg y;
    public anun z;
    
    static {
        agzi.registerDefaultInstance(ains.class, a = new ains());
    }
    
    private ains() {
        this.D = 2;
        this.c = "";
    }
    
    @Override
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
                if ((b2 = ains.B) == null) {
                    synchronized (ains.class) {
                        if (ains.B == null) {
                            ains.B = (ahbe)new agzb((agzi)ains.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ains.a;
            }
            case 4: {
                return new agza((agzi)ains.a);
            }
            case 3: {
                return new ains();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ains.a, "\u0001\u0019\u0000\u0002\u0001\ue444\uaddb\u0019\u0000\u0000\u0001\u0001\u1008\u0000\u0004\u1009\u0015\ue948\u3588\u1009\u0003\uf69a\u3ed2\u1009\u0004\ufa4d\u3f1e\u1009\u0007\uee68\u403c\u1009\u0005\uf593\u405f\u1409\n\ue04c\u456e\u1009\f\ue7c6\u4811\u1009\u0010\ueb23\u485f\u1009\u0011\ueb51\u4bd4\u1009\u0012\ue6c3\u4cc4\u1009\u0013\ue71e\u4d72\u1009\u0016\ue7b1\u4e3a\u1009\u0017\ufc77\u4e80\u1009\u0018\ufc98\u516a\u1009\u001a\ue33d\u528e\u1009\u001b\uffa6\u584d\u1009\u001d\ue779\u6687\u1009!\ue5eb\u74e0\u1009#\ue2a9\u76e6\u1009\b\ue1c7\u9f59\u1009%\uefeb\ua54b\u1009&\ufaf0\ua54b\u1009'\ue444\uaddb\u1009(", new Object[] { "b", "C", "c", "o", "d", "e", "g", "f", "i", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "u", "v", "w", "h", "x", "y", "z", "A" });
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
