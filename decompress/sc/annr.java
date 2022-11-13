import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annr extends ahbh implements ahcw
{
    public static final annr a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ajut g;
    private anuv h;
    private anuv i;
    private anuv j;
    private anuv k;
    private anuv l;
    private anuv m;
    private anuv n;
    private ahhu o;
    private anuv p;
    private anuv q;
    private byte r;
    
    static {
        ahbh.registerDefaultInstance((Class)annr.class, (ahbh)(a = new annr()));
    }
    
    private annr() {
        this.r = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte r = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = annr.b) == null) {
                    synchronized (annr.class) {
                        if (annr.b == null) {
                            annr.b = (ahdd)new ahba((ahbh)annr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return annr.a;
            }
            case 4: {
                return new ahaz((ahbh)annr.a);
            }
            case 3: {
                return new annr();
            }
            case 2: {
                return newMessageInfo((MessageLite)annr.a, "\u0001\u000e\u0000\u0001\u0001\"\u000e\u0000\u0000\u000e\u0001\u1409\u0000\u0003\u1409\n\u000b\u1409\t\u000e\u1409\u0011\u000f\u1409\f\u0015\u1409\u0002\u0016\u1409\u0005\u0017\u1409\u0006\u001a\u1409\r\u001b\u1409\u0012\u001c\u1409\u0013 \u1409\u000e!\u1409\u000b\"\u1409\u000f", new Object[] { "c", "d", "i", "h", "o", "k", "e", "f", "g", "l", "p", "q", "m", "j", "n" });
            }
            case 1: {
                if (o == null) {
                    r = 0;
                }
                this.r = r;
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
