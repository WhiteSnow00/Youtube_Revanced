import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokt extends ahbh implements ahcw
{
    public static final aokt a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private aida f;
    private aida g;
    private aida h;
    private ajut i;
    private ajut j;
    private aiqj k;
    private ahhu l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)aokt.class, (ahbh)(a = new aokt()));
    }
    
    private aokt() {
        this.m = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aokt.b) == null) {
                    synchronized (aokt.class) {
                        if (aokt.b == null) {
                            aokt.b = (ahdd)new ahba((ahbh)aokt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aokt.a;
            }
            case 4: {
                return new ahaz((ahbh)aokt.a);
            }
            case 3: {
                return new aokt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aokt.a, "\u0001\t\u0000\u0001\b\u001a\t\u0000\u0000\t\b\u1409\f\t\u1409\u000e\n\u1409\u000f\u000b\u1409\u0010\f\u1409\u0011\r\u1409\u0014\u000f\u1409\u0017\u0011\u1409\u0012\u001a\u1409\u0013", new Object[] { "c", "d", "e", "f", "g", "h", "k", "l", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
