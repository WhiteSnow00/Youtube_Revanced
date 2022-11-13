import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoww extends ahbh implements ahcw
{
    public static final aoww a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public ahbx d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aoww.class, (ahbh)(a = new aoww()));
    }
    
    private aoww() {
        this.f = 2;
        this.c = "";
        this.d = emptyProtobufList();
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
                if ((e = aoww.e) == null) {
                    synchronized (aoww.class) {
                        if (aoww.e == null) {
                            aoww.e = (ahdd)new ahba((ahbh)aoww.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoww.a;
            }
            case 4: {
                return new ahaz((ahbh)aoww.a);
            }
            case 3: {
                return new aoww();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoww.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u041b", new Object[] { "b", "c", "d", aowv.class });
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
