import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpg extends ahcz implements aheo
{
    public static final akpg a;
    private static volatile ahev p;
    public int b;
    public aknh c;
    public String d;
    public int e;
    public ahbt f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public int k;
    public boolean l;
    public int m;
    public long n;
    public int o;
    private byte q;
    
    static {
        ahcz.registerDefaultInstance(akpg.class, a = new akpg());
    }
    
    private akpg() {
        this.q = 2;
        this.d = "";
        this.f = ahbt.b;
        this.g = "";
        this.h = "";
        this.i = "";
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
                if ((p3 = akpg.p) == null) {
                    synchronized (akpg.class) {
                        if (akpg.p == null) {
                            akpg.p = (ahev)new ahcs((ahcz)akpg.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return akpg.a;
            }
            case 4: {
                return new ahcr((ahcz)akpg.a);
            }
            case 3: {
                return new akpg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpg.a, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0004\u100a\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006\b\u1007\u0007\t\u100b\b\u000b\u1007\n\f\u100c\u000b\r\u1002\f\u000e\u100c\r", new Object[] { "b", "c", "d", "e", ajse.d, "f", "g", "h", "i", "j", "k", "l", "m", ajse.g, "n", "o", ajse.f });
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
