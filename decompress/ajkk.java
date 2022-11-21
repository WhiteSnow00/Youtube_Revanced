import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkk extends ahcz implements aheo
{
    public static final ajkk a;
    public static final ahcx b;
    private static volatile ahev l;
    public int c;
    public String d;
    public ajki e;
    public aqif f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    private byte m;
    
    static {
        final ajkk a2 = new ajkk();
        ahcz.registerDefaultInstance(ajkk.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqia.a, a2, (MessageLite)a2, null, 429403481, ahgc.k, ajkk.class);
    }
    
    private ajkk() {
        this.m = 2;
        this.d = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
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
                final ahev l;
                if ((l = ajkk.l) == null) {
                    synchronized (ajkk.class) {
                        if (ajkk.l == null) {
                            ajkk.l = (ahev)new ahcs((ahcz)ajkk.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ajkk.a;
            }
            case 4: {
                return new ahcr((ahcz)ajkk.a);
            }
            case 3: {
                return new ajkk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajkk.a, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0000\u0001\u0001\u1008\u0000\u0005\u1409\u0005\n\u1008\b\f\u1008\n\r\u1008\u000b\u000e\u1008\f\u000f\u1008\r\u0010\u1009\u0004", new Object[] { "c", "d", "f", "g", "h", "i", "j", "k", "e" });
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
