import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amnj extends ahcz implements aheo
{
    public static final amnj a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amnj.class, a = new amnj());
    }
    
    private amnj() {
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
                if ((d = amnj.d) == null) {
                    synchronized (amnj.class) {
                        if (amnj.d == null) {
                            amnj.d = (ahev)new ahcs((ahcz)amnj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amnj.a;
            }
            case 4: {
                return new ahcr((ahcz)amnj.a);
            }
            case 3: {
                return new amnj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amnj.a, "\u0001\u0005\u0001\u0000\ufefc\u2a3b\ufbe5\u9d2a\u0005\u0000\u0000\u0005\ufefc\u2a3b\u143c\u0000\ue1ce\u3a42\u143c\u0000\uf5b1\u73a8\u143c\u0000\ue504\u89b4\u143c\u0000\ufbe5\u9d2a\u143c\u0000", new Object[] { "c", "b", alyw.class, amno.class, anpm.class, aihs.class, ajvg.class });
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
