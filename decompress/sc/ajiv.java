import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajiv extends ahbh implements ahcw
{
    public static final ajiv a;
    public static final ahbf b;
    private static volatile ahdd k;
    public int c;
    public int d;
    public Object e;
    public aqfl f;
    public String g;
    public String h;
    public String i;
    public String j;
    private byte l;
    
    static {
        final ajiv a2 = new ajiv();
        ahbh.registerDefaultInstance((Class)ajiv.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 378762193, ahek.k, (Class)ajiv.class);
    }
    
    private ajiv() {
        this.d = 0;
        this.l = 2;
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = ajiv.k) == null) {
                    synchronized (ajiv.class) {
                        if (ajiv.k == null) {
                            ajiv.k = (ahdd)new ahba((ahbh)ajiv.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return ajiv.a;
            }
            case 4: {
                return new ahaz((ahbh)ajiv.a);
            }
            case 3: {
                return new ajiv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajiv.a, "\u0001\u0007\u0001\u0001\u0002\t\u0007\u0000\u0000\u0002\u0002\u1409\u0001\u0003\u1008\u0003\u0004\u103b\u0000\u0005\u1008\u0006\u0006\u1008\u0007\b\u1008\b\t\u143c\u0000", new Object[] { "e", "d", "c", "f", "g", "h", "i", "j", aqdy.class });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
