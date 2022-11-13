import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anmw extends ahbh implements ahcw
{
    public static final anmw a;
    public static final ahbf b;
    private static volatile ahdd d;
    public ahbx c;
    
    static {
        final anmw a2 = new anmw();
        ahbh.registerDefaultInstance((Class)anmw.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajmz.a, (Object)a2, (MessageLite)a2, (ahbm)null, 413030470, ahek.k, (Class)anmw.class);
    }
    
    private anmw() {
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anmw.d) == null) {
                    synchronized (anmw.class) {
                        if (anmw.d == null) {
                            anmw.d = (ahdd)new ahba((ahbh)anmw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anmw.a;
            }
            case 4: {
                return new ahaz((ahbh)anmw.a);
            }
            case 3: {
                return new anmw();
            }
            case 2: {
                return newMessageInfo((MessageLite)anmw.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[] { "c" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
