import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoit extends ahbh implements ahcw
{
    public static final aoit a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public String d;
    public ahhu e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aoit.class, (ahbh)(a = new aoit()));
    }
    
    private aoit() {
        this.g = 2;
        this.c = "";
        this.d = "";
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aoit.f) == null) {
                    synchronized (aoit.class) {
                        if (aoit.f == null) {
                            aoit.f = (ahdd)new ahba((ahbh)aoit.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aoit.a;
            }
            case 4: {
                return new ahaz((ahbh)aoit.a);
            }
            case 3: {
                return new aoit();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoit.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
