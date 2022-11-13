import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anmy extends ahbh implements ahcw
{
    public static final anmy a;
    private static volatile ahdd m;
    public int b;
    public aotp c;
    public ahbx d;
    public ajut e;
    public ajut f;
    public ajut g;
    public ajut h;
    public ahbx i;
    public aiqj j;
    public anuv k;
    public ahab l;
    private amgv n;
    private ahhu o;
    private byte p;
    
    static {
        ahbh.registerDefaultInstance((Class)anmy.class, (ahbh)(a = new anmy()));
    }
    
    private anmy() {
        this.p = 2;
        this.d = emptyProtobufList();
        this.i = emptyProtobufList();
        this.l = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd m;
                if ((m = anmy.m) == null) {
                    synchronized (anmy.class) {
                        if (anmy.m == null) {
                            anmy.m = (ahdd)new ahba((ahbh)anmy.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return anmy.a;
            }
            case 4: {
                return new ahaz((ahbh)anmy.a);
            }
            case 3: {
                return new anmy();
            }
            case 2: {
                return newMessageInfo((MessageLite)anmy.a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0002\u000b\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u041b\u0006\u1409\u0005\u0007\u1409\u0006\b\u100a\b\t\u1409\t\n\u1409\u0001\u000b\u1409\u0007\f\u1409\u0004", new Object[] { "b", "c", "d", aotd.class, "f", "g", "i", aiao.class, "j", "n", "l", "o", "e", "k", "h" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
