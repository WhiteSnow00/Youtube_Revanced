import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angt extends ahbh implements ahcw
{
    public static final angt a;
    private static volatile ahdd f;
    public int b;
    public ajot c;
    public ajos d;
    public ajmo e;
    private ahle g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)angt.class, (ahbh)(a = new angt()));
    }
    
    private angt() {
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = angt.f) == null) {
                    synchronized (angt.class) {
                        if (angt.f == null) {
                            angt.f = (ahdd)new ahba((ahbh)angt.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return angt.a;
            }
            case 4: {
                return new ahaz((ahbh)angt.a);
            }
            case 3: {
                return new angt();
            }
            case 2: {
                return newMessageInfo((MessageLite)angt.a, "\u0001\u0004\u0000\u0001\uf478\u1b3d\ue2e3\u6584\u0004\u0000\u0000\u0004\uf478\u1b3d\u1409\u0001\uf5f9\u1b40\u1409\u0000\uf492\u4933\u1409\u0003\ue2e3\u6584\u1409\u0002", new Object[] { "b", "d", "c", "e", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
