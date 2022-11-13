import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiic extends ahbh implements ahcw
{
    public static final aiic a;
    private static volatile ahdd k;
    public int b;
    public int c;
    public Object d;
    public ahbx e;
    public aiib f;
    public ahab g;
    public int h;
    public aiqj i;
    public int j;
    private ahhu l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)aiic.class, (ahbh)(a = new aiic()));
    }
    
    private aiic() {
        this.c = 0;
        this.m = 2;
        this.e = emptyProtobufList();
        this.g = ahab.b;
        this.j = 1;
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
                if ((k = aiic.k) == null) {
                    synchronized (aiic.class) {
                        if (aiic.k == null) {
                            aiic.k = (ahdd)new ahba((ahbh)aiic.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aiic.a;
            }
            case 4: {
                return new ahaz((boolean[])null, (float[][])null);
            }
            case 3: {
                return new aiic();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiic.a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0001\u0005\u0001\u041b\u0002\u1009\u0000\u0003\u143c\u0000\u0004\u1409\u0003\u0005\u100a\u0004\u0006\u143c\u0000\u0007\u100c\u0005\b\u1409\u0006\t\u100c\u0007", new Object[] { "d", "c", "b", "e", aiid.class, "f", aiqj.class, "l", "g", aida.class, "h", aieh.l, "i", "j", aieh.o });
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
