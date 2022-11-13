import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajie extends ahbh implements ahcw
{
    public static final ajie a;
    public static final ahbf b;
    private static volatile ahdd h;
    public int c;
    public aqfl d;
    public String e;
    public aina f;
    public ajid g;
    private byte i;
    
    static {
        final ajie a2 = new ajie();
        ahbh.registerDefaultInstance((Class)ajie.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 314573701, ahek.k, (Class)ajie.class);
    }
    
    private ajie() {
        this.i = 2;
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = ajie.h) == null) {
                    synchronized (ajie.class) {
                        if (ajie.h == null) {
                            ajie.h = (ahdd)new ahba((ahbh)ajie.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajie.a;
            }
            case 4: {
                return new ahaz((ahbh)ajie.a);
            }
            case 3: {
                return new ajie();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajie.a, "\u0001\u0004\u0000\u0001\u0002\b\u0004\u0000\u0000\u0001\u0002\u1008\u0002\u0006\u1009\u0006\u0007\u1409\u0001\b\u1009\u0007", new Object[] { "c", "e", "f", "d", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
