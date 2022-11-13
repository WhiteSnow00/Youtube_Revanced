import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlf extends ahbh implements ahcw
{
    public static final amlf a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amlf.class, (ahbh)(a = new amlf()));
    }
    
    private amlf() {
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
                if ((d = amlf.d) == null) {
                    synchronized (amlf.class) {
                        if (amlf.d == null) {
                            amlf.d = (ahdd)new ahba((ahbh)amlf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amlf.a;
            }
            case 4: {
                return new ahaz((ahbh)amlf.a);
            }
            case 3: {
                return new amlf();
            }
            case 2: {
                return newMessageInfo((MessageLite)amlf.a, "\u0001\u0004\u0001\u0000\ue9be\u24cf\uf723\u9d0e\u0004\u0000\u0000\u0004\ue9be\u24cf\u143c\u0000\uecd4\u3b13\u143c\u0000\ufa62\u814f\u143c\u0000\uf723\u9d0e\u143c\u0000", new Object[] { "c", "b", ahjz.class, amln.class, aiga.class, ajti.class });
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
