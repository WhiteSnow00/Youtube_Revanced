import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anbm extends ahbh implements ahcw
{
    public static final anbm a;
    private static volatile ahdd j;
    public int b;
    public int c;
    public Object d;
    public String e;
    public String f;
    public aiqj g;
    public ahil h;
    public int i;
    private ahhu k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)anbm.class, (ahbh)(a = new anbm()));
    }
    
    private anbm() {
        this.c = 0;
        this.l = 2;
        this.e = "";
        this.f = "";
        final ahab b = ahab.b;
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
                if ((j = anbm.j) == null) {
                    synchronized (anbm.class) {
                        if (anbm.j == null) {
                            anbm.j = (ahdd)new ahba((ahbh)anbm.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return anbm.a;
            }
            case 4: {
                return new ahaz((ahbh)anbm.a);
            }
            case 3: {
                return new anbm();
            }
            case 2: {
                return newMessageInfo((MessageLite)anbm.a, "\u0001\b\u0001\u0001\u0001\n\b\u0000\u0000\u0004\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1409\u0002\u0004\u1009\u0003\u0005\u143c\u0000\u0007\u100c\u0007\b\u1409\b\n\u143c\u0000", new Object[] { "d", "c", "b", "e", "f", "g", "h", akdi.class, "i", anbq.a(), "k", aotp.class });
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
