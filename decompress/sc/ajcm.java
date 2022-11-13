import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcm extends ahbh implements ahcw
{
    public static final ajcm a;
    private static volatile ahdd j;
    public int b;
    public ajut c;
    public ahbx d;
    public anuv e;
    public ajut f;
    public ajut g;
    public ajut h;
    public String i;
    private anuv k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)ajcm.class, (ahbh)(a = new ajcm()));
    }
    
    private ajcm() {
        this.l = 2;
        this.d = emptyProtobufList();
        this.i = "";
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
                final ahdd j;
                if ((j = ajcm.j) == null) {
                    synchronized (ajcm.class) {
                        if (ajcm.j == null) {
                            ajcm.j = (ahdd)new ahba((ahbh)ajcm.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajcm.a;
            }
            case 4: {
                return new ahaz((ahbh)ajcm.a);
            }
            case 3: {
                return new ajcm();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajcm.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0006\u0001\u1409\u0000\u0003\u001b\u0004\u1409\u0002\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0003\t\u1008\u0007", new Object[] { "b", "c", "d", ajcn.class, "e", "f", "g", "h", "k", "i" });
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
