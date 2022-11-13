import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apai extends ahbh implements ahcw
{
    public static final apai a;
    private static volatile ahdd i;
    public int b;
    public aotp c;
    public ajut d;
    public ajut e;
    public ajut f;
    public aida g;
    public aida h;
    private ahhu j;
    private aiqj k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)apai.class, (ahbh)(a = new apai()));
    }
    
    private apai() {
        this.l = 2;
        final ahab b = ahab.b;
        emptyProtobufList();
        emptyProtobufList();
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
                final ahdd i;
                if ((i = apai.i) == null) {
                    synchronized (apai.class) {
                        if (apai.i == null) {
                            apai.i = (ahdd)new ahba((ahbh)apai.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return apai.a;
            }
            case 4: {
                return new ahaz((ahbh)apai.a);
            }
            case 3: {
                return new apai();
            }
            case 2: {
                return newMessageInfo((MessageLite)apai.a, "\u0001\b\u0000\u0001\u0001\u001a\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\u001a\u1409\b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "j", "k" });
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
