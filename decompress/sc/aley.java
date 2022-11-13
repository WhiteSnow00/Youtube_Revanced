import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aley extends ahbh implements ahcw
{
    public static final aley a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aley.class, (ahbh)(a = new aley()));
    }
    
    private aley() {
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
                if ((d = aley.d) == null) {
                    synchronized (aley.class) {
                        if (aley.d == null) {
                            aley.d = (ahdd)new ahba((ahbh)aley.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aley.a;
            }
            case 4: {
                return new ahaz((ahbh)aley.a);
            }
            case 3: {
                return new aley();
            }
            case 2: {
                return newMessageInfo((MessageLite)aley.a, "\u0001\u000f\u0001\u0000\ue32b\u1bcb\ufed7\u6061\u000f\u0000\u0000\u000f\ue32b\u1bcb\u143c\u0000\ue9fd\u1dc6\u143c\u0000\uf321\u1e90\u143c\u0000\uf092\u1f0a\u143c\u0000\uf437\u1f3b\u143c\u0000\uf26a\u2912\u143c\u0000\uf88a\u2cf8\u143c\u0000\uec26\u2dd9\u143c\u0000\uefcf\u2e35\u143c\u0000\uf28f\u3c9f\u143c\u0000\ue91b\u3cbe\u143c\u0000\ue923\u4da1\u143c\u0000\ue611\u5aaf\u143c\u0000\ueb32\u5f63\u143c\u0000\ufed7\u6061\u143c\u0000", new Object[] { "c", "b", apxi.class, apxj.class, aixf.class, apxk.class, apxx.class, aljh.class, ammu.class, amgg.class, amfo.class, apxz.class, apai.class, ajvp.class, alux.class, ajfl.class, aojm.class });
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
