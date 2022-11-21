import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubl extends ahcz implements aheo
{
    public static final aubl a;
    private static volatile ahev l;
    public int b;
    public boolean c;
    public aubg d;
    public String e;
    public String f;
    public int g;
    public String h;
    public afta i;
    public ahim j;
    public aubn k;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(aubl.class, a = new aubl());
    }
    
    private aubl() {
        this.m = 2;
        this.e = "";
        this.f = "";
        this.h = "";
    }
    
    public static void a(final aubl aubl) {
        aubl.b |= 0x1;
        aubl.c = true;
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
                if ((l = aubl.l) == null) {
                    synchronized (aubl.class) {
                        if (aubl.l == null) {
                            aubl.l = (ahev)new ahcs((ahcz)aubl.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aubl.a;
            }
            case 4: {
                return new ahcr((ahcz)aubl.a);
            }
            case 3: {
                return new aubl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aubl.a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001\u1007\u0000\u0002\u1009\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u100c\u0004\u0007\u1008\u0007\t\u1409\b\n\u1009\t\u000b\u1009\n", new Object[] { "b", "c", "d", "e", "f", "g", areg.s, "h", "i", "j", "k" });
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
