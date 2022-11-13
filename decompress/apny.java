import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apny extends ahbh implements ahcw
{
    public static final apny a;
    private static volatile ahdd f;
    public int b;
    public apob c;
    public ahab d;
    public apnz e;
    private ajut g;
    private aiqj h;
    private ahhu i;
    private apnw j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)apny.class, (ahbh)(a = new apny()));
    }
    
    private apny() {
        this.k = 2;
        this.d = ahab.b;
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
                final ahdd f;
                if ((f = apny.f) == null) {
                    synchronized (apny.class) {
                        if (apny.f == null) {
                            apny.f = (ahdd)new ahba((ahbh)apny.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apny.a;
            }
            case 4: {
                return new ahaz((ahbh)apny.a);
            }
            case 3: {
                return new apny();
            }
            case 2: {
                return newMessageInfo((MessageLite)apny.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001\u1009\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006", new Object[] { "b", "c", "g", "h", "d", "i", "j", "e" });
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
