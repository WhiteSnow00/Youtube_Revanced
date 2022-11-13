import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldi extends ahbh implements ahcw
{
    public static final aldi a;
    private static volatile ahdd i;
    public int b;
    public int c;
    public Object d;
    public aklg e;
    public String f;
    public String g;
    public boolean h;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aldi.class, (ahbh)(a = new aldi()));
    }
    
    private aldi() {
        this.c = 0;
        this.j = 2;
        this.f = "";
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
                final ahdd i;
                if ((i = aldi.i) == null) {
                    synchronized (aldi.class) {
                        if (aldi.i == null) {
                            aldi.i = (ahdd)new ahba((ahbh)aldi.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aldi.a;
            }
            case 4: {
                return new ahaz((ahbh)aldi.a);
            }
            case 3: {
                return new aldi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldi.a, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u103b\u0000\u0003\u1008\u0003\u0005\u1008\u0004\u0006\u1007\u0005\u0007\u103b\u0000", new Object[] { "d", "c", "b", "e", "f", "g", "h" });
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
