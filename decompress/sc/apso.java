import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apso extends ahbh implements ahcw
{
    public static final apso a;
    private static volatile ahdd b;
    private int c;
    private aicz d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apso.class, (ahbh)(a = new apso()));
    }
    
    private apso() {
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
                final ahdd b;
                if ((b = apso.b) == null) {
                    synchronized (apso.class) {
                        if (apso.b == null) {
                            apso.b = (ahdd)new ahba((ahbh)apso.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apso.a;
            }
            case 4: {
                return new ahaz((ahbh)apso.a);
            }
            case 3: {
                return new apso();
            }
            case 2: {
                return newMessageInfo((MessageLite)apso.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "c", "d" });
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
