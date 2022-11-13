import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozx extends ahbh implements ahcw
{
    public static final aozx a;
    private static volatile ahdd h;
    public int b;
    public aozk c;
    public aozp d;
    public apad e;
    public apac f;
    public aozg g;
    private aozm i;
    private aozi j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aozx.class, (ahbh)(a = new aozx()));
    }
    
    private aozx() {
        this.k = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = aozx.h) == null) {
                    synchronized (aozx.class) {
                        if (aozx.h == null) {
                            aozx.h = (ahdd)new ahba((ahbh)aozx.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aozx.a;
            }
            case 4: {
                return new ahaz((ahbh)aozx.a);
            }
            case 3: {
                return new aozx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozx.a, "\u0001\u0007\u0000\u0001\ue084\u2994\uf5e5\u65cf\u0007\u0000\u0000\u0007\ue084\u2994\u1409\u0003\uee27\u299c\u1409\u0001\uee6f\u29bd\u1409\u0000\uee75\u3fe4\u1409\u0002\ufb36\u461e\u1409\u0005\uf281\u51af\u1409\u0006\uf5e5\u65cf\u1409\u0004", new Object[] { "b", "e", "c", "i", "d", "j", "g", "f" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
