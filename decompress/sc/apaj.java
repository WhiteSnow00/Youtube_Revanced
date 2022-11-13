import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apaj extends ahbh implements ahcw
{
    public static final apaj a;
    private static volatile ahdd l;
    public int b;
    public aotp c;
    public ahbx d;
    public ajut e;
    public ajut f;
    public aida g;
    public ajut h;
    public ajut i;
    public aida j;
    public aida k;
    private ahhu m;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)apaj.class, (ahbh)(a = new apaj()));
    }
    
    private apaj() {
        this.n = 2;
        this.d = emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = apaj.l) == null) {
                    synchronized (apaj.class) {
                        if (apaj.l == null) {
                            apaj.l = (ahdd)new ahba((ahbh)apaj.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return apaj.a;
            }
            case 4: {
                return new ahaz((ahbh)apaj.a);
            }
            case 3: {
                return new apaj();
            }
            case 2: {
                return newMessageInfo((MessageLite)apaj.a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\n\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\t\u1409\u0007\n\u1409\b", new Object[] { "b", "c", "d", aotp.class, "e", "f", "g", "h", "i", "j", "k", "m" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
