import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjs extends ahbh implements ahcw
{
    public static final amjs a;
    private static volatile ahdd k;
    public int b;
    public ajut c;
    public ajut d;
    public ajut e;
    public int f;
    public aotp g;
    public ahbx h;
    public ahbx i;
    public ajut j;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)amjs.class, (ahbh)(a = new amjs()));
    }
    
    private amjs() {
        this.l = 2;
        this.h = emptyProtobufList();
        this.i = emptyProtobufList();
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
                if ((k = amjs.k) == null) {
                    synchronized (amjs.class) {
                        if (amjs.k == null) {
                            amjs.k = (ahdd)new ahba((ahbh)amjs.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return amjs.a;
            }
            case 4: {
                return new ahaz((ahbh)amjs.a);
            }
            case 3: {
                return new amjs();
            }
            case 2: {
                return newMessageInfo((MessageLite)amjs.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u041b\u0006\u041b\u0007\u100c\u0003\b\u1409\u0005", new Object[] { "b", "c", "d", "e", "g", "h", aida.class, "i", aolq.class, "f", anic.m, "j" });
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
