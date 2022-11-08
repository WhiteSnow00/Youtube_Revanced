import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfx extends agzi implements ahax
{
    public static final ajfx a;
    public static final agzg b;
    private static volatile ahbe p;
    public int c;
    public int d;
    public Object e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public int n;
    public String o;
    private byte q;
    
    static {
        final ajfx a2 = new ajfx();
        agzi.registerDefaultInstance(ajfx.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, a2, (MessageLite)a2, null, 192, ahcm.k, ajfx.class);
    }
    
    private ajfx() {
        this.d = 0;
        this.q = 2;
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.l = "";
        this.m = "";
        this.o = "";
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
                final ahbe p3;
                if ((p3 = ajfx.p) == null) {
                    synchronized (ajfx.class) {
                        if (ajfx.p == null) {
                            ajfx.p = (ahbe)new agzb((agzi)ajfx.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return ajfx.a;
            }
            case 4: {
                return new agza((agzi)ajfx.a);
            }
            case 3: {
                return new ajfx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajfx.a, "\u0001\f\u0001\u0001\u0001\r\f\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0004\u0005\u1008\u0003\u0006\u143c\u0000\u0007\u143c\u0000\b\u1008\b\t\u1004\u0005\u000b\u1008\t\f\u1004\n\r\u1008\u000b", new Object[] { "e", "d", "c", "f", "g", "h", "j", "i", aorm.class, ajfw.class, "l", "k", "m", "n", "o" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.q = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
