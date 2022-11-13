import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfk extends ahbh implements ahcw
{
    public static final ajfk a;
    private static volatile ahdd f;
    public int b;
    public aotp c;
    public ajut d;
    public ajut e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajfk.class, (ahbh)(a = new ajfk()));
    }
    
    private ajfk() {
        this.g = 2;
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
                if ((f = ajfk.f) == null) {
                    synchronized (ajfk.class) {
                        if (ajfk.f == null) {
                            ajfk.f = (ahdd)new ahba((ahbh)ajfk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajfk.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfk.a);
            }
            case 3: {
                return new ajfk();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfk.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
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
