import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkw extends ahcz implements aheo
{
    public static final ajkw a;
    public static final ahcx b;
    private static volatile ahev j;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public ahdh i;
    private aqkv k;
    private aqkv l;
    private byte m;
    
    static {
        final ajkw a2 = new ajkw();
        ahcz.registerDefaultInstance(ajkw.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqia.a, a2, (MessageLite)a2, null, 373468381, ahgc.k, ajkw.class);
    }
    
    private ajkw() {
        this.m = 2;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = ahcz.emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = ajkw.j) == null) {
                    synchronized (ajkw.class) {
                        if (ajkw.j == null) {
                            ajkw.j = (ahev)new ahcs((ahcz)ajkw.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajkw.a;
            }
            case 4: {
                return new ahcr((byte[])null, (char[])null);
            }
            case 3: {
                return new ajkw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajkw.a, "\u0001\b\u0000\u0001\u0003\u000b\b\u0000\u0001\u0002\u0003\u1008\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1008\u0006\u0007\u1008\u0007\b\u1008\b\n\u1008\t\u000b\u0016", new Object[] { "c", "d", "k", "l", "e", "f", "g", "h", "i" });
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
