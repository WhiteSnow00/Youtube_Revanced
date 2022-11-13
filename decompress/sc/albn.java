import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albn extends ahbh implements ahcw
{
    public static final albn a;
    private static volatile ahdd e;
    public int b;
    public aklg c;
    public String d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)albn.class, (ahbh)(a = new albn()));
    }
    
    private albn() {
        this.f = 2;
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = albn.e) == null) {
                    synchronized (albn.class) {
                        if (albn.e == null) {
                            albn.e = (ahdd)new ahba((ahbh)albn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return albn.a;
            }
            case 4: {
                return new ahaz((ahbh)albn.a);
            }
            case 3: {
                return new albn();
            }
            case 2: {
                return newMessageInfo((MessageLite)albn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
