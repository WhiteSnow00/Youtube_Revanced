import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxa extends ahbh implements ahcw
{
    public static final akxa a;
    private static volatile ahdd r;
    public int b;
    public alwj c;
    public alwj d;
    public alwj e;
    public ahbp f;
    public int g;
    public alwj h;
    public alwj i;
    public alwj j;
    public alwj k;
    public alwj l;
    public alwj m;
    public alwj n;
    public alwh o;
    public ahbx p;
    public apqd q;
    
    static {
        ahbh.registerDefaultInstance((Class)akxa.class, (ahbh)(a = new akxa()));
    }
    
    private akxa() {
        this.f = emptyIntList();
        emptyProtobufList();
        this.p = emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd r;
                if ((r = akxa.r) == null) {
                    synchronized (akxa.class) {
                        if (akxa.r == null) {
                            akxa.r = (ahdd)new ahba((ahbh)akxa.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return akxa.a;
            }
            case 4: {
                return new ahaz((ahbh)akxa.a);
            }
            case 3: {
                return new akxa();
            }
            case 2: {
                return newMessageInfo((MessageLite)akxa.a, "\u0001\u000f\u0000\u0001\u0001\u0019\u000f\u0000\u0002\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0004\u0005\u1009\u0005\u0006\u1009\u0006\r\u1009\u000e\u000e\u1009\t\u000f\u1009\u000f\u0010\u0016\u0011\u1004\u0003\u0012\u1009\u0007\u0013\u1009\b\u0014\u001b\u0019\u1009\u0012", new Object[] { "b", "c", "d", "e", "h", "i", "j", "n", "m", "o", "f", "g", "k", "l", "p", anfr.class, "q" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
