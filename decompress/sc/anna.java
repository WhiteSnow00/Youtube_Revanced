import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anna extends ahbh implements ahcw
{
    public static final anna a;
    private static volatile ahdd e;
    public anuv b;
    public ahbx c;
    public ahab d;
    private int f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)anna.class, (ahbh)(a = new anna()));
    }
    
    private anna() {
        this.h = 2;
        this.c = emptyProtobufList();
        this.d = ahab.b;
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
                if ((e = anna.e) == null) {
                    synchronized (anna.class) {
                        if (anna.e == null) {
                            anna.e = (ahdd)new ahba((ahbh)anna.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anna.a;
            }
            case 4: {
                return new ahaz((ahbh)anna.a);
            }
            case 3: {
                return new anna();
            }
            case 2: {
                return newMessageInfo((MessageLite)anna.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u041b\u0004\u100a\u0001\u0005\u1409\u0002", new Object[] { "f", "b", "c", anuv.class, "d", "g" });
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