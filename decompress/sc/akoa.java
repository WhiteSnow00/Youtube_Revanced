import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoa extends ahbh implements ahcw
{
    public static final akoa a;
    private static volatile ahdd g;
    public int b;
    public ahab c;
    public ajut d;
    public ahbx e;
    public int f;
    private ahhu h;
    private aida i;
    private aida j;
    private aiqj k;
    private aida l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)akoa.class, (ahbh)(a = new akoa()));
    }
    
    private akoa() {
        this.m = 2;
        this.c = ahab.b;
        this.e = emptyProtobufList();
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
                final ahdd g;
                if ((g = akoa.g) == null) {
                    synchronized (akoa.class) {
                        if (akoa.g == null) {
                            akoa.g = (ahdd)new ahba((ahbh)akoa.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akoa.a;
            }
            case 4: {
                return new ahaz((ahbh)akoa.a);
            }
            case 3: {
                return new akoa();
            }
            case 2: {
                return newMessageInfo((MessageLite)akoa.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u100a\u0001\u0003\u1409\u0002\u0004\u041b\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\t\u100c\u0007", new Object[] { "b", "h", "c", "d", "e", akob.class, "i", "j", "k", "l", "f", ajek.d });
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
