import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajka extends ahcz implements aheo
{
    public static final ajka a;
    public static final ahcx b;
    private static volatile ahev p;
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
        final ajka a2 = new ajka();
        ahcz.registerDefaultInstance(ajka.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 192, ahgc.k, ajka.class);
    }
    
    private ajka() {
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
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte q = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev p3;
                if ((p3 = ajka.p) == null) {
                    synchronized (ajka.class) {
                        if (ajka.p == null) {
                            ajka.p = (ahev)new ahcs((ahcz)ajka.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return ajka.a;
            }
            case 4: {
                return new ahcr((ahcz)ajka.a);
            }
            case 3: {
                return new ajka();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajka.a, "\u0001\f\u0001\u0001\u0001\r\f\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0004\u0005\u1008\u0003\u0006\u143c\u0000\u0007\u143c\u0000\b\u1008\b\t\u1004\u0005\u000b\u1008\t\f\u1004\n\r\u1008\u000b", new Object[] { "e", "d", "c", "f", "g", "h", "j", "i", aowb.class, ajjz.class, "l", "k", "m", "n", "o" });
            }
            case 1: {
                if (o == null) {
                    q = 0;
                }
                this.q = q;
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
