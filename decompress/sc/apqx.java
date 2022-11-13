import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqx extends ahbc implements ahbd
{
    public static final apqx a;
    private static volatile ahdd i;
    public int b;
    public aprg c;
    public aprd d;
    public ahbx e;
    public int f;
    public ajut g;
    public ajmr h;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)apqx.class, (ahbh)(a = new apqx()));
    }
    
    private apqx() {
        this.k = 2;
        this.e = emptyProtobufList();
        final ahab b = ahab.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = apqx.i) == null) {
                    synchronized (apqx.class) {
                        if (apqx.i == null) {
                            apqx.i = (ahdd)new ahba((ahbh)apqx.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return apqx.a;
            }
            case 4: {
                return new ahbb((ahbc)apqx.a);
            }
            case 3: {
                return new apqx();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqx.a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0004\u1004\u0002\u0005\u1409\u0003\b\u1409\u0005\u000b\u1009\u0004", new Object[] { "b", "c", "d", "e", apru.class, "f", "g", "j", "h" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
