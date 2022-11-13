import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfa extends ahbh implements ahcw
{
    public static final alfa a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public Object d;
    public apxx e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)alfa.class, (ahbh)(a = new alfa()));
    }
    
    private alfa() {
        this.c = 0;
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = alfa.f) == null) {
                    synchronized (alfa.class) {
                        if (alfa.f == null) {
                            alfa.f = (ahdd)new ahba((ahbh)alfa.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alfa.a;
            }
            case 4: {
                return new ahaz((ahbh)alfa.a);
            }
            case 3: {
                return new alfa();
            }
            case 2: {
                return newMessageInfo((MessageLite)alfa.a, "\u0001\b\u0001\u0001\uf875\u1be7\ue893\ub05f\b\u0000\u0000\b\uf875\u1be7\u143c\u0000\uf437\u1f3b\u1409\u0007\ue642\u2d46\u143c\u0000\ue35f\u4d02\u143c\u0000\ued59\u5db2\u143c\u0000\uec17\u5ddb\u143c\u0000\uf475\u6168\u143c\u0000\ue893\ub05f\u143c\u0000", new Object[] { "d", "c", "b", apxa.class, "e", amge.class, aoye.class, aojy.class, aoyf.class, aojx.class, aojp.class });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
