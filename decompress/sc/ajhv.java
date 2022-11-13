import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajhv extends ahbh implements ahcw
{
    public static final ajhv a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public String d;
    private byte f;
    
    static {
        final ajhv a2 = new ajhv();
        ahbh.registerDefaultInstance((Class)ajhv.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 380917126, ahek.k, (Class)ajhv.class);
    }
    
    private ajhv() {
        this.f = 2;
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajhv.e) == null) {
                    synchronized (ajhv.class) {
                        if (ajhv.e == null) {
                            ajhv.e = (ahdd)new ahba((ahbh)ajhv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajhv.a;
            }
            case 4: {
                return new ahaz((ahbh)ajhv.a);
            }
            case 3: {
                return new ajhv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajhv.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
