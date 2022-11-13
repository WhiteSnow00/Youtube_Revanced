import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajii extends ahbh implements ahcw
{
    public static final ajii a;
    public static final ahbf b;
    private static volatile ahdd o;
    public int c;
    public String d;
    public aotp e;
    public String f;
    public String g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public ahbx m;
    public ahab n;
    private byte p;
    
    static {
        final ajii a2 = new ajii();
        ahbh.registerDefaultInstance((Class)ajii.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 199, ahek.k, (Class)ajii.class);
    }
    
    private ajii() {
        this.p = 2;
        this.d = "";
        this.f = "";
        this.g = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = emptyProtobufList();
        this.n = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd o3;
                if ((o3 = ajii.o) == null) {
                    synchronized (ajii.class) {
                        if (ajii.o == null) {
                            ajii.o = (ahdd)new ahba((ahbh)ajii.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return ajii.a;
            }
            case 4: {
                return new ahaz((short[])null, (byte[][])null);
            }
            case 3: {
                return new ajii();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajii.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1004\u0004\u0006\u1008\u0005\u0007\u1008\u0006\b\u1008\u0007\t\u1008\b\n\u001b\u000b\u100a\t", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", ajfu.class, "n" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
