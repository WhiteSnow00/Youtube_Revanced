import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdv extends ahbh implements ahcw
{
    public static final ajdv a;
    private static volatile ahdd h;
    public int b;
    public int c;
    public Object d;
    public aiqj e;
    public String f;
    public ahab g;
    private ajut i;
    private anuv j;
    private ahhu k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)ajdv.class, (ahbh)(a = new ajdv()));
    }
    
    private ajdv() {
        this.c = 0;
        this.l = 2;
        this.f = "";
        this.g = ahab.b;
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
                final ahdd h;
                if ((h = ajdv.h) == null) {
                    synchronized (ajdv.class) {
                        if (ajdv.h == null) {
                            ajdv.h = (ahdd)new ahba((ahbh)ajdv.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajdv.a;
            }
            case 4: {
                return new ahaz((ahbh)ajdv.a);
            }
            case 3: {
                return new ajdv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajdv.a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0006\u0001\u143c\u0000\u0002\u143c\u0000\u0003\u1409\u0004\u0004\u1409\u0005\u0005\u1409\b\u0006\u100a\t\u0007\u1409\u0006\b\u1008\u0007", new Object[] { "d", "c", "b", akdi.class, aotp.class, "i", "e", "k", "g", "j", "f" });
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
