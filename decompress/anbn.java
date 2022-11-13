import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anbn extends ahbh implements ahcw
{
    public static final anbn a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anbn.class, (ahbh)(a = new anbn()));
    }
    
    private anbn() {
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
                if ((d = anbn.d) == null) {
                    synchronized (anbn.class) {
                        if (anbn.d == null) {
                            anbn.d = (ahdd)new ahba((ahbh)anbn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anbn.a;
            }
            case 4: {
                return new ahaz((ahbh)anbn.a);
            }
            case 3: {
                return new anbn();
            }
            case 2: {
                return newMessageInfo((MessageLite)anbn.a, "\u0001\u0004\u0001\u0000\uf3e4\u2e6e\uf174\u97cf\u0004\u0000\u0000\u0003\uf3e4\u2e6e\u143c\u0000\uf3fb\u30fa\u143c\u0000\ufa1a\u4324\u143c\u0000\uf174\u97cf\u103c\u0000", new Object[] { "c", "b", amqw.class, akbo.class, apfn.class, apfp.class });
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
