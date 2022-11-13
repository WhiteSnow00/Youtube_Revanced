import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajhu extends ahbh implements ahcw
{
    public static final ajhu a;
    public static final ahbf b;
    private static volatile ahdd j;
    public int c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public aqfl i;
    private byte k;
    
    static {
        final ajhu a2 = new ajhu();
        ahbh.registerDefaultInstance((Class)ajhu.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 355044355, ahek.k, (Class)ajhu.class);
    }
    
    private ajhu() {
        this.k = 2;
        this.e = "";
        this.f = "";
        this.g = "";
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
                if ((j = ajhu.j) == null) {
                    synchronized (ajhu.class) {
                        if (ajhu.j == null) {
                            ajhu.j = (ahdd)new ahba((ahbh)ajhu.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajhu.a;
            }
            case 4: {
                return new ahaz((ahbh)ajhu.a);
            }
            case 3: {
                return new ajhu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajhu.a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0001\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\b\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
