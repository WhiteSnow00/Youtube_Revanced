import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfd extends ahbh implements ahcw
{
    public static final ajfd a;
    private static volatile ahdd i;
    public int b;
    public akdi c;
    public String d;
    public String e;
    public ahbx f;
    public ahhu g;
    public ahab h;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)ajfd.class, (ahbh)(a = new ajfd()));
    }
    
    private ajfd() {
        this.j = 2;
        this.d = "";
        this.e = "";
        this.f = emptyProtobufList();
        this.h = ahab.b;
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
                if ((i = ajfd.i) == null) {
                    synchronized (ajfd.class) {
                        if (ajfd.i == null) {
                            ajfd.i = (ahdd)new ahba((ahbh)ajfd.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ajfd.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfd.a);
            }
            case 3: {
                return new ajfd();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfd.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0003\u0001\u1008\u0002\u0002\u1409\u0003\u0003\u100a\u0004\u0004\u1008\u0001\u0005\u1409\u0000\u0006\u041b", new Object[] { "b", "e", "g", "h", "d", "c", "f", ajut.class });
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
