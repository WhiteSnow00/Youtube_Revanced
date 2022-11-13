import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbw extends ahbh implements ahcw
{
    public static final apbw a;
    private static volatile ahdd b;
    private int c;
    private apbx d;
    private apby e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)apbw.class, (ahbh)(a = new apbw()));
    }
    
    private apbw() {
        this.f = 2;
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
                final ahdd b;
                if ((b = apbw.b) == null) {
                    synchronized (apbw.class) {
                        if (apbw.b == null) {
                            apbw.b = (ahdd)new ahba((ahbh)apbw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbw.a;
            }
            case 4: {
                return new ahaz((ahbh)apbw.a);
            }
            case 3: {
                return new apbw();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbw.a, "\u0001\u0002\u0000\u0001\uf4b7\u385e\ufd04\u3899\u0002\u0000\u0000\u0002\uf4b7\u385e\u1409\u0000\ufd04\u3899\u1409\u0001", new Object[] { "c", "d", "e" });
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
