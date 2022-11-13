import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgv extends ahbh implements ahcw
{
    public static final akgv a;
    private static volatile ahdd f;
    public akli b;
    public ahbx c;
    public boolean d;
    public ahab e;
    private int g;
    private ahhu h;
    private ajvo i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)akgv.class, (ahbh)(a = new akgv()));
    }
    
    private akgv() {
        this.j = 2;
        this.c = emptyProtobufList();
        this.e = ahab.b;
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
                final ahdd f;
                if ((f = akgv.f) == null) {
                    synchronized (akgv.class) {
                        if (akgv.f == null) {
                            akgv.f = (ahdd)new ahba((ahbh)akgv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akgv.a;
            }
            case 4: {
                return new ahaz((ahbh)akgv.a);
            }
            case 3: {
                return new akgv();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgv.a, "\u0001\u0006\u0000\u0001\u0001\u0309\u0006\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u041b\u0005\u1007\u0002\u0007\u1409\u0004\b\u100a\u0005\u0309\u1409\u0007", new Object[] { "g", "b", "c", akgw.class, "d", "h", "e", "i" });
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
