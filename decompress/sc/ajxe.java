import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxe extends ahbh implements ahcw
{
    public static final ajxe a;
    private static volatile ahdd l;
    public int b;
    public ajut c;
    public ajut d;
    public ajut e;
    public aotp f;
    public boolean g;
    public aiqj h;
    public aiqj i;
    public String j;
    public String k;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxe.class, (ahbh)(a = new ajxe()));
    }
    
    private ajxe() {
        this.m = 2;
        emptyProtobufList();
        this.j = "";
        this.k = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = ajxe.l) == null) {
                    synchronized (ajxe.class) {
                        if (ajxe.l == null) {
                            ajxe.l = (ahdd)new ahba((ahbh)ajxe.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ajxe.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxe.a);
            }
            case 3: {
                return new ajxe();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxe.a, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0005\u0007\u1007\u0006\n\u1409\u0007\u000b\u1409\b\f\u1008\t\r\u1008\n", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
