import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apni extends ahbh implements ahcw
{
    public static final apni a;
    private static volatile ahdd b;
    private int c;
    private apnk d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apni.class, (ahbh)(a = new apni()));
    }
    
    private apni() {
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
                if ((b = apni.b) == null) {
                    synchronized (apni.class) {
                        if (apni.b == null) {
                            apni.b = (ahdd)new ahba((ahbh)apni.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apni.a;
            }
            case 4: {
                return new ahaz((ahbh)apni.a);
            }
            case 3: {
                return new apni();
            }
            case 2: {
                return newMessageInfo((MessageLite)apni.a, "\u0001\u0001\u0000\u0001\uf87c\u18b0\uf87c\u18b0\u0001\u0000\u0000\u0001\uf87c\u18b0\u1409\u0000", new Object[] { "c", "d" });
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
