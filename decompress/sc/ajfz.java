import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfz extends ahbh implements ahcw
{
    public static final ajfz a;
    public static final ahbf b;
    private static volatile ahdd h;
    public int c;
    public ajfy d;
    public ajge e;
    public aqfl f;
    public String g;
    private aqei i;
    private byte j;
    
    static {
        final ajfz a2 = new ajfz();
        ahbh.registerDefaultInstance((Class)ajfz.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 372095937, ahek.k, (Class)ajfz.class);
    }
    
    private ajfz() {
        this.j = 2;
        this.g = "";
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
                final ahdd h;
                if ((h = ajfz.h) == null) {
                    synchronized (ajfz.class) {
                        if (ajfz.h == null) {
                            ajfz.h = (ahdd)new ahba((ahbh)ajfz.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajfz.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfz.a);
            }
            case 3: {
                return new ajfz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfz.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0001\u0001\u1009\u0000\u0002\u1009\u0001\u0004\u1409\u0003\u0005\u1009\u0004\u0007\u1008\u0006", new Object[] { "c", "d", "e", "f", "i", "g" });
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
