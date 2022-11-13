import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anpa extends ahbh implements ahcw
{
    public static final anpa a;
    private static volatile ahdd k;
    public int b;
    public akdi c;
    public ajut d;
    public ajut e;
    public ahbx f;
    public ahbx g;
    public anuv h;
    public anpl i;
    public anpb j;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)anpa.class, (ahbh)(a = new anpa()));
    }
    
    private anpa() {
        this.l = 2;
        this.f = emptyProtobufList();
        this.g = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = anpa.k) == null) {
                    synchronized (anpa.class) {
                        if (anpa.k == null) {
                            anpa.k = (ahdd)new ahba((ahbh)anpa.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return anpa.a;
            }
            case 4: {
                return new ahaz((ahbh)anpa.a);
            }
            case 3: {
                return new anpa();
            }
            case 2: {
                return newMessageInfo((MessageLite)anpa.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u041b\u0005\u041b\u0006\u1409\u0003\u0007\u1009\u0004\b\u1009\u0005", new Object[] { "b", "c", "d", "e", "f", aiqj.class, "g", aiqj.class, "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
