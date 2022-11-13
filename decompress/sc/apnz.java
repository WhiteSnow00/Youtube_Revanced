import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnz extends ahbh implements ahcw
{
    public static final apnz a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apnz.class, (ahbh)(a = new apnz()));
    }
    
    private apnz() {
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
                if ((d = apnz.d) == null) {
                    synchronized (apnz.class) {
                        if (apnz.d == null) {
                            apnz.d = (ahdd)new ahba((ahbh)apnz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apnz.a;
            }
            case 4: {
                return new ahaz((ahbh)apnz.a);
            }
            case 3: {
                return new apnz();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnz.a, "\u0001\u0001\u0001\u0000\ufb9c\u2dd7\ufb9c\u2dd7\u0001\u0000\u0000\u0001\ufb9c\u2dd7\u143c\u0000", new Object[] { "c", "b", amrl.class });
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
