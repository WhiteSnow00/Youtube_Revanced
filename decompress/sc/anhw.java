import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anhw extends ahbh implements ahcw
{
    public static final anhw a;
    private static volatile ahdd k;
    public int b;
    public ankk c;
    public ajut d;
    public ajut e;
    public ahbx f;
    public aiqj g;
    public amgv h;
    public int i;
    public ahab j;
    private ahhu l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)anhw.class, (ahbh)(a = new anhw()));
    }
    
    private anhw() {
        this.m = 2;
        this.f = emptyProtobufList();
        this.j = ahab.b;
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
                final ahdd k;
                if ((k = anhw.k) == null) {
                    synchronized (anhw.class) {
                        if (anhw.k == null) {
                            anhw.k = (ahdd)new ahba((ahbh)anhw.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return anhw.a;
            }
            case 4: {
                return new ahaz((ahbh)anhw.a);
            }
            case 3: {
                return new anhw();
            }
            case 2: {
                return newMessageInfo((MessageLite)anhw.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u041b\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0006\b\u100a\u0007\t\u100c\u0005", new Object[] { "b", "c", "d", "e", "f", aotd.class, "g", "h", "l", "j", "i", anci.t });
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
