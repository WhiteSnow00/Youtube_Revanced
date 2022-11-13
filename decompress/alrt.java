import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrt extends ahbh implements ahcw
{
    public static final alrt a;
    private static volatile ahdd f;
    public String b;
    public ahbx c;
    public ahab d;
    public ajut e;
    private int g;
    private anuv h;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)alrt.class, (ahbh)(a = new alrt()));
    }
    
    private alrt() {
        this.j = 2;
        this.b = "";
        this.c = emptyProtobufList();
        this.d = ahab.b;
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
                if ((f = alrt.f) == null) {
                    synchronized (alrt.class) {
                        if (alrt.f == null) {
                            alrt.f = (ahdd)new ahba((ahbh)alrt.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alrt.a;
            }
            case 4: {
                return new ahaz((ahbh)alrt.a);
            }
            case 3: {
                return new alrt();
            }
            case 2: {
                return newMessageInfo((MessageLite)alrt.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001\u1008\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u100a\u0003\u0006\u1409\u0004", new Object[] { "g", "b", "c", anuv.class, "h", "i", "d", "e" });
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
