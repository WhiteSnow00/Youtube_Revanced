import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajik extends ahbh implements ahcw
{
    public static final ajik a;
    public static final ahbf b;
    private static volatile ahdd j;
    public int c;
    public aqfl d;
    public String e;
    public ajij f;
    public boolean g;
    public boolean h;
    public ajgk i;
    private byte k;
    
    static {
        final ajik a2 = new ajik();
        ahbh.registerDefaultInstance((Class)ajik.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 323685881, ahek.k, (Class)ajik.class);
    }
    
    private ajik() {
        this.k = 2;
        this.e = "";
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
                if ((j = ajik.j) == null) {
                    synchronized (ajik.class) {
                        if (ajik.j == null) {
                            ajik.j = (ahdd)new ahba((ahbh)ajik.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajik.a;
            }
            case 4: {
                return new ahaz((ahbh)ajik.a);
            }
            case 3: {
                return new ajik();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajik.a, "\u0001\u0006\u0000\u0001\u0002\f\u0006\u0000\u0000\u0001\u0002\u1008\u0003\u0007\u1007\b\b\u1007\t\t\u1009\n\n\u1409\u0001\f\u1009\u0007", new Object[] { "c", "e", "g", "h", "i", "d", "f" });
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
