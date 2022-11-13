import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqg extends ahbh implements ahcw
{
    private static final apqg a;
    private static volatile ahdd b;
    private int c;
    private boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)apqg.class, (ahbh)(a = new apqg()));
    }
    
    private apqg() {
    }
    
    public static apqf a() {
        return (apqf)apqg.a.createBuilder();
    }
    
    static apqg b() {
        return apqg.a;
    }
    
    public static void c(final apqg apqg, final boolean b) {
        apqg.d(b);
    }
    
    private void d(final boolean d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apqg.b) == null) {
                    synchronized (apqg.class) {
                        if (apqg.b == null) {
                            apqg.b = (ahdd)new ahba((ahbh)apqg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqg.a;
            }
            case 4: {
                return new apqf();
            }
            case 3: {
                return new apqg();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
