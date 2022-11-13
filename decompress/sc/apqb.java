import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqb extends ahbh implements ahcw
{
    private static final apqb a;
    private static volatile ahdd b;
    private String c;
    
    static {
        ahbh.registerDefaultInstance((Class)apqb.class, (ahbh)(a = new apqb()));
    }
    
    private apqb() {
        this.c = "";
    }
    
    public static apqb a() {
        return apqb.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apqb.b) == null) {
                    synchronized (apqb.class) {
                        if (apqb.b == null) {
                            apqb.b = (ahdd)new ahba((ahbh)apqb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqb.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new apqb();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqb.a, "\u0001\u0000", (Object[])null);
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
