import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnu extends ahbh implements ahcw
{
    public static final apnu a;
    private static volatile ahdd b;
    private int c;
    private apkf d;
    private amgs e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)apnu.class, (ahbh)(a = new apnu()));
    }
    
    private apnu() {
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
                if ((b = apnu.b) == null) {
                    synchronized (apnu.class) {
                        if (apnu.b == null) {
                            apnu.b = (ahdd)new ahba((ahbh)apnu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apnu.a;
            }
            case 4: {
                return new ahaz((ahbh)apnu.a);
            }
            case 3: {
                return new apnu();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnu.a, "\u0001\u0002\u0000\u0001\ueaaa\u1fae\uf6ae\u2fd9\u0002\u0000\u0000\u0002\ueaaa\u1fae\u1409\u0001\uf6ae\u2fd9\u1409\u0000", new Object[] { "c", "e", "d" });
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
