import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqy extends ahbh implements ahcw
{
    public static final apqy a;
    private static volatile ahdd f;
    public int b;
    public ahbx c;
    public aiqj d;
    public ajut e;
    private ajut g;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)apqy.class, (ahbh)(a = new apqy()));
    }
    
    private apqy() {
        this.i = 2;
        this.c = emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = apqy.f) == null) {
                    synchronized (apqy.class) {
                        if (apqy.f == null) {
                            apqy.f = (ahdd)new ahba((ahbh)apqy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apqy.a;
            }
            case 4: {
                return new ahaz((ahbh)apqy.a);
            }
            case 3: {
                return new apqy();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqy.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003", new Object[] { "b", "g", "c", apqw.class, "d", "e", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
