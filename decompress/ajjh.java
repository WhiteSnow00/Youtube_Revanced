import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjh extends ahbh implements ahcw
{
    public static final ajjh a;
    public static final ahbf b;
    private static volatile ahdd i;
    public int c;
    public aqfl d;
    public String e;
    public aina f;
    public ajjg g;
    public int h;
    private byte j;
    
    static {
        final ajjh a2 = new ajjh();
        ahbh.registerDefaultInstance((Class)ajjh.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 297019532, ahek.k, (Class)ajjh.class);
    }
    
    private ajjh() {
        this.j = 2;
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = ajjh.i) == null) {
                    synchronized (ajjh.class) {
                        if (ajjh.i == null) {
                            ajjh.i = (ahdd)new ahba((ahbh)ajjh.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ajjh.a;
            }
            case 4: {
                return new ahaz((ahbh)ajjh.a);
            }
            case 3: {
                return new ajjh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajjh.a, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0000\u0001\u0002\u1008\u0002\u0006\u1009\u0006\u0007\u1009\u0005\b\u1409\u0001\t\u1004\u0007", new Object[] { "c", "e", "g", "f", "d", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
