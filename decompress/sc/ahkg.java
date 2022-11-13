import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkg extends ahbh implements ahcw
{
    public static final ahbq a;
    public static final ahkg b;
    private static volatile ahdd e;
    public boolean c;
    public ahbp d;
    private int f;
    private aiqj g;
    private byte h;
    
    static {
        a = (ahbq)new ptj(9);
        ahbh.registerDefaultInstance((Class)ahkg.class, (ahbh)(b = new ahkg()));
    }
    
    private ahkg() {
        this.h = 2;
        this.d = emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ahkg.e) == null) {
                    synchronized (ahkg.class) {
                        if (ahkg.e == null) {
                            ahkg.e = (ahdd)new ahba((ahbh)ahkg.b);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahkg.b;
            }
            case 4: {
                return new ahaz((ahbh)ahkg.b);
            }
            case 3: {
                return new ahkg();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkg.b, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001\u1007\u0000\u0003\u1409\u0003\u0005\u001e", new Object[] { "f", "c", "g", "d", ahkf.a() });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
