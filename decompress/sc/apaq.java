import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apaq extends ahbh implements ahcw
{
    public static final apaq a;
    private static volatile ahdd d;
    public int b;
    public apap c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apaq.class, (ahbh)(a = new apaq()));
    }
    
    private apaq() {
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
                if ((d = apaq.d) == null) {
                    synchronized (apaq.class) {
                        if (apaq.d == null) {
                            apaq.d = (ahdd)new ahba((ahbh)apaq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apaq.a;
            }
            case 4: {
                return new ahaz((ahbh)apaq.a);
            }
            case 3: {
                return new apaq();
            }
            case 2: {
                return newMessageInfo((MessageLite)apaq.a, "\u0001\u0001\u0000\u0001\uf422\u4787\uf422\u4787\u0001\u0000\u0000\u0001\uf422\u4787\u1409\u0000", new Object[] { "b", "c" });
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
