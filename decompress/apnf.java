import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnf extends ahbh implements ahcw
{
    public static final apnf a;
    private static volatile ahdd b;
    private int c;
    private aicz d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apnf.class, (ahbh)(a = new apnf()));
    }
    
    private apnf() {
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
                if ((b = apnf.b) == null) {
                    synchronized (apnf.class) {
                        if (apnf.b == null) {
                            apnf.b = (ahdd)new ahba((ahbh)apnf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apnf.a;
            }
            case 4: {
                return new ahaz((ahbh)apnf.a);
            }
            case 3: {
                return new apnf();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnf.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "c", "d" });
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
