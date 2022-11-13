import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aihw extends ahbh implements ahcw
{
    public static final aihw a;
    private static volatile ahdd d;
    public int b;
    public aicz c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aihw.class, (ahbh)(a = new aihw()));
    }
    
    private aihw() {
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
                if ((d = aihw.d) == null) {
                    synchronized (aihw.class) {
                        if (aihw.d == null) {
                            aihw.d = (ahdd)new ahba((ahbh)aihw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aihw.a;
            }
            case 4: {
                return new ahaz((ahbh)aihw.a);
            }
            case 3: {
                return new aihw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aihw.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "b", "c" });
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
