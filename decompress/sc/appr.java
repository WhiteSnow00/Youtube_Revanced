import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appr extends ahbh implements ahcw
{
    private static final appr a;
    private static volatile ahdd b;
    private int c;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)appr.class, (ahbh)(a = new appr()));
    }
    
    private appr() {
    }
    
    public static appq a() {
        return (appq)appr.a.createBuilder();
    }
    
    static appr b() {
        return appr.a;
    }
    
    public static void c(final appr appr, final apps apps) {
        appr.d(apps);
    }
    
    private void d(final apps apps) {
        this.d = apps.getNumber();
        this.c |= 0x4;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = appr.b) == null) {
                    synchronized (appr.class) {
                        if (appr.b == null) {
                            appr.b = (ahdd)new ahba((ahbh)appr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appr.a;
            }
            case 4: {
                return new appq();
            }
            case 3: {
                return new appr();
            }
            case 2: {
                return newMessageInfo((MessageLite)appr.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u100c\u0002", new Object[] { "c", "d", apps.a() });
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
