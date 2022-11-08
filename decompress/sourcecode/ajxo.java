import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxo extends agzi implements ahax
{
    public static final ajxo a;
    private static volatile ahbe ab;
    public anod A;
    public ReelItemRendererOuterClass$ReelItemRenderer B;
    public aorv C;
    public apdf D;
    public aozj E;
    public apab F;
    public apap G;
    public apaq H;
    public apas I;
    public apbu J;
    public apbx K;
    public ajux L;
    public ajvd M;
    public ajuw N;
    public aiag O;
    public ankj P;
    public anpu Q;
    public amnf R;
    public amko S;
    public amlg T;
    public ajtx U;
    public apay V;
    public aovs W;
    public aphz X;
    public amlp Y;
    public aiwc Z;
    public ajkj aa;
    private byte ac;
    public int b;
    public int c;
    public aiuh d;
    public aixw e;
    public aiso f;
    public aitp g;
    public aitq h;
    public aith i;
    public apme j;
    public ajwy k;
    public ajxa l;
    public ajxb m;
    public ajxc n;
    public ajxd o;
    public ajxe p;
    public ajxg q;
    public ajxh r;
    public ajxj s;
    public ajxk t;
    public ajxp u;
    public ajxs v;
    public ajxq w;
    public alst x;
    public amlx y;
    public annr z;
    
    static {
        agzi.registerDefaultInstance(ajxo.class, a = new ajxo());
    }
    
    private ajxo() {
        this.ac = 2;
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
                final ahbe ab;
                if ((ab = ajxo.ab) == null) {
                    synchronized (ajxo.class) {
                        if (ajxo.ab == null) {
                            ajxo.ab = (ahbe)new agzb((agzi)ajxo.a);
                        }
                    }
                }
                return ab;
            }
            case 5: {
                return ajxo.a;
            }
            case 4: {
                return new agza((agzi)ajxo.a);
            }
            case 3: {
                return new ajxo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxo.a, "\u00012\u0000\u0002\uf143\u1824\ue5c9\uc70d2\u0000\u00002\uf143\u1824\u1409\u0000\ue567\u1832\u1409\u0003\uef41\u1838\u1409\u0002\uea1c\u1be3\u1409\u0005\ufa2b\u1cc9\u1409\u0007\ufa34\u1cc9\u1409\t\ufa43\u1cc9\u1409\r\ufa4a\u1cc9\u1409\u0010\ufa79\u1cc9\u1409\u0012\ue52a\u1dd2\u1409\u0015\uf60f\u1fbb\u1409\b\ued8a\u2643\u1409\u0006\ue0b4\u2730\u1409\u000f\ueb31\u28e1\u1409\u001a\uefa9\u2c60\u1409\u000e\uead4\u2e10\u1409\u001f\ue3c8\u2e52\u1409\u001e\ue5a9\u2e62\u1409!\uf5b1\u2f1e\u1409\u0001\ue772\u2fa9\u1409\u001b\uf969\u3253\u1409\u0011\ufd3b\u3273\u1409\"\ue9f9\u3274\u1409#\uf04b\u3336\u1409%\uf062\u3765\u1409\u001d\ue53c\u4241\u1409'\ue92d\u455d\u1409\f\ufbbb\u456d\u1409&\uf528\u4589\u1409\n\ue93c\u458b\u1409\u000b\uf0c1\u48dc\u1409\u0004\uf492\u4933\u14091\uf411\u4aef\u1409\u0016\uf423\u4aef\u1409\u0017\ue156\u4bc3\u1409\u0018\uf72c\u4c0d\u14090\uedf0\u4cde\u1409(\uf556\u4dda\u1409-\ue8d9\u4f95\u1409$\uf7bf\u5359\u1409,\ufb36\u567e\u1409)\uf078\u583d\u1409\u0014\uec2c\u5c92\u1409+\ueaf6\u68ea\u1409\u001c\uf6ce\u6df8\u1409\u0019\ue7a1\u7d15\u1409.\uf3b0\u8627\u1409/\ufe53\u9bf0\u1409 \uebbc\uaf27\u1409\u0013\ue5c9\uc70d\u1409*", new Object[] { "b", "c", "d", "g", "f", "i", "k", "m", "q", "t", "v", "y", "l", "j", "s", "D", "r", "I", "H", "K", "e", "E", "u", "L", "M", "O", "G", "Q", "p", "P", "n", "o", "h", "aa", "z", "A", "B", "Z", "R", "W", "N", "V", "S", "x", "U", "F", "C", "X", "Y", "J", "w", "T" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.ac = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.ac;
            }
        }
    }
}
