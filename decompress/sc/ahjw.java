import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjw extends ahbh implements ahcw
{
    public static final ahjw a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ahjw.class, (ahbh)(a = new ahjw()));
    }
    
    private ahjw() {
        this.b = 0;
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ahjw.d) == null) {
                    synchronized (ahjw.class) {
                        if (ahjw.d == null) {
                            ahjw.d = (ahdd)new ahba((ahbh)ahjw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahjw.a;
            }
            case 4: {
                return new ahaz((ahbh)ahjw.a);
            }
            case 3: {
                return new ahjw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjw.a, "\u0001\u0002\u0001\u0000\ueeec\u1e3f\ued6a\u25bb\u0002\u0000\u0000\u0002\ueeec\u1e3f\u143c\u0000\ued6a\u25bb\u143c\u0000", new Object[] { "c", "b", ahju.class, aivd.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
