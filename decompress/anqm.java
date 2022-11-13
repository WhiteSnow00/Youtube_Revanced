import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anqm extends ahbh implements ahcw
{
    public static final anqm a;
    private static volatile ahdd h;
    public int b;
    public anuv c;
    public ahbx d;
    public ahmo e;
    public ahab f;
    public String g;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)anqm.class, (ahbh)(a = new anqm()));
    }
    
    private anqm() {
        this.j = 2;
        this.d = emptyProtobufList();
        this.f = ahab.b;
        this.g = "";
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
                final ahdd h;
                if ((h = anqm.h) == null) {
                    synchronized (anqm.class) {
                        if (anqm.h == null) {
                            anqm.h = (ahdd)new ahba((ahbh)anqm.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return anqm.a;
            }
            case 4: {
                return new ahaz((ahbh)anqm.a);
            }
            case 3: {
                return new anqm();
            }
            case 2: {
                return newMessageInfo((MessageLite)anqm.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0002\u0004\u100a\u0003\u0005\u1409\u0001\u0006\u1008\u0004", new Object[] { "b", "c", "d", aiqj.class, "i", "f", "e", "g" });
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
