import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjk extends ahbh implements ahcw
{
    public static final aqjk a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public aodx d;
    public String e;
    
    static {
        final aqjk a2 = new aqjk();
        ahbh.registerDefaultInstance((Class)aqjk.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)annw.a, (Object)a2, (MessageLite)a2, (ahbm)null, 1000, ahek.k, (Class)aqjk.class);
    }
    
    private aqjk() {
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqjk.f) == null) {
                    synchronized (aqjk.class) {
                        if (aqjk.f == null) {
                            aqjk.f = (ahdd)new ahba((ahbh)aqjk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqjk.a;
            }
            case 4: {
                return new ahaz((ahbh)aqjk.a);
            }
            case 3: {
                return new aqjk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001", new Object[] { "c", "d", "e" });
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
