import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajhr extends ahbh implements ahcw
{
    public static final ajhr a;
    public static final ahbf b;
    private static volatile ahdd j;
    public int c;
    public aqfl d;
    public String e;
    public int f;
    public int g;
    public String h;
    public int i;
    private byte k;
    
    static {
        final ajhr a2 = new ajhr();
        ahbh.registerDefaultInstance((Class)ajhr.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 362363524, ahek.k, (Class)ajhr.class);
    }
    
    private ajhr() {
        this.k = 2;
        this.e = "";
        this.h = "";
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
                final ahdd j;
                if ((j = ajhr.j) == null) {
                    synchronized (ajhr.class) {
                        if (ajhr.j == null) {
                            ajhr.j = (ahdd)new ahba((ahbh)ajhr.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajhr.a;
            }
            case 4: {
                return new ahaz((ahbh)ajhr.a);
            }
            case 3: {
                return new ajhr();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajhr.a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0001\u0002\u1409\u0001\u0003\u1008\u0003\u0004\u100c\u0004\u0005\u1004\u0005\u0007\u1008\u0006\b\u100c\u0007", new Object[] { "c", "d", "e", "f", ajhp.a(), "g", "h", "i", ajek.p });
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
