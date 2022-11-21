import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akei extends ahcz implements aheo
{
    public static final akei a;
    private static volatile ahev x;
    public int b;
    public ahst c;
    public aihw d;
    public aiwp e;
    public amnc f;
    public ankd g;
    public anpe h;
    public anpg i;
    public anwc j;
    public aoaa k;
    public apnb l;
    public ReelItemRendererOuterClass$ReelItemRenderer m;
    public akaj n;
    public ajqq o;
    public ajxz p;
    public akhf q;
    public alzj r;
    public anee s;
    public amid t;
    public ajon u;
    public akbw v;
    public anwb w;
    private byte y;
    
    static {
        ahcz.registerDefaultInstance(akei.class, a = new akei());
    }
    
    private akei() {
        this.y = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte y = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev x;
                if ((x = akei.x) == null) {
                    synchronized (akei.class) {
                        if (akei.x == null) {
                            akei.x = (ahev)new ahcs((ahcz)akei.a);
                        }
                    }
                }
                return x;
            }
            case 5: {
                return akei.a;
            }
            case 4: {
                return new ahcr((ahcz)akei.a);
            }
            case 3: {
                return new akei();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akei.a, "\u0001\u0015\u0000\u0001\ufa79\u1cc9\ue623\ud678\u0015\u0000\u0000\u0015\ufa79\u1cc9\u1409\u0013\ueabc\u2a6c\u1409\b\ufef6\u394c\u1409\t\ufc4b\u3969\u1409\u0000\ufcba\u3a37\u1409\u0003\ue69e\u3a52\u1409\u0014\ue8dc\u3a66\u1409\u0007\ue7a9\u3b1e\u1409\u0004\uf255\u3d63\u1409\u0001\uf103\u415f\u1409\u0002\ue0bf\u455a\u1409\u000b\uf37f\u45af\u1409\u0006\uf492\u4933\u1409\u0012\ue656\u4994\u1409\u0005\ue156\u4bc3\u1409\n\ue362\u5026\u1409\f\uec2c\u5c92\u1409\r\uedff\u8c1f\u1409\u000e\uf166\u929a\u1409\u000f\uec75\u9b33\u1409\u0011\ue623\ud678\u1409\u0010", new Object[] { "b", "v", "k", "l", "c", "f", "w", "j", "g", "d", "e", "n", "i", "u", "h", "m", "o", "p", "q", "r", "t", "s" });
            }
            case 1: {
                if (o == null) {
                    y = 0;
                }
                this.y = y;
                return null;
            }
            case 0: {
                return this.y;
            }
        }
    }
}
