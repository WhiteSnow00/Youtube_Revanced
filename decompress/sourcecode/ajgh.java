import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgh extends agzi implements ahax
{
    public static final ajgh a;
    public static final agzg b;
    private static volatile ahbe l;
    public int c;
    public String d;
    public ajgf e;
    public aqcz f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    private byte m;
    
    static {
        final ajgh a2 = new ajgh();
        agzi.registerDefaultInstance(ajgh.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, a2, (MessageLite)a2, null, 429403481, ahcm.k, ajgh.class);
    }
    
    private ajgh() {
        this.m = 2;
        this.d = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe l;
                if ((l = ajgh.l) == null) {
                    synchronized (ajgh.class) {
                        if (ajgh.l == null) {
                            ajgh.l = (ahbe)new agzb((agzi)ajgh.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ajgh.a;
            }
            case 4: {
                return new agza((agzi)ajgh.a);
            }
            case 3: {
                return new ajgh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajgh.a, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0000\u0001\u0001\u1008\u0000\u0005\u1409\u0005\n\u1008\b\f\u1008\n\r\u1008\u000b\u000e\u1008\f\u000f\u1008\r\u0010\u1009\u0004", new Object[] { "c", "d", "f", "g", "h", "i", "j", "k", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
