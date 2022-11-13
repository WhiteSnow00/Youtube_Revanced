import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apao extends ahbh implements ahcw
{
    public static final apao a;
    private static volatile ahdd k;
    public int b;
    public int c;
    public Object d;
    public ajut e;
    public ahbx f;
    public aida g;
    public aida h;
    public int i;
    public ahab j;
    private ahhu l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)apao.class, (ahbh)(a = new apao()));
    }
    
    private apao() {
        this.c = 0;
        this.m = 2;
        this.f = emptyProtobufList();
        this.j = ahab.b;
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
                final ahdd k;
                if ((k = apao.k) == null) {
                    synchronized (apao.class) {
                        if (apao.k == null) {
                            apao.k = (ahdd)new ahba((ahbh)apao.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return apao.a;
            }
            case 4: {
                return new ahaz((char[])null, (int[])null);
            }
            case 3: {
                return new apao();
            }
            case 2: {
                return newMessageInfo((MessageLite)apao.a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u103b\u0000\u0006\u1409\u0006\u0007\u100a\u0007\b\u103f\u0000\t\u100c\u0005", new Object[] { "d", "c", "b", "e", "f", ajut.class, "g", "h", "l", "j", aose.a(), "i", aose.a() });
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
